package edu.aku.hassannaqvi.hf_patient_v2.ui.sections;

import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.prescription;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.google.android.flexbox.FlexboxLayout;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import edu.aku.hassannaqvi.hf_patient_v2.R;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;
import edu.aku.hassannaqvi.hf_patient_v2.database.DatabaseHelper;
import edu.aku.hassannaqvi.hf_patient_v2.databinding.ActivitySectionPrescriptionBinding;

public class SectionPrescriptionActivity extends AppCompatActivity {

    ActivitySectionPrescriptionBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_prescription);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(prescription);
        setupSkips();

    }

    private void setupSkips() {

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

    private boolean insertMedicineRecord(String medCode, String dose, String frequency, String duration) {

//        if (!prescription.getUid().equals("")) return;
        MainApp.prescription.populateMeta();
        MainApp.patientDetails.setiStatus("1");

        prescription.updatePrescription(medCode, dose, frequency, duration);
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
        List<FlexboxLayout> parentLayouts = new ArrayList<>();
        parentLayouts.add(bi.presStub1.mp100check1);
        parentLayouts.add(bi.presStub2.mp100check2);

        boolean isChecked = false;
        for (int i = 0; i < parentLayouts.size(); i++) {
            FlexboxLayout parentLayout = parentLayouts.get(i);
            for (int j = 0; j < parentLayout.getChildCount(); j++) {
                View view = parentLayout.getChildAt(j);
                if (view instanceof CheckBox) {
                    CheckBox checkBox = ((CheckBox) view);
                    if (checkBox.isChecked()) {
                        isChecked = true;
                        for (int k = j + 1; k <= j + 3; k++) {
                            View view1 = parentLayout.getChildAt(k);
                            if (view1 instanceof EditTextPicker) {
                                EditTextPicker editText = ((EditTextPicker) view1);
                                editText.clearFocus();
                                if (!editText.isEmptyTextBox())
                                    return false;
                                else if (!editText.isRangeTextValidate())
                                    return false;

                            } else if (view1 instanceof RadioGroup) {
                                RadioGroup radioGroup = ((RadioGroup) view1);
                                if (!Validator.emptyCheckingContainer(this, radioGroup))
                                    return false;
                            }
                        }
                    }
                }
            }
        }
        if (!isChecked) {
            Toast.makeText(this, getString(R.string.select_medicine), Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
//        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        //if (!insertNewRecord()) return;

        if (prescription.mp101.equals("1")) {
            insertMedicineRecord(prescription.getMp101(), prescription.getMp101do(), prescription.getMp101f(), prescription.getMp101du());
        }

        if (prescription.mp102.equals("2")) {
            insertMedicineRecord(prescription.getMp102(), prescription.getMp102do(), prescription.getMp102f(), prescription.getMp102du());
        }

        if (prescription.mp103.equals("3")) {
            insertMedicineRecord(prescription.getMp103(), prescription.getMp103do(), prescription.getMp103f(), prescription.getMp103du());
        }

        if (prescription.mp104.equals("4")) {
            insertMedicineRecord(prescription.getMp104(), prescription.getMp104do(), prescription.getMp104f(), prescription.getMp104du());
        }

        if (prescription.mp105.equals("5")) {
            insertMedicineRecord(prescription.getMp105(), prescription.getMp105do(), prescription.getMp105f(), prescription.getMp105du());
        }

        if (prescription.mp106.equals("6")) {
            insertMedicineRecord(prescription.getMp106(), prescription.getMp106do(), prescription.getMp106f(), prescription.getMp106du());
        }

        if (prescription.mp107.equals("7")) {
            insertMedicineRecord(prescription.getMp107(), prescription.getMp107do(), prescription.getMp107f(), prescription.getMp107du());
        }

        if (prescription.mp108.equals("8")) {
            insertMedicineRecord(prescription.getMp108(), prescription.getMp108do(), prescription.getMp108f(), prescription.getMp108du());
        }

        if (prescription.mp109.equals("9")) {
            insertMedicineRecord(prescription.getMp109(), prescription.getMp109do(), prescription.getMp109f(), prescription.getMp109du());
        }

        if (prescription.mp110.equals("10")) {
            insertMedicineRecord(prescription.getMp110(), prescription.getMp110do(), prescription.getMp110f(), prescription.getMp110du());
        }

        if (prescription.mp111.equals("11")) {
            insertMedicineRecord(prescription.getMp111(), prescription.getMp111do(), prescription.getMp111f(), prescription.getMp111du());
        }

        if (prescription.mp112.equals("12")) {
            insertMedicineRecord(prescription.getMp112(), prescription.getMp112do(), prescription.getMp112f(), prescription.getMp112du());
        }

        if (prescription.mp113.equals("13")) {
            insertMedicineRecord(prescription.getMp113(), prescription.getMp113do(), prescription.getMp113f(), prescription.getMp113du());
        }

        if (prescription.mp114.equals("14")) {
            insertMedicineRecord(prescription.getMp114(), prescription.getMp114do(), prescription.getMp114f(), prescription.getMp114du());
        }

        if (prescription.mp115.equals("15")) {
            insertMedicineRecord(prescription.getMp115(), prescription.getMp115do(), prescription.getMp115f(), prescription.getMp115du());
        }

        if (prescription.mp116.equals("16")) {
            insertMedicineRecord(prescription.getMp116(), prescription.getMp116do(), prescription.getMp116f(), prescription.getMp116du());
        }

        if (prescription.mp117.equals("17")) {
            insertMedicineRecord(prescription.getMp117(), prescription.getMp117do(), prescription.getMp117f(), prescription.getMp117du());
        }

        if (prescription.mp118.equals("18")) {
            insertMedicineRecord(prescription.getMp118(), prescription.getMp118do(), prescription.getMp118f(), prescription.getMp118du());
        }

        if (prescription.mp119.equals("19")) {
            insertMedicineRecord(prescription.getMp119(), prescription.getMp119do(), prescription.getMp119f(), prescription.getMp119du());
        }

        if (prescription.mp120.equals("20")) {
            insertMedicineRecord(prescription.getMp120(), prescription.getMp120do(), prescription.getMp120f(), prescription.getMp120du());
        }

        if (prescription.mp121.equals("21")) {
            insertMedicineRecord(prescription.getMp121(), prescription.getMp121do(), prescription.getMp121f(), prescription.getMp121du());
        }

        if (prescription.mp122.equals("22")) {
            insertMedicineRecord(prescription.getMp122(), prescription.getMp122do(), prescription.getMp122f(), prescription.getMp122du());
        }

        if (prescription.mp123.equals("23")) {
            insertMedicineRecord(prescription.getMp123(), prescription.getMp123do(), prescription.getMp123f(), prescription.getMp123du());
        }

        if (prescription.mp124.equals("24")) {
            insertMedicineRecord(prescription.getMp124(), prescription.getMp124do(), prescription.getMp124f(), prescription.getMp124du());
        }

        if (prescription.mp125.equals("25")) {
            insertMedicineRecord(prescription.getMp125(), prescription.getMp125do(), prescription.getMp125f(), prescription.getMp125du());
        }

        if (prescription.mp126.equals("26")) {
            insertMedicineRecord(prescription.getMp126(), prescription.getMp126do(), prescription.getMp126f(), prescription.getMp126du());
        }

        if (prescription.mp127.equals("27")) {
            insertMedicineRecord(prescription.getMp127(), prescription.getMp127do(), prescription.getMp127f(), prescription.getMp127du());
        }

        if (prescription.mp128.equals("28")) {
            insertMedicineRecord(prescription.getMp128(), prescription.getMp128do(), prescription.getMp128f(), prescription.getMp128du());
        }

        if (prescription.mp129.equals("29")) {
            insertMedicineRecord(prescription.getMp129(), prescription.getMp129do(), prescription.getMp129f(), prescription.getMp129du());
        }

        if (prescription.mp130.equals("30")) {
            insertMedicineRecord(prescription.getMp130(), prescription.getMp130do(), prescription.getMp130f(), prescription.getMp130du());
        }

        if (prescription.mp131.equals("31")) {
            insertMedicineRecord(prescription.getMp131(), prescription.getMp131do(), prescription.getMp131f(), prescription.getMp131du());
        }

        if (prescription.mp132.equals("32")) {
            insertMedicineRecord(prescription.getMp132(), prescription.getMp132do(), prescription.getMp132f(), prescription.getMp132du());
        }

        if (prescription.mp133.equals("33")) {
            insertMedicineRecord(prescription.getMp133(), prescription.getMp133do(), prescription.getMp133f(), prescription.getMp133du());
        }

        if (prescription.mp134.equals("34")) {
            insertMedicineRecord(prescription.getMp134(), prescription.getMp134do(), prescription.getMp134f(), prescription.getMp134du());
        }

        if (prescription.mp135.equals("35")) {
            insertMedicineRecord(prescription.getMp135(), prescription.getMp135do(), prescription.getMp135f(), prescription.getMp135du());
        }

        if (prescription.mp136.equals("36")) {
            insertMedicineRecord(prescription.getMp136(), prescription.getMp136do(), prescription.getMp136f(), prescription.getMp136du());
        }

        if (prescription.mp137.equals("37")) {
            insertMedicineRecord(prescription.getMp137(), prescription.getMp137do(), prescription.getMp137f(), prescription.getMp137du());
        }

        if (prescription.mpnr.equals("999")) {
            insertMedicineRecord(prescription.getMpnr(), "999", "999", "999");
        }

        if (updateDB()) {
            finish();
            Toast.makeText(this, "Record Entered", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, SectionScreeningActivity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void BtnEnd(View view) {
        finish();
//        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
//        finish();
    }
}