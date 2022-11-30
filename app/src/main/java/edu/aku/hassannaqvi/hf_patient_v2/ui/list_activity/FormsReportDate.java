package edu.aku.hassannaqvi.hf_patient_v2.ui.list_activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import edu.aku.hassannaqvi.hf_patient_v2.R;
import edu.aku.hassannaqvi.hf_patient_v2.adapters.FormsAdapter;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;
import edu.aku.hassannaqvi.hf_patient_v2.database.DatabaseHelper;
import edu.aku.hassannaqvi.hf_patient_v2.models.PatientDetails;
import edu.aku.hassannaqvi.hf_patient_v2.ui.sections.SectionScreeningActivity;


public class FormsReportDate extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private static final String TAG = "FormsReportDate";
    DatabaseHelper db;
    Collection<PatientDetails> fc;
    //    String sysdateToday = new SimpleDateFormat("dd-MM-yy").format(new Date());
    String sysdateToday = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(new Date());
    RadioGroup searchRG;
    RadioButton sbDateRB, sbNameRB, sbPRNoRB;
    TextView dtFilter, nameFilter, prnoFilter;
    TextView noresult;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter formsAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms_report_date);
        recyclerView = findViewById(R.id.fc_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        searchRG = findViewById(R.id.searchRG);
        searchRG.setOnCheckedChangeListener(this);

        sbDateRB = findViewById(R.id.sbDateRB);
        sbNameRB = findViewById(R.id.sbNameRB);
        sbPRNoRB = findViewById(R.id.sbPRNoRB);

        dtFilter = findViewById(R.id.dtFilter);
        nameFilter = findViewById(R.id.nameFilter);
        prnoFilter = findViewById(R.id.prnoFilter);

        noresult = findViewById(R.id.noresult);
        db = new DatabaseHelper(this);
        try {
            dtFilter.setText(sysdateToday);
            fc = db.getTodayForms(dtFilter.getText().toString());
//            fc = db.getTodayForms(sysdateToday);
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "onCreate(getTodayForms): " + e.getMessage());
            Toast.makeText(this, "onCreate(getTodayForms): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        // specify an adapter (see also next example)
        formsAdapter = new FormsAdapter((List<PatientDetails>) fc, this, iOnRVItemClickListener);
        recyclerView.setAdapter(formsAdapter);
    }

    public void filterForms(View view) {
        try {
//            if (!dtFilter.getText().toString().isEmpty())
                fc = db.getTodayForms(dtFilter.getText().toString());
//            else if (!nameFilter.getText().toString().isEmpty())
//                fc = db.getFormsByName(nameFilter.getText().toString());
//            else if (!prnoFilter.getText().toString().isEmpty())
//                fc = db.getFormsByPRNo(prnoFilter.getText().toString());
//            else
//                // Get all records
//                fc = db.getTodayForms(null);
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "filterForms(getTodayForms): " + e.getMessage());
            Toast.makeText(this, "filterForms(getTodayForms): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (fc.size() > 0) {
            recyclerView.setVisibility(View.VISIBLE);
            noresult.setVisibility(View.GONE);

            Toast.makeText(this, "updated: " + fc.size(), Toast.LENGTH_SHORT).show();
            formsAdapter = new FormsAdapter((List<PatientDetails>) fc, this, iOnRVItemClickListener);
            formsAdapter.notifyDataSetChanged();
            recyclerView.setAdapter(formsAdapter);
        } else {
            recyclerView.setVisibility(View.GONE);
            noresult.setVisibility(View.VISIBLE);
        }
    }

    FormsAdapter.IOnRVItemClickListener iOnRVItemClickListener = new FormsAdapter.IOnRVItemClickListener() {
        @Override
        public void onItemClick(Object obj, int position) {
            PatientDetails pd = (PatientDetails) obj;
            if (pd.getSynced().isEmpty()) {
                MainApp.PATIENT_DETAIL_EDIT = db.getPatientDetailsByUID(pd.getUid());
                MainApp.isUpdate = true;
                startActivity(new Intent(FormsReportDate.this, SectionScreeningActivity.class));
            } else {
                showItemLockAlert();
            }
//            finish();
        }
    };

    private void showItemLockAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(FormsReportDate.this);
        builder.setTitle("Record Synced!");
        builder.setMessage("This record has been synced hence cannot be updated");
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        resetSearchFields();
        if (checkedId == R.id.sbDateRB)
            dtFilter.setVisibility(View.VISIBLE);
        else if (checkedId == R.id.sbNameRB)
            nameFilter.setVisibility(View.VISIBLE);
        else
            prnoFilter.setVisibility(View.VISIBLE);
    }

    private void resetSearchFields() {
        dtFilter.setText(null);
        dtFilter.setVisibility(View.GONE);

        nameFilter.setText(null);
        nameFilter.setVisibility(View.GONE);

        prnoFilter.setText(null);
        prnoFilter.setVisibility(View.GONE);
    }
}