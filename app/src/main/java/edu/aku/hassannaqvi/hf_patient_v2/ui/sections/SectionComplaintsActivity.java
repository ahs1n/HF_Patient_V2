package edu.aku.hassannaqvi.hf_patient_v2.ui.sections;

import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.complaints;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
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
import edu.aku.hassannaqvi.hf_patient_v2.databinding.ActivitySectionComplaintsBinding;
import edu.aku.hassannaqvi.hf_patient_v2.models.Complaints;

public class SectionComplaintsActivity extends AppCompatActivity {

    ActivitySectionComplaintsBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_complaints);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;


        bi.setForm(complaints);

        if (MainApp.PATIENT_DETAIL_EDIT != null)
            presetFields(db.getComplaintsByUUID(MainApp.PATIENT_DETAIL_EDIT.getUid()));
    }

    private void presetFields(List<Complaints> complaintsList) {
        for (int i = 0; i < complaintsList.size(); i++) {
            Complaints _complaints = complaintsList.get(i);

            switch (_complaints.getCompCode()) {
                case "1":
                    complaints.setPc201(_complaints.getCompCode());
                    break;
                case "2":
                    complaints.setPc202(_complaints.getCompCode());
                    break;
                case "3":
                    complaints.setPc203(_complaints.getCompCode());
                    break;
                case "4":
                    complaints.setPc204(_complaints.getCompCode());
                    break;
                case "5":
                    complaints.setPc205(_complaints.getCompCode());
                    break;
                case "6":
                    complaints.setPc206(_complaints.getCompCode());
                    break;
                case "7":
                    complaints.setPc207(_complaints.getCompCode());
                    break;
                case "8":
                    complaints.setPc208(_complaints.getCompCode());
                    break;
                case "9":
                    complaints.setPc209(_complaints.getCompCode());
                    break;
                case "10":
                    complaints.setPc210(_complaints.getCompCode());
                    break;
                case "11":
                    complaints.setPc211(_complaints.getCompCode());
                    break;
                case "12":
                    complaints.setPc212(_complaints.getCompCode());
                    break;
                case "13":
                    complaints.setPc213(_complaints.getCompCode());
                    break;
                case "14":
                    complaints.setPc214(_complaints.getCompCode());
                    break;
                case "15":
                    complaints.setPc215(_complaints.getCompCode());
                    break;
                case "16":
                    complaints.setPc216(_complaints.getCompCode());
                    break;
                case "17":
                    complaints.setPc217(_complaints.getCompCode());
                    break;
                case "18":
                    complaints.setPc218(_complaints.getCompCode());
                    break;
                case "19":
                    complaints.setPc219(_complaints.getCompCode());
                    break;
                case "20":
                    complaints.setPc220(_complaints.getCompCode());
                    break;
                case "21":
                    complaints.setPc221(_complaints.getCompCode());
                    break;
                case "22":
                    complaints.setPc222(_complaints.getCompCode());
                    break;
                case "23":
                    complaints.setPc223(_complaints.getCompCode());
                    break;
                case "24":
                    complaints.setPc224(_complaints.getCompCode());
                    break;
                case "25":
                    complaints.setPc225(_complaints.getCompCode());
                    break;
                case "26":
                    complaints.setPc226(_complaints.getCompCode());
                    break;
                case "27":
                    complaints.setPc227(_complaints.getCompCode());
                    break;
                case "28":
                    complaints.setPc228(_complaints.getCompCode());
                    break;
                case "29":
                    complaints.setPc229(_complaints.getCompCode());
                    break;
                case "30":
                    complaints.setPc230(_complaints.getCompCode());
                    break;
                case "31":
                    complaints.setPc231(_complaints.getCompCode());
                    break;
                case "32":
                    complaints.setPc232(_complaints.getCompCode());
                    break;
                case "33":
                    complaints.setPc233(_complaints.getCompCode());
                    break;
                case "34":
                    complaints.setPc234(_complaints.getCompCode());
                    break;
                case "35":
                    complaints.setPc235(_complaints.getCompCode());
                    break;
                case "36":
                    complaints.setPc236(_complaints.getCompCode());
                    break;
                case "37":
                    complaints.setPc237(_complaints.getCompCode());
                    break;
                case "38":
                    complaints.setPc238(_complaints.getCompCode());
                    break;
                case "39":
                    complaints.setPc239(_complaints.getCompCode());
                    break;
                case "40":
                    complaints.setPc240(_complaints.getCompCode());
                    break;
                case "41":
                    complaints.setPc241(_complaints.getCompCode());
                    break;
                case "42":
                    complaints.setPc242(_complaints.getCompCode());
                    break;
                case "43":
                    complaints.setPc243(_complaints.getCompCode());
                    break;
                case "44":
                    complaints.setPc244(_complaints.getCompCode());
                    break;
                case "45":
                    complaints.setPc245(_complaints.getCompCode());
                    break;
                case "46":
                    complaints.setPc246(_complaints.getCompCode());
                    break;
                case "47":
                    complaints.setPc247(_complaints.getCompCode());
                    break;
                case "48":
                    complaints.setPc248(_complaints.getCompCode());
                    break;
                case "49":
                    complaints.setPc249(_complaints.getCompCode());
                    break;
                case "50":
                    complaints.setPc250(_complaints.getCompCode());
                    break;
                case "51":
                    complaints.setPc251(_complaints.getCompCode());
                    break;
                case "52":
                    complaints.setPc252(_complaints.getCompCode());
                    break;
                case "53":
                    complaints.setPc253(_complaints.getCompCode());
                    break;
                case "54":
                    complaints.setPc254(_complaints.getCompCode());
                    break;
                case "55":
                    complaints.setPc255(_complaints.getCompCode());
                    break;
                case "56":
                    complaints.setPc256(_complaints.getCompCode());
                    break;
                case "57":
                    complaints.setPc257(_complaints.getCompCode());
                    break;
                case "58":
                    complaints.setPc258(_complaints.getCompCode());
                    break;
                case "59":
                    complaints.setPc259(_complaints.getCompCode());
                    break;
                case "961":
                    complaints.setPc2961(_complaints.getCompCode());
                    complaints.setPc2961x(_complaints.getCompOther());
                    break;
                case "962":
                    complaints.setPc2962(_complaints.getCompCode());
                    complaints.setPc2962x(_complaints.getCompOther());
                    break;
                case "963":
                    complaints.setPc2963(_complaints.getCompCode());
                    complaints.setPc2963x(_complaints.getCompOther());
                    break;
                case "999":
                    complaints.setPc200nr(_complaints.getCompCode());
                    break;
            }

//            bi.setForm(complaints);
        }
    }


    private boolean insertNewRecord() {
        if (!complaints.getUid().equals("")) return true;
        MainApp.complaints.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addCOMP(complaints);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        complaints.setId(String.valueOf(rowId));
        if (rowId > 0) {
            complaints.setUid(complaints.getDeviceId() + complaints.getId());
            db.updatesCOMPColumn(PDContract.COMPLAINTSTable.COLUMN_UID, complaints.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean insertComplaintsRecord(String compCode, String otherSpecify) {

//        if (!prescription.getUid().equals("")) return;
        complaints.populateMeta();

        complaints.updateComplaints(compCode, otherSpecify);
        long rowId = 0;
        try {
            rowId = db.addCOMP(complaints);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        complaints.setId(String.valueOf(rowId));
        if (rowId > 0) {
            complaints.setUid(complaints.getDeviceId() + complaints.getId());
            db.updatesCOMPColumn(PDContract.COMPLAINTSTable.COLUMN_UID, complaints.getUid());
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
            updcount = db.updatesCOMPColumn(PDContract.COMPLAINTSTable.COLUMN_SCOMP, complaints.sCOMPtoString());
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

        if (complaints.pc201.equals("1")) {
            insertComplaintsRecord(complaints.getPc201(), "");
        }

        if (complaints.pc202.equals("2")) {
            insertComplaintsRecord(complaints.getPc202(), "");
        }

        if (complaints.pc203.equals("3")) {
            insertComplaintsRecord(complaints.getPc203(), "");
        }

        if (complaints.pc204.equals("4")) {
            insertComplaintsRecord(complaints.getPc204(), "");
        }

        if (complaints.pc205.equals("5")) {
            insertComplaintsRecord(complaints.getPc205(), "");
        }

        if (complaints.pc206.equals("6")) {
            insertComplaintsRecord(complaints.getPc206(), "");
        }

        if (complaints.pc207.equals("7")) {
            insertComplaintsRecord(complaints.getPc207(), "");
        }

        if (complaints.pc208.equals("8")) {
            insertComplaintsRecord(complaints.getPc208(), "");
        }

        if (complaints.pc209.equals("9")) {
            insertComplaintsRecord(complaints.getPc209(), "");
        }

        if (complaints.pc210.equals("10")) {
            insertComplaintsRecord(complaints.getPc210(), "");
        }

        if (complaints.pc211.equals("11")) {
            insertComplaintsRecord(complaints.getPc211(), "");
        }

        if (complaints.pc212.equals("12")) {
            insertComplaintsRecord(complaints.getPc212(), "");
        }

        if (complaints.pc213.equals("13")) {
            insertComplaintsRecord(complaints.getPc213(), "");
        }

        if (complaints.pc214.equals("14")) {
            insertComplaintsRecord(complaints.getPc214(), "");
        }

        if (complaints.pc215.equals("15")) {
            insertComplaintsRecord(complaints.getPc215(), "");
        }

        if (complaints.pc216.equals("16")) {
            insertComplaintsRecord(complaints.getPc216(), "");
        }

        if (complaints.pc217.equals("17")) {
            insertComplaintsRecord(complaints.getPc217(), "");
        }

        if (complaints.pc218.equals("18")) {
            insertComplaintsRecord(complaints.getPc218(), "");
        }

        if (complaints.pc219.equals("19")) {
            insertComplaintsRecord(complaints.getPc219(), "");
        }

        if (complaints.pc220.equals("20")) {
            insertComplaintsRecord(complaints.getPc220(), "");
        }

        if (complaints.pc221.equals("21")) {
            insertComplaintsRecord(complaints.getPc221(), "");
        }

        if (complaints.pc222.equals("22")) {
            insertComplaintsRecord(complaints.getPc222(), "");
        }

        if (complaints.pc223.equals("23")) {
            insertComplaintsRecord(complaints.getPc223(), "");
        }

        if (complaints.pc224.equals("24")) {
            insertComplaintsRecord(complaints.getPc224(), "");
        }

        if (complaints.pc225.equals("25")) {
            insertComplaintsRecord(complaints.getPc225(), "");
        }

        if (complaints.pc226.equals("26")) {
            insertComplaintsRecord(complaints.getPc226(), "");
        }

        if (complaints.pc227.equals("27")) {
            insertComplaintsRecord(complaints.getPc227(), "");
        }

        if (complaints.pc228.equals("28")) {
            insertComplaintsRecord(complaints.getPc228(), "");
        }

        if (complaints.pc229.equals("29")) {
            insertComplaintsRecord(complaints.getPc229(), "");
        }

        if (complaints.pc230.equals("30")) {
            insertComplaintsRecord(complaints.getPc230(), "");
        }

        if (complaints.pc231.equals("31")) {
            insertComplaintsRecord(complaints.getPc231(), "");
        }

        if (complaints.pc232.equals("32")) {
            insertComplaintsRecord(complaints.getPc232(), "");
        }

        if (complaints.pc233.equals("33")) {
            insertComplaintsRecord(complaints.getPc233(), "");
        }

        if (complaints.pc234.equals("34")) {
            insertComplaintsRecord(complaints.getPc234(), "");
        }

        if (complaints.pc235.equals("35")) {
            insertComplaintsRecord(complaints.getPc235(), "");
        }

        if (complaints.pc236.equals("36")) {
            insertComplaintsRecord(complaints.getPc236(), "");
        }

        if (complaints.pc237.equals("37")) {
            insertComplaintsRecord(complaints.getPc237(), "");
        }

        if (complaints.pc238.equals("38")) {
            insertComplaintsRecord(complaints.getPc238(), "");
        }

        if (complaints.pc239.equals("39")) {
            insertComplaintsRecord(complaints.getPc239(), "");
        }

        if (complaints.pc240.equals("40")) {
            insertComplaintsRecord(complaints.getPc240(), "");
        }

        if (complaints.pc241.equals("41")) {
            insertComplaintsRecord(complaints.getPc241(), "");
        }

        if (complaints.pc242.equals("42")) {
            insertComplaintsRecord(complaints.getPc242(), "");
        }

        if (complaints.pc243.equals("43")) {
            insertComplaintsRecord(complaints.getPc243(), "");
        }

        if (complaints.pc244.equals("44")) {
            insertComplaintsRecord(complaints.getPc244(), "");
        }

        if (complaints.pc245.equals("45")) {
            insertComplaintsRecord(complaints.getPc245(), "");
        }

        if (complaints.pc246.equals("46")) {
            insertComplaintsRecord(complaints.getPc246(), "");
        }

        if (complaints.pc247.equals("47")) {
            insertComplaintsRecord(complaints.getPc247(), "");
        }

        if (complaints.pc248.equals("48")) {
            insertComplaintsRecord(complaints.getPc248(), "");
        }

        if (complaints.pc249.equals("49")) {
            insertComplaintsRecord(complaints.getPc249(), "");
        }

        if (complaints.pc250.equals("50")) {
            insertComplaintsRecord(complaints.getPc250(), "");
        }

        if (complaints.pc251.equals("51")) {
            insertComplaintsRecord(complaints.getPc251(), "");
        }

        if (complaints.pc252.equals("52")) {
            insertComplaintsRecord(complaints.getPc252(), "");
        }

        if (complaints.pc253.equals("53")) {
            insertComplaintsRecord(complaints.getPc253(), "");
        }

        if (complaints.pc254.equals("54")) {
            insertComplaintsRecord(complaints.getPc254(), "");
        }

        if (complaints.pc255.equals("55")) {
            insertComplaintsRecord(complaints.getPc255(), "");
        }

        if (complaints.pc256.equals("56")) {
            insertComplaintsRecord(complaints.getPc256(), "");
        }

        if (complaints.pc257.equals("57")) {
            insertComplaintsRecord(complaints.getPc257(), "");
        }

        if (complaints.pc258.equals("58")) {
            insertComplaintsRecord(complaints.getPc258(), "");
        }

        if (complaints.pc259.equals("59")) {
            insertComplaintsRecord(complaints.getPc259(), "");
        }

        if (complaints.pc2961.equals("961")) {
            insertComplaintsRecord(complaints.getPc2961(), complaints.getPc2961x());
        }

        if (complaints.pc2962.equals("962")) {
            insertComplaintsRecord(complaints.getPc2962(), complaints.getPc2962x());
        }

        if (complaints.pc2963.equals("963")) {
            insertComplaintsRecord(complaints.getPc2963(), complaints.getPc2963x());
        }

        if (complaints.pc200nr.equals("999")) {
            insertComplaintsRecord(complaints.getPc200nr(), "");
        }


        if (updateDB()) {
//            finish();
            startActivity(new Intent(this, SectionHistoryActivity.class));
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
        super.onBackPressed();
        startActivity(new Intent(this, SectionScreeningActivity.class));
        finish();
//        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
//        setResult(RESULT_CANCELED);
//        finish();
    }
}