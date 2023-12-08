package edu.aku.hassannaqvi.hf_patient_v2.ui.sections;

import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.patientDetails;
import static edu.aku.hassannaqvi.hf_patient_v2.utils.extension.ActivityExtKt.gotoActivity;
import static edu.aku.hassannaqvi.hf_patient_v2.utils.extension.ActivityExtKt.gotoActivityWithPutExtra;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.google.gson.Gson;
import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import edu.aku.hassannaqvi.hf_patient_v2.R;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;
import edu.aku.hassannaqvi.hf_patient_v2.database.DatabaseHelper;
import edu.aku.hassannaqvi.hf_patient_v2.databinding.ActivityMobileHealthR2Binding;
import edu.aku.hassannaqvi.hf_patient_v2.models.Camps;
import edu.aku.hassannaqvi.hf_patient_v2.models.Doctor;
import edu.aku.hassannaqvi.hf_patient_v2.models.PatientDetails;
import edu.aku.hassannaqvi.hf_patient_v2.ui.MainActivity;
import edu.aku.hassannaqvi.hf_patient_v2.utils.AppUtilsKt;
import edu.aku.hassannaqvi.hf_patient_v2.utils.DateUtils;
import edu.aku.hassannaqvi.hf_patient_v2.utils.EndSectionActivity;
import edu.aku.hassannaqvi.hf_patient_v2.utils.shared.SharedStorage;

public class SectionMobileHealthR2 extends AppCompatActivity implements EndSectionActivity {

    private final boolean AllVaccinationsViewed = false;
    ActivityMobileHealthR2Binding bi;
    private String patientType;
    private List<String> campNo;
    private DatabaseHelper db;
    private ArrayList<String> doctorNames, doctorCodes;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_mobile_health_r2);
        bi.setCallback(this);
        setSupportActionBar(bi.toolbar);

        /*
         * Get camp data and set it to xml
         * */
        Camps camp = new Gson().fromJson(SharedStorage.INSTANCE.getSelectedFacilityData(this), Camps.class);
        bi.setCamps(camp);

        db = MainApp.appInfo.dbHelper;
        setupSkips();
        populateSpinner();

        bi.ss101.setMinDate(DateUtils.getMonthsBack("dd/MM/yyyy", -4));
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
        bi.pc201a.setAdapter(new ArrayAdapter<>(SectionMobileHealthR2.this, R.layout.custom_spinner, doctorNames));

        bi.pc201a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position != 0) {
                    MainApp.selectedDoctorName = (doctorNames.get(bi.pc201a.getSelectedItemPosition()));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
    }


    private void setupSkips() {

        bi.ss108.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i == bi.ss10801.getId()) {
                Clear.clearAllFields(bi.fldGrpCVss109);
                bi.fldGrpCVss109.setVisibility(View.GONE);
                Clear.clearAllFields(bi.fldGrpCVvs301);
                bi.fldGrpCVvs301.setVisibility(View.GONE);
            } else {
                if (TextUtils.isEmpty(bi.ss107y.getText().toString())) {
                    return;
                } else if (Integer.parseInt(bi.ss107y.getText().toString()) >= 14) {
                    bi.fldGrpCVss109.setVisibility(View.VISIBLE);
                    bi.fldGrpCVvs301.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.ss108a.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVss109));
        bi.ss108a.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVss111));

        bi.ss108.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVss109));
        bi.ss108.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVss111));
        bi.ss108.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVvs301));

        bi.vs307.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVvs308));

        bi.vs30699.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.vs306check, !b));

        bi.ss11099.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.ss110, !b));
        bi.ss11199.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.ss111check, !b));
        bi.pc20199.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.pc201check, !b));
        bi.di20299.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.di202check, !b));
        bi.me20399.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.me203check, !b));

        bi.ss111c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if (isChecked) {
                    bi.fldGrpCVvs306v.setVisibility(View.VISIBLE);
                    bi.fldGrpCVvs307.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrpCVvs306v.setVisibility(View.GONE);
                    bi.fldGrpCVvs307.setVisibility(View.GONE);
                    Clear.clearAllFields(bi.fldGrpCVvs306v);
                    Clear.clearAllFields(bi.fldGrpCVvs307);
                    bi.bcg.setTag(null);
                    bi.penta.setTag(null);
                    bi.measles.setTag(null);
                    bi.dpt.setTag(null);
                    bi.opv.setTag(null);
                    bi.pcv.setTag(null);
                    bi.rota.setTag(null);
                    bi.hepb.setTag(null);
                    bi.tcv.setTag(null);
                    bi.ipv.setTag(null);
                    bi.bcg.setChecked(false);
                    bi.dpt.setChecked(false);
                    bi.hepb.setChecked(false);
                    bi.tcv.setChecked(false);
                }
            }
        });


        setTags(bi.bcg, new View[]{bi.penta, bi.measles, bi.opv, bi.pcv, bi.rota, bi.ipv, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.penta, new View[]{bi.bcg, bi.measles, bi.opv, bi.pcv, bi.rota, bi.ipv, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.measles, new View[]{bi.bcg, bi.penta, bi.opv, bi.pcv, bi.rota, bi.ipv, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.dpt, new View[]{bi.bcg, bi.penta, bi.measles, bi.opv, bi.pcv, bi.rota, bi.ipv, bi.hepb, bi.tcv});
        setTags(bi.opv, new View[]{bi.bcg, bi.penta, bi.measles, bi.pcv, bi.rota, bi.ipv, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.pcv, new View[]{bi.bcg, bi.penta, bi.measles, bi.opv, bi.rota, bi.ipv, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.rota, new View[]{bi.bcg, bi.penta, bi.measles, bi.opv, bi.pcv, bi.ipv, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.ipv, new View[]{bi.bcg, bi.penta, bi.measles, bi.opv, bi.pcv, bi.rota, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.hepb, new View[]{bi.bcg, bi.penta, bi.measles, bi.opv, bi.pcv, bi.rota, bi.dpt, bi.ipv, bi.tcv});
        setTags(bi.tcv, new View[]{bi.bcg, bi.penta, bi.measles, bi.opv, bi.pcv, bi.rota, bi.dpt, bi.ipv, bi.hepb});

    }

    public void ss107yOnTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(bi.ss107y.getText().toString()))
            return;

        Clear.clearAllFields(bi.fldGrpCVss108);

        int age = Integer.parseInt(bi.ss107y.getText().toString());

        if (age >= 5) {
            Clear.clearAllFields(bi.fldGrpCVdi202);
            bi.fldGrpCVdi202.setVisibility(View.GONE);
            Clear.clearAllFields(bi.fldGrpU5);
            bi.fldGrpU5.setVisibility(View.GONE);
        } else {
            bi.fldGrpCVdi202.setVisibility(View.VISIBLE);
            bi.fldGrpU5.setVisibility(View.VISIBLE);
        }

        if (age < 5) {
            Clear.clearAllFields(bi.fldGrpCVpc201);
            bi.fldGrpCVpc201.setVisibility(View.GONE);
        } else {
            bi.fldGrpCVpc201.setVisibility(View.VISIBLE);
        }

        if (age < 14) {
            Clear.clearAllFields(bi.fldGrpCVss109);
            bi.fldGrpCVss109.setVisibility(View.GONE);
            Clear.clearAllFields(bi.fldGrpCVvs301);
            bi.fldGrpCVvs301.setVisibility(View.GONE);
        } else {
            bi.fldGrpCVss109.setVisibility(View.VISIBLE);
            bi.fldGrpCVvs301.setVisibility(View.VISIBLE);
        }

        if (age < 13) {
            bi.ss1082.setChecked(true);
            bi.fldGrpCVss108a.setVisibility(View.GONE);
        } else {
            Clear.clearAllFields(bi.fldGrpCVss108a);
            bi.fldGrpCVss108a.setVisibility(View.VISIBLE);
        }
    }

    public void setTags(RadioGroup rg, View[] views) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            for (View view : views) view.setTag("-1");
        });
    }

    public void setTags(RadioButton rb, View[] views) {
        rb.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) for (View view : views) view.setTag("-1");
        });
    }


    public void segregateByAge(CharSequence s, int i, int i1, int i2) {
        segregate();
    }


    public void segregateByGender(RadioGroup radioGroup, int i) {
        segregate();
    }


    public void segregate() {
    }


    private boolean UpdateDB() throws JSONException {
        long updcount = db.addPD(patientDetails);
        patientDetails.setId(String.valueOf(updcount));
        if (updcount > 0) {
            patientDetails.setUid(patientDetails.getDeviceId() + patientDetails.getId());
            long count = db.updatesPDColumn(PDContract.PDTable.COLUMN_UID, patientDetails.getUid());
            if (count > 0)
                count = db.updatesPDColumn(PDContract.PDTable.COLUMN_SPD, patientDetails.sPDtoString());
            if (count > 0) return true;
            else {
                Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
                return false;
            }
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private void saveDraft() {
        patientDetails = new PatientDetails();
        patientDetails.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        patientDetails.setUserName(MainApp.user.getUserName());
        patientDetails.setDeviceId(MainApp.appInfo.getDeviceID());
        patientDetails.setDeviceTag(MainApp.appInfo.getTagName());
        patientDetails.setAppver(MainApp.appInfo.getAppVersion());
    }


    public void BtnContinue(View view) throws JSONException {
        if (!formValidation()) return;
        saveDraft();
        if (UpdateDB()) {
            Toast.makeText(this, "Patient Added", Toast.LENGTH_SHORT).show();
            finish();
            gotoActivityWithPutExtra(this, SectionMobileHealthR2.class, "complete", true);
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void BtnEnd(View view) {
        AppUtilsKt.contextEndActivity(this);
    }


    @Override
    public void endSecActivity(boolean flag) {
        finish();
        gotoActivity(this, MainActivity.class);

    }
}