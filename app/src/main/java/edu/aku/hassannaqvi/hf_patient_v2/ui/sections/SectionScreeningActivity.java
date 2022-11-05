package edu.aku.hassannaqvi.hf_patient_v2.ui.sections;

import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.patientDetails;
import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.pd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.Collection;

import edu.aku.hassannaqvi.hf_patient_v2.R;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;
import edu.aku.hassannaqvi.hf_patient_v2.database.DatabaseHelper;
import edu.aku.hassannaqvi.hf_patient_v2.databinding.ActivitySectionScreeningBinding;
import edu.aku.hassannaqvi.hf_patient_v2.models.Doctor;
import edu.aku.hassannaqvi.hf_patient_v2.utils.DateUtils;

public class SectionScreeningActivity extends AppCompatActivity {

    ActivitySectionScreeningBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> doctorNames, doctorCodes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_screening);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(pd);

        bi.date.setMinDate(DateUtils.getMonthsBack("dd/MM/yyyy", -4));
    }

    private void populateSpinner() {

        Collection<Doctor> doctors = db.getDoctorsByUC(MainApp.user.getUcCode());

        doctorNames = new ArrayList<>();
        doctorCodes = new ArrayList<>();
        doctorNames.add("...");
        doctorCodes.add("...");

        for (Doctor dc : doctors) {
            doctorNames.add(dc.getStaff_name());
            doctorCodes.add(dc.getIddoctor());
        }

        if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {
            doctorNames.add("Test Doctor 1");
            doctorNames.add("Test Doctor 2");
            doctorNames.add("Test Doctor 3");

            doctorCodes.add("001");
            doctorCodes.add("002");
            doctorCodes.add("003");
        }
        // Apply the adapter to the spinner
        bi.ss100.setAdapter(new ArrayAdapter<>(SectionScreeningActivity.this, R.layout.custom_spinner, doctorNames));

        bi.ss100.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position != 0) {
                    MainApp.selectedDoctorName = (doctorNames.get(bi.ss100.getSelectedItemPosition()));
//                    mobileHealth.setSs100(MainApp.selectedDoctorName);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
    }


    private boolean insertNewRecord() {
        if (!pd.getUid().equals("")) return true;
        MainApp.pd.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addPD(patientDetails);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        patientDetails.setId(String.valueOf(rowId));
        if (rowId > 0) {
            patientDetails.setUid(patientDetails.getDeviceId() + patientDetails.getId());
            db.updatesPDColumn(PDContract.PDTable.COLUMN_UID, patientDetails.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean updateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = 0;
        try {
            updcount = db.updatesPDColumn(PDContract.PDTable.COLUMN_SPD, patientDetails.sPDtoString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionComplaintsActivity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
//        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }
}