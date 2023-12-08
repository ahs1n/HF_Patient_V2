package edu.aku.hassannaqvi.hf_patient_v2.ui.sections;

import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.diagnosis;
import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.patientDetails;
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

import java.util.List;

import edu.aku.hassannaqvi.hf_patient_v2.R;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;
import edu.aku.hassannaqvi.hf_patient_v2.database.DatabaseHelper;
import edu.aku.hassannaqvi.hf_patient_v2.databinding.ActivitySectionDiagnosisBinding;
import edu.aku.hassannaqvi.hf_patient_v2.models.Diagnosis;
import edu.aku.hassannaqvi.hf_patient_v2.models.Prescription;
import edu.aku.hassannaqvi.hf_patient_v2.models.Vaccination;

public class SectionDiagnosisActivity extends AppCompatActivity {

    ActivitySectionDiagnosisBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_diagnosis);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(diagnosis);

        if (MainApp.PATIENT_DETAIL_EDIT != null)
            presetFields(db.getDiagnosisByUUID(MainApp.PATIENT_DETAIL_EDIT.getUid()));
    }

    private void presetFields(List<Diagnosis> diagnosisList) {
        for (int i = 0; i < diagnosisList.size(); i++) {
            Diagnosis _diagnosis = diagnosisList.get(i);
            switch (_diagnosis.getDiagCode()) {
                case "1":
                    diagnosis.setSd101(_diagnosis.getDiagCode());
                    break;
                case "2":
                    diagnosis.setSd102(_diagnosis.getDiagCode());
                    break;
                case "3":
                    diagnosis.setSd103(_diagnosis.getDiagCode());
                    break;
                case "4":
                    diagnosis.setSd104(_diagnosis.getDiagCode());
                    break;
                case "5":
                    diagnosis.setSd105(_diagnosis.getDiagCode());
                    break;
                case "6":
                    diagnosis.setSd106(_diagnosis.getDiagCode());
                    break;
                case "7":
                    diagnosis.setSd107(_diagnosis.getDiagCode());
                    break;
                case "8":
                    diagnosis.setSd108(_diagnosis.getDiagCode());
                    break;
                case "9":
                    diagnosis.setSd109(_diagnosis.getDiagCode());
                    break;
                case "10":
                    diagnosis.setSd110(_diagnosis.getDiagCode());
                    break;
                case "11":
                    diagnosis.setSd111(_diagnosis.getDiagCode());
                    break;
                case "12":
                    diagnosis.setSd112(_diagnosis.getDiagCode());
                    break;
                case "13":
                    diagnosis.setSd113(_diagnosis.getDiagCode());
                    break;
                case "14":
                    diagnosis.setSd114(_diagnosis.getDiagCode());
                    break;
                case "15":
                    diagnosis.setSd115(_diagnosis.getDiagCode());
                    break;
                case "16":
                    diagnosis.setSd116(_diagnosis.getDiagCode());
                    break;
                case "17":
                    diagnosis.setSd117(_diagnosis.getDiagCode());
                    break;
                case "18":
                    diagnosis.setSd118(_diagnosis.getDiagCode());
                    break;
                case "19":
                    diagnosis.setSd119(_diagnosis.getDiagCode());
                    break;
                case "20":
                    diagnosis.setSd120(_diagnosis.getDiagCode());
                    break;
                case "21":
                    diagnosis.setSd121(_diagnosis.getDiagCode());
                    break;
                case "22":
                    diagnosis.setSd122(_diagnosis.getDiagCode());
                    break;
                case "23":
                    diagnosis.setSd123(_diagnosis.getDiagCode());
                    break;
                case "24":
                    diagnosis.setSd124(_diagnosis.getDiagCode());
                    break;
                case "25":
                    diagnosis.setSd125(_diagnosis.getDiagCode());
                    break;
                case "26":
                    diagnosis.setSd126(_diagnosis.getDiagCode());
                    break;
                case "27":
                    diagnosis.setSd127(_diagnosis.getDiagCode());
                    break;
                case "28":
                    diagnosis.setSd128(_diagnosis.getDiagCode());
                    break;
                case "29":
                    diagnosis.setSd129(_diagnosis.getDiagCode());
                    break;
                case "30":
                    diagnosis.setSd130(_diagnosis.getDiagCode());
                    break;
                case "31":
                    diagnosis.setSd131(_diagnosis.getDiagCode());
                    break;
                case "32":
                    diagnosis.setSd132(_diagnosis.getDiagCode());
                    break;
                case "33":
                    diagnosis.setSd133(_diagnosis.getDiagCode());
                    break;
                case "34":
                    diagnosis.setSd134(_diagnosis.getDiagCode());
                    break;
                case "35":
                    diagnosis.setSd135(_diagnosis.getDiagCode());
                    break;
                case "36":
                    diagnosis.setSd136(_diagnosis.getDiagCode());
                    break;
                case "37":
                    diagnosis.setSd137(_diagnosis.getDiagCode());
                    break;
                case "38":
                    diagnosis.setSd138(_diagnosis.getDiagCode());
                    break;
                case "39":
                    diagnosis.setSd139(_diagnosis.getDiagCode());
                    break;
                case "40":
                    diagnosis.setSd140(_diagnosis.getDiagCode());
                    break;
                case "41":
                    diagnosis.setSd141(_diagnosis.getDiagCode());
                    break;
                case "42":
                    diagnosis.setSd142(_diagnosis.getDiagCode());
                    break;
                case "43":
                    diagnosis.setSd143(_diagnosis.getDiagCode());
                    break;
                case "44":
                    diagnosis.setSd144(_diagnosis.getDiagCode());
                    break;
                case "45":
                    diagnosis.setSd145(_diagnosis.getDiagCode());
                    break;
                case "46":
                    diagnosis.setSd146(_diagnosis.getDiagCode());
                    break;
                case "47":
                    diagnosis.setSd147(_diagnosis.getDiagCode());
                    break;
                case "48":
                    diagnosis.setSd148(_diagnosis.getDiagCode());
                    break;
                case "49":
                    diagnosis.setSd149(_diagnosis.getDiagCode());
                    break;
                case "999":
                    diagnosis.setSd100nr(_diagnosis.getDiagCode());
                    break;
                case "961":
                    diagnosis.setSd961(_diagnosis.getDiagCode());
                    diagnosis.setSd961x(_diagnosis.getDiagOther());
                    break;
                case "962":
                    diagnosis.setSd962(_diagnosis.getDiagCode());
                    diagnosis.setSd962x(_diagnosis.getDiagOther());
                    break;
                case "963":
                    diagnosis.setSd963(_diagnosis.getDiagCode());
                    diagnosis.setSd963x(_diagnosis.getDiagOther());
                    break;
                case "964":
                    diagnosis.setSd964(_diagnosis.getDiagCode());
                    diagnosis.setSd964x(_diagnosis.getDiagOther());
                    break;
                case "965":
                    diagnosis.setSd965(_diagnosis.getDiagCode());
                    diagnosis.setSd965x(_diagnosis.getDiagOther());
                    break;
                case "966":
                    diagnosis.setSd966(_diagnosis.getDiagCode());
                    diagnosis.setSd966x(_diagnosis.getDiagOther());
                    break;


            }
        }
    }


    private boolean insertNewRecord() {
        if (!diagnosis.getUid().equals("")) return true;
        MainApp.diagnosis.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addDIAG(diagnosis);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        diagnosis.setId(String.valueOf(rowId));
        if (rowId > 0) {
            diagnosis.setUid(diagnosis.getDeviceId() + diagnosis.getId());
            db.updatesDIAGColumn(PDContract.DIAGNOSISTable.COLUMN_UID, diagnosis.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void presetFields() {

    }


    private boolean insertDiagnosisRecord(String diagCode, String otherSpecify) {

//        if (!prescription.getUid().equals("")) return;
        diagnosis.populateMeta();

        diagnosis.updateDiagnosis(diagCode, otherSpecify);
        long rowId = 0;
        try {
            rowId = db.addDIAG(diagnosis);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        diagnosis.setId(String.valueOf(rowId));
        if (rowId > 0) {
            diagnosis.setUid(diagnosis.getDeviceId() + diagnosis.getId());
            db.updatesDIAGColumn(PDContract.DIAGNOSISTable.COLUMN_UID, diagnosis.getUid());
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
            updcount = db.updatesDIAGColumn(PDContract.DIAGNOSISTable.COLUMN_SDIAG, diagnosis.sDIAGtoString());
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
//        if (!insertNewRecord()) return;

        // Delete records if already exists to avoid redundancy and data messing up
        db.deleteDiagnosisByUUID(patientDetails.getUid());

        if (diagnosis.sd101.equals("1")) {
            insertDiagnosisRecord(diagnosis.getSd101(), "");
        }

        if (diagnosis.sd102.equals("2")) {
            insertDiagnosisRecord(diagnosis.getSd102(), "");
        }

        if (diagnosis.sd103.equals("3")) {
            insertDiagnosisRecord(diagnosis.getSd103(), "");
        }

        if (diagnosis.sd104.equals("4")) {
            insertDiagnosisRecord(diagnosis.getSd104(), "");
        }

        if (diagnosis.sd105.equals("5")) {
            insertDiagnosisRecord(diagnosis.getSd105(), "");
        }


        if (diagnosis.sd106.equals("6")) {
            insertDiagnosisRecord(diagnosis.getSd106(), "");
        }


        if (diagnosis.sd107.equals("7")) {
            insertDiagnosisRecord(diagnosis.getSd107(), "");
        }


        if (diagnosis.sd108.equals("8")) {
            insertDiagnosisRecord(diagnosis.getSd108(), "");
        }


        if (diagnosis.sd109.equals("9")) {
            insertDiagnosisRecord(diagnosis.getSd109(), "");
        }


        if (diagnosis.sd110.equals("10")) {
            insertDiagnosisRecord(diagnosis.getSd110(), "");
        }

        if (diagnosis.sd111.equals("11")) {
            insertDiagnosisRecord(diagnosis.getSd111(), "");
        }

        if (diagnosis.sd112.equals("12")) {
            insertDiagnosisRecord(diagnosis.getSd112(), "");
        }

        if (diagnosis.sd113.equals("13")) {
            insertDiagnosisRecord(diagnosis.getSd113(), "");
        }

        if (diagnosis.sd114.equals("14")) {
            insertDiagnosisRecord(diagnosis.getSd114(), "");
        }

        if (diagnosis.sd115.equals("15")) {
            insertDiagnosisRecord(diagnosis.getSd115(), "");
        }

        if (diagnosis.sd116.equals("16")) {
            insertDiagnosisRecord(diagnosis.getSd116(), "");
        }

        if (diagnosis.sd117.equals("17")) {
            insertDiagnosisRecord(diagnosis.getSd117(), "");
        }

        if (diagnosis.sd118.equals("18")) {
            insertDiagnosisRecord(diagnosis.getSd118(), "");
        }

        if (diagnosis.sd119.equals("19")) {
            insertDiagnosisRecord(diagnosis.getSd119(), "");
        }

        if (diagnosis.sd120.equals("20")) {
            insertDiagnosisRecord(diagnosis.getSd120(), "");
        }

        if (diagnosis.sd121.equals("21")) {
            insertDiagnosisRecord(diagnosis.getSd121(), "");
        }

        if (diagnosis.sd122.equals("22")) {
            insertDiagnosisRecord(diagnosis.getSd122(), "");
        }

        if (diagnosis.sd123.equals("23")) {
            insertDiagnosisRecord(diagnosis.getSd123(), "");
        }

        if (diagnosis.sd124.equals("24")) {
            insertDiagnosisRecord(diagnosis.getSd124(), "");
        }

        if (diagnosis.sd125.equals("25")) {
            insertDiagnosisRecord(diagnosis.getSd125(), "");
        }

        if (diagnosis.sd126.equals("26")) {
            insertDiagnosisRecord(diagnosis.getSd126(), "");
        }

        if (diagnosis.sd127.equals("27")) {
            insertDiagnosisRecord(diagnosis.getSd127(), "");
        }

        if (diagnosis.sd128.equals("28")) {
            insertDiagnosisRecord(diagnosis.getSd128(), "");
        }

        if (diagnosis.sd129.equals("29")) {
            insertDiagnosisRecord(diagnosis.getSd129(), "");
        }

        if (diagnosis.sd130.equals("30")) {
            insertDiagnosisRecord(diagnosis.getSd130(), "");
        }

        if (diagnosis.sd131.equals("31")) {
            insertDiagnosisRecord(diagnosis.getSd131(), "");
        }

        if (diagnosis.sd132.equals("32")) {
            insertDiagnosisRecord(diagnosis.getSd132(), "");
        }

        if (diagnosis.sd133.equals("33")) {
            insertDiagnosisRecord(diagnosis.getSd133(), "");
        }

        if (diagnosis.sd134.equals("34")) {
            insertDiagnosisRecord(diagnosis.getSd134(), "");
        }

        if (diagnosis.sd135.equals("35")) {
            insertDiagnosisRecord(diagnosis.getSd135(), "");
        }

        if (diagnosis.sd136.equals("36")) {
            insertDiagnosisRecord(diagnosis.getSd136(), "");
        }

        if (diagnosis.sd137.equals("37")) {
            insertDiagnosisRecord(diagnosis.getSd137(), "");
        }

        if (diagnosis.sd138.equals("38")) {
            insertDiagnosisRecord(diagnosis.getSd138(), "");
        }

        if (diagnosis.sd139.equals("39")) {
            insertDiagnosisRecord(diagnosis.getSd139(), "");
        }

        if (diagnosis.sd140.equals("40")) {
            insertDiagnosisRecord(diagnosis.getSd140(), "");
        }

        if (diagnosis.sd141.equals("41")) {
            insertDiagnosisRecord(diagnosis.getSd141(), "");
        }

        if (diagnosis.sd142.equals("42")) {
            insertDiagnosisRecord(diagnosis.getSd142(), "");
        }

        if (diagnosis.sd143.equals("43")) {
            insertDiagnosisRecord(diagnosis.getSd143(), "");
        }

        if (diagnosis.sd144.equals("44")) {
            insertDiagnosisRecord(diagnosis.getSd144(), "");
        }

        if (diagnosis.sd145.equals("45")) {
            insertDiagnosisRecord(diagnosis.getSd145(), "");
        }

        if (diagnosis.sd146.equals("46")) {
            insertDiagnosisRecord(diagnosis.getSd146(), "");
        }

        if (diagnosis.sd147.equals("47")) {
            insertDiagnosisRecord(diagnosis.getSd147(), "");
        }

        if (diagnosis.sd148.equals("48")) {
            insertDiagnosisRecord(diagnosis.getSd148(), "");
        }

        if (diagnosis.sd149.equals("49")) {
            insertDiagnosisRecord(diagnosis.getSd149(), "");
        }

        if (diagnosis.sd100nr.equals("999")) {
            insertDiagnosisRecord(diagnosis.getSd100nr(), "");
        }

        if (diagnosis.sd961.equals("961")) {
            insertDiagnosisRecord(diagnosis.getSd961(), diagnosis.getSd961x());
        }

        if (diagnosis.sd962.equals("962")) {
            insertDiagnosisRecord(diagnosis.getSd962(), diagnosis.getSd962x());
        }

        if (diagnosis.sd963.equals("963")) {
            insertDiagnosisRecord(diagnosis.getSd963(), diagnosis.getSd963x());
        }

        if (diagnosis.sd964.equals("964")) {
            insertDiagnosisRecord(diagnosis.getSd964(), diagnosis.getSd964x());
        }

        if (diagnosis.sd965.equals("965")) {
            insertDiagnosisRecord(diagnosis.getSd965(), diagnosis.getSd965x());
        }

        if (diagnosis.sd966.equals("966")) {
            insertDiagnosisRecord(diagnosis.getSd966(), diagnosis.getSd966x());
        }


        if (updateDB()) {
            if (patientDetails.ss104y.length() > 0 && Integer.parseInt(patientDetails.ss104y) < 5
                    && (patientDetails.getSs601().equals("1") || patientDetails.getSs601().equals("3"))) {
                vaccination = new Vaccination();
                startActivity(new Intent(this, SectionVaccinationActivity.class));
            } else {
                prescription = new Prescription();
                startActivity(new Intent(this, SectionPrescriptionActivity.class));
            }
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }


    public void BtnEnd(View view) {
        finish();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}