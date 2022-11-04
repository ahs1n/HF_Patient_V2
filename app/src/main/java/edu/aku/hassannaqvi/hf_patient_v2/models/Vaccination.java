package edu.aku.hassannaqvi.hf_patient_v2.models;

import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.hf_patient_v2.core.MainApp._EMPTY_;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.hf_patient_v2.BR;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;

public class Vaccination extends BaseObservable implements Observable {

    private final String TAG = "PatientDetails";
    public String prno = _EMPTY_;
    public String facility = _EMPTY_;
    public String sv101 = _EMPTY_;
    public String sv102 = _EMPTY_;
    public String sv103 = _EMPTY_;
    public String sv104 = _EMPTY_;
    public String sv105 = _EMPTY_;
    public String sv106 = _EMPTY_;
    public String sv107 = _EMPTY_;
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
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
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

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
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
    public String getSv101() {
        return sv101;
    }

    public void setSv101(String sv101) {
        this.sv101 = sv101;
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
        notifyPropertyChanged(BR.sv103);
    }

    @Bindable
    public String getSv104() {
        return sv104;
    }

    public void setSv104(String sv104) {
        this.sv104 = sv104;
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
}
