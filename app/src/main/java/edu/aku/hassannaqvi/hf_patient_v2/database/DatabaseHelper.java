package edu.aku.hassannaqvi.hf_patient_v2.database;

import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.IBAHC;
import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.complaints;
import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.diagnosis;
import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.patientDetails;
import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.prescription;
import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.vaccination;
import static edu.aku.hassannaqvi.hf_patient_v2.core.UserAuth.checkPassword;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_ALTER_USERS_ENABLED;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_ALTER_USERS_ISNEW_USER;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_ALTER_USERS_PWD_EXPIRY;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_CREATE_COMPLAINTS;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_CREATE_DIAGNOSIS;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_CREATE_DOCTOR;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_CREATE_ENTRYLOGS;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_CREATE_FACILITIES;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_CREATE_PATIENT_DETAILS;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_CREATE_PRESCRIPTION;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_CREATE_UCS;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_CREATE_USERS;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_CREATE_VACCINATION;
import static edu.aku.hassannaqvi.hf_patient_v2.database.CreateTable.SQL_CREATE_VERSIONAPP;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.util.Log;
import android.widget.Toast;

import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteException;
import net.sqlcipher.database.SQLiteOpenHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.hf_patient_v2.contracts.ChildInformationContract.ChildInfoTable;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.EntryLog.EntryLogTable;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.FormsContract;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.FormsContract.FormsTable;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract.COMPLAINTSTable;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract.DIAGNOSISTable;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract.PDTable;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract.PRESCRIPTIONTable;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract.VACCINATIONTable;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;
import edu.aku.hassannaqvi.hf_patient_v2.models.Camps;
import edu.aku.hassannaqvi.hf_patient_v2.models.Complaints;
import edu.aku.hassannaqvi.hf_patient_v2.models.Diagnosis;
import edu.aku.hassannaqvi.hf_patient_v2.models.Doctor;
import edu.aku.hassannaqvi.hf_patient_v2.models.EntryLog;
import edu.aku.hassannaqvi.hf_patient_v2.models.Form;
import edu.aku.hassannaqvi.hf_patient_v2.models.FormIndicatorsModel;
import edu.aku.hassannaqvi.hf_patient_v2.models.HealthFacilities;
import edu.aku.hassannaqvi.hf_patient_v2.models.PatientDetails;
import edu.aku.hassannaqvi.hf_patient_v2.models.Prescription;
import edu.aku.hassannaqvi.hf_patient_v2.models.UCs;
import edu.aku.hassannaqvi.hf_patient_v2.models.UCs.TableUCs;
import edu.aku.hassannaqvi.hf_patient_v2.models.Users;
import edu.aku.hassannaqvi.hf_patient_v2.models.Users.UsersTable;
import edu.aku.hassannaqvi.hf_patient_v2.models.Vaccination;

/**
 * @author muhammad hussain on 03/11/22
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = PROJECT_NAME + ".db";
    public static final String DATABASE_COPY = PROJECT_NAME + "_copy.db";
    public static final String DATABASE_PASSWORD = IBAHC;
    private static final int DATABASE_VERSION = 1;
    private final String TAG = "DatabaseHelper";
    private final Context mContext;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_FACILITIES);
        db.execSQL(SQL_CREATE_UCS);
        db.execSQL(SQL_CREATE_PATIENT_DETAILS);
        db.execSQL(SQL_CREATE_DIAGNOSIS);
        db.execSQL(SQL_CREATE_COMPLAINTS);
        db.execSQL(SQL_CREATE_VACCINATION);
        db.execSQL(SQL_CREATE_PRESCRIPTION);
        db.execSQL(SQL_CREATE_VERSIONAPP);
        db.execSQL(SQL_CREATE_DOCTOR);
        db.execSQL(SQL_CREATE_ENTRYLOGS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1:
                db.execSQL(SQL_ALTER_USERS_ENABLED);
                db.execSQL(SQL_ALTER_USERS_ISNEW_USER);
                db.execSQL(SQL_ALTER_USERS_PWD_EXPIRY);
        }
    }


    /*
     * Addition in DB
     * */


    public Long addEntryLog(EntryLog entryLog) throws SQLiteException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(EntryLogTable.COLUMN_PROJECT_NAME, entryLog.getProjectName());
        values.put(EntryLogTable.COLUMN_UUID, entryLog.getUuid());
        values.put(EntryLogTable.COLUMN_HHID, entryLog.getHhid());
        values.put(EntryLogTable.COLUMN_USERNAME, entryLog.getUserName());
        values.put(EntryLogTable.COLUMN_SYSDATE, entryLog.getSysDate());
        values.put(EntryLogTable.COLUMN_ISTATUS, entryLog.getiStatus());
        values.put(EntryLogTable.COLUMN_ISTATUS96x, entryLog.getiStatus96x());
        values.put(EntryLogTable.COLUMN_ENTRY_TYPE, entryLog.getEntryType());
        values.put(EntryLogTable.COLUMN_ENTRY_DATE, entryLog.getEntryDate());
        values.put(EntryLogTable.COLUMN_DEVICEID, entryLog.getDeviceId());
        values.put(EntryLogTable.COLUMN_SYNCED, entryLog.getSynced());
        values.put(EntryLogTable.COLUMN_SYNC_DATE, entryLog.getSyncDate());
        values.put(EntryLogTable.COLUMN_APPVERSION, entryLog.getAppver());

        long newRowId;
        newRowId = db.insertOrThrow(
                EntryLogTable.TABLE_NAME,
                EntryLogTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addPD(PatientDetails patientDetails) throws JSONException {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(PDTable.COLUMN_PROJECT_NAME, patientDetails.getProjectName());
        values.put(PDTable.COLUMN_UID, patientDetails.getUid());
        values.put(PDTable.COLUMN_USERNAME, patientDetails.getUserName());
        values.put(PDTable.COLUMN_SYSDATE, patientDetails.getSysDate());
        values.put(PDTable.COLUMN_SPD, patientDetails.sPDtoString());
        values.put(PDTable.COLUMN_SHIS, patientDetails.sHIStoString());
        values.put(PDTable.COLUMN_SEXM, patientDetails.sEXMtoString());
        values.put(PDTable.COLUMN_DEVICEID, patientDetails.getDeviceId());
        values.put(PDTable.COLUMN_DEVICETAGID, patientDetails.getDeviceTag());
        values.put(PDTable.COLUMN_SYNCED, patientDetails.getSynced());
        values.put(PDTable.COLUMN_SYNCED_DATE, patientDetails.getSyncDate());
        values.put(PDTable.COLUMN_APPVERSION, patientDetails.getAppver());
        values.put(PDTable.COLUMN_ISTATUS, patientDetails.getiStatus());
        values.put(PDTable.COLUMN_ISTATUS96x, patientDetails.getiStatus96x());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                PDTable.TABLE_NAME,
                PDTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addVAC(Vaccination vaccination) throws JSONException {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(VACCINATIONTable.COLUMN_PROJECT_NAME, vaccination.getProjectName());
        values.put(VACCINATIONTable.COLUMN_UID, vaccination.getUid());
        values.put(VACCINATIONTable.COLUMN_UUID, vaccination.getUuid());
        values.put(VACCINATIONTable.COLUMN_PRNO, vaccination.getPrno());
        values.put(VACCINATIONTable.COLUMN_USERNAME, vaccination.getUserName());
        values.put(VACCINATIONTable.COLUMN_SYSDATE, vaccination.getSysDate());
        values.put(VACCINATIONTable.COLUMN_SVAC, vaccination.sVACtoString());
        values.put(VACCINATIONTable.COLUMN_DEVICEID, vaccination.getDeviceId());
        values.put(VACCINATIONTable.COLUMN_DEVICETAGID, vaccination.getDeviceTag());
        values.put(VACCINATIONTable.COLUMN_SYNCED, vaccination.getSynced());
        values.put(VACCINATIONTable.COLUMN_SYNCED_DATE, vaccination.getSyncDate());
        values.put(VACCINATIONTable.COLUMN_APPVERSION, vaccination.getAppver());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                VACCINATIONTable.TABLE_NAME,
                VACCINATIONTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addDIAG(Diagnosis diagnosis) throws JSONException {

        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(DIAGNOSISTable.COLUMN_PROJECT_NAME, diagnosis.getProjectName());
        values.put(DIAGNOSISTable.COLUMN_UID, diagnosis.getUid());
        values.put(DIAGNOSISTable.COLUMN_UUID, diagnosis.getUuid());
        values.put(DIAGNOSISTable.COLUMN_PRNO, diagnosis.getPrno());
        values.put(DIAGNOSISTable.COLUMN_USERNAME, diagnosis.getUserName());
        values.put(DIAGNOSISTable.COLUMN_SYSDATE, diagnosis.getSysDate());
        values.put(DIAGNOSISTable.COLUMN_SDIAG, diagnosis.sDIAGtoString());
        values.put(DIAGNOSISTable.COLUMN_DIAG_CODE, diagnosis.getDiagCode());
        values.put(DIAGNOSISTable.COLUMN_DIAG_OTHER, diagnosis.getDiagOther());
        values.put(DIAGNOSISTable.COLUMN_DEVICEID, diagnosis.getDeviceId());
        values.put(DIAGNOSISTable.COLUMN_DEVICETAGID, diagnosis.getDeviceTag());
        values.put(DIAGNOSISTable.COLUMN_SYNCED, diagnosis.getSynced());
        values.put(DIAGNOSISTable.COLUMN_SYNCED_DATE, diagnosis.getSyncDate());
        values.put(DIAGNOSISTable.COLUMN_APPVERSION, diagnosis.getAppver());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                DIAGNOSISTable.TABLE_NAME,
                DIAGNOSISTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addCOMP(Complaints complaints) throws JSONException {

        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(COMPLAINTSTable.COLUMN_PROJECT_NAME, complaints.getProjectName());
        values.put(COMPLAINTSTable.COLUMN_UID, complaints.getUid());
        values.put(COMPLAINTSTable.COLUMN_UUID, complaints.getUuid());
        values.put(COMPLAINTSTable.COLUMN_PRNO, complaints.getPrno());
        values.put(COMPLAINTSTable.COLUMN_USERNAME, complaints.getUserName());
        values.put(COMPLAINTSTable.COLUMN_SYSDATE, complaints.getSysDate());
        values.put(COMPLAINTSTable.COLUMN_SCOMP, complaints.sCOMPtoString());
        values.put(COMPLAINTSTable.COLUMN_COMP_CODE, complaints.getCompCode());
        values.put(COMPLAINTSTable.COLUMN_COMP_OTHER, complaints.getCompOther());
        values.put(COMPLAINTSTable.COLUMN_DEVICEID, complaints.getDeviceId());
        values.put(COMPLAINTSTable.COLUMN_DEVICETAGID, complaints.getDeviceTag());
        values.put(COMPLAINTSTable.COLUMN_SYNCED, complaints.getSynced());
        values.put(COMPLAINTSTable.COLUMN_SYNCED_DATE, complaints.getSyncDate());
        values.put(COMPLAINTSTable.COLUMN_APPVERSION, complaints.getAppver());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                COMPLAINTSTable.TABLE_NAME,
                COMPLAINTSTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addPRES(Prescription prescription) throws JSONException {

        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(PRESCRIPTIONTable.COLUMN_PROJECT_NAME, prescription.getProjectName());
        values.put(PRESCRIPTIONTable.COLUMN_UID, prescription.getUid());
        values.put(PRESCRIPTIONTable.COLUMN_UUID, prescription.getUuid());
        values.put(PRESCRIPTIONTable.COLUMN_PRNO, prescription.getPrno());
        values.put(PRESCRIPTIONTable.COLUMN_USERNAME, prescription.getUserName());
        values.put(PRESCRIPTIONTable.COLUMN_SYSDATE, prescription.getSysDate());
        //values.put(PRESCRIPTIONTable.COLUMN_PRES, prescription.getsPrescription());
        values.put(PRESCRIPTIONTable.COLUMN_MED_CODE, prescription.getMedCode());
        values.put(PRESCRIPTIONTable.COLUMN_DOSE, prescription.getDose());
        values.put(PRESCRIPTIONTable.COLUMN_FREQUENCY, prescription.getFrequency());
        values.put(PRESCRIPTIONTable.COLUMN_DURATION, prescription.getDuration());
        values.put(PRESCRIPTIONTable.COLUMN_DEVICEID, prescription.getDeviceId());
        values.put(PRESCRIPTIONTable.COLUMN_DEVICETAGID, prescription.getDeviceTag());
        values.put(PRESCRIPTIONTable.COLUMN_SYNCED, prescription.getSynced());
        values.put(PRESCRIPTIONTable.COLUMN_SYNCED_DATE, prescription.getSyncDate());
        values.put(PRESCRIPTIONTable.COLUMN_APPVERSION, prescription.getAppver());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                PRESCRIPTIONTable.TABLE_NAME,
                PRESCRIPTIONTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    /*
     * Functions that dealing with table data
     * */
    public Users getLoginUser(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                UsersTable.COLUMN_ID,
                UsersTable.COLUMN_USERNAME,
                UsersTable.COLUMN_PASSWORD,
                UsersTable.COLUMN_FULLNAME,
                UsersTable.COLUMN_DIST_ID,
        };
        String whereClause = UsersTable.COLUMN_USERNAME + "=? AND " + UsersTable.COLUMN_PASSWORD + "=?";
        String[] whereArgs = {username, password};
        String groupBy = null;
        String having = null;
        String orderBy = UsersTable.COLUMN_ID + " ASC";

        Users allForms = null;
        try {
            c = db.query(
                    UsersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allForms = new Users().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return allForms;
    }


    public boolean doLogin(String username, String password) throws InvalidKeySpecException, NoSuchAlgorithmException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = UsersTable.COLUMN_USERNAME + "=? ";
        String[] whereArgs = {username};
        String groupBy = null;
        String having = null;
        String orderBy = UsersTable.COLUMN_ID + " ASC";

        Users loggedInUser = new Users();
        c = db.query(
                UsersTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            loggedInUser = new Users().hydrate(c);

        }

        c.close();

        if (loggedInUser.getPassword().equals("")) {
            Toast.makeText(mContext, "Stored password is invalid", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (checkPassword(password, loggedInUser.getPassword())) {
            MainApp.user = loggedInUser;
            //  MainApp.selectedDistrict = loggedInUser.getDist_id();
            return c.getCount() > 0;
        } else {
            return false;
        }
    }


    public ArrayList<Form> getFormsByDate(String sysdate) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                FormsTable._ID,
                FormsTable.COLUMN_UID,
                FormsTable.COLUMN_SYSDATE,
                FormsTable.COLUMN_USERNAME,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_ISTATUS96x,
                FormsTable.COLUMN_ENDINGDATETIME,
                FormsTable.COLUMN_SYNCED,

        };
        String whereClause = FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_ID + " ASC";
        ArrayList<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form forms = new Form();
                forms.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                forms.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                forms.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                forms.setUserName(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME)));
                allForms.add(forms);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return allForms;
    }

    public FormIndicatorsModel getFormStatusCount(String sysdate) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        FormIndicatorsModel count = new FormIndicatorsModel();


        Cursor mCursor = db.rawQuery(
                "select " +
                        "sum(case when ? = 1 then 1 else 0 end) as completed," +
                        "sum(case when ? != 1 OR ? is null then 1 else 0 end) as notCompleted " +
                        "from ? WHERE ? Like ?", new String[]{FormsTable.COLUMN_ISTATUS, FormsTable.COLUMN_ISTATUS, FormsTable.COLUMN_ISTATUS, FormsTable.TABLE_NAME, FormsTable.COLUMN_SYSDATE,
                        "%" + sysdate + " %"});
        if (mCursor != null && mCursor.moveToFirst()) {
            count = count.copy(Integer.parseInt(mCursor.getString(0)),
                    Integer.parseInt(mCursor.getString(1)));
            mCursor.close();
        }
        return count;
    }

    public FormIndicatorsModel getUploadStatusCount() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        FormIndicatorsModel count = new FormIndicatorsModel();
        Cursor mCursor = db.rawQuery(
                "select " +
                        "sum(case when ? = 1 then 1 else 0 end) as completed," +
                        "sum(case when ? is null OR ? = '' then 1 else 0 end) as notCompleted " +
                        "from ?", new String[]{FormsTable.COLUMN_SYNCED, FormsTable.COLUMN_SYNCED, FormsTable.COLUMN_SYNCED, FormsTable.TABLE_NAME,
                        null});
        if (mCursor != null && mCursor.moveToFirst()) {
            count = count.copy(Integer.parseInt(mCursor.getString(0)),
                    Integer.parseInt(mCursor.getString(1)));
            mCursor.close();
        }
        return count;
    }

    public Camps getSpecificCamp(String campNo, String distCode) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause = Camps.TableCamp.COLUMN_FACILITY_NAME + "=? AND " + Camps.TableCamp.COLUMN_DIST_ID + "=?";
        String[] whereArgs = {campNo, distCode};
        String groupBy = null;
        String having = null;

        String orderBy = Camps.TableCamp._ID + " ASC";
        Camps camp = null;
        try {
            c = db.query(
                    Camps.TableCamp.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                camp = new Camps().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return camp;
    }

    public ArrayList<Doctor> getDoctorByCamp(String camno) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause = Doctor.TableDoctor.COLUMN_UC_CODE + "=?";
        String[] whereArgs = {camno};
        String groupBy = null;
        String having = null;

        String orderBy = Doctor.TableDoctor.COLUMN_STAFF_NAME + " ASC";

        ArrayList<Doctor> docs = new ArrayList<>();
        try {
            c = db.query(
                    Doctor.TableDoctor.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                docs.add(new Doctor().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return docs;
    }

    public ArrayList<UCs> getUCsByDistricts(String dCode) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause = TableUCs.COLUMN_DISTRICT_CODE + "=?";
        String[] whereArgs = new String[]{dCode};
        String groupBy = null;
        String having = null;

        String orderBy = TableUCs.COLUMN_UC_CODE + " ASC";

        ArrayList<UCs> allDC = new ArrayList<>();
        try {
            c = db.query(
                    TableUCs.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                UCs dc = new UCs();
                allDC.add(dc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return allDC;
    }

    public Form getFormByClusterHH(String distCode, String subAreaCode, String hh) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormsTable.COLUMN_DCODE + "=? AND " +
                FormsTable.COLUMN_CLUSTER + "=? AND " +
                FormsTable.COLUMN_HHNO + "=? AND " +
                FormsTable.COLUMN_SYNCED + " is null AND " +
                FormsTable.COLUMN_ISTATUS + "=?";

        String[] whereArgs = {distCode, subAreaCode, hh, "2"};

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        Form allFC = null;
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allFC = new Form().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return allFC;
    }

    public ArrayList<Cursor> getDatabaseManagerData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(Query, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (Exception sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    /*public BLRandom getHHFromBLRandom(String subAreaCode, String hh) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        String[] columns = {
                BLRandomContract.BLRandomTable.COLUMN_ID,
                BLRandomContract.BLRandomTable.COLUMN_LUID,
                BLRandomContract.BLRandomTable.COLUMN_STRUCTURE_NO,
                BLRandomContract.BLRandomTable.COLUMN_FAMILY_EXT_CODE,
                BLRandomContract.BLRandomTable.COLUMN_HH,
                BLRandomContract.BLRandomTable.COLUMN_P_CODE,
                BLRandomContract.BLRandomTable.COLUMN_EB_CODE,
                BLRandomContract.BLRandomTable.COLUMN_RANDOMDT,
                BLRandomContract.BLRandomTable.COLUMN_HH_SELECTED_STRUCT,
                BLRandomContract.BLRandomTable.COLUMN_CONTACT,
                BLRandomContract.BLRandomTable.COLUMN_HH_HEAD,
                BLRandomContract.BLRandomTable.COLUMN_SNO_HH
        };

        String whereClause = BLRandomContract.BLRandomTable.COLUMN_P_CODE + "=? AND " + BLRandomContract.BLRandomTable.COLUMN_HH + "=?";
        String[] whereArgs = new String[]{subAreaCode, hh};
        String groupBy = null;
        String having = null;

        String orderBy =
                BLRandomContract.BLRandomTable.COLUMN_ID + " ASC";

        BLRandom allBL = null;
        try {
            c = db.query(
                    BLRandomContract.BLRandomTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allBL = new BLRandom().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return allBL;
    }*/


    /*
     * Update data in tables
     * */

    public int updatesPDColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = PDTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(patientDetails.getId())};

        return db.update(PDTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesVACColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = VACCINATIONTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(vaccination.getId())};

        return db.update(VACCINATIONTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesDIAGColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = DIAGNOSISTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(diagnosis.getId())};

        return db.update(DIAGNOSISTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesCOMPColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = COMPLAINTSTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(complaints.getId())};

        return db.update(COMPLAINTSTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesPRESColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = PRESCRIPTIONTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(prescription.getId())};

        return db.update(PRESCRIPTIONTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FormsContract.FormsTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS, MainApp.form.getIStatus());
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS, MainApp.form.getHh26());
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS96x, MainApp.form.getIStatus96x());
        values.put(FormsContract.FormsTable.COLUMN_ENDINGDATETIME, MainApp.form.getEndTime());

        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updatesEntryLogColumn(String column, String value, String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = EntryLogTable._ID + " =? ";
        String[] selectionArgs = {id};

        return db.update(EntryLogTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    /*
     * Download data functions
     * */

    // Sync Facilities
    public int synchf_list(JSONArray healthfacilities) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(HealthFacilities.TableHealthFacilities.TABLE_NAME, null, null);
        int insertCount = 0;

        for (int i = 0; i < healthfacilities.length(); i++) {
            JSONObject json = healthfacilities.getJSONObject(i);
            HealthFacilities facilities = new HealthFacilities();
            facilities.sync(json);
            ContentValues values = new ContentValues();

            values.put(HealthFacilities.TableHealthFacilities.COLUMN_UC_CODE, facilities.getUcCode());
            values.put(HealthFacilities.TableHealthFacilities.COLUMN_UC_NAME, facilities.getUcName());
            values.put(HealthFacilities.TableHealthFacilities.COLUMN_DISTRICT_CODE, facilities.getDistrictCode());
            values.put(HealthFacilities.TableHealthFacilities.COLUMN_FACILITY_NAME, facilities.getFacilityName());
            values.put(HealthFacilities.TableHealthFacilities.COLUMN_FACILITY_CODE, facilities.getFacilityCode());

            long rowID = db.insert(HealthFacilities.TableHealthFacilities.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        return insertCount;
    }

    public int syncuclist(JSONArray ucList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(TableUCs.TABLE_NAME, null, null);
        int insertCount = 0;

        for (int i = 0; i < ucList.length(); i++) {
            JSONObject jsonObjectUc = ucList.getJSONObject(i);
            UCs uc = new UCs();
            uc.sync(jsonObjectUc);
            ContentValues values = new ContentValues();

            values.put(TableUCs.COLUMN_UC_CODE, uc.getUcCode());
            values.put(TableUCs.COLUMN_UC_NAME, uc.getUcName());
            values.put(TableUCs.COLUMN_DISTRICT_CODE, uc.getDistCode());
            values.put(TableUCs.COLUMN_DISTRICT_NAME, uc.getDistName());
            values.put(TableUCs.COLUMN_PROVINCE_CODE, uc.getProvCode());
            values.put(TableUCs.COLUMN_PROVINCE_NAME, uc.getProvName());

            long rowID = db.insert(TableUCs.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        return insertCount;
    }

    public int syncCamps(JSONArray campList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(Camps.TableCamp.TABLE_NAME, null, null);
        int insertCount = 0;
        for (int i = 0; i < campList.length(); i++) {
            JSONObject json = campList.getJSONObject(i);
            Camps camps = new Camps();
            camps.sync(json);
            ContentValues values = new ContentValues();

            values.put(Camps.TableCamp.COLUMN_ID_CAMP, camps.getIdCamp());
            values.put(Camps.TableCamp.COLUMN_FACILITY_NAME, camps.getFacilityName());
            values.put(Camps.TableCamp.COLUMN_DIST_ID, camps.getDist_id());
            values.put(Camps.TableCamp.COLUMN_FACILITY_CODE, camps.getFacilityCode());
            values.put(Camps.TableCamp.COLUMN_UC_CODE, camps.getUcCode());
            values.put(Camps.TableCamp.COLUMN_UC_NAME, camps.getUcName());
            values.put(Camps.TableCamp.COLUMN_AREA_NAME, camps.getArea_name());
            values.put(Camps.TableCamp.COLUMN_PLAN_DATE, camps.getPlan_date());

            long rowID = db.insert(Camps.TableCamp.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        return insertCount;
    }

    public int syncdoctorlist(JSONArray docList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(Doctor.TableDoctor.TABLE_NAME, null, null);
        int insertCount = 0;
        for (int i = 0; i < docList.length(); i++) {
            JSONObject json = docList.getJSONObject(i);
            Doctor doc = new Doctor();
            doc.sync(json);
            ContentValues values = new ContentValues();

            values.put(Doctor.TableDoctor.COLUMN_UC_CODE, doc.getUcCode());
            values.put(Doctor.TableDoctor.COLUMN_ID_DOCTOR, doc.getIddoctor());
            values.put(Doctor.TableDoctor.COLUMN_STAFF_NAME, doc.getStaff_name());

            long rowID = db.insert(Doctor.TableDoctor.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        return insertCount;
    }


    public int syncVersionApp(JSONArray VersionList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        long count = 0;

        JSONObject jsonObjectVersion = ((JSONArray) VersionList.getJSONObject(0).get("elements")).getJSONObject(0);

        String appPath = jsonObjectVersion.getString("outputFile");
        String versionCode = jsonObjectVersion.getString("versionCode");

        MainApp.editor.putString("outputFile", jsonObjectVersion.getString("outputFile"));
        MainApp.editor.putString("versionCode", jsonObjectVersion.getString("versionCode"));
        MainApp.editor.putString("versionName", jsonObjectVersion.getString("versionName") + ".");
        MainApp.editor.apply();
        count++;
          /*  VersionApp Vc = new VersionApp();
            Vc.sync(jsonObjectVersion);

            ContentValues values = new ContentValues();

            values.put(VersionTable.COLUMN_PATH_NAME, Vc.getPathname());
            values.put(VersionTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
            values.put(VersionTable.COLUMN_VERSION_NAME, Vc.getVersionname());

            count = db.insert(VersionTable.TABLE_NAME, null, values);
            if (count > 0) count = 1;

        } catch (Exception ignored) {
        } finally {
            db.close();
        }*/

        return (int) count;
    }

    public int syncUsers(JSONArray userList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(UsersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        for (int i = 0; i < userList.length(); i++) {

            JSONObject jsonObjectUser = userList.getJSONObject(i);

            Users user = new Users();
            user.sync(jsonObjectUser);
            ContentValues values = new ContentValues();

            values.put(UsersTable.COLUMN_USERNAME, user.getUserName());
            values.put(UsersTable.COLUMN_PASSWORD, user.getPassword());
            values.put(UsersTable.COLUMN_FULLNAME, user.getFullname());
            values.put(UsersTable.COLUMN_DIST_ID, user.getDist_id());
            values.put(UsersTable.COLUMN_ENABLED, user.getEnabled());
            values.put(UsersTable.COLUMN_ISNEW_USER, user.getNewUser());
            values.put(UsersTable.COLUMN_PWD_EXPIRY, user.getPwdExpiry());
            values.put(UsersTable.COLUMN_UC_CODE, user.getUcCode());
            long rowID = db.insert(UsersTable.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        return insertCount;
    }


    //get UnSyncedTables
    public JSONArray getUnsyncedForms() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormsTable.COLUMN_SYNCED + " is null ";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                /** WorkManager Upload
                 /*Form fc = new Form();
                 allFC.add(fc.Hydrate(c));*/
                Log.d(TAG, "getUnsyncedForms: " + c.getCount());
                Form form = new Form();
                allForms.put(form.Hydrate(c).toJSONObject());


            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        Log.d(TAG, "getUnsyncedForms: " + allForms.toString().length());
        Log.d(TAG, "getUnsyncedForms: " + allForms);
        return allForms;
    }

    public JSONArray getUnsyncedPD() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                PDTable.COLUMN_ID,
                PDTable.COLUMN_UID,
                PDTable.COLUMN_USERNAME,
                PDTable.COLUMN_SYSDATE,
                PDTable.COLUMN_DEVICEID,
                PDTable.COLUMN_DEVICETAGID,
                PDTable.COLUMN_APPVERSION,
                PDTable.COLUMN_SYNCED,
                PDTable.COLUMN_SYNCED_DATE,
                PDTable.COLUMN_ISTATUS,
                PDTable.COLUMN_SPD,
                PDTable.COLUMN_SHIS,
                PDTable.COLUMN_SEXM
        };

        String whereClause;
        whereClause = PDTable.COLUMN_SYNCED + " is null ";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = PDTable.COLUMN_ID + " ASC";

        JSONArray jsa = new JSONArray();

        c = db.query(
                PDTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedPD: " + c.getCount());
            PatientDetails mhForm = new PatientDetails();
            jsa.put(mhForm.Hydrate(c).toJSONObject());
        }

        c.close();

        return jsa;
    }

    public JSONArray getUnsyncedVAC() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                VACCINATIONTable.COLUMN_ID,
                VACCINATIONTable.COLUMN_UID,
                VACCINATIONTable.COLUMN_USERNAME,
                VACCINATIONTable.COLUMN_SYSDATE,
                VACCINATIONTable.COLUMN_DEVICEID,
                VACCINATIONTable.COLUMN_DEVICETAGID,
                VACCINATIONTable.COLUMN_APPVERSION,
                VACCINATIONTable.COLUMN_SYNCED,
                VACCINATIONTable.COLUMN_SYNCED_DATE,
                VACCINATIONTable.COLUMN_SVAC
        };

        String whereClause;
        whereClause = VACCINATIONTable.COLUMN_SYNCED + " is null ";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = VACCINATIONTable.COLUMN_ID + " ASC";

        JSONArray jsa = new JSONArray();

        c = db.query(
                VACCINATIONTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedVACCINATION: " + c.getCount());
            Vaccination vaccination = new Vaccination();
            jsa.put(vaccination.Hydrate(c).toJSONObject());
        }

        c.close();

        return jsa;
    }

    public JSONArray getUnsyncedDIAG() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                DIAGNOSISTable.COLUMN_ID,
                DIAGNOSISTable.COLUMN_UID,
                DIAGNOSISTable.COLUMN_USERNAME,
                DIAGNOSISTable.COLUMN_SYSDATE,
                DIAGNOSISTable.COLUMN_DEVICEID,
                DIAGNOSISTable.COLUMN_DEVICETAGID,
                DIAGNOSISTable.COLUMN_APPVERSION,
                DIAGNOSISTable.COLUMN_SYNCED,
                DIAGNOSISTable.COLUMN_SYNCED_DATE,
                DIAGNOSISTable.COLUMN_SDIAG,
                DIAGNOSISTable.COLUMN_DIAG_CODE,
                DIAGNOSISTable.COLUMN_DIAG_OTHER
        };

        String whereClause = DIAGNOSISTable.COLUMN_SYNCED + " is null ";
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = DIAGNOSISTable.COLUMN_ID + " ASC";

        JSONArray jsa = new JSONArray();

        c = db.query(
                DIAGNOSISTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedDIAGNOSIS: " + c.getCount());
            Diagnosis diagnosis = new Diagnosis();
            jsa.put(diagnosis.Hydrate(c).toJSONObject());
        }
        c.close();
        return jsa;
    }

    public JSONArray getUnsyncedCOMP() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                COMPLAINTSTable.COLUMN_ID,
                COMPLAINTSTable.COLUMN_UID,
                COMPLAINTSTable.COLUMN_USERNAME,
                COMPLAINTSTable.COLUMN_SYSDATE,
                COMPLAINTSTable.COLUMN_DEVICEID,
                COMPLAINTSTable.COLUMN_DEVICETAGID,
                COMPLAINTSTable.COLUMN_APPVERSION,
                COMPLAINTSTable.COLUMN_SYNCED,
                COMPLAINTSTable.COLUMN_SYNCED_DATE,
                COMPLAINTSTable.COLUMN_SCOMP,
                COMPLAINTSTable.COLUMN_COMP_CODE,
                COMPLAINTSTable.COLUMN_COMP_OTHER
        };

        String whereClause = COMPLAINTSTable.COLUMN_SYNCED + " is null ";
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = COMPLAINTSTable.COLUMN_ID + " ASC";

        JSONArray jsa = new JSONArray();

        c = db.query(
                COMPLAINTSTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedCOMPLAINTS: " + c.getCount());
            Complaints complaints = new Complaints();
            jsa.put(complaints.Hydrate(c).toJSONObject());
        }
        c.close();
        return jsa;
    }

    public JSONArray getUnsyncedPRES() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                PRESCRIPTIONTable.COLUMN_ID,
                PRESCRIPTIONTable.COLUMN_UID,
                PRESCRIPTIONTable.COLUMN_USERNAME,
                PRESCRIPTIONTable.COLUMN_SYSDATE,
                PRESCRIPTIONTable.COLUMN_DEVICEID,
                PRESCRIPTIONTable.COLUMN_DEVICETAGID,
                PRESCRIPTIONTable.COLUMN_APPVERSION,
                PRESCRIPTIONTable.COLUMN_SYNCED,
                PRESCRIPTIONTable.COLUMN_SYNCED_DATE,
                PRESCRIPTIONTable.COLUMN_PRES
        };

        String whereClause = PRESCRIPTIONTable.COLUMN_SYNCED + " is null ";
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = PRESCRIPTIONTable.COLUMN_ID + " ASC";

        JSONArray jsa = new JSONArray();

        c = db.query(
                PRESCRIPTIONTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedPRESCRIPTION: " + c.getCount());
            Prescription prescription = new Prescription();
            jsa.put(prescription.Hydrate(c).toJSONObject());
        }
        c.close();
        return jsa;
    }


    public JSONArray getUnsyncedEntryLog() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = EntryLogTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = EntryLogTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                EntryLogTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedEntryLog: " + c.getCount());
            EntryLog entryLog = new EntryLog();
            all.put(entryLog.Hydrate(c).toJSONObject());
        }
        Log.d(TAG, "getUnsyncedEntryLog: " + all.toString().length());
        Log.d(TAG, "getUnsyncedEntryLog: " + all);
        return all;
    }


    //update SyncedTables
    public void updateSyncedForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SYNCED, true);
        values.put(FormsContract.FormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsContract.FormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedHHChildrens(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

// New value for one column
        ContentValues values = new ContentValues();
        values.put(ChildInfoTable.COLUMN_SYNCED, true);
        values.put(ChildInfoTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = ChildInfoTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                ChildInfoTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedpatientdetails(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

// New value for one column
        ContentValues values = new ContentValues();
        values.put(PDTable.COLUMN_SYNCED, true);
        values.put(PDTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = PDTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                PDTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }


    public void updateSyncedEntryLog(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(EntryLogTable.COLUMN_SYNCED, true);
        values.put(EntryLogTable.COLUMN_SYNC_DATE, new Date().toString());
        String where = EntryLogTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                EntryLogTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public int updatePassword(String hashedPassword) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(UsersTable.COLUMN_PASSWORD, hashedPassword);
        values.put(UsersTable.COLUMN_ISNEW_USER, "");

        String selection = UsersTable.COLUMN_USERNAME + " =? ";
        String[] selectionArgs = {MainApp.user.getUserName()};

        return db.update(UsersTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public Collection<PatientDetails> getFormsByCluster(String cluster) throws JSONException {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                PDTable.COLUMN_ID,
                PDTable.COLUMN_UID,
                PDTable.COLUMN_SYSDATE,
                PDTable.COLUMN_SPD,
                PDTable.COLUMN_SYNCED,

        };
        String whereClause = null;
        String[] whereArgs = new String[]{cluster};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy =
                PDTable.COLUMN_ID + " ASC";

        Collection<PatientDetails> allFC = new ArrayList<>();
        try {
            c = db.query(
                    PDTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                PatientDetails fc = new PatientDetails();
                fc.setId(c.getString(c.getColumnIndexOrThrow(PDTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(PDTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(PDTable.COLUMN_SYSDATE)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(PDTable.COLUMN_SYNCED)));
                fc.sPDHydrate(c.getString(c.getColumnIndexOrThrow(PDTable.COLUMN_SPD)));
                Log.d(TAG, "getFormsByCluster: " + c.getString(c.getColumnIndexOrThrow(PDTable.COLUMN_SPD)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return allFC;
    }

    public ArrayList<Form> getUnclosedForms() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                FormsTable._ID,
                FormsTable.COLUMN_UID,
                FormsTable.COLUMN_SYSDATE,
                FormsTable.COLUMN_CLUSTER,
                FormsTable.COLUMN_HHNO,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_SYNCED,
        };
        String whereClause = FormsTable.COLUMN_ISTATUS + " = ''";
        String[] whereArgs = null;
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_ID + " ASC";
        ArrayList<Form> allFC = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form fc = new Form();
                fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                fc.setCluster(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_CLUSTER)));
                fc.setHhno(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_HHNO)));
                fc.setIStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return allFC;
    }

    public Collection<PatientDetails> getTodayForms(String sysdate) throws JSONException {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                PDTable.COLUMN_ID,
                PDTable.COLUMN_UID,
                PDTable.COLUMN_SYSDATE,
                PDTable.COLUMN_SPD,
                PDTable.COLUMN_SYNCED,


        };
        String whereClause = PDTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = PDTable.COLUMN_ID + " DESC";

        Collection<PatientDetails> allFC = new ArrayList<>();
        try {
            c = db.query(
                    PDTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                PatientDetails fc = new PatientDetails();
                fc.setId(c.getString(c.getColumnIndexOrThrow(PDTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(PDTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(PDTable.COLUMN_SYSDATE)));
                fc.sPDHydrate(c.getString(c.getColumnIndexOrThrow(PDTable.COLUMN_SPD)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(PDTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return allFC;
    }

    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {
            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    public ArrayList<HealthFacilities> getAllFacilities() {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy = HealthFacilities.TableHealthFacilities._ID + " ASC";
        ArrayList<HealthFacilities> allHF = new ArrayList<>();
        c = db.query(
                HealthFacilities.TableHealthFacilities.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            allHF.add(new HealthFacilities().hydrate(c));
        }
        if (c != null) {
            c.close();
        }
        return allHF;
    }

    public ArrayList<HealthFacilities> getAllFacilitiesByUC(String ucCode) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = HealthFacilities.TableHealthFacilities.COLUMN_UC_CODE + " = ? ";
        String[] whereArgs = {ucCode};
        String groupBy = null;
        String having = null;

        String orderBy = HealthFacilities.TableHealthFacilities.COLUMN_FACILITY_CODE + " ASC";
        ArrayList<HealthFacilities> hf = new ArrayList<>();

        c = db.query(
                HealthFacilities.TableHealthFacilities.TABLE_NAME,  // The table to query
                columns,                   // The columns to return8
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            hf.add(new HealthFacilities().hydrate(c));
        }
        return hf;
    }

    public Collection<Doctor> getDoctorsByUC(String ucCode) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = Doctor.TableDoctor.COLUMN_UC_CODE + " = ? ";
        String[] whereArgs = {ucCode};
        String groupBy = null;
        String having = null;

        String orderBy = Doctor.TableDoctor.COLUMN_ID_DOCTOR + " ASC";
        List<Doctor> doctors = new ArrayList<>();

        c = db.query(
                Doctor.TableDoctor.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            doctors.add(new Doctor().hydrate(c));
        }
        return doctors;
    }
}