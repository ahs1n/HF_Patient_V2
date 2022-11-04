package edu.aku.hassannaqvi.hf_patient_v2.database

import edu.aku.hassannaqvi.hf_patient_v2.contracts.EntryLog.EntryLogTable
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.PROJECT_NAME
import edu.aku.hassannaqvi.hf_patient_v2.models.*

object CreateTable {
    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"

    const val SQL_CREATE_PATIENT_DETAILS = ("CREATE TABLE "
            + PDContract.PDTable.TABLE_NAME + "("
            + PDContract.PDTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PDContract.PDTable.COLUMN_PROJECT_NAME + " TEXT,"
            + PDContract.PDTable.COLUMN_UID + " TEXT,"
            + PDContract.PDTable.COLUMN_USERNAME + " TEXT,"
            + PDContract.PDTable.COLUMN_SYSDATE + " TEXT,"
            + PDContract.PDTable.COLUMN_ISTATUS + " TEXT,"
            + PDContract.PDTable.COLUMN_ISTATUS96x + " TEXT,"
            + PDContract.PDTable.COLUMN_DEVICEID + " TEXT,"
            + PDContract.PDTable.COLUMN_DEVICETAGID + " TEXT,"
            + PDContract.PDTable.COLUMN_SYNCED + " TEXT,"
            + PDContract.PDTable.COLUMN_SYNCED_DATE + " TEXT,"
            + PDContract.PDTable.COLUMN_APPVERSION + " TEXT,"
            + PDContract.PDTable.COLUMN_SPD + " TEXT"
            + " );")

    const val SQL_CREATE_VACCINATION = ("CREATE TABLE "
            + PDContract.VACCINATIONTable.TABLE_NAME + "("
            + PDContract.VACCINATIONTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PDContract.VACCINATIONTable.COLUMN_PROJECT_NAME + " TEXT,"
            + PDContract.VACCINATIONTable.COLUMN_UID + " TEXT,"
            + PDContract.VACCINATIONTable.COLUMN_USERNAME + " TEXT,"
            + PDContract.VACCINATIONTable.COLUMN_SYSDATE + " TEXT,"
            + PDContract.VACCINATIONTable.COLUMN_ISTATUS + " TEXT,"
            + PDContract.VACCINATIONTable.COLUMN_ISTATUS96x + " TEXT,"
            + PDContract.VACCINATIONTable.COLUMN_DEVICEID + " TEXT,"
            + PDContract.VACCINATIONTable.COLUMN_DEVICETAGID + " TEXT,"
            + PDContract.VACCINATIONTable.COLUMN_SYNCED + " TEXT,"
            + PDContract.VACCINATIONTable.COLUMN_SYNCED_DATE + " TEXT,"
            + PDContract.VACCINATIONTable.COLUMN_APPVERSION + " TEXT,"
            + PDContract.VACCINATIONTable.COLUMN_SVAC + " TEXT"
            + " );")

    const val SQL_CREATE_DIAGNOSIS = ("CREATE TABLE "
            + PDContract.DIAGNOSISTable.TABLE_NAME + "("
            + PDContract.DIAGNOSISTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PDContract.DIAGNOSISTable.COLUMN_PROJECT_NAME + " TEXT,"
            + PDContract.DIAGNOSISTable.COLUMN_UID + " TEXT,"
            + PDContract.DIAGNOSISTable.COLUMN_USERNAME + " TEXT,"
            + PDContract.DIAGNOSISTable.COLUMN_SYSDATE + " TEXT,"
            + PDContract.DIAGNOSISTable.COLUMN_ISTATUS + " TEXT,"
            + PDContract.DIAGNOSISTable.COLUMN_ISTATUS96x + " TEXT,"
            + PDContract.DIAGNOSISTable.COLUMN_DEVICEID + " TEXT,"
            + PDContract.DIAGNOSISTable.COLUMN_DEVICETAGID + " TEXT,"
            + PDContract.DIAGNOSISTable.COLUMN_SYNCED + " TEXT,"
            + PDContract.DIAGNOSISTable.COLUMN_SYNCED_DATE + " TEXT,"
            + PDContract.DIAGNOSISTable.COLUMN_APPVERSION + " TEXT,"
            + PDContract.DIAGNOSISTable.COLUMN_SDIAG + " TEXT"
            + " );")

    const val SQL_CREATE_COMPLAINTS = ("CREATE TABLE "
            + PDContract.COMPLAINTSTable.TABLE_NAME + "("
            + PDContract.COMPLAINTSTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PDContract.COMPLAINTSTable.COLUMN_PROJECT_NAME + " TEXT,"
            + PDContract.COMPLAINTSTable.COLUMN_UID + " TEXT,"
            + PDContract.COMPLAINTSTable.COLUMN_USERNAME + " TEXT,"
            + PDContract.COMPLAINTSTable.COLUMN_SYSDATE + " TEXT,"
            + PDContract.COMPLAINTSTable.COLUMN_ISTATUS + " TEXT,"
            + PDContract.COMPLAINTSTable.COLUMN_ISTATUS96x + " TEXT,"
            + PDContract.COMPLAINTSTable.COLUMN_DEVICEID + " TEXT,"
            + PDContract.COMPLAINTSTable.COLUMN_DEVICETAGID + " TEXT,"
            + PDContract.COMPLAINTSTable.COLUMN_SYNCED + " TEXT,"
            + PDContract.COMPLAINTSTable.COLUMN_SYNCED_DATE + " TEXT,"
            + PDContract.COMPLAINTSTable.COLUMN_APPVERSION + " TEXT,"
            + PDContract.COMPLAINTSTable.COLUMN_SCOMP + " TEXT"
            + " );")

    const val SQL_CREATE_PRESCRIPTION = ("CREATE TABLE "
            + PDContract.PRESCRIPTIONTable.TABLE_NAME + "("
            + PDContract.PRESCRIPTIONTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PDContract.PRESCRIPTIONTable.COLUMN_PROJECT_NAME + " TEXT,"
            + PDContract.PRESCRIPTIONTable.COLUMN_UID + " TEXT,"
            + PDContract.PRESCRIPTIONTable.COLUMN_USERNAME + " TEXT,"
            + PDContract.PRESCRIPTIONTable.COLUMN_SYSDATE + " TEXT,"
            + PDContract.PRESCRIPTIONTable.COLUMN_ISTATUS + " TEXT,"
            + PDContract.PRESCRIPTIONTable.COLUMN_ISTATUS96x + " TEXT,"
            + PDContract.PRESCRIPTIONTable.COLUMN_DEVICEID + " TEXT,"
            + PDContract.PRESCRIPTIONTable.COLUMN_DEVICETAGID + " TEXT,"
            + PDContract.PRESCRIPTIONTable.COLUMN_SYNCED + " TEXT,"
            + PDContract.PRESCRIPTIONTable.COLUMN_SYNCED_DATE + " TEXT,"
            + PDContract.PRESCRIPTIONTable.COLUMN_APPVERSION + " TEXT,"
            + PDContract.PRESCRIPTIONTable.COLUMN_PRES + " TEXT"
            + " );")

    const val SQL_CREATE_USERS = ("CREATE TABLE " + Users.UsersTable.TABLE_NAME + "("
            + Users.UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Users.UsersTable.COLUMN_USERNAME + " TEXT,"
            + Users.UsersTable.COLUMN_PASSWORD + " TEXT,"
            + Users.UsersTable.COLUMN_FULLNAME + " TEXT,"
            + Users.UsersTable.COLUMN_ENABLED + " TEXT,"
            + Users.UsersTable.COLUMN_ISNEW_USER + " TEXT,"
            + Users.UsersTable.COLUMN_UC_CODE + " TEXT,"
            + Users.UsersTable.COLUMN_PWD_EXPIRY + " TEXT,"
            + Users.UsersTable.COLUMN_DIST_ID + " TEXT"
            + " );")

    const val SQL_ALTER_USERS_ENABLED = ("Alter TABLE "
            + Users.UsersTable.TABLE_NAME + " ADD "
            + Users.UsersTable.COLUMN_ENABLED + " TEXT"
            + " ;"
            )

    const val SQL_ALTER_USERS_ISNEW_USER = ("Alter TABLE "
            + Users.UsersTable.TABLE_NAME + " ADD "
            + Users.UsersTable.COLUMN_ISNEW_USER + " TEXT"
            + " ;"
            )
    const val SQL_ALTER_USERS_PWD_EXPIRY = ("Alter TABLE "
            + Users.UsersTable.TABLE_NAME + " ADD "
            + Users.UsersTable.COLUMN_PWD_EXPIRY + " TEXT"
            + " ;"
            )

    const val SQL_CREATE_FACILITIES =
        ("CREATE TABLE " + HealthFacilities.TableHealthFacilities.TABLE_NAME + "("
                + HealthFacilities.TableHealthFacilities.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_UC_CODE + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_UC_NAME + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_DISTRICT_CODE + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_FACILITY_NAME + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_FACILITY_CODE + " TEXT"
                + " );")

    const val SQL_CREATE_UCS = ("CREATE TABLE " + UCs.TableUCs.TABLE_NAME + "("
            + UCs.TableUCs.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UCs.TableUCs.COLUMN_UC_NAME + " TEXT,"
            + UCs.TableUCs.COLUMN_UC_CODE + " TEXT,"
            + UCs.TableUCs.COLUMN_DISTRICT_CODE + " TEXT,"
            + UCs.TableUCs.COLUMN_DISTRICT_NAME + " TEXT,"
            + UCs.TableUCs.COLUMN_PROVINCE_CODE + " TEXT,"
            + UCs.TableUCs.COLUMN_PROVINCE_NAME + " TEXT"
            + " );")

    const val SQL_CREATE_VERSIONAPP =
        "CREATE TABLE " + VersionApp.VersionAppTable.TABLE_NAME + " (" +
                VersionApp.VersionAppTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                VersionApp.VersionAppTable.COLUMN_VERSION_CODE + " TEXT, " +
                VersionApp.VersionAppTable.COLUMN_VERSION_NAME + " TEXT, " +
                VersionApp.VersionAppTable.COLUMN_PATH_NAME + " TEXT " +
                ");"

    const val SQL_CREATE_DOCTOR = ("CREATE TABLE " + Doctor.TableDoctor.TABLE_NAME + "("
            + Doctor.TableDoctor.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Doctor.TableDoctor.COLUMN_UC_CODE + " TEXT,"
            + Doctor.TableDoctor.COLUMN_ID_DOCTOR + " TEXT,"
            + Doctor.TableDoctor.COLUMN_STAFF_NAME + " TEXT"
            + " );")

    const val SQL_CREATE_ENTRYLOGS = ("CREATE TABLE "
            + EntryLogTable.TABLE_NAME + "("
            + EntryLogTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EntryLogTable.COLUMN_PROJECT_NAME + " TEXT,"
            + EntryLogTable.COLUMN_UID + " TEXT,"
            + EntryLogTable.COLUMN_UUID + " TEXT,"
            + EntryLogTable.COLUMN_HHID + " TEXT,"
            + EntryLogTable.COLUMN_USERNAME + " TEXT,"
            + EntryLogTable.COLUMN_SYSDATE + " TEXT,"
            + EntryLogTable.COLUMN_DEVICEID + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_DATE + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS96x + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_TYPE + " TEXT,"
            + EntryLogTable.COLUMN_SYNCED + " TEXT,"
            + EntryLogTable.COLUMN_SYNC_DATE + " TEXT,"
            + EntryLogTable.COLUMN_APPVERSION + " TEXT"
            + " );"
            )
}