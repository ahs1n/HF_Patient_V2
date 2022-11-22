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
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract.PRESCRIPTIONTable;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;

public class Prescription extends BaseObservable implements Observable {

    private final String TAG = "Prescription";
    public String prno = _EMPTY_;
    public String facility = _EMPTY_;
    public String facilityCode = _EMPTY_;
    public String vdate = _EMPTY_;
    public String mp101 = _EMPTY_;
    public String mp101do = _EMPTY_;
    public String mp101f = _EMPTY_;
    public String mp101du = _EMPTY_;
    public String mp102 = _EMPTY_;
    public String mp102do = _EMPTY_;
    public String mp102f = _EMPTY_;
    public String mp102du = _EMPTY_;
    public String mp103 = _EMPTY_;
    public String mp103do = _EMPTY_;
    public String mp103f = _EMPTY_;
    public String mp103du = _EMPTY_;
    public String mp104 = _EMPTY_;
    public String mp104do = _EMPTY_;
    public String mp104f = _EMPTY_;
    public String mp104du = _EMPTY_;
    public String mp105 = _EMPTY_;
    public String mp105do = _EMPTY_;
    public String mp105f = _EMPTY_;
    public String mp105du = _EMPTY_;
    public String mp106 = _EMPTY_;
    public String mp106do = _EMPTY_;
    public String mp106f = _EMPTY_;
    public String mp106du = _EMPTY_;
    public String mp107 = _EMPTY_;
    public String mp107do = _EMPTY_;
    public String mp107f = _EMPTY_;
    public String mp107du = _EMPTY_;
    public String mp108 = _EMPTY_;
    public String mp108do = _EMPTY_;
    public String mp108f = _EMPTY_;
    public String mp108du = _EMPTY_;
    public String mp109 = _EMPTY_;
    public String mp109do = _EMPTY_;
    public String mp109f = _EMPTY_;
    public String mp109du = _EMPTY_;
    public String mp110 = _EMPTY_;
    public String mp110do = _EMPTY_;
    public String mp110f = _EMPTY_;
    public String mp110du = _EMPTY_;
    public String mp111 = _EMPTY_;
    public String mp111do = _EMPTY_;
    public String mp111f = _EMPTY_;
    public String mp111du = _EMPTY_;
    public String mp112 = _EMPTY_;
    public String mp112do = _EMPTY_;
    public String mp112f = _EMPTY_;
    public String mp112du = _EMPTY_;
    public String mp113 = _EMPTY_;
    public String mp113do = _EMPTY_;
    public String mp113f = _EMPTY_;
    public String mp113du = _EMPTY_;
    public String mp114 = _EMPTY_;
    public String mp114do = _EMPTY_;
    public String mp114f = _EMPTY_;
    public String mp114du = _EMPTY_;
    public String mp115 = _EMPTY_;
    public String mp115do = _EMPTY_;
    public String mp115f = _EMPTY_;
    public String mp115du = _EMPTY_;
    public String mp116 = _EMPTY_;
    public String mp116do = _EMPTY_;
    public String mp116f = _EMPTY_;
    public String mp116du = _EMPTY_;
    public String mp117 = _EMPTY_;
    public String mp117do = _EMPTY_;
    public String mp117f = _EMPTY_;
    public String mp117du = _EMPTY_;
    public String mp118 = _EMPTY_;
    public String mp118do = _EMPTY_;
    public String mp118f = _EMPTY_;
    public String mp118du = _EMPTY_;
    public String mp119 = _EMPTY_;
    public String mp119do = _EMPTY_;
    public String mp119f = _EMPTY_;
    public String mp119du = _EMPTY_;
    public String mp120 = _EMPTY_;
    public String mp120do = _EMPTY_;
    public String mp120f = _EMPTY_;
    public String mp120du = _EMPTY_;
    public String mp121 = _EMPTY_;
    public String mp121do = _EMPTY_;
    public String mp121f = _EMPTY_;
    public String mp121du = _EMPTY_;
    public String mp122 = _EMPTY_;
    public String mp122do = _EMPTY_;
    public String mp122f = _EMPTY_;
    public String mp122du = _EMPTY_;
    public String mp123 = _EMPTY_;
    public String mp123do = _EMPTY_;
    public String mp123f = _EMPTY_;
    public String mp123du = _EMPTY_;
    public String mp124 = _EMPTY_;
    public String mp124do = _EMPTY_;
    public String mp124f = _EMPTY_;
    public String mp124du = _EMPTY_;
    public String mp125 = _EMPTY_;
    public String mp125do = _EMPTY_;
    public String mp125f = _EMPTY_;
    public String mp125du = _EMPTY_;
    public String mp126 = _EMPTY_;
    public String mp126do = _EMPTY_;
    public String mp126f = _EMPTY_;
    public String mp126du = _EMPTY_;
    public String mp127 = _EMPTY_;
    public String mp127do = _EMPTY_;
    public String mp127f = _EMPTY_;
    public String mp127du = _EMPTY_;
    public String mp128 = _EMPTY_;
    public String mp128do = _EMPTY_;
    public String mp128f = _EMPTY_;
    public String mp128du = _EMPTY_;
    public String mp129 = _EMPTY_;
    public String mp129do = _EMPTY_;
    public String mp129f = _EMPTY_;
    public String mp129du = _EMPTY_;
    public String mp130 = _EMPTY_;
    public String mp130do = _EMPTY_;
    public String mp130f = _EMPTY_;
    public String mp130du = _EMPTY_;
    public String mp131 = _EMPTY_;
    public String mp131do = _EMPTY_;
    public String mp131f = _EMPTY_;
    public String mp131du = _EMPTY_;
    public String mp132 = _EMPTY_;
    public String mp132do = _EMPTY_;
    public String mp132f = _EMPTY_;
    public String mp132du = _EMPTY_;
    public String mp133 = _EMPTY_;
    public String mp133do = _EMPTY_;
    public String mp133f = _EMPTY_;
    public String mp133du = _EMPTY_;
    public String mp134 = _EMPTY_;
    public String mp134do = _EMPTY_;
    public String mp134f = _EMPTY_;
    public String mp134du = _EMPTY_;
    public String mp135 = _EMPTY_;
    public String mp135do = _EMPTY_;
    public String mp135f = _EMPTY_;
    public String mp135du = _EMPTY_;
    public String mp136 = _EMPTY_;
    public String mp136do = _EMPTY_;
    public String mp136f = _EMPTY_;
    public String mp136du = _EMPTY_;
    public String mp137 = _EMPTY_;
    public String mp137do = _EMPTY_;
    public String mp137f = _EMPTY_;
    public String mp137du = _EMPTY_;
    public String mpnr = _EMPTY_;

    public String mp961 = _EMPTY_;
    public String mp961do = _EMPTY_;
    public String mp961f = _EMPTY_;
    public String mp961du = _EMPTY_;
    public String mp961x = _EMPTY_;
    public String mp962 = _EMPTY_;
    public String mp962do = _EMPTY_;
    public String mp962f = _EMPTY_;
    public String mp962du = _EMPTY_;
    public String mp962x = _EMPTY_;
    public String mp963 = _EMPTY_;
    public String mp963do = _EMPTY_;
    public String mp963f = _EMPTY_;
    public String mp963du = _EMPTY_;
    public String mp963x = _EMPTY_;

    public String medCode = _EMPTY_;
    public String dose = _EMPTY_;
    public String frequency = _EMPTY_;
    public String duration = _EMPTY_;
    public String other = _EMPTY_;
    private String uuid = _EMPTY_;


    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    private String id = _EMPTY_;
    private String uid = _EMPTY_;

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
    private String sPrescription = _EMPTY_;

    public Prescription() {
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
    public String getsPrescription() {
        return sPrescription;
    }

    public void setsPrescription(String sPrescription) {
        this.sPrescription = sPrescription;
        notifyPropertyChanged(BR.sPrescription);
    }

    @Bindable
    public String getMedCode() {
        return medCode;
    }

    public void setMedCode(String medCode) {
        this.medCode = medCode;
        notifyPropertyChanged(BR.medCode);
    }

    @Bindable
    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
        notifyPropertyChanged(BR.dose);
    }

    @Bindable
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
        notifyPropertyChanged(BR.frequency);
    }

    @Bindable
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
        notifyPropertyChanged(BR.duration);
    }

    @Bindable
    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
        notifyPropertyChanged(BR.other);
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
    public String getMp101() {
        return mp101;
    }

    public void setMp101(String mp101) {
        if (this.mp101.equals(mp101)) return; // for all checkboxes
        this.mp101 = mp101;
        setMp101do(mp101.equals("1") ? this.mp101do : "");
        setMp101f(mp101.equals("1") ? this.mp101f : "");
        setMp101du(mp101.equals("1") ? this.mp101du : "");
        notifyPropertyChanged(BR.mp101);
    }

    @Bindable
    public String getMp101do() {
        return mp101do;
    }

    public void setMp101do(String mp101do) {
        this.mp101do = mp101do;
        notifyPropertyChanged(BR.mp101do);
    }

    @Bindable
    public String getMp101f() {
        return mp101f;
    }

    public void setMp101f(String mp101f) {
        this.mp101f = mp101f;
        notifyPropertyChanged(BR.mp101f);
    }

    @Bindable
    public String getMp101du() {
        return mp101du;
    }

    public void setMp101du(String mp101du) {
        this.mp101du = mp101du;
        notifyPropertyChanged(BR.mp101du);
    }

    @Bindable
    public String getMp102() {
        return mp102;
    }

    public void setMp102(String mp102) {
        if (this.mp102.equals(mp102)) return; // for all checkboxes
        this.mp102 = mp102;
        setMp102do(mp102.equals("2") ? this.mp102do : "");
        setMp102f(mp102.equals("2") ? this.mp102f : "");
        setMp102du(mp102.equals("2") ? this.mp102du : "");
        notifyPropertyChanged(BR.mp102);
    }

    @Bindable
    public String getMp102do() {
        return mp102do;
    }

    public void setMp102do(String mp102do) {
        this.mp102do = mp102do;
        notifyPropertyChanged(BR.mp102do);
    }

    @Bindable
    public String getMp102f() {
        return mp102f;
    }

    public void setMp102f(String mp102f) {
        this.mp102f = mp102f;
        notifyPropertyChanged(BR.mp102f);
    }

    @Bindable
    public String getMp102du() {
        return mp102du;
    }

    public void setMp102du(String mp102du) {
        this.mp102du = mp102du;
        notifyPropertyChanged(BR.mp102du);
    }

    @Bindable
    public String getMp103() {
        return mp103;
    }

    public void setMp103(String mp103) {
        if (this.mp103.equals(mp103)) return; // for all checkboxes
        this.mp103 = mp103;
        setMp103do(mp103.equals("3") ? this.mp103do : "");
        setMp103f(mp103.equals("3") ? this.mp103f : "");
        setMp103du(mp103.equals("3") ? this.mp103du : "");
        notifyPropertyChanged(BR.mp103);
    }

    @Bindable
    public String getMp103do() {
        return mp103do;
    }

    public void setMp103do(String mp103do) {
        this.mp103do = mp103do;
        notifyPropertyChanged(BR.mp103do);
    }

    @Bindable
    public String getMp103f() {
        return mp103f;
    }

    public void setMp103f(String mp103f) {
        this.mp103f = mp103f;
        notifyPropertyChanged(BR.mp103f);
    }

    @Bindable
    public String getMp103du() {
        return mp103du;
    }

    public void setMp103du(String mp103du) {
        this.mp103du = mp103du;
        notifyPropertyChanged(BR.mp103du);
    }

    @Bindable
    public String getMp104() {
        return mp104;
    }

    public void setMp104(String mp104) {
        if (this.mp104.equals(mp104)) return; // for all checkboxes
        this.mp104 = mp104;
        setMp104do(mp104.equals("4") ? this.mp104do : "");
        setMp104f(mp104.equals("4") ? this.mp104f : "");
        setMp104du(mp104.equals("4") ? this.mp104du : "");
        notifyPropertyChanged(BR.mp104);
    }

    @Bindable
    public String getMp104do() {
        return mp104do;
    }

    public void setMp104do(String mp104do) {
        this.mp104do = mp104do;
        notifyPropertyChanged(BR.mp104do);
    }

    @Bindable
    public String getMp104f() {
        return mp104f;
    }

    public void setMp104f(String mp104f) {
        this.mp104f = mp104f;
        notifyPropertyChanged(BR.mp104f);
    }

    @Bindable
    public String getMp104du() {
        return mp104du;
    }

    public void setMp104du(String mp104du) {
        this.mp104du = mp104du;
        notifyPropertyChanged(BR.mp104du);
    }

    @Bindable
    public String getMp105() {
        return mp105;
    }

    public void setMp105(String mp105) {
        if (this.mp105.equals(mp105)) return; // for all checkboxes
        this.mp105 = mp105;
        setMp105do(mp105.equals("5") ? this.mp105do : "");
        setMp105f(mp105.equals("5") ? this.mp105f : "");
        setMp105du(mp105.equals("5") ? this.mp105du : "");
        notifyPropertyChanged(BR.mp105);
    }

    @Bindable
    public String getMp105do() {
        return mp105do;
    }

    public void setMp105do(String mp105do) {
        this.mp105do = mp105do;
        notifyPropertyChanged(BR.mp105do);
    }

    @Bindable
    public String getMp105f() {
        return mp105f;
    }

    public void setMp105f(String mp105f) {
        this.mp105f = mp105f;
        notifyPropertyChanged(BR.mp105f);
    }

    @Bindable
    public String getMp105du() {
        return mp105du;
    }

    public void setMp105du(String mp105du) {
        this.mp105du = mp105du;
        notifyPropertyChanged(BR.mp105du);
    }

    @Bindable
    public String getMp106() {
        return mp106;
    }

    public void setMp106(String mp106) {
        if (this.mp106.equals(mp106)) return; // for all checkboxes
        this.mp106 = mp106;
        setMp106do(mp106.equals("6") ? this.mp106do : "");
        setMp106f(mp106.equals("6") ? this.mp106f : "");
        setMp106du(mp106.equals("6") ? this.mp106du : "");
        notifyPropertyChanged(BR.mp106);
    }

    @Bindable
    public String getMp106do() {
        return mp106do;
    }

    public void setMp106do(String mp106do) {
        this.mp106do = mp106do;
        notifyPropertyChanged(BR.mp106do);
    }

    @Bindable
    public String getMp106f() {
        return mp106f;
    }

    public void setMp106f(String mp106f) {
        this.mp106f = mp106f;
        notifyPropertyChanged(BR.mp106f);
    }

    @Bindable
    public String getMp106du() {
        return mp106du;
    }

    public void setMp106du(String mp106du) {
        this.mp106du = mp106du;
        notifyPropertyChanged(BR.mp106du);
    }

    @Bindable
    public String getMp107() {
        return mp107;
    }

    public void setMp107(String mp107) {
        if (this.mp107.equals(mp107)) return; // for all checkboxes
        this.mp107 = mp107;
        setMp107do(mp107.equals("7") ? this.mp107do : "");
        setMp107f(mp107.equals("7") ? this.mp107f : "");
        setMp107du(mp107.equals("7") ? this.mp107du : "");
        notifyPropertyChanged(BR.mp107);
    }

    @Bindable
    public String getMp107do() {
        return mp107do;
    }

    public void setMp107do(String mp107do) {
        this.mp107do = mp107do;
        notifyPropertyChanged(BR.mp107do);
    }

    @Bindable
    public String getMp107f() {
        return mp107f;
    }

    public void setMp107f(String mp107f) {
        this.mp107f = mp107f;
        notifyPropertyChanged(BR.mp107f);
    }

    @Bindable
    public String getMp107du() {
        return mp107du;
    }

    public void setMp107du(String mp107du) {
        this.mp107du = mp107du;
        notifyPropertyChanged(BR.mp107du);
    }

    @Bindable
    public String getMp108() {
        return mp108;
    }

    public void setMp108(String mp108) {
        if (this.mp108.equals(mp108)) return; // for all checkboxes
        this.mp108 = mp108;
        setMp108do(mp108.equals("8") ? this.mp108do : "");
        setMp108f(mp108.equals("8") ? this.mp108f : "");
        setMp108du(mp108.equals("8") ? this.mp108du : "");
        notifyPropertyChanged(BR.mp108);
    }

    @Bindable
    public String getMp108do() {
        return mp108do;
    }

    public void setMp108do(String mp108do) {
        this.mp108do = mp108do;
        notifyPropertyChanged(BR.mp108do);
    }

    @Bindable
    public String getMp108f() {
        return mp108f;
    }

    public void setMp108f(String mp108f) {
        this.mp108f = mp108f;
        notifyPropertyChanged(BR.mp108f);
    }

    @Bindable
    public String getMp108du() {
        return mp108du;
    }

    public void setMp108du(String mp108du) {
        this.mp108du = mp108du;
        notifyPropertyChanged(BR.mp108du);
    }

    @Bindable
    public String getMp109() {
        return mp109;
    }

    public void setMp109(String mp109) {
        if (this.mp109.equals(mp109)) return; // for all checkboxes
        this.mp109 = mp109;
        setMp109do(mp109.equals("9") ? this.mp109do : "");
        setMp109f(mp109.equals("9") ? this.mp109f : "");
        setMp109du(mp109.equals("9") ? this.mp109du : "");
        notifyPropertyChanged(BR.mp109);
    }

    @Bindable
    public String getMp109do() {
        return mp109do;
    }

    public void setMp109do(String mp109do) {
        this.mp109do = mp109do;
        notifyPropertyChanged(BR.mp109do);
    }

    @Bindable
    public String getMp109f() {
        return mp109f;
    }

    public void setMp109f(String mp109f) {
        this.mp109f = mp109f;
        notifyPropertyChanged(BR.mp109f);
    }

    @Bindable
    public String getMp109du() {
        return mp109du;
    }

    public void setMp109du(String mp109du) {
        this.mp109du = mp109du;
        notifyPropertyChanged(BR.mp109du);
    }

    @Bindable
    public String getMp110() {
        return mp110;
    }

    public void setMp110(String mp110) {
        if (this.mp110.equals(mp110)) return; // for all checkboxes
        this.mp110 = mp110;
        setMp110do(mp110.equals("10") ? this.mp110do : "");
        setMp110f(mp110.equals("10") ? this.mp110f : "");
        setMp110du(mp110.equals("10") ? this.mp110du : "");
        notifyPropertyChanged(BR.mp110);
    }

    @Bindable
    public String getMp110do() {
        return mp110do;
    }

    public void setMp110do(String mp110do) {
        this.mp110do = mp110do;
        notifyPropertyChanged(BR.mp110do);
    }

    @Bindable
    public String getMp110f() {
        return mp110f;
    }

    public void setMp110f(String mp110f) {
        this.mp110f = mp110f;
        notifyPropertyChanged(BR.mp110f);
    }

    @Bindable
    public String getMp110du() {
        return mp110du;
    }

    public void setMp110du(String mp110du) {
        this.mp110du = mp110du;
        notifyPropertyChanged(BR.mp110du);
    }

    @Bindable
    public String getMp111() {
        return mp111;
    }

    public void setMp111(String mp111) {
        if (this.mp111.equals(mp111)) return; // for all checkboxes
        this.mp111 = mp111;
        setMp111do(mp111.equals("11") ? this.mp111do : "");
        setMp111f(mp111.equals("11") ? this.mp111f : "");
        setMp111du(mp111.equals("11") ? this.mp111du : "");
        notifyPropertyChanged(BR.mp111);
    }

    @Bindable
    public String getMp111do() {
        return mp111do;
    }

    public void setMp111do(String mp111do) {
        this.mp111do = mp111do;
        notifyPropertyChanged(BR.mp111do);
    }

    @Bindable
    public String getMp111f() {
        return mp111f;
    }

    public void setMp111f(String mp111f) {
        this.mp111f = mp111f;
        notifyPropertyChanged(BR.mp111f);
    }

    @Bindable
    public String getMp111du() {
        return mp111du;
    }

    public void setMp111du(String mp111du) {
        this.mp111du = mp111du;
        notifyPropertyChanged(BR.mp111du);
    }

    @Bindable
    public String getMp112() {
        return mp112;
    }

    public void setMp112(String mp112) {
        if (this.mp112.equals(mp112)) return; // for all checkboxes
        this.mp112 = mp112;
        setMp112do(mp112.equals("12") ? this.mp112do : "");
        setMp112f(mp112.equals("12") ? this.mp112f : "");
        setMp112du(mp112.equals("12") ? this.mp112du : "");
        notifyPropertyChanged(BR.mp112);
    }

    @Bindable
    public String getMp112do() {
        return mp112do;
    }

    public void setMp112do(String mp112do) {
        this.mp112do = mp112do;
        notifyPropertyChanged(BR.mp112do);
    }

    @Bindable
    public String getMp112f() {
        return mp112f;
    }

    public void setMp112f(String mp112f) {
        this.mp112f = mp112f;
        notifyPropertyChanged(BR.mp112f);
    }

    @Bindable
    public String getMp112du() {
        return mp112du;
    }

    public void setMp112du(String mp112du) {
        this.mp112du = mp112du;
        notifyPropertyChanged(BR.mp112du);
    }

    @Bindable
    public String getMp113() {
        return mp113;
    }

    public void setMp113(String mp113) {
        if (this.mp113.equals(mp113)) return; // for all checkboxes
        this.mp113 = mp113;
        setMp113do(mp113.equals("13") ? this.mp113do : "");
        setMp113f(mp113.equals("13") ? this.mp113f : "");
        setMp113du(mp113.equals("13") ? this.mp113du : "");
        notifyPropertyChanged(BR.mp113);
    }

    @Bindable
    public String getMp113do() {
        return mp113do;
    }

    public void setMp113do(String mp113do) {
        this.mp113do = mp113do;
        notifyPropertyChanged(BR.mp113do);
    }

    @Bindable
    public String getMp113f() {
        return mp113f;
    }

    public void setMp113f(String mp113f) {
        this.mp113f = mp113f;
        notifyPropertyChanged(BR.mp113f);
    }

    @Bindable
    public String getMp113du() {
        return mp113du;
    }

    public void setMp113du(String mp113du) {
        this.mp113du = mp113du;
        notifyPropertyChanged(BR.mp113du);
    }

    @Bindable
    public String getMp114() {
        return mp114;
    }

    public void setMp114(String mp114) {
        if (this.mp114.equals(mp114)) return; // for all checkboxes
        this.mp114 = mp114;
        setMp114do(mp114.equals("14") ? this.mp114do : "");
        setMp114f(mp114.equals("14") ? this.mp114f : "");
        setMp114du(mp114.equals("14") ? this.mp114du : "");
        notifyPropertyChanged(BR.mp114);
    }

    @Bindable
    public String getMp114do() {
        return mp114do;
    }

    public void setMp114do(String mp114do) {
        this.mp114do = mp114do;
        notifyPropertyChanged(BR.mp114do);
    }

    @Bindable
    public String getMp114f() {
        return mp114f;
    }

    public void setMp114f(String mp114f) {
        this.mp114f = mp114f;
        notifyPropertyChanged(BR.mp114f);
    }

    @Bindable
    public String getMp114du() {
        return mp114du;
    }

    public void setMp114du(String mp114du) {
        this.mp114du = mp114du;
        notifyPropertyChanged(BR.mp114du);
    }

    @Bindable
    public String getMp115() {
        return mp115;
    }

    public void setMp115(String mp115) {
        if (this.mp115.equals(mp115)) return; // for all checkboxes
        this.mp115 = mp115;
        setMp115do(mp115.equals("15") ? this.mp115do : "");
        setMp115f(mp115.equals("15") ? this.mp115f : "");
        setMp115du(mp115.equals("15") ? this.mp115du : "");
        notifyPropertyChanged(BR.mp115);
    }

    @Bindable
    public String getMp115do() {
        return mp115do;
    }

    public void setMp115do(String mp115do) {
        this.mp115do = mp115do;
        notifyPropertyChanged(BR.mp115do);
    }

    @Bindable
    public String getMp115f() {
        return mp115f;
    }

    public void setMp115f(String mp115f) {
        this.mp115f = mp115f;
        notifyPropertyChanged(BR.mp115f);
    }

    @Bindable
    public String getMp115du() {
        return mp115du;
    }

    public void setMp115du(String mp115du) {
        this.mp115du = mp115du;
        notifyPropertyChanged(BR.mp115du);
    }

    @Bindable
    public String getMp116() {
        return mp116;
    }

    public void setMp116(String mp116) {
        if (this.mp116.equals(mp116)) return; // for all checkboxes
        this.mp116 = mp116;
        setMp116do(mp116.equals("16") ? this.mp116do : "");
        setMp116f(mp116.equals("16") ? this.mp116f : "");
        setMp116du(mp116.equals("16") ? this.mp116du : "");
        notifyPropertyChanged(BR.mp116);
    }

    @Bindable
    public String getMp116do() {
        return mp116do;
    }

    public void setMp116do(String mp116do) {
        this.mp116do = mp116do;
        notifyPropertyChanged(BR.mp116do);
    }

    @Bindable
    public String getMp116f() {
        return mp116f;
    }

    public void setMp116f(String mp116f) {
        this.mp116f = mp116f;
        notifyPropertyChanged(BR.mp116f);
    }

    @Bindable
    public String getMp116du() {
        return mp116du;
    }

    public void setMp116du(String mp116du) {
        this.mp116du = mp116du;
        notifyPropertyChanged(BR.mp116du);
    }

    @Bindable
    public String getMp117() {
        return mp117;
    }

    public void setMp117(String mp117) {
        if (this.mp117.equals(mp117)) return; // for all checkboxes
        this.mp117 = mp117;
        setMp117do(mp117.equals("17") ? this.mp117do : "");
        setMp117f(mp117.equals("17") ? this.mp117f : "");
        setMp117du(mp117.equals("17") ? this.mp117du : "");
        notifyPropertyChanged(BR.mp117);
    }

    @Bindable
    public String getMp117do() {
        return mp117do;
    }

    public void setMp117do(String mp117do) {
        this.mp117do = mp117do;
        notifyPropertyChanged(BR.mp117do);
    }

    @Bindable
    public String getMp117f() {
        return mp117f;
    }

    public void setMp117f(String mp117f) {
        this.mp117f = mp117f;
        notifyPropertyChanged(BR.mp117f);
    }

    @Bindable
    public String getMp117du() {
        return mp117du;
    }

    public void setMp117du(String mp117du) {
        this.mp117du = mp117du;
        notifyPropertyChanged(BR.mp117du);
    }

    @Bindable
    public String getMp118() {
        return mp118;
    }

    public void setMp118(String mp118) {
        if (this.mp118.equals(mp118)) return; // for all checkboxes
        this.mp118 = mp118;
        setMp118do(mp118.equals("18") ? this.mp118do : "");
        setMp118f(mp118.equals("18") ? this.mp118f : "");
        setMp118du(mp118.equals("18") ? this.mp118du : "");
        notifyPropertyChanged(BR.mp118);
    }

    @Bindable
    public String getMp118do() {
        return mp118do;
    }

    public void setMp118do(String mp118do) {
        this.mp118do = mp118do;
        notifyPropertyChanged(BR.mp118do);
    }

    @Bindable
    public String getMp118f() {
        return mp118f;
    }

    public void setMp118f(String mp118f) {
        this.mp118f = mp118f;
        notifyPropertyChanged(BR.mp118f);
    }

    @Bindable
    public String getMp118du() {
        return mp118du;
    }

    public void setMp118du(String mp118du) {
        this.mp118du = mp118du;
        notifyPropertyChanged(BR.mp118du);
    }

    @Bindable
    public String getMp119() {
        return mp119;
    }

    public void setMp119(String mp119) {
        if (this.mp119.equals(mp119)) return; // for all checkboxes
        this.mp119 = mp119;
        setMp119do(mp119.equals("19") ? this.mp119do : "");
        setMp119f(mp119.equals("19") ? this.mp119f : "");
        setMp119du(mp119.equals("19") ? this.mp119du : "");
        notifyPropertyChanged(BR.mp119);
    }

    @Bindable
    public String getMp119do() {
        return mp119do;
    }

    public void setMp119do(String mp119do) {
        this.mp119do = mp119do;
        notifyPropertyChanged(BR.mp119do);
    }

    @Bindable
    public String getMp119f() {
        return mp119f;
    }

    public void setMp119f(String mp119f) {
        this.mp119f = mp119f;
        notifyPropertyChanged(BR.mp119f);
    }

    @Bindable
    public String getMp119du() {
        return mp119du;
    }

    public void setMp119du(String mp119du) {
        this.mp119du = mp119du;
        notifyPropertyChanged(BR.mp119du);
    }

    @Bindable
    public String getMp120() {
        return mp120;
    }

    public void setMp120(String mp120) {
        if (this.mp120.equals(mp120)) return; // for all checkboxes
        this.mp120 = mp120;
        setMp120do(mp120.equals("20") ? this.mp120do : "");
        setMp120f(mp120.equals("20") ? this.mp120f : "");
        setMp120du(mp120.equals("20") ? this.mp120du : "");
        notifyPropertyChanged(BR.mp120);
    }

    @Bindable
    public String getMp120do() {
        return mp120do;
    }

    public void setMp120do(String mp120do) {
        this.mp120do = mp120do;
        notifyPropertyChanged(BR.mp120do);
    }

    @Bindable
    public String getMp120f() {
        return mp120f;
    }

    public void setMp120f(String mp120f) {
        this.mp120f = mp120f;
        notifyPropertyChanged(BR.mp120f);
    }

    @Bindable
    public String getMp120du() {
        return mp120du;
    }

    public void setMp120du(String mp120du) {
        this.mp120du = mp120du;
        notifyPropertyChanged(BR.mp120du);
    }

    @Bindable
    public String getMp121() {
        return mp121;
    }

    public void setMp121(String mp121) {
        if (this.mp121.equals(mp121)) return; // for all checkboxes
        this.mp121 = mp121;
        setMp121do(mp121.equals("21") ? this.mp121do : "");
        setMp121f(mp121.equals("21") ? this.mp121f : "");
        setMp121du(mp121.equals("21") ? this.mp121du : "");
        notifyPropertyChanged(BR.mp121);
    }

    @Bindable
    public String getMp121do() {
        return mp121do;
    }

    public void setMp121do(String mp121do) {
        this.mp121do = mp121do;
        notifyPropertyChanged(BR.mp121do);
    }

    @Bindable
    public String getMp121f() {
        return mp121f;
    }

    public void setMp121f(String mp121f) {
        this.mp121f = mp121f;
        notifyPropertyChanged(BR.mp121f);
    }

    @Bindable
    public String getMp121du() {
        return mp121du;
    }

    public void setMp121du(String mp121du) {
        this.mp121du = mp121du;
        notifyPropertyChanged(BR.mp121du);
    }

    @Bindable
    public String getMp122() {
        return mp122;
    }

    public void setMp122(String mp122) {
        if (this.mp122.equals(mp122)) return; // for all checkboxes
        this.mp122 = mp122;
        setMp122do(mp122.equals("22") ? this.mp122do : "");
        setMp122f(mp122.equals("22") ? this.mp122f : "");
        setMp122du(mp122.equals("22") ? this.mp122du : "");
        notifyPropertyChanged(BR.mp122);
    }

    @Bindable
    public String getMp122do() {
        return mp122do;
    }

    public void setMp122do(String mp122do) {
        this.mp122do = mp122do;
        notifyPropertyChanged(BR.mp122do);
    }

    @Bindable
    public String getMp122f() {
        return mp122f;
    }

    public void setMp122f(String mp122f) {
        this.mp122f = mp122f;
        notifyPropertyChanged(BR.mp122f);
    }

    @Bindable
    public String getMp122du() {
        return mp122du;
    }

    public void setMp122du(String mp122du) {
        this.mp122du = mp122du;
        notifyPropertyChanged(BR.mp122du);
    }

    @Bindable
    public String getMp123() {
        return mp123;
    }

    public void setMp123(String mp123) {
        if (this.mp123.equals(mp123)) return; // for all checkboxes
        this.mp123 = mp123;
        setMp123do(mp123.equals("23") ? this.mp123do : "");
        setMp123f(mp123.equals("23") ? this.mp123f : "");
        setMp123du(mp123.equals("23") ? this.mp123du : "");
        notifyPropertyChanged(BR.mp123);
    }

    @Bindable
    public String getMp123do() {
        return mp123do;
    }

    public void setMp123do(String mp123do) {
        this.mp123do = mp123do;
        notifyPropertyChanged(BR.mp123do);
    }

    @Bindable
    public String getMp123f() {
        return mp123f;
    }

    public void setMp123f(String mp123f) {
        this.mp123f = mp123f;
        notifyPropertyChanged(BR.mp123f);
    }

    @Bindable
    public String getMp123du() {
        return mp123du;
    }

    public void setMp123du(String mp123du) {
        this.mp123du = mp123du;
        notifyPropertyChanged(BR.mp123du);
    }

    @Bindable
    public String getMp124() {
        return mp124;
    }

    public void setMp124(String mp124) {
        if (this.mp124.equals(mp124)) return; // for all checkboxes
        this.mp124 = mp124;
        setMp124do(mp124.equals("24") ? this.mp124do : "");
        setMp124f(mp124.equals("24") ? this.mp124f : "");
        setMp124du(mp124.equals("24") ? this.mp124du : "");
        notifyPropertyChanged(BR.mp124);
    }

    @Bindable
    public String getMp124do() {
        return mp124do;
    }

    public void setMp124do(String mp124do) {
        this.mp124do = mp124do;
        notifyPropertyChanged(BR.mp124do);
    }

    @Bindable
    public String getMp124f() {
        return mp124f;
    }

    public void setMp124f(String mp124f) {
        this.mp124f = mp124f;
        notifyPropertyChanged(BR.mp124f);
    }

    @Bindable
    public String getMp124du() {
        return mp124du;
    }

    public void setMp124du(String mp124du) {
        this.mp124du = mp124du;
        notifyPropertyChanged(BR.mp124du);
    }

    @Bindable
    public String getMp125() {
        return mp125;
    }

    public void setMp125(String mp125) {
        if (this.mp125.equals(mp125)) return; // for all checkboxes
        this.mp125 = mp125;
        setMp125do(mp125.equals("25") ? this.mp125do : "");
        setMp125f(mp125.equals("25") ? this.mp125f : "");
        setMp125du(mp125.equals("25") ? this.mp125du : "");
        notifyPropertyChanged(BR.mp125);
    }

    @Bindable
    public String getMp125do() {
        return mp125do;
    }

    public void setMp125do(String mp125do) {
        this.mp125do = mp125do;
        notifyPropertyChanged(BR.mp125do);
    }

    @Bindable
    public String getMp125f() {
        return mp125f;
    }

    public void setMp125f(String mp125f) {
        this.mp125f = mp125f;
        notifyPropertyChanged(BR.mp125f);
    }

    @Bindable
    public String getMp125du() {
        return mp125du;
    }

    public void setMp125du(String mp125du) {
        this.mp125du = mp125du;
        notifyPropertyChanged(BR.mp125du);
    }

    @Bindable
    public String getMp126() {
        return mp126;
    }

    public void setMp126(String mp126) {
        if (this.mp126.equals(mp126)) return; // for all checkboxes
        this.mp126 = mp126;
        setMp126do(mp126.equals("26") ? this.mp126do : "");
        setMp126f(mp126.equals("26") ? this.mp126f : "");
        setMp126du(mp126.equals("26") ? this.mp126du : "");
        notifyPropertyChanged(BR.mp126);
    }

    @Bindable
    public String getMp126do() {
        return mp126do;
    }

    public void setMp126do(String mp126do) {
        this.mp126do = mp126do;
        notifyPropertyChanged(BR.mp126do);
    }

    @Bindable
    public String getMp126f() {
        return mp126f;
    }

    public void setMp126f(String mp126f) {
        this.mp126f = mp126f;
        notifyPropertyChanged(BR.mp126f);
    }

    @Bindable
    public String getMp126du() {
        return mp126du;
    }

    public void setMp126du(String mp126du) {
        this.mp126du = mp126du;
        notifyPropertyChanged(BR.mp126du);
    }

    @Bindable
    public String getMp127() {
        return mp127;
    }

    public void setMp127(String mp127) {
        if (this.mp127.equals(mp127)) return; // for all checkboxes
        this.mp127 = mp127;
        setMp127do(mp127.equals("27") ? this.mp127do : "");
        setMp127f(mp127.equals("27") ? this.mp127f : "");
        setMp127du(mp127.equals("27") ? this.mp127du : "");
        notifyPropertyChanged(BR.mp127);
    }

    @Bindable
    public String getMp127do() {
        return mp127do;
    }

    public void setMp127do(String mp127do) {
        this.mp127do = mp127do;
        notifyPropertyChanged(BR.mp127do);
    }

    @Bindable
    public String getMp127f() {
        return mp127f;
    }

    public void setMp127f(String mp127f) {
        this.mp127f = mp127f;
        notifyPropertyChanged(BR.mp127f);
    }

    @Bindable
    public String getMp127du() {
        return mp127du;
    }

    public void setMp127du(String mp127du) {
        this.mp127du = mp127du;
        notifyPropertyChanged(BR.mp127du);
    }

    @Bindable
    public String getMp128() {
        return mp128;
    }

    public void setMp128(String mp128) {
        if (this.mp128.equals(mp128)) return; // for all checkboxes
        this.mp128 = mp128;
        setMp128do(mp128.equals("28") ? this.mp128do : "");
        setMp128f(mp128.equals("28") ? this.mp128f : "");
        setMp128du(mp128.equals("28") ? this.mp128du : "");
        notifyPropertyChanged(BR.mp128);
    }

    @Bindable
    public String getMp128do() {
        return mp128do;
    }

    public void setMp128do(String mp128do) {
        this.mp128do = mp128do;
        notifyPropertyChanged(BR.mp128do);
    }

    @Bindable
    public String getMp128f() {
        return mp128f;
    }

    public void setMp128f(String mp128f) {
        this.mp128f = mp128f;
        notifyPropertyChanged(BR.mp128f);
    }

    @Bindable
    public String getMp128du() {
        return mp128du;
    }

    public void setMp128du(String mp128du) {
        this.mp128du = mp128du;
        notifyPropertyChanged(BR.mp128du);
    }

    @Bindable
    public String getMp129() {
        return mp129;
    }

    public void setMp129(String mp129) {
        if (this.mp129.equals(mp129)) return; // for all checkboxes
        this.mp129 = mp129;
        setMp129do(mp129.equals("29") ? this.mp129do : "");
        setMp129f(mp129.equals("29") ? this.mp129f : "");
        setMp129du(mp129.equals("29") ? this.mp129du : "");
        notifyPropertyChanged(BR.mp129);
    }

    @Bindable
    public String getMp129do() {
        return mp129do;
    }

    public void setMp129do(String mp129do) {
        this.mp129do = mp129do;
        notifyPropertyChanged(BR.mp129do);
    }

    @Bindable
    public String getMp129f() {
        return mp129f;
    }

    public void setMp129f(String mp129f) {
        this.mp129f = mp129f;
        notifyPropertyChanged(BR.mp129f);
    }

    @Bindable
    public String getMp129du() {
        return mp129du;
    }

    public void setMp129du(String mp129du) {
        this.mp129du = mp129du;
        notifyPropertyChanged(BR.mp129du);
    }

    @Bindable
    public String getMp130() {
        return mp130;
    }

    public void setMp130(String mp130) {
        if (this.mp130.equals(mp130)) return; // for all checkboxes
        this.mp130 = mp130;
        setMp130do(mp130.equals("30") ? this.mp130do : "");
        setMp130f(mp130.equals("30") ? this.mp130f : "");
        setMp130du(mp130.equals("30") ? this.mp130du : "");
        notifyPropertyChanged(BR.mp130);
    }

    @Bindable
    public String getMp130do() {
        return mp130do;
    }

    public void setMp130do(String mp130do) {
        this.mp130do = mp130do;
        notifyPropertyChanged(BR.mp130do);
    }

    @Bindable
    public String getMp130f() {
        return mp130f;
    }

    public void setMp130f(String mp130f) {
        this.mp130f = mp130f;
        notifyPropertyChanged(BR.mp130f);
    }

    @Bindable
    public String getMp130du() {
        return mp130du;
    }

    public void setMp130du(String mp130du) {
        this.mp130du = mp130du;
        notifyPropertyChanged(BR.mp130du);
    }

    @Bindable
    public String getMp131() {
        return mp131;
    }

    public void setMp131(String mp131) {
        if (this.mp131.equals(mp131)) return; // for all checkboxes
        this.mp131 = mp131;
        setMp131do(mp131.equals("31") ? this.mp131do : "");
        setMp131f(mp131.equals("31") ? this.mp131f : "");
        setMp131du(mp131.equals("31") ? this.mp131du : "");
        notifyPropertyChanged(BR.mp131);
    }

    @Bindable
    public String getMp131do() {
        return mp131do;
    }

    public void setMp131do(String mp131do) {
        this.mp131do = mp131do;
        notifyPropertyChanged(BR.mp131do);
    }

    @Bindable
    public String getMp131f() {
        return mp131f;
    }

    public void setMp131f(String mp131f) {
        this.mp131f = mp131f;
        notifyPropertyChanged(BR.mp131f);
    }

    @Bindable
    public String getMp131du() {
        return mp131du;
    }

    public void setMp131du(String mp131du) {
        this.mp131du = mp131du;
        notifyPropertyChanged(BR.mp131du);
    }

    @Bindable
    public String getMp132() {
        return mp132;
    }

    public void setMp132(String mp132) {
        if (this.mp132.equals(mp132)) return; // for all checkboxes
        this.mp132 = mp132;
        setMp132do(mp132.equals("32") ? this.mp132do : "");
        setMp132f(mp132.equals("32") ? this.mp132f : "");
        setMp132du(mp132.equals("32") ? this.mp132du : "");
        notifyPropertyChanged(BR.mp132);
    }

    @Bindable
    public String getMp132do() {
        return mp132do;
    }

    public void setMp132do(String mp132do) {
        this.mp132do = mp132do;
        notifyPropertyChanged(BR.mp132do);
    }

    @Bindable
    public String getMp132f() {
        return mp132f;
    }

    public void setMp132f(String mp132f) {
        this.mp132f = mp132f;
        notifyPropertyChanged(BR.mp132f);
    }

    @Bindable
    public String getMp132du() {
        return mp132du;
    }

    public void setMp132du(String mp132du) {
        this.mp132du = mp132du;
        notifyPropertyChanged(BR.mp132du);
    }

    @Bindable
    public String getMp133() {
        return mp133;
    }

    public void setMp133(String mp133) {
        if (this.mp133.equals(mp133)) return; // for all checkboxes
        this.mp133 = mp133;
        setMp133do(mp133.equals("33") ? this.mp133do : "");
        setMp133f(mp133.equals("33") ? this.mp133f : "");
        setMp133du(mp133.equals("33") ? this.mp133du : "");
        notifyPropertyChanged(BR.mp133);
    }

    @Bindable
    public String getMp133do() {
        return mp133do;
    }

    public void setMp133do(String mp133do) {
        this.mp133do = mp133do;
        notifyPropertyChanged(BR.mp133do);
    }

    @Bindable
    public String getMp133f() {
        return mp133f;
    }

    public void setMp133f(String mp133f) {
        this.mp133f = mp133f;
        notifyPropertyChanged(BR.mp133f);
    }

    @Bindable
    public String getMp133du() {
        return mp133du;
    }

    public void setMp133du(String mp133du) {
        this.mp133du = mp133du;
        notifyPropertyChanged(BR.mp133du);
    }

    @Bindable
    public String getMp134() {
        return mp134;
    }

    public void setMp134(String mp134) {
        if (this.mp134.equals(mp134)) return; // for all checkboxes
        this.mp134 = mp134;
        setMp134do(mp134.equals("34") ? this.mp134do : "");
        setMp134f(mp134.equals("34") ? this.mp134f : "");
        setMp134du(mp134.equals("34") ? this.mp134du : "");
        notifyPropertyChanged(BR.mp134);
    }

    @Bindable
    public String getMp134do() {
        return mp134do;
    }

    public void setMp134do(String mp134do) {
        this.mp134do = mp134do;
        notifyPropertyChanged(BR.mp134do);
    }

    @Bindable
    public String getMp134f() {
        return mp134f;
    }

    public void setMp134f(String mp134f) {
        this.mp134f = mp134f;
        notifyPropertyChanged(BR.mp134f);
    }

    @Bindable
    public String getMp134du() {
        return mp134du;
    }

    public void setMp134du(String mp134du) {
        this.mp134du = mp134du;
        notifyPropertyChanged(BR.mp134du);
    }

    @Bindable
    public String getMp135() {
        return mp135;
    }

    public void setMp135(String mp135) {
        if (this.mp135.equals(mp135)) return; // for all checkboxes
        this.mp135 = mp135;
        setMp135do(mp135.equals("35") ? this.mp135do : "");
        setMp135f(mp135.equals("35") ? this.mp135f : "");
        setMp135du(mp135.equals("35") ? this.mp135du : "");
        notifyPropertyChanged(BR.mp135);
    }

    @Bindable
    public String getMp135do() {
        return mp135do;
    }

    public void setMp135do(String mp135do) {
        this.mp135do = mp135do;
        notifyPropertyChanged(BR.mp135do);
    }

    @Bindable
    public String getMp135f() {
        return mp135f;
    }

    public void setMp135f(String mp135f) {
        this.mp135f = mp135f;
        notifyPropertyChanged(BR.mp135f);
    }

    @Bindable
    public String getMp135du() {
        return mp135du;
    }

    public void setMp135du(String mp135du) {
        this.mp135du = mp135du;
        notifyPropertyChanged(BR.mp135du);
    }

    @Bindable
    public String getMp136() {
        return mp136;
    }

    public void setMp136(String mp136) {
        if (this.mp136.equals(mp136)) return; // for all checkboxes
        this.mp136 = mp136;
        setMp136do(mp136.equals("36") ? this.mp136do : "");
        setMp136f(mp136.equals("36") ? this.mp136f : "");
        setMp136du(mp136.equals("36") ? this.mp136du : "");
        notifyPropertyChanged(BR.mp136);
    }

    @Bindable
    public String getMp136do() {
        return mp136do;
    }

    public void setMp136do(String mp136do) {
        this.mp136do = mp136do;
        notifyPropertyChanged(BR.mp136do);
    }

    @Bindable
    public String getMp136f() {
        return mp136f;
    }

    public void setMp136f(String mp136f) {
        this.mp136f = mp136f;
        notifyPropertyChanged(BR.mp136f);
    }

    @Bindable
    public String getMp136du() {
        return mp136du;
    }

    public void setMp136du(String mp136du) {
        this.mp136du = mp136du;
        notifyPropertyChanged(BR.mp136du);
    }

    @Bindable
    public String getMp137() {
        return mp137;
    }

    public void setMp137(String mp137) {
        if (this.mp137.equals(mp137)) return; // for all checkboxes
        this.mp137 = mp137;
        setMp137do(mp137.equals("37") ? this.mp137do : "");
        setMp137f(mp137.equals("37") ? this.mp137f : "");
        setMp137du(mp137.equals("37") ? this.mp137du : "");
        notifyPropertyChanged(BR.mp137);
    }

    @Bindable
    public String getMp137do() {
        return mp137do;
    }

    public void setMp137do(String mp137do) {
        this.mp137do = mp137do;
        notifyPropertyChanged(BR.mp137do);
    }

    @Bindable
    public String getMp137f() {
        return mp137f;
    }

    public void setMp137f(String mp137f) {
        this.mp137f = mp137f;
        notifyPropertyChanged(BR.mp137f);
    }

    @Bindable
    public String getMp137du() {
        return mp137du;
    }

    public void setMp137du(String mp137du) {
        this.mp137du = mp137du;
        notifyPropertyChanged(BR.mp137du);
    }

    @Bindable
    public String getMp961() {
        return mp961;
    }

    public void setMp961(String mp961) {
        if (this.mp961.equals(mp961)) return; // for all checkboxes
        this.mp961 = mp961;
        setMp961do(mp961.equals("961") ? this.mp961do : "");
        setMp961f(mp961.equals("961") ? this.mp961f : "");
        setMp961du(mp961.equals("961") ? this.mp961du : "");
        setMp961x(mp961.equals("961") ? this.mp961x : "");
        notifyPropertyChanged(BR.mp961);
    }

    @Bindable
    public String getMp961do() {
        return mp961do;
    }

    public void setMp961do(String mp961do) {
        this.mp961do = mp961do;
        notifyPropertyChanged(BR.mp961do);
    }

    @Bindable
    public String getMp961f() {
        return mp961f;
    }

    public void setMp961f(String mp961f) {
        this.mp961f = mp961f;
        notifyPropertyChanged(BR.mp961f);
    }

    @Bindable
    public String getMp961du() {
        return mp961du;
    }

    public void setMp961du(String mp961du) {
        this.mp961du = mp961du;
        notifyPropertyChanged(BR.mp961du);
    }

    @Bindable
    public String getMp961x() {
        return mp961x;
    }

    public void setMp961x(String mp961x) {
        this.mp961x = mp961x;
        notifyPropertyChanged(BR.mp961x);
    }

    @Bindable
    public String getMp962() {
        return mp962;
    }

    public void setMp962(String mp962) {
        if (this.mp962.equals(mp962)) return; // for all checkboxes
        this.mp962 = mp962;
        setMp962do(mp962.equals("962") ? this.mp962do : "");
        setMp962f(mp962.equals("962") ? this.mp962f : "");
        setMp962du(mp962.equals("962") ? this.mp962du : "");
        setMp962x(mp962.equals("962") ? this.mp962x : "");
        notifyPropertyChanged(BR.mp962);
    }

    @Bindable
    public String getMp962do() {
        return mp962do;
    }

    public void setMp962do(String mp962do) {
        this.mp962do = mp962do;
        notifyPropertyChanged(BR.mp962do);
    }

    @Bindable
    public String getMp962f() {
        return mp962f;
    }

    public void setMp962f(String mp962f) {
        this.mp962f = mp962f;
        notifyPropertyChanged(BR.mp962f);
    }

    @Bindable
    public String getMp962du() {
        return mp962du;
    }

    public void setMp962du(String mp962du) {
        this.mp962du = mp962du;
        notifyPropertyChanged(BR.mp962du);
    }

    @Bindable
    public String getMp962x() {
        return mp962x;
    }

    public void setMp962x(String mp962x) {
        this.mp962x = mp962x;
        notifyPropertyChanged(BR.mp962x);
    }

    @Bindable
    public String getMp963() {
        return mp963;
    }

    public void setMp963(String mp963) {
        if (this.mp963.equals(mp963)) return; // for all checkboxes
        this.mp963 = mp963;
        setMp963do(mp963.equals("963") ? this.mp963do : "");
        setMp963f(mp963.equals("963") ? this.mp963f : "");
        setMp963du(mp963.equals("963") ? this.mp963du : "");
        setMp963x(mp963.equals("963") ? this.mp963x : "");
        notifyPropertyChanged(BR.mp963);
    }

    @Bindable
    public String getMp963do() {
        return mp963do;
    }

    public void setMp963do(String mp963do) {
        this.mp963do = mp963do;
        notifyPropertyChanged(BR.mp963do);
    }

    @Bindable
    public String getMp963f() {
        return mp963f;
    }

    public void setMp963f(String mp963f) {
        this.mp963f = mp963f;
        notifyPropertyChanged(BR.mp963f);
    }

    @Bindable
    public String getMp963du() {
        return mp963du;
    }

    public void setMp963du(String mp963du) {
        this.mp963du = mp963du;
        notifyPropertyChanged(BR.mp963du);
    }

    @Bindable
    public String getMp963x() {
        return mp963x;
    }

    public void setMp963x(String mp963x) {
        this.mp963x = mp963x;
        notifyPropertyChanged(BR.mp963x);
    }

    @Bindable
    public String getMpnr() {
        return mpnr;
    }

    public void setMpnr(String mpnr) {
        if (this.mpnr.equals(mpnr)) return; // for all checkboxes
        this.mpnr = mpnr;
        setMp101(mpnr.equals("999") ? "" : this.mp101);
        setMp102(mpnr.equals("999") ? "" : this.mp102);
        setMp103(mpnr.equals("999") ? "" : this.mp103);
        setMp104(mpnr.equals("999") ? "" : this.mp104);
        setMp105(mpnr.equals("999") ? "" : this.mp105);
        setMp106(mpnr.equals("999") ? "" : this.mp106);
        setMp107(mpnr.equals("999") ? "" : this.mp107);
        setMp108(mpnr.equals("999") ? "" : this.mp108);
        setMp109(mpnr.equals("999") ? "" : this.mp109);
        setMp110(mpnr.equals("999") ? "" : this.mp110);
        setMp111(mpnr.equals("999") ? "" : this.mp111);
        setMp112(mpnr.equals("999") ? "" : this.mp112);
        setMp113(mpnr.equals("999") ? "" : this.mp113);
        setMp114(mpnr.equals("999") ? "" : this.mp114);
        setMp115(mpnr.equals("999") ? "" : this.mp115);
        setMp116(mpnr.equals("999") ? "" : this.mp116);
        setMp117(mpnr.equals("999") ? "" : this.mp117);
        setMp118(mpnr.equals("999") ? "" : this.mp118);
        setMp119(mpnr.equals("999") ? "" : this.mp119);
        setMp120(mpnr.equals("999") ? "" : this.mp120);
        setMp121(mpnr.equals("999") ? "" : this.mp121);
        setMp122(mpnr.equals("999") ? "" : this.mp122);
        setMp123(mpnr.equals("999") ? "" : this.mp123);
        setMp124(mpnr.equals("999") ? "" : this.mp124);
        setMp125(mpnr.equals("999") ? "" : this.mp125);
        setMp126(mpnr.equals("999") ? "" : this.mp126);
        setMp127(mpnr.equals("999") ? "" : this.mp127);
        setMp128(mpnr.equals("999") ? "" : this.mp128);
        setMp129(mpnr.equals("999") ? "" : this.mp129);
        setMp130(mpnr.equals("999") ? "" : this.mp130);
        setMp131(mpnr.equals("999") ? "" : this.mp131);
        setMp132(mpnr.equals("999") ? "" : this.mp132);
        setMp133(mpnr.equals("999") ? "" : this.mp133);
        setMp134(mpnr.equals("999") ? "" : this.mp134);
        setMp135(mpnr.equals("999") ? "" : this.mp135);
        setMp136(mpnr.equals("999") ? "" : this.mp136);
        setMp137(mpnr.equals("999") ? "" : this.mp137);
        setMp961(mpnr.equals("999") ? "" : this.mp961);
        setMp962(mpnr.equals("999") ? "" : this.mp962);
        setMp963(mpnr.equals("999") ? "" : this.mp963);
        notifyPropertyChanged(BR.mpnr);
    }


    public Prescription Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_UUID));
        this.prno = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_PRNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_USERNAME));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_PROJECT_NAME));
        this.facility = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_FACILITY));
        this.facilityCode = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_FACILITY_CODE));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_SYSDATE));
        this.vdate = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_VDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_SYNCED_DATE));
        this.medCode = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_MED_CODE));
        this.dose = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_DOSE));
        this.frequency = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_FREQUENCY));
        this.duration = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_DURATION));
        this.other = cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_OTHER));

        sPRESHydrate(cursor.getString(cursor.getColumnIndexOrThrow(PRESCRIPTIONTable.COLUMN_PRES)));

        return this;
    }

    public void sPRESHydrate(String string) throws JSONException {
        Log.d(TAG, "sPRESHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.mp101 = json.has("mp101") ? json.getString("mp101") : "";
            this.mp101do = json.has("mp101do") ? json.getString("mp101do") : "";
            this.mp101f = json.has("mp101f") ? json.getString("mp101f") : "";
            this.mp101du = json.has("mp101du") ? json.getString("mp101du") : "";
            this.mp102 = json.has("mp102") ? json.getString("mp102") : "";
            this.mp102do = json.has("mp102do") ? json.getString("mp102do") : "";
            this.mp102f = json.has("mp102f") ? json.getString("mp102f") : "";
            this.mp102du = json.has("mp102du") ? json.getString("mp102du") : "";
            this.mp103 = json.has("mp103") ? json.getString("mp103") : "";
            this.mp103do = json.has("mp103do") ? json.getString("mp103do") : "";
            this.mp103f = json.has("mp103f") ? json.getString("mp103f") : "";
            this.mp103du = json.has("mp103du") ? json.getString("mp103du") : "";
            this.mp104 = json.has("mp104") ? json.getString("mp104") : "";
            this.mp104do = json.has("mp104do") ? json.getString("mp104do") : "";
            this.mp104f = json.has("mp104f") ? json.getString("mp104f") : "";
            this.mp104du = json.has("mp104du") ? json.getString("mp104du") : "";
            this.mp105 = json.has("mp105") ? json.getString("mp105") : "";
            this.mp105do = json.has("mp105do") ? json.getString("mp105do") : "";
            this.mp105f = json.has("mp105f") ? json.getString("mp105f") : "";
            this.mp105du = json.has("mp105du") ? json.getString("mp105du") : "";
            this.mp106 = json.has("mp106") ? json.getString("mp106") : "";
            this.mp106do = json.has("mp106do") ? json.getString("mp106do") : "";
            this.mp106f = json.has("mp106f") ? json.getString("mp106f") : "";
            this.mp106du = json.has("mp106du") ? json.getString("mp106du") : "";
            this.mp107 = json.has("mp107") ? json.getString("mp107") : "";
            this.mp107do = json.has("mp107do") ? json.getString("mp107do") : "";
            this.mp107f = json.has("mp107f") ? json.getString("mp107f") : "";
            this.mp107du = json.has("mp107du") ? json.getString("mp107du") : "";
            this.mp108 = json.has("mp108") ? json.getString("mp108") : "";
            this.mp108do = json.has("mp108do") ? json.getString("mp108do") : "";
            this.mp108f = json.has("mp108f") ? json.getString("mp108f") : "";
            this.mp108du = json.has("mp108du") ? json.getString("mp108du") : "";
            this.mp109 = json.has("mp109") ? json.getString("mp109") : "";
            this.mp109do = json.has("mp109do") ? json.getString("mp109do") : "";
            this.mp109f = json.has("mp109f") ? json.getString("mp109f") : "";
            this.mp109du = json.has("mp109du") ? json.getString("mp109du") : "";
            this.mp110 = json.has("mp110") ? json.getString("mp110") : "";
            this.mp110do = json.has("mp110do") ? json.getString("mp110do") : "";
            this.mp110f = json.has("mp110f") ? json.getString("mp110f") : "";
            this.mp110du = json.has("mp110du") ? json.getString("mp110du") : "";
            this.mp111 = json.has("mp111") ? json.getString("mp111") : "";
            this.mp111do = json.has("mp111do") ? json.getString("mp111do") : "";
            this.mp111f = json.has("mp111f") ? json.getString("mp111f") : "";
            this.mp111du = json.has("mp111du") ? json.getString("mp111du") : "";
            this.mp112 = json.has("mp112") ? json.getString("mp112") : "";
            this.mp112do = json.has("mp112do") ? json.getString("mp112do") : "";
            this.mp112f = json.has("mp112f") ? json.getString("mp112f") : "";
            this.mp112du = json.has("mp112du") ? json.getString("mp112du") : "";
            this.mp113 = json.has("mp113") ? json.getString("mp113") : "";
            this.mp113do = json.has("mp113do") ? json.getString("mp113do") : "";
            this.mp113f = json.has("mp113f") ? json.getString("mp113f") : "";
            this.mp113du = json.has("mp113du") ? json.getString("mp113du") : "";
            this.mp114 = json.has("mp114") ? json.getString("mp114") : "";
            this.mp114do = json.has("mp114do") ? json.getString("mp114do") : "";
            this.mp114f = json.has("mp114f") ? json.getString("mp114f") : "";
            this.mp114du = json.has("mp114du") ? json.getString("mp114du") : "";
            this.mp115 = json.has("mp115") ? json.getString("mp115") : "";
            this.mp115do = json.has("mp115do") ? json.getString("mp115do") : "";
            this.mp115f = json.has("mp115f") ? json.getString("mp115f") : "";
            this.mp115du = json.has("mp115du") ? json.getString("mp115du") : "";
            this.mp116 = json.has("mp116") ? json.getString("mp116") : "";
            this.mp116do = json.has("mp116do") ? json.getString("mp116do") : "";
            this.mp116f = json.has("mp116f") ? json.getString("mp116f") : "";
            this.mp116du = json.has("mp116du") ? json.getString("mp116du") : "";
            this.mp117 = json.has("mp117") ? json.getString("mp117") : "";
            this.mp117do = json.has("mp117do") ? json.getString("mp117do") : "";
            this.mp117f = json.has("mp117f") ? json.getString("mp117f") : "";
            this.mp117du = json.has("mp117du") ? json.getString("mp117du") : "";
            this.mp118 = json.has("mp118") ? json.getString("mp118") : "";
            this.mp118do = json.has("mp118do") ? json.getString("mp118do") : "";
            this.mp118f = json.has("mp118f") ? json.getString("mp118f") : "";
            this.mp118du = json.has("mp118du") ? json.getString("mp118du") : "";
            this.mp119 = json.has("mp119") ? json.getString("mp119") : "";
            this.mp119do = json.has("mp119do") ? json.getString("mp119do") : "";
            this.mp119f = json.has("mp119f") ? json.getString("mp119f") : "";
            this.mp119du = json.has("mp119du") ? json.getString("mp119du") : "";
            this.mp120 = json.has("mp120") ? json.getString("mp120") : "";
            this.mp120do = json.has("mp120do") ? json.getString("mp120do") : "";
            this.mp120f = json.has("mp120f") ? json.getString("mp120f") : "";
            this.mp120du = json.has("mp120du") ? json.getString("mp120du") : "";
            this.mp121 = json.has("mp121") ? json.getString("mp121") : "";
            this.mp121do = json.has("mp121do") ? json.getString("mp121do") : "";
            this.mp121f = json.has("mp121f") ? json.getString("mp121f") : "";
            this.mp121du = json.has("mp121du") ? json.getString("mp121du") : "";
            this.mp122 = json.has("mp122") ? json.getString("mp122") : "";
            this.mp122do = json.has("mp122do") ? json.getString("mp122do") : "";
            this.mp122f = json.has("mp122f") ? json.getString("mp122f") : "";
            this.mp122du = json.has("mp122du") ? json.getString("mp122du") : "";
            this.mp123 = json.has("mp123") ? json.getString("mp123") : "";
            this.mp123do = json.has("mp123do") ? json.getString("mp123do") : "";
            this.mp123f = json.has("mp123f") ? json.getString("mp123f") : "";
            this.mp123du = json.has("mp123du") ? json.getString("mp123du") : "";
            this.mp124 = json.has("mp124") ? json.getString("mp124") : "";
            this.mp124do = json.has("mp124do") ? json.getString("mp124do") : "";
            this.mp124f = json.has("mp124f") ? json.getString("mp124f") : "";
            this.mp124du = json.has("mp124du") ? json.getString("mp124du") : "";
            this.mp125 = json.has("mp125") ? json.getString("mp125") : "";
            this.mp125do = json.has("mp125do") ? json.getString("mp125do") : "";
            this.mp125f = json.has("mp125f") ? json.getString("mp125f") : "";
            this.mp125du = json.has("mp125du") ? json.getString("mp125du") : "";
            this.mp126 = json.has("mp126") ? json.getString("mp126") : "";
            this.mp126do = json.has("mp126do") ? json.getString("mp126do") : "";
            this.mp126f = json.has("mp126f") ? json.getString("mp126f") : "";
            this.mp126du = json.has("mp126du") ? json.getString("mp126du") : "";
            this.mp127 = json.has("mp127") ? json.getString("mp127") : "";
            this.mp127do = json.has("mp127do") ? json.getString("mp127do") : "";
            this.mp127f = json.has("mp127f") ? json.getString("mp127f") : "";
            this.mp127du = json.has("mp127du") ? json.getString("mp127du") : "";
            this.mp128 = json.has("mp128") ? json.getString("mp128") : "";
            this.mp128do = json.has("mp128do") ? json.getString("mp128do") : "";
            this.mp128f = json.has("mp128f") ? json.getString("mp128f") : "";
            this.mp128du = json.has("mp128du") ? json.getString("mp128du") : "";
            this.mp129 = json.has("mp129") ? json.getString("mp129") : "";
            this.mp129do = json.has("mp129do") ? json.getString("mp129do") : "";
            this.mp129f = json.has("mp129f") ? json.getString("mp129f") : "";
            this.mp129du = json.has("mp129du") ? json.getString("mp129du") : "";
            this.mp130 = json.has("mp130") ? json.getString("mp130") : "";
            this.mp130do = json.has("mp130do") ? json.getString("mp130do") : "";
            this.mp130f = json.has("mp130f") ? json.getString("mp130f") : "";
            this.mp130du = json.has("mp130du") ? json.getString("mp130du") : "";
            this.mp131 = json.has("mp131") ? json.getString("mp131") : "";
            this.mp131do = json.has("mp131do") ? json.getString("mp131do") : "";
            this.mp131f = json.has("mp131f") ? json.getString("mp131f") : "";
            this.mp131du = json.has("mp131du") ? json.getString("mp131du") : "";
            this.mp132 = json.has("mp132") ? json.getString("mp132") : "";
            this.mp132do = json.has("mp132do") ? json.getString("mp132do") : "";
            this.mp132f = json.has("mp132f") ? json.getString("mp132f") : "";
            this.mp132du = json.has("mp132du") ? json.getString("mp132du") : "";
            this.mp133 = json.has("mp133") ? json.getString("mp133") : "";
            this.mp133do = json.has("mp133do") ? json.getString("mp133do") : "";
            this.mp133f = json.has("mp133f") ? json.getString("mp133f") : "";
            this.mp133du = json.has("mp133du") ? json.getString("mp133du") : "";
            this.mp134 = json.has("mp134") ? json.getString("mp134") : "";
            this.mp134do = json.has("mp134do") ? json.getString("mp134do") : "";
            this.mp134f = json.has("mp134f") ? json.getString("mp134f") : "";
            this.mp134du = json.has("mp134du") ? json.getString("mp134du") : "";
            this.mp135 = json.has("mp135") ? json.getString("mp135") : "";
            this.mp135do = json.has("mp135do") ? json.getString("mp135do") : "";
            this.mp135f = json.has("mp135f") ? json.getString("mp135f") : "";
            this.mp135du = json.has("mp135du") ? json.getString("mp135du") : "";
            this.mp136 = json.has("mp136") ? json.getString("mp136") : "";
            this.mp136do = json.has("mp136do") ? json.getString("mp136do") : "";
            this.mp136f = json.has("mp136f") ? json.getString("mp136f") : "";
            this.mp136du = json.has("mp136du") ? json.getString("mp136du") : "";
            this.mp137 = json.has("mp137") ? json.getString("mp137") : "";
            this.mp137do = json.has("mp137do") ? json.getString("mp137do") : "";
            this.mp137f = json.has("mp137f") ? json.getString("mp137f") : "";
            this.mp137du = json.has("mp137du") ? json.getString("mp137du") : "";
            this.mpnr = json.has("mpnr") ? json.getString("mpnr") : "";
            this.mp961 = json.has("mp961") ? json.getString("mp961") : "";
            this.mp961do = json.has("mp961do") ? json.getString("mp961do") : "";
            this.mp961f = json.has("mp961f") ? json.getString("mp961f") : "";
            this.mp961du = json.has("mp961du") ? json.getString("mp961du") : "";
            this.mp961x = json.has("mp961x") ? json.getString("mp961x") : "";
            this.mp962 = json.has("mp962") ? json.getString("mp962") : "";
            this.mp962do = json.has("mp962do") ? json.getString("mp962do") : "";
            this.mp962f = json.has("mp962f") ? json.getString("mp962f") : "";
            this.mp962du = json.has("mp962du") ? json.getString("mp962du") : "";
            this.mp962x = json.has("mp962x") ? json.getString("mp962x") : "";
            this.mp963 = json.has("mp963") ? json.getString("mp963") : "";
            this.mp963do = json.has("mp963do") ? json.getString("mp963do") : "";
            this.mp963f = json.has("mp963f") ? json.getString("mp963f") : "";
            this.mp963du = json.has("mp963du") ? json.getString("mp963du") : "";
            this.mp963x = json.has("mp963x") ? json.getString("mp963x") : "";

        }
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(PRESCRIPTIONTable.COLUMN_ID, this.id);
        json.put(PRESCRIPTIONTable.COLUMN_UID, this.uid);
        json.put(PRESCRIPTIONTable.COLUMN_UUID, this.uuid);
        json.put(PRESCRIPTIONTable.COLUMN_PRNO, this.prno);
        json.put(PRESCRIPTIONTable.COLUMN_USERNAME, this.userName);
        json.put(PRESCRIPTIONTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(PRESCRIPTIONTable.COLUMN_FACILITY, this.facility);
        json.put(PRESCRIPTIONTable.COLUMN_FACILITY_CODE, this.facilityCode);
        json.put(PRESCRIPTIONTable.COLUMN_VDATE, this.vdate);
        json.put(PRESCRIPTIONTable.COLUMN_SYSDATE, this.sysDate);
        json.put(PRESCRIPTIONTable.COLUMN_DEVICEID, this.deviceId);
        json.put(PRESCRIPTIONTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(PRESCRIPTIONTable.COLUMN_APPVERSION, this.appver);
        json.put(PRESCRIPTIONTable.COLUMN_SYNCED, this.synced);
        json.put(PRESCRIPTIONTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(PRESCRIPTIONTable.COLUMN_MED_CODE, this.medCode);
        json.put(PRESCRIPTIONTable.COLUMN_DOSE, this.dose);
        json.put(PRESCRIPTIONTable.COLUMN_FREQUENCY, this.frequency);
        json.put(PRESCRIPTIONTable.COLUMN_DURATION, this.duration);
        json.put(PRESCRIPTIONTable.COLUMN_OTHER, this.other);

        json.put(PRESCRIPTIONTable.COLUMN_PRES, new JSONObject(sPREStoString()));
        return json;
    }

    public String sPREStoString() throws JSONException {
        Log.d(TAG, "sPREStoString: ");
        JSONObject json = new JSONObject();
        /*json.put("mp101", mp101)
                .put("mp101do", mp101do)
                .put("mp101f", mp101f)
                .put("mp101du", mp101du)
                .put("mp102", mp102)
                .put("mp102do", mp102do)
                .put("mp102f", mp102f)
                .put("mp102du", mp102du)
                .put("mp103", mp103)
                .put("mp103do", mp103do)
                .put("mp103f", mp103f)
                .put("mp103du", mp103du)
                .put("mp104", mp104)
                .put("mp104do", mp104do)
                .put("mp104f", mp104f)
                .put("mp104du", mp104du)
                .put("mp105", mp105)
                .put("mp105do", mp105do)
                .put("mp105f", mp105f)
                .put("mp105du", mp105du)
                .put("mp106", mp106)
                .put("mp106do", mp106do)
                .put("mp106f", mp106f)
                .put("mp106du", mp106du)
                .put("mp107", mp107)
                .put("mp107do", mp107do)
                .put("mp107f", mp107f)
                .put("mp107du", mp107du)
                .put("mp108", mp108)
                .put("mp108do", mp108do)
                .put("mp108f", mp108f)
                .put("mp108du", mp108du)
                .put("mp109", mp109)
                .put("mp109do", mp109do)
                .put("mp109f", mp109f)
                .put("mp109du", mp109du)
                .put("mp110", mp110)
                .put("mp110do", mp110do)
                .put("mp110f", mp110f)
                .put("mp110du", mp110du)
                .put("mp111", mp111)
                .put("mp111do", mp111do)
                .put("mp111f", mp111f)
                .put("mp111du", mp111du)
                .put("mp112", mp112)
                .put("mp112do", mp112do)
                .put("mp112f", mp112f)
                .put("mp112du", mp112du)
                .put("mp113", mp113)
                .put("mp113do", mp113do)
                .put("mp113f", mp113f)
                .put("mp113du", mp113du)
                .put("mp114", mp114)
                .put("mp114do", mp114do)
                .put("mp114f", mp114f)
                .put("mp114du", mp114du)
                .put("mp115", mp115)
                .put("mp115do", mp115do)
                .put("mp115f", mp115f)
                .put("mp115du", mp115du)
                .put("mp116", mp116)
                .put("mp116do", mp116do)
                .put("mp116f", mp116f)
                .put("mp116du", mp116du)
                .put("mp117", mp117)
                .put("mp117do", mp117do)
                .put("mp117f", mp117f)
                .put("mp117du", mp117du)
                .put("mp118", mp118)
                .put("mp118do", mp118do)
                .put("mp118f", mp118f)
                .put("mp118du", mp118du)
                .put("mp119", mp119)
                .put("mp119do", mp119do)
                .put("mp119f", mp119f)
                .put("mp119du", mp119du)
                .put("mp120", mp120)
                .put("mp120do", mp120do)
                .put("mp120f", mp120f)
                .put("mp120du", mp120du)
                .put("mp121", mp121)
                .put("mp121do", mp121do)
                .put("mp121f", mp121f)
                .put("mp121du", mp121du)
                .put("mp122", mp122)
                .put("mp122do", mp122do)
                .put("mp122f", mp122f)
                .put("mp122du", mp122du)
                .put("mp123", mp123)
                .put("mp123do", mp123do)
                .put("mp123f", mp123f)
                .put("mp123du", mp123du)
                .put("mp124", mp124)
                .put("mp124do", mp124do)
                .put("mp124f", mp124f)
                .put("mp124du", mp124du)
                .put("mp125", mp125)
                .put("mp125do", mp125do)
                .put("mp125f", mp125f)
                .put("mp125du", mp125du)
                .put("mp126", mp126)
                .put("mp126do", mp126do)
                .put("mp126f", mp126f)
                .put("mp126du", mp126du)
                .put("mp127", mp127)
                .put("mp127do", mp127do)
                .put("mp127f", mp127f)
                .put("mp127du", mp127du)
                .put("mp128", mp128)
                .put("mp128do", mp128do)
                .put("mp128f", mp128f)
                .put("mp128du", mp128du)
                .put("mp129", mp129)
                .put("mp129do", mp129do)
                .put("mp129f", mp129f)
                .put("mp129du", mp129du)
                .put("mp130", mp130)
                .put("mp130do", mp130do)
                .put("mp130f", mp130f)
                .put("mp130du", mp130du)
                .put("mp131", mp131)
                .put("mp131do", mp131do)
                .put("mp131f", mp131f)
                .put("mp131du", mp131du)
                .put("mp132", mp132)
                .put("mp132do", mp132do)
                .put("mp132f", mp132f)
                .put("mp132du", mp132du)
                .put("mp133", mp133)
                .put("mp133do", mp133do)
                .put("mp133f", mp133f)
                .put("mp133du", mp133du)
                .put("mp134", mp134)
                .put("mp134do", mp134do)
                .put("mp134f", mp134f)
                .put("mp134du", mp134du)
                .put("mp135", mp135)
                .put("mp135do", mp135do)
                .put("mp135f", mp135f)
                .put("mp135du", mp135du)
                .put("mp136", mp136)
                .put("mp136do", mp136do)
                .put("mp136f", mp136f)
                .put("mp136du", mp136du)
                .put("mp137", mp137)
                .put("mp137do", mp137do)
                .put("mp137f", mp137f)
                .put("mp137du", mp137du)
                .put("mpnr", mpnr);*/
        return json.toString();
    }


    public void updatePrescription(String medCode, String dose, String frequency, String duration, String other) {
        MainApp.prescription.setMedCode(medCode);
        MainApp.prescription.setDose(dose);
        MainApp.prescription.setFrequency(frequency);
        MainApp.prescription.setDuration(duration);
        MainApp.prescription.setOther(other);
    }

}