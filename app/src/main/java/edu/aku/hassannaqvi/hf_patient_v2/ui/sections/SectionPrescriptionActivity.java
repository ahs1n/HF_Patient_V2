package edu.aku.hassannaqvi.hf_patient_v2.ui.sections;

import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.patientDetails;
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
import edu.aku.hassannaqvi.hf_patient_v2.models.Diagnosis;
import edu.aku.hassannaqvi.hf_patient_v2.models.Prescription;
import edu.aku.hassannaqvi.hf_patient_v2.ui.list_activity.FormsReportDate;

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

        if (MainApp.PATIENT_DETAIL_EDIT != null)
            presetFields(db.getPrescriptionByUUID(MainApp.PATIENT_DETAIL_EDIT.getUid()));

        setupSkips();

    }

    private void presetFields(List<Prescription> prescriptionList) {
        for (int i = 0; i < prescriptionList.size(); i++) {
            Prescription _prescription = prescriptionList.get(i);
            switch (_prescription.getMedCode()) {
                case "1":
                    prescription.setMp101(_prescription.getMedCode());
                    prescription.setMp101do(_prescription.getDose());
                    prescription.setMp101f(_prescription.getFrequency());
                    prescription.setMp101du(_prescription.getDuration());
                    break;
                case "2":
                    prescription.setMp102(_prescription.getMedCode());
                    prescription.setMp102do(_prescription.getDose());
                    prescription.setMp102f(_prescription.getFrequency());
                    prescription.setMp102du(_prescription.getDuration());
                    break;
                case "3":
                    prescription.setMp103(_prescription.getMedCode());
                    prescription.setMp103do(_prescription.getDose());
                    prescription.setMp103f(_prescription.getFrequency());
                    prescription.setMp103du(_prescription.getDuration());
                    break;
                case "4":
                    prescription.setMp104(_prescription.getMedCode());
                    prescription.setMp104do(_prescription.getDose());
                    prescription.setMp104f(_prescription.getFrequency());
                    prescription.setMp104du(_prescription.getDuration());
                    break;
                case "5":
                    prescription.setMp105(_prescription.getMedCode());
                    prescription.setMp105do(_prescription.getDose());
                    prescription.setMp105f(_prescription.getFrequency());
                    prescription.setMp105du(_prescription.getDuration());
                    break;
                case "6":
                    prescription.setMp106(_prescription.getMedCode());
                    prescription.setMp106do(_prescription.getDose());
                    prescription.setMp106f(_prescription.getFrequency());
                    prescription.setMp106du(_prescription.getDuration());
                    break;
                case "7":
                    prescription.setMp107(_prescription.getMedCode());
                    prescription.setMp107do(_prescription.getDose());
                    prescription.setMp107f(_prescription.getFrequency());
                    prescription.setMp107du(_prescription.getDuration());
                    break;
                case "8":
                    prescription.setMp108(_prescription.getMedCode());
                    prescription.setMp108do(_prescription.getDose());
                    prescription.setMp108f(_prescription.getFrequency());
                    prescription.setMp108du(_prescription.getDuration());
                    break;
                case "9":
                    prescription.setMp109(_prescription.getMedCode());
                    prescription.setMp109do(_prescription.getDose());
                    prescription.setMp109f(_prescription.getFrequency());
                    prescription.setMp109du(_prescription.getDuration());
                    break;
                case "10":
                    prescription.setMp110(_prescription.getMedCode());
                    prescription.setMp110do(_prescription.getDose());
                    prescription.setMp110f(_prescription.getFrequency());
                    prescription.setMp110du(_prescription.getDuration());
                    break;
                case "11":
                    prescription.setMp111(_prescription.getMedCode());
                    prescription.setMp111do(_prescription.getDose());
                    prescription.setMp111f(_prescription.getFrequency());
                    prescription.setMp111du(_prescription.getDuration());
                    break;
                case "12":
                    prescription.setMp112(_prescription.getMedCode());
                    prescription.setMp112do(_prescription.getDose());
                    prescription.setMp112f(_prescription.getFrequency());
                    prescription.setMp112du(_prescription.getDuration());
                    break;
                case "13":
                    prescription.setMp113(_prescription.getMedCode());
                    prescription.setMp113do(_prescription.getDose());
                    prescription.setMp113f(_prescription.getFrequency());
                    prescription.setMp113du(_prescription.getDuration());
                    break;
                case "14":
                    prescription.setMp114(_prescription.getMedCode());
                    prescription.setMp114do(_prescription.getDose());
                    prescription.setMp114f(_prescription.getFrequency());
                    prescription.setMp114du(_prescription.getDuration());
                    break;
                case "15":
                    prescription.setMp115(_prescription.getMedCode());
                    prescription.setMp115do(_prescription.getDose());
                    prescription.setMp115f(_prescription.getFrequency());
                    prescription.setMp115du(_prescription.getDuration());
                    break;
                case "16":
                    prescription.setMp116(_prescription.getMedCode());
                    prescription.setMp116do(_prescription.getDose());
                    prescription.setMp116f(_prescription.getFrequency());
                    prescription.setMp116du(_prescription.getDuration());
                    break;
                case "17":
                    prescription.setMp117(_prescription.getMedCode());
                    prescription.setMp117do(_prescription.getDose());
                    prescription.setMp117f(_prescription.getFrequency());
                    prescription.setMp117du(_prescription.getDuration());
                    break;
                case "18":
                    prescription.setMp118(_prescription.getMedCode());
                    prescription.setMp118do(_prescription.getDose());
                    prescription.setMp118f(_prescription.getFrequency());
                    prescription.setMp118du(_prescription.getDuration());
                    break;
                case "19":
                    prescription.setMp119(_prescription.getMedCode());
                    prescription.setMp119do(_prescription.getDose());
                    prescription.setMp119f(_prescription.getFrequency());
                    prescription.setMp119du(_prescription.getDuration());
                    break;
                case "20":
                    prescription.setMp120(_prescription.getMedCode());
                    prescription.setMp120do(_prescription.getDose());
                    prescription.setMp120f(_prescription.getFrequency());
                    prescription.setMp120du(_prescription.getDuration());
                    break;
                case "21":
                    prescription.setMp121(_prescription.getMedCode());
                    prescription.setMp121do(_prescription.getDose());
                    prescription.setMp121f(_prescription.getFrequency());
                    prescription.setMp121du(_prescription.getDuration());
                    break;
                case "22":
                    prescription.setMp122(_prescription.getMedCode());
                    prescription.setMp122do(_prescription.getDose());
                    prescription.setMp122f(_prescription.getFrequency());
                    prescription.setMp122du(_prescription.getDuration());
                    break;
                case "23":
                    prescription.setMp123(_prescription.getMedCode());
                    prescription.setMp123do(_prescription.getDose());
                    prescription.setMp123f(_prescription.getFrequency());
                    prescription.setMp123du(_prescription.getDuration());
                    break;
                case "24":
                    prescription.setMp124(_prescription.getMedCode());
                    prescription.setMp124do(_prescription.getDose());
                    prescription.setMp124f(_prescription.getFrequency());
                    prescription.setMp124du(_prescription.getDuration());
                    break;
                case "25":
                    prescription.setMp125(_prescription.getMedCode());
                    prescription.setMp125do(_prescription.getDose());
                    prescription.setMp125f(_prescription.getFrequency());
                    prescription.setMp125du(_prescription.getDuration());
                    break;
                case "26":
                    prescription.setMp126(_prescription.getMedCode());
                    prescription.setMp126do(_prescription.getDose());
                    prescription.setMp126f(_prescription.getFrequency());
                    prescription.setMp126du(_prescription.getDuration());
                    break;
                case "27":
                    prescription.setMp127(_prescription.getMedCode());
                    prescription.setMp127do(_prescription.getDose());
                    prescription.setMp127f(_prescription.getFrequency());
                    prescription.setMp127du(_prescription.getDuration());
                    break;
                case "28":
                    prescription.setMp128(_prescription.getMedCode());
                    prescription.setMp128do(_prescription.getDose());
                    prescription.setMp128f(_prescription.getFrequency());
                    prescription.setMp128du(_prescription.getDuration());
                    break;
                case "29":
                    prescription.setMp129(_prescription.getMedCode());
                    prescription.setMp129do(_prescription.getDose());
                    prescription.setMp129f(_prescription.getFrequency());
                    prescription.setMp129du(_prescription.getDuration());
                    break;
                case "30":
                    prescription.setMp130(_prescription.getMedCode());
                    prescription.setMp130do(_prescription.getDose());
                    prescription.setMp130f(_prescription.getFrequency());
                    prescription.setMp130du(_prescription.getDuration());
                    break;
                case "31":
                    prescription.setMp131(_prescription.getMedCode());
                    prescription.setMp131do(_prescription.getDose());
                    prescription.setMp131f(_prescription.getFrequency());
                    prescription.setMp131du(_prescription.getDuration());
                    break;
                case "32":
                    prescription.setMp132(_prescription.getMedCode());
                    prescription.setMp132do(_prescription.getDose());
                    prescription.setMp132f(_prescription.getFrequency());
                    prescription.setMp132du(_prescription.getDuration());
                    break;
                case "33":
                    prescription.setMp133(_prescription.getMedCode());
                    prescription.setMp133do(_prescription.getDose());
                    prescription.setMp133f(_prescription.getFrequency());
                    prescription.setMp133du(_prescription.getDuration());
                    break;
                case "34":
                    prescription.setMp134(_prescription.getMedCode());
                    prescription.setMp134do(_prescription.getDose());
                    prescription.setMp134f(_prescription.getFrequency());
                    prescription.setMp134du(_prescription.getDuration());
                    break;
                case "35":
                    prescription.setMp135(_prescription.getMedCode());
                    prescription.setMp135do(_prescription.getDose());
                    prescription.setMp135f(_prescription.getFrequency());
                    prescription.setMp135du(_prescription.getDuration());
                    break;
                case "36":
                    prescription.setMp136(_prescription.getMedCode());
                    prescription.setMp136do(_prescription.getDose());
                    prescription.setMp136f(_prescription.getFrequency());
                    prescription.setMp136du(_prescription.getDuration());
                    break;
                case "37":
                    prescription.setMp137(_prescription.getMedCode());
                    prescription.setMp137do(_prescription.getDose());
                    prescription.setMp137f(_prescription.getFrequency());
                    prescription.setMp137du(_prescription.getDuration());
                    break;
                case "961":
                    prescription.setMp961(_prescription.getMedCode());
                    prescription.setMp961do(_prescription.getDose());
                    prescription.setMp961f(_prescription.getFrequency());
                    prescription.setMp961du(_prescription.getDuration());
                    prescription.setMp961x(_prescription.getOther());
                    break;
                case "962":
                    prescription.setMp962(_prescription.getMedCode());
                    prescription.setMp962do(_prescription.getDose());
                    prescription.setMp962f(_prescription.getFrequency());
                    prescription.setMp962du(_prescription.getDuration());
                    prescription.setMp962x(_prescription.getOther());
                    break;
                case "963":
                    prescription.setMp963(_prescription.getMedCode());
                    prescription.setMp963do(_prescription.getDose());
                    prescription.setMp963f(_prescription.getFrequency());
                    prescription.setMp963du(_prescription.getDuration());
                    prescription.setMp963x(_prescription.getOther());
                    break;
                case "999":
                    prescription.setMpnr(_prescription.getMedCode());
                    break;


            }
        }
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

    private boolean insertMedicineRecord(String medCode, String dose, String frequency, String duration, String other) {

//        if (!prescription.getUid().equals("")) return;
        MainApp.prescription.populateMeta();
        MainApp.patientDetails.setiStatus("1");

        prescription.updatePrescription(medCode, dose, frequency, duration, other);
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
            insertMedicineRecord(prescription.getMp101(), prescription.getMp101do(), prescription.getMp101f(), prescription.getMp101du(), "");
        }

        if (prescription.mp102.equals("2")) {
            insertMedicineRecord(prescription.getMp102(), prescription.getMp102do(), prescription.getMp102f(), prescription.getMp102du(), "");
        }

        if (prescription.mp103.equals("3")) {
            insertMedicineRecord(prescription.getMp103(), prescription.getMp103do(), prescription.getMp103f(), prescription.getMp103du(), "");
        }

        if (prescription.mp104.equals("4")) {
            insertMedicineRecord(prescription.getMp104(), prescription.getMp104do(), prescription.getMp104f(), prescription.getMp104du(), "");
        }

        if (prescription.mp105.equals("5")) {
            insertMedicineRecord(prescription.getMp105(), prescription.getMp105do(), prescription.getMp105f(), prescription.getMp105du(), "");
        }

        if (prescription.mp106.equals("6")) {
            insertMedicineRecord(prescription.getMp106(), prescription.getMp106do(), prescription.getMp106f(), prescription.getMp106du(), "");
        }

        if (prescription.mp107.equals("7")) {
            insertMedicineRecord(prescription.getMp107(), prescription.getMp107do(), prescription.getMp107f(), prescription.getMp107du(), "");
        }

        if (prescription.mp108.equals("8")) {
            insertMedicineRecord(prescription.getMp108(), prescription.getMp108do(), prescription.getMp108f(), prescription.getMp108du(), "");
        }

        if (prescription.mp109.equals("9")) {
            insertMedicineRecord(prescription.getMp109(), prescription.getMp109do(), prescription.getMp109f(), prescription.getMp109du(), "");
        }

        if (prescription.mp110.equals("10")) {
            insertMedicineRecord(prescription.getMp110(), prescription.getMp110do(), prescription.getMp110f(), prescription.getMp110du(), "");
        }

        if (prescription.mp111.equals("11")) {
            insertMedicineRecord(prescription.getMp111(), prescription.getMp111do(), prescription.getMp111f(), prescription.getMp111du(), "");
        }

        if (prescription.mp112.equals("12")) {
            insertMedicineRecord(prescription.getMp112(), prescription.getMp112do(), prescription.getMp112f(), prescription.getMp112du(), "");
        }

        if (prescription.mp113.equals("13")) {
            insertMedicineRecord(prescription.getMp113(), prescription.getMp113do(), prescription.getMp113f(), prescription.getMp113du(), "");
        }

        if (prescription.mp114.equals("14")) {
            insertMedicineRecord(prescription.getMp114(), prescription.getMp114do(), prescription.getMp114f(), prescription.getMp114du(), "");
        }

        if (prescription.mp115.equals("15")) {
            insertMedicineRecord(prescription.getMp115(), prescription.getMp115do(), prescription.getMp115f(), prescription.getMp115du(), "");
        }

        if (prescription.mp116.equals("16")) {
            insertMedicineRecord(prescription.getMp116(), prescription.getMp116do(), prescription.getMp116f(), prescription.getMp116du(), "");
        }

        if (prescription.mp117.equals("17")) {
            insertMedicineRecord(prescription.getMp117(), prescription.getMp117do(), prescription.getMp117f(), prescription.getMp117du(), "");
        }

        if (prescription.mp118.equals("18")) {
            insertMedicineRecord(prescription.getMp118(), prescription.getMp118do(), prescription.getMp118f(), prescription.getMp118du(), "");
        }

        if (prescription.mp119.equals("19")) {
            insertMedicineRecord(prescription.getMp119(), prescription.getMp119do(), prescription.getMp119f(), prescription.getMp119du(), "");
        }

        if (prescription.mp120.equals("20")) {
            insertMedicineRecord(prescription.getMp120(), prescription.getMp120do(), prescription.getMp120f(), prescription.getMp120du(), "");
        }

        if (prescription.mp121.equals("21")) {
            insertMedicineRecord(prescription.getMp121(), prescription.getMp121do(), prescription.getMp121f(), prescription.getMp121du(), "");
        }

        if (prescription.mp122.equals("22")) {
            insertMedicineRecord(prescription.getMp122(), prescription.getMp122do(), prescription.getMp122f(), prescription.getMp122du(), "");
        }

        if (prescription.mp123.equals("23")) {
            insertMedicineRecord(prescription.getMp123(), prescription.getMp123do(), prescription.getMp123f(), prescription.getMp123du(), "");
        }

        if (prescription.mp124.equals("24")) {
            insertMedicineRecord(prescription.getMp124(), prescription.getMp124do(), prescription.getMp124f(), prescription.getMp124du(), "");
        }

        if (prescription.mp125.equals("25")) {
            insertMedicineRecord(prescription.getMp125(), prescription.getMp125do(), prescription.getMp125f(), prescription.getMp125du(), "");
        }

        if (prescription.mp126.equals("26")) {
            insertMedicineRecord(prescription.getMp126(), prescription.getMp126do(), prescription.getMp126f(), prescription.getMp126du(), "");
        }

        if (prescription.mp127.equals("27")) {
            insertMedicineRecord(prescription.getMp127(), prescription.getMp127do(), prescription.getMp127f(), prescription.getMp127du(), "");
        }

        if (prescription.mp128.equals("28")) {
            insertMedicineRecord(prescription.getMp128(), prescription.getMp128do(), prescription.getMp128f(), prescription.getMp128du(), "");
        }

        if (prescription.mp129.equals("29")) {
            insertMedicineRecord(prescription.getMp129(), prescription.getMp129do(), prescription.getMp129f(), prescription.getMp129du(), "");
        }

        if (prescription.mp130.equals("30")) {
            insertMedicineRecord(prescription.getMp130(), prescription.getMp130do(), prescription.getMp130f(), prescription.getMp130du(), "");
        }

        if (prescription.mp131.equals("31")) {
            insertMedicineRecord(prescription.getMp131(), prescription.getMp131do(), prescription.getMp131f(), prescription.getMp131du(), "");
        }

        if (prescription.mp132.equals("32")) {
            insertMedicineRecord(prescription.getMp132(), prescription.getMp132do(), prescription.getMp132f(), prescription.getMp132du(), "");
        }

        if (prescription.mp133.equals("33")) {
            insertMedicineRecord(prescription.getMp133(), prescription.getMp133do(), prescription.getMp133f(), prescription.getMp133du(), "");
        }

        if (prescription.mp134.equals("34")) {
            insertMedicineRecord(prescription.getMp134(), prescription.getMp134do(), prescription.getMp134f(), prescription.getMp134du(), "");
        }

        if (prescription.mp135.equals("35")) {
            insertMedicineRecord(prescription.getMp135(), prescription.getMp135do(), prescription.getMp135f(), prescription.getMp135du(), "");
        }

        if (prescription.mp136.equals("36")) {
            insertMedicineRecord(prescription.getMp136(), prescription.getMp136do(), prescription.getMp136f(), prescription.getMp136du(), "");
        }

        if (prescription.mp137.equals("37")) {
            insertMedicineRecord(prescription.getMp137(), prescription.getMp137do(), prescription.getMp137f(), prescription.getMp137du(), "");
        }

        if (prescription.mp961.equals("961")) {
            insertMedicineRecord(prescription.getMp961(), prescription.getMp961do(), prescription.getMp961f(), prescription.getMp961du(), prescription.getMp961x());
        }

        if (prescription.mp962.equals("962")) {
            insertMedicineRecord(prescription.getMp962(), prescription.getMp962do(), prescription.getMp962f(), prescription.getMp962du(), prescription.getMp962x());
        }

        if (prescription.mp963.equals("963")) {
            insertMedicineRecord(prescription.getMp963(), prescription.getMp963do(), prescription.getMp963f(), prescription.getMp963du(), prescription.getMp963x());
        }

        if (prescription.mpnr.equals("999")) {
            insertMedicineRecord(prescription.getMpnr(), "999", "999", "999", "");
        }

        if (updateDB()) {
            setIStatuses();
            MainApp.PATIENT_DETAIL_EDIT = null;
            MainApp.isClearStack = true;
            Intent intent;
            if (MainApp.isUpdate) {
                MainApp.isUpdate = false;
                intent = new Intent(this, FormsReportDate.class);
                Toast.makeText(this, "Record Updated", Toast.LENGTH_SHORT).show();
            } else {
//                intent = new Intent(this, SectionScreeningActivity.class);
                intent = new Intent(this, SectionScreeningActivity.class);
//                startActivity(new Intent(this, SectionScreeningActivity.class));
                Toast.makeText(this, "Record Entered", Toast.LENGTH_SHORT).show();
            }
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
//                startActivity(new Intent(this, SectionScreeningActivity.class));


        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }

    private void setIStatuses() {
        String uuid = MainApp.patientDetails.getUid();
        db.setIStatus(PDContract.PDTable.TABLE_NAME, PDContract.PDTable.COLUMN_ISTATUS, PDContract.PDTable.COLUMN_UID, uuid);
        db.setIStatus(PDContract.COMPLAINTSTable.TABLE_NAME, PDContract.COMPLAINTSTable.COLUMN_ISTATUS, PDContract.COMPLAINTSTable.COLUMN_UUID, uuid);
        db.setIStatus(PDContract.DIAGNOSISTable.TABLE_NAME, PDContract.DIAGNOSISTable.COLUMN_ISTATUS, PDContract.DIAGNOSISTable.COLUMN_UUID, uuid);
        db.setIStatus(PDContract.PRESCRIPTIONTable.TABLE_NAME, PDContract.PRESCRIPTIONTable.COLUMN_ISTATUS, PDContract.PRESCRIPTIONTable.COLUMN_UUID, uuid);

//        if (MainApp.patientDetails.ss104y.length() > 0 && Integer.parseInt(MainApp.patientDetails.ss104y) < 5)
        db.setIStatus(PDContract.VACCINATIONTable.TABLE_NAME, PDContract.VACCINATIONTable.COLUMN_ISTATUS, PDContract.VACCINATIONTable.COLUMN_UUID, uuid);
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
        super.onBackPressed();
//        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
//        setResult(RESULT_CANCELED);
        finish();
    }
}