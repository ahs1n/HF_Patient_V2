package edu.aku.hassannaqvi.hf_patient_v2.ui.sections;

import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.vaccination;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.hf_patient_v2.R;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;
import edu.aku.hassannaqvi.hf_patient_v2.database.DatabaseHelper;
import edu.aku.hassannaqvi.hf_patient_v2.databinding.ActivitySectionVaccinationBinding;

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
}