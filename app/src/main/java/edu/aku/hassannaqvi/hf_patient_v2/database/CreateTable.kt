package edu.aku.hassannaqvi.hf_patient_v2.database

import edu.aku.hassannaqvi.hf_patient_v2.contracts.EntryLog.EntryLogTable
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.PROJECT_NAME
import edu.aku.hassannaqvi.hf_patient_v2.models.*

object CreateTable {
    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"

    const val SQL_CREATE_MOBILE_HEALTH = ("CREATE TABLE "
            + PDContract.MHTable.TABLE_NAME + "("
            + PDContract.MHTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PDContract.MHTable.COLUMN_PROJECT_NAME + " TEXT,"
            + PDContract.MHTable.COLUMN_UID + " TEXT,"
            + PDContract.MHTable.COLUMN_USERNAME + " TEXT,"
            + PDContract.MHTable.COLUMN_SYSDATE + " TEXT,"
            + PDContract.MHTable.COLUMN_STATUS + " TEXT,"
            + PDContract.MHTable.COLUMN_DEVICEID + " TEXT,"
            + PDContract.MHTable.COLUMN_DEVICETAGID + " TEXT,"
            + PDContract.MHTable.COLUMN_SYNCED + " TEXT,"
            + PDContract.MHTable.COLUMN_SYNCED_DATE + " TEXT,"
            + PDContract.MHTable.COLUMN_APPVERSION + " TEXT,"
            + PDContract.MHTable.COLUMN_SERIAL + " TEXT,"
            + PDContract.MHTable.COLUMN_SS101 + " TEXT,"
            + PDContract.MHTable.COLUMN_SS102 + " TEXT,"
            + PDContract.MHTable.COLUMN_SS103 + " TEXT,"
            + PDContract.MHTable.COLUMN_SS104 + " TEXT,"
            + PDContract.MHTable.COLUMN_SS105 + " TEXT,"
            + PDContract.MHTable.COLUMN_SS106 + " TEXT,"
            + PDContract.MHTable.COLUMN_SS107 + " TEXT,"
            + PDContract.MHTable.COLUMN_SA + " TEXT"
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