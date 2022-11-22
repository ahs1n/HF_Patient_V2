package edu.aku.hassannaqvi.hf_patient_v2.models;

import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.hf_patient_v2.BR;
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract.VACCINATIONTable;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;

public class Vaccination extends BaseObservable implements Observable {

    private final String TAG = "Vaccination";
    public String prno = _EMPTY_;
    public String facility = _EMPTY_;
    public String facilityCode = _EMPTY_;
    public String vdate = _EMPTY_;
    public String sv101 = _EMPTY_;
    public String sv102 = _EMPTY_;
    public String sv103 = _EMPTY_;
    public String sv104 = _EMPTY_;
    public String sv105 = _EMPTY_;
    public String sv106 = _EMPTY_;
    public String sv107 = _EMPTY_;
    public String bcg = _EMPTY_;
    public String penta1 = _EMPTY_;
    public String penta2 = _EMPTY_;
    public String penta3 = _EMPTY_;
    public String measles1 = _EMPTY_;
    public String measles2 = _EMPTY_;
    public String dpt = _EMPTY_;
    public String opv0 = _EMPTY_;
    public String opv1 = _EMPTY_;
    public String opv2 = _EMPTY_;
    public String opv3 = _EMPTY_;
    public String tcv = _EMPTY_;
    public String pcv1 = _EMPTY_;
    public String pcv2 = _EMPTY_;
    public String pcv3 = _EMPTY_;
    public String hepb = _EMPTY_;
    public String rota1 = _EMPTY_;
    public String rota2 = _EMPTY_;
    public String ipv1 = _EMPTY_;
    public String ipv2 = _EMPTY_;
    public String svcheck = _EMPTY_;


    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;
    private String entryType = _EMPTY_;
    // SECTION VARIABLE = _EMPTY_;
    private String sVaccination = _EMPTY_;

    public Vaccination() {
    }

    public void populateMeta() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setUuid(MainApp.patientDetails.getUid());
        setPrno(MainApp.patientDetails.getPrno());
        setFacility(MainApp.patientDetails.getFacility());
        setFacilityCode(MainApp.patientDetails.getFacilityCode());
        setVdate(MainApp.patientDetails.getVdate());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setEntryType(String.valueOf(MainApp.entryType));

    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    @Bindable
    public String getsVaccination() {
        return sVaccination;
    }

    public void setsVaccination(String sVaccination) {
        this.sVaccination = sVaccination;
        notifyPropertyChanged(BR.sVaccination);
    }

    @Bindable
    public String getPrno() {
        return prno;
    }

    public void setPrno(String prno) {
        this.prno = prno;
        notifyPropertyChanged(BR.prno);
    }

    @Bindable
    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
        notifyPropertyChanged(BR.facility);
    }

    @Bindable
    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
        notifyPropertyChanged(BR.facilityCode);
    }

    @Bindable
    public String getVdate() {
        return vdate;
    }

    public void setVdate(String vdate) {
        this.vdate = vdate;
        notifyPropertyChanged(BR.vdate);
    }

    @Bindable
    public String getSv101() {
        return sv101;
    }

    public void setSv101(String sv101) {
        this.sv101 = sv101;
        setSv102(sv101.equals("1") ? this.sv102 : "");
        notifyPropertyChanged(BR.sv101);
    }

    @Bindable
    public String getSv102() {
        return sv102;
    }

    public void setSv102(String sv102) {
        this.sv102 = sv102;
        notifyPropertyChanged(BR.sv102);
    }

    @Bindable
    public String getSv103() {
        return sv103;
    }

    public void setSv103(String sv103) {
        this.sv103 = sv103;
        setSv104(sv103.equals("2") ? this.sv104 : "");
        setSv105(sv103.equals("1") ? this.sv105 : "");
        notifyPropertyChanged(BR.sv103);
    }

    @Bindable
    public String getSv104() {
        return sv104;
    }

    public void setSv104(String sv104) {
        this.sv104 = sv104;
        setSv105(sv104.equals("1") ? this.sv105 : "");
        setSv106(sv104.equals("2") ? this.sv106 : "");
        notifyPropertyChanged(BR.sv104);
    }

    @Bindable
    public String getSv105() {
        return sv105;
    }

    public void setSv105(String sv105) {
        this.sv105 = sv105;
        notifyPropertyChanged(BR.sv105);
    }

    @Bindable
    public String getSv106() {
        return sv106;
    }

    public void setSv106(String sv106) {
        this.sv106 = sv106;
        notifyPropertyChanged(BR.sv106);
    }

    @Bindable
    public String getSv107() {
        return sv107;
    }

    public void setSv107(String sv107) {
        this.sv107 = sv107;
        notifyPropertyChanged(BR.sv107);
    }

    @Bindable
    public String getBcg() {
        return bcg;
    }

    public void setBcg(String bcg) {
        this.bcg = bcg;
        notifyPropertyChanged(BR.bcg);
    }

    @Bindable
    public String getPenta1() {
        return penta1;
    }

    public void setPenta1(String penta1) {
        this.penta1 = penta1;
        notifyPropertyChanged(BR.penta1);
    }

    @Bindable
    public String getPenta2() {
        return penta2;
    }

    public void setPenta2(String penta2) {
        this.penta2 = penta2;
        notifyPropertyChanged(BR.penta2);
    }

    @Bindable
    public String getPenta3() {
        return penta3;
    }

    public void setPenta3(String penta3) {
        this.penta3 = penta3;
        notifyPropertyChanged(BR.penta3);
    }

    @Bindable
    public String getMeasles1() {
        return measles1;
    }

    public void setMeasles1(String measles1) {
        this.measles1 = measles1;
        notifyPropertyChanged(BR.measles1);
    }

    @Bindable
    public String getMeasles2() {
        return measles2;
    }

    public void setMeasles2(String measles2) {
        this.measles2 = measles2;
        notifyPropertyChanged(BR.measles2);
    }

    @Bindable
    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
        notifyPropertyChanged(BR.dpt);
    }

    @Bindable
    public String getOpv0() {
        return opv0;
    }

    public void setOpv0(String opv0) {
        this.opv0 = opv0;
        notifyPropertyChanged(BR.opv0);
    }

    @Bindable
    public String getOpv1() {
        return opv1;
    }

    public void setOpv1(String opv1) {
        this.opv1 = opv1;
        notifyPropertyChanged(BR.opv1);
    }

    @Bindable
    public String getOpv2() {
        return opv2;
    }

    public void setOpv2(String opv2) {
        this.opv2 = opv2;
        notifyPropertyChanged(BR.opv2);
    }

    @Bindable
    public String getOpv3() {
        return opv3;
    }

    public void setOpv3(String opv3) {
        this.opv3 = opv3;
        notifyPropertyChanged(BR.opv3);
    }

    @Bindable
    public String getTcv() {
        return tcv;
    }

    public void setTcv(String tcv) {
        this.tcv = tcv;
        notifyPropertyChanged(BR.tcv);
    }

    @Bindable
    public String getPcv1() {
        return pcv1;
    }

    public void setPcv1(String pcv1) {
        this.pcv1 = pcv1;
        notifyPropertyChanged(BR.pcv1);
    }

    @Bindable
    public String getPcv2() {
        return pcv2;
    }

    public void setPcv2(String pcv2) {
        this.pcv2 = pcv2;
        notifyPropertyChanged(BR.pcv2);
    }

    @Bindable
    public String getPcv3() {
        return pcv3;
    }

    public void setPcv3(String pcv3) {
        this.pcv3 = pcv3;
        notifyPropertyChanged(BR.pcv3);
    }

    @Bindable
    public String getHepb() {
        return hepb;
    }

    public void setHepb(String hepb) {
        this.hepb = hepb;
        notifyPropertyChanged(BR.hepb);
    }

    @Bindable
    public String getRota1() {
        return rota1;
    }

    public void setRota1(String rota1) {
        this.rota1 = rota1;
        notifyPropertyChanged(BR.rota1);
    }

    @Bindable
    public String getRota2() {
        return rota2;
    }

    public void setRota2(String rota2) {
        this.rota2 = rota2;
        notifyPropertyChanged(BR.rota2);
    }

    @Bindable
    public String getIpv1() {
        return ipv1;
    }

    public void setIpv1(String ipv1) {
        this.ipv1 = ipv1;
        notifyPropertyChanged(BR.ipv1);
    }

    @Bindable
    public String getIpv2() {
        return ipv2;
    }

    public void setIpv2(String ipv2) {
        this.ipv2 = ipv2;
        notifyPropertyChanged(BR.ipv2);
    }

    @Bindable
    public String getSvcheck() {
        return svcheck;
    }

    public void setSvcheck(String svcheck) {
        if (this.svcheck.equals(svcheck)) return; // for all checkboxes
        this.svcheck = svcheck;
        setSv101(svcheck.equals("999") ? "" : this.sv101);
        setSv102(svcheck.equals("999") ? "" : this.sv102);
        setSv103(svcheck.equals("999") ? "" : this.sv103);
        setSv104(svcheck.equals("999") ? "" : this.sv104);
        setSv105(svcheck.equals("999") ? "" : this.sv105);
        setSv106(svcheck.equals("999") ? "" : this.sv106);
        setBcg(svcheck.equals("999") ? "" : this.bcg);
        setPenta1(svcheck.equals("999") ? "" : this.penta1);
        setPenta2(svcheck.equals("999") ? "" : this.penta2);
        setPenta3(svcheck.equals("999") ? "" : this.penta3);
        setMeasles1(svcheck.equals("999") ? "" : this.measles1);
        setMeasles2(svcheck.equals("999") ? "" : this.measles2);
        setDpt(svcheck.equals("999") ? "" : this.dpt);
        setOpv0(svcheck.equals("999") ? "" : this.opv0);
        setOpv1(svcheck.equals("999") ? "" : this.opv1);
        setOpv2(svcheck.equals("999") ? "" : this.opv2);
        setOpv3(svcheck.equals("999") ? "" : this.opv3);
        setTcv(svcheck.equals("999") ? "" : this.tcv);
        setPcv1(svcheck.equals("999") ? "" : this.pcv1);
        setPcv2(svcheck.equals("999") ? "" : this.pcv2);
        setPcv3(svcheck.equals("999") ? "" : this.pcv3);
        setHepb(svcheck.equals("999") ? "" : this.hepb);
        setRota1(svcheck.equals("999") ? "" : this.rota1);
        setRota2(svcheck.equals("999") ? "" : this.rota2);
        setIpv1(svcheck.equals("999") ? "" : this.ipv1);
        setIpv2(svcheck.equals("999") ? "" : this.ipv2);
        notifyPropertyChanged(BR.svcheck);
    }

    public Vaccination Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_UUID));
        this.prno = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_PRNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_USERNAME));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_PROJECT_NAME));
        this.facility = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_FACILITY));
        this.facilityCode = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_FACILITY_CODE));
        this.vdate = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_VDATE));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_SYNCED_DATE));

        sVACHydrate(cursor.getString(cursor.getColumnIndexOrThrow(VACCINATIONTable.COLUMN_SVAC)));

        return this;
    }

    public void sVACHydrate(String string) throws JSONException {
        Log.d(TAG, "sVACHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.sv101 = json.getString("sv101");
            this.sv102 = json.getString("sv102");
            this.sv103 = json.getString("sv103");
            this.sv104 = json.getString("sv104");
            this.sv105 = json.getString("sv105");
            this.sv106 = json.getString("sv106");
            this.sv107 = json.getString("sv107");
            this.bcg = json.has("bcg") ? json.getString("bcg") : "";
            this.penta1 = json.has("penta1") ? json.getString("penta1") : "";
            this.penta2 = json.has("penta2") ? json.getString("penta2") : "";
            this.penta3 = json.has("penta3") ? json.getString("penta3") : "";
            this.measles1 = json.has("measles1") ? json.getString("measles1") : "";
            this.measles2 = json.has("measles2") ? json.getString("measles2") : "";
            this.dpt = json.has("dpt") ? json.getString("dpt") : "";
            this.opv0 = json.has("opv0") ? json.getString("opv0") : "";
            this.opv1 = json.has("opv1") ? json.getString("opv1") : "";
            this.opv2 = json.has("opv2") ? json.getString("opv2") : "";
            this.opv3 = json.has("opv3") ? json.getString("opv3") : "";
            this.tcv = json.has("tcv") ? json.getString("tcv") : "";
            this.pcv1 = json.has("pcv1") ? json.getString("pcv1") : "";
            this.pcv2 = json.has("pcv2") ? json.getString("pcv2") : "";
            this.pcv3 = json.has("pcv3") ? json.getString("pcv3") : "";
            this.hepb = json.has("hepb") ? json.getString("hepb") : "";
            this.rota1 = json.has("rota1") ? json.getString("rota1") : "";
            this.rota2 = json.has("rota2") ? json.getString("rota2") : "";
            this.ipv1 = json.has("ipv1") ? json.getString("ipv1") : "";
            this.ipv2 = json.has("ipv2") ? json.getString("ipv2") : "";
            this.svcheck = json.has("svcheck") ? json.getString("svcheck") : "";
        }
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(VACCINATIONTable.COLUMN_ID, this.id);
        json.put(VACCINATIONTable.COLUMN_UID, this.uid);
        json.put(VACCINATIONTable.COLUMN_UUID, this.uuid);
        json.put(VACCINATIONTable.COLUMN_PRNO, this.prno);
        json.put(VACCINATIONTable.COLUMN_USERNAME, this.userName);
        json.put(VACCINATIONTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(VACCINATIONTable.COLUMN_FACILITY, this.facility);
        json.put(VACCINATIONTable.COLUMN_FACILITY_CODE, this.facilityCode);
        json.put(VACCINATIONTable.COLUMN_VDATE, this.vdate);
        json.put(VACCINATIONTable.COLUMN_SYSDATE, this.sysDate);
        json.put(VACCINATIONTable.COLUMN_DEVICEID, this.deviceId);
        json.put(VACCINATIONTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(VACCINATIONTable.COLUMN_APPVERSION, this.appver);
        json.put(VACCINATIONTable.COLUMN_SYNCED, this.synced);
        json.put(VACCINATIONTable.COLUMN_SYNCED_DATE, this.syncDate);

        json.put(VACCINATIONTable.COLUMN_SVAC, new JSONObject(sVACtoString()));
        return json;
    }

    public String sVACtoString() throws JSONException {
        Log.d(TAG, "sVACtoString: ");
        JSONObject json = new JSONObject();
        json.put("sv101", sv101)
                .put("sv102", sv102)
                .put("sv103", sv103)
                .put("sv104", sv104)
                .put("sv105", sv105)
                .put("sv106", sv106)
                .put("sv107", sv107)
                .put("bcg", bcg)
                .put("penta1", penta1)
                .put("penta2", penta2)
                .put("penta3", penta3)
                .put("measles1", measles1)
                .put("measles2", measles2)
                .put("dpt", dpt)
                .put("opv0", opv0)
                .put("opv1", opv1)
                .put("opv2", opv2)
                .put("opv3", opv3)
                .put("tcv", tcv)
                .put("pcv1", pcv1)
                .put("pcv2", pcv2)
                .put("pcv3", pcv3)
                .put("hepb", hepb)
                .put("rota1", rota1)
                .put("rota2", rota2)
                .put("ipv1", ipv1)
                .put("ipv2", ipv2)
                .put("svcheck", svcheck);
        return json.toString();
    }
}
