package edu.aku.hassannaqvi.hf_patient_v2.ui.sections;

import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.prescription;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.hf_patient_v2.R;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;
import edu.aku.hassannaqvi.hf_patient_v2.database.DatabaseHelper;
import edu.aku.hassannaqvi.hf_patient_v2.databinding.ActivitySectionPrescriptionBinding;

public class SectionPrescriptionActivity extends AppCompatActivity {

    ActivitySectionPrescriptionBinding bi;
    private DatabaseHelper db;

    private ViewStub presStub1, presStub2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_prescription);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(prescription);

        presStub1 = findViewById(R.id.presStub1);
        presStub2 = findViewById(R.id.presStub2);
        presStub1.inflate();
        presStub2.inflate();

    }

    // For prescription visibility
    // This code is used to divide the load of views as there are 'too many parameters'
    // error occurred in data binding while loading prescription UI
    public void presToggle(View view) {
        Button navPresBtn = (Button) view;
        if (presStub1.getVisibility() == View.VISIBLE) {
            presStub1.setVisibility(View.GONE);
            presStub2.setVisibility(View.VISIBLE);
            navPresBtn.setText(getString(R.string.back));
        } else {
            presStub2.setVisibility(View.GONE);
            presStub1.setVisibility(View.VISIBLE);
            navPresBtn.setText(getString(R.string.more));
        }

    }

    private boolean insertNewRecord() {
        if (!prescription.getUid().equals("")) return true;
        MainApp.prescription.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addPRES(prescription);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        prescription.setId(String.valueOf(rowId));
        if (rowId > 0) {
            prescription.setUid(prescription.getDeviceId() + prescription.getId());
            db.updatesPRESColumn(PDContract.PRESCRIPTIONTable.COLUMN_UID, prescription.getUid());
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
            updcount = db.updatesPRESColumn(PDContract.PRESCRIPTIONTable.COLUMN_PRES, prescription.sPREStoString());
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
            startActivity(new Intent(this, SectionComplaintsActivity.class));
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
        finish();
    }
}