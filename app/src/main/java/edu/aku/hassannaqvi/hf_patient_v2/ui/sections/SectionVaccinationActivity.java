package edu.aku.hassannaqvi.hf_patient_v2.ui.sections;

import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.prescription;
import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.vaccination;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.hf_patient_v2.R;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;
import edu.aku.hassannaqvi.hf_patient_v2.database.DatabaseHelper;
import edu.aku.hassannaqvi.hf_patient_v2.databinding.ActivitySectionVaccinationBinding;
import edu.aku.hassannaqvi.hf_patient_v2.models.Prescription;

public class SectionVaccinationActivity extends AppCompatActivity {

    ActivitySectionVaccinationBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_vaccination);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(vaccination);
    }


    private boolean insertNewRecord() {
        if (!vaccination.getUid().equals("")) return true;
        MainApp.vaccination.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addVAC(vaccination);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        vaccination.setId(String.valueOf(rowId));
        if (rowId > 0) {
            vaccination.setUid(vaccination.getDeviceId() + vaccination.getId());
            db.updatesVACColumn(PDContract.VACCINATIONTable.COLUMN_UID, vaccination.getUid());
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
            updcount = db.updatesVACColumn(PDContract.VACCINATIONTable.COLUMN_SVAC, vaccination.sVACtoString());
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


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        if (updateDB()) {
            finish();
            prescription = new Prescription();
            startActivity(new Intent(this, SectionPrescriptionActivity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void BtnEnd(View view) {
        finish();
//        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
//        finish();
    }
}