package edu.aku.hassannaqvi.hf_patient_v2.ui.sections;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.hf_patient_v2.R;
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
    }
}