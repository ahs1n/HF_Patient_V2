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

public class Diagnosis extends BaseObservable implements Observable {

    private final String TAG = "PatientDetails";
    public String prno = _EMPTY_;
    public String facility = _EMPTY_;
    public String sd100 = _EMPTY_;
    public String sd101 = _EMPTY_;
    public String sd102 = _EMPTY_;
    public String sd103 = _EMPTY_;
    public String sd104 = _EMPTY_;
    public String sd105 = _EMPTY_;
    public String sd106 = _EMPTY_;
    public String sd107 = _EMPTY_;
    public String sd108 = _EMPTY_;
    public String sd109 = _EMPTY_;
    public String sd110 = _EMPTY_;
    public String sd111 = _EMPTY_;
    public String sd112 = _EMPTY_;
    public String sd113 = _EMPTY_;
    public String sd114 = _EMPTY_;
    public String sd115 = _EMPTY_;
    public String sd116 = _EMPTY_;
    public String sd117 = _EMPTY_;
    public String sd118 = _EMPTY_;
    public String sd119 = _EMPTY_;
    public String sd120 = _EMPTY_;
    public String sd121 = _EMPTY_;
    public String sd122 = _EMPTY_;
    public String sd123 = _EMPTY_;
    public String sd124 = _EMPTY_;
    public String sd125 = _EMPTY_;
    public String sd126 = _EMPTY_;
    public String sd127 = _EMPTY_;
    public String sd128 = _EMPTY_;
    public String sd129 = _EMPTY_;
    public String sd130 = _EMPTY_;
    public String sd131 = _EMPTY_;
    public String sd132 = _EMPTY_;
    public String sd133 = _EMPTY_;
    public String sd134 = _EMPTY_;
    public String sd135 = _EMPTY_;
    public String sd136 = _EMPTY_;
    public String sd137 = _EMPTY_;
    public String sd138 = _EMPTY_;
    public String sd139 = _EMPTY_;
    public String sd140 = _EMPTY_;
    public String sd141 = _EMPTY_;
    public String sd142 = _EMPTY_;
    public String sd143 = _EMPTY_;
    public String sd144 = _EMPTY_;
    public String sd145 = _EMPTY_;
    public String sd146 = _EMPTY_;
    public String sd147 = _EMPTY_;
    public String sd148 = _EMPTY_;
    public String sd149 = _EMPTY_;
    public String sd961 = _EMPTY_;
    public String sd961x = _EMPTY_;
    public String sd962 = _EMPTY_;
    public String sd962x = _EMPTY_;
    public String sd963 = _EMPTY_;
    public String sd963x = _EMPTY_;
    public String sd964 = _EMPTY_;
    public String sd964x = _EMPTY_;
    public String sd965 = _EMPTY_;
    public String sd965x = _EMPTY_;
    public String sd966 = _EMPTY_;
    public String sd966x = _EMPTY_;
    public String sd100nr = _EMPTY_;
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
    private String sDiagnosis = _EMPTY_;

    public Diagnosis() {
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
    public String getsDiagnosis() {
        return sDiagnosis;
    }

    public void setsDiagnosis(String sDiagnosis) {
        this.sDiagnosis = sDiagnosis;
        notifyPropertyChanged(BR.sDiagnosis);
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
    public String getSd100() {
        return sd100;
    }

    public void setSd100(String sd100) {
        this.sd100 = sd100;
        notifyPropertyChanged(BR.sd100);
    }

    @Bindable
    public String getSd101() {
        return sd101;
    }

    public void setSd101(String sd101) {
        this.sd101 = sd101;
        notifyPropertyChanged(BR.sd101);
    }

    @Bindable
    public String getSd102() {
        return sd102;
    }

    public void setSd102(String sd102) {
        this.sd102 = sd102;
        notifyPropertyChanged(BR.sd102);
    }

    @Bindable
    public String getSd103() {
        return sd103;
    }

    public void setSd103(String sd103) {
        this.sd103 = sd103;
        notifyPropertyChanged(BR.sd103);
    }

    @Bindable
    public String getSd104() {
        return sd104;
    }

    public void setSd104(String sd104) {
        this.sd104 = sd104;
        notifyPropertyChanged(BR.sd104);
    }

    @Bindable
    public String getSd105() {
        return sd105;
    }

    public void setSd105(String sd105) {
        this.sd105 = sd105;
        notifyPropertyChanged(BR.sd105);
    }

    @Bindable
    public String getSd106() {
        return sd106;
    }

    public void setSd106(String sd106) {
        this.sd106 = sd106;
        notifyPropertyChanged(BR.sd106);
    }

    @Bindable
    public String getSd107() {
        return sd107;
    }

    public void setSd107(String sd107) {
        this.sd107 = sd107;
        notifyPropertyChanged(BR.sd107);
    }

    @Bindable
    public String getSd108() {
        return sd108;
    }

    public void setSd108(String sd108) {
        this.sd108 = sd108;
        notifyPropertyChanged(BR.sd108);
    }

    @Bindable
    public String getSd109() {
        return sd109;
    }

    public void setSd109(String sd109) {
        this.sd109 = sd109;
        notifyPropertyChanged(BR.sd109);
    }

    @Bindable
    public String getSd110() {
        return sd110;
    }

    public void setSd110(String sd110) {
        this.sd110 = sd110;
        notifyPropertyChanged(BR.sd110);
    }

    @Bindable
    public String getSd111() {
        return sd111;
    }

    public void setSd111(String sd111) {
        this.sd111 = sd111;
        notifyPropertyChanged(BR.sd111);
    }

    @Bindable
    public String getSd112() {
        return sd112;
    }

    public void setSd112(String sd112) {
        this.sd112 = sd112;
        notifyPropertyChanged(BR.sd112);
    }

    @Bindable
    public String getSd113() {
        return sd113;
    }

    public void setSd113(String sd113) {
        this.sd113 = sd113;
        notifyPropertyChanged(BR.sd113);
    }

    @Bindable
    public String getSd114() {
        return sd114;
    }

    public void setSd114(String sd114) {
        this.sd114 = sd114;
        notifyPropertyChanged(BR.sd114);
    }

    @Bindable
    public String getSd115() {
        return sd115;
    }

    public void setSd115(String sd115) {
        this.sd115 = sd115;
        notifyPropertyChanged(BR.sd115);
    }

    @Bindable
    public String getSd116() {
        return sd116;
    }

    public void setSd116(String sd116) {
        this.sd116 = sd116;
        notifyPropertyChanged(BR.sd116);
    }

    @Bindable
    public String getSd117() {
        return sd117;
    }

    public void setSd117(String sd117) {
        this.sd117 = sd117;
        notifyPropertyChanged(BR.sd117);
    }

    @Bindable
    public String getSd118() {
        return sd118;
    }

    public void setSd118(String sd118) {
        this.sd118 = sd118;
        notifyPropertyChanged(BR.sd118);
    }

    @Bindable
    public String getSd119() {
        return sd119;
    }

    public void setSd119(String sd119) {
        this.sd119 = sd119;
        notifyPropertyChanged(BR.sd119);
    }

    @Bindable
    public String getSd120() {
        return sd120;
    }

    public void setSd120(String sd120) {
        this.sd120 = sd120;
        notifyPropertyChanged(BR.sd120);
    }

    @Bindable
    public String getSd121() {
        return sd121;
    }

    public void setSd121(String sd121) {
        this.sd121 = sd121;
        notifyPropertyChanged(BR.sd121);
    }

    @Bindable
    public String getSd122() {
        return sd122;
    }

    public void setSd122(String sd122) {
        this.sd122 = sd122;
        notifyPropertyChanged(BR.sd122);
    }

    @Bindable
    public String getSd123() {
        return sd123;
    }

    public void setSd123(String sd123) {
        this.sd123 = sd123;
        notifyPropertyChanged(BR.sd123);
    }

    @Bindable
    public String getSd124() {
        return sd124;
    }

    public void setSd124(String sd124) {
        this.sd124 = sd124;
        notifyPropertyChanged(BR.sd124);
    }

    @Bindable
    public String getSd125() {
        return sd125;
    }

    public void setSd125(String sd125) {
        this.sd125 = sd125;
        notifyPropertyChanged(BR.sd125);
    }

    @Bindable
    public String getSd126() {
        return sd126;
    }

    public void setSd126(String sd126) {
        this.sd126 = sd126;
        notifyPropertyChanged(BR.sd126);
    }

    @Bindable
    public String getSd127() {
        return sd127;
    }

    public void setSd127(String sd127) {
        this.sd127 = sd127;
        notifyPropertyChanged(BR.sd127);
    }

    @Bindable
    public String getSd128() {
        return sd128;
    }

    public void setSd128(String sd128) {
        this.sd128 = sd128;
        notifyPropertyChanged(BR.sd128);
    }

    @Bindable
    public String getSd129() {
        return sd129;
    }

    public void setSd129(String sd129) {
        this.sd129 = sd129;
        notifyPropertyChanged(BR.sd129);
    }

    @Bindable
    public String getSd130() {
        return sd130;
    }

    public void setSd130(String sd130) {
        this.sd130 = sd130;
        notifyPropertyChanged(BR.sd130);
    }

    @Bindable
    public String getSd131() {
        return sd131;
    }

    public void setSd131(String sd131) {
        this.sd131 = sd131;
        notifyPropertyChanged(BR.sd131);
    }

    @Bindable
    public String getSd132() {
        return sd132;
    }

    public void setSd132(String sd132) {
        this.sd132 = sd132;
        notifyPropertyChanged(BR.sd132);
    }

    @Bindable
    public String getSd133() {
        return sd133;
    }

    public void setSd133(String sd133) {
        this.sd133 = sd133;
        notifyPropertyChanged(BR.sd133);
    }

    @Bindable
    public String getSd134() {
        return sd134;
    }

    public void setSd134(String sd134) {
        this.sd134 = sd134;
        notifyPropertyChanged(BR.sd134);
    }

    @Bindable
    public String getSd135() {
        return sd135;
    }

    public void setSd135(String sd135) {
        this.sd135 = sd135;
        notifyPropertyChanged(BR.sd135);
    }

    @Bindable
    public String getSd136() {
        return sd136;
    }

    public void setSd136(String sd136) {
        this.sd136 = sd136;
        notifyPropertyChanged(BR.sd136);
    }

    @Bindable
    public String getSd137() {
        return sd137;
    }

    public void setSd137(String sd137) {
        this.sd137 = sd137;
        notifyPropertyChanged(BR.sd137);
    }

    @Bindable
    public String getSd138() {
        return sd138;
    }

    public void setSd138(String sd138) {
        this.sd138 = sd138;
        notifyPropertyChanged(BR.sd138);
    }

    @Bindable
    public String getSd139() {
        return sd139;
    }

    public void setSd139(String sd139) {
        this.sd139 = sd139;
        notifyPropertyChanged(BR.sd139);
    }

    @Bindable
    public String getSd140() {
        return sd140;
    }

    public void setSd140(String sd140) {
        this.sd140 = sd140;
        notifyPropertyChanged(BR.sd140);
    }

    @Bindable
    public String getSd141() {
        return sd141;
    }

    public void setSd141(String sd141) {
        this.sd141 = sd141;
        notifyPropertyChanged(BR.sd141);
    }

    @Bindable
    public String getSd142() {
        return sd142;
    }

    public void setSd142(String sd142) {
        this.sd142 = sd142;
        notifyPropertyChanged(BR.sd142);
    }

    @Bindable
    public String getSd143() {
        return sd143;
    }

    public void setSd143(String sd143) {
        this.sd143 = sd143;
        notifyPropertyChanged(BR.sd143);
    }

    @Bindable
    public String getSd144() {
        return sd144;
    }

    public void setSd144(String sd144) {
        this.sd144 = sd144;
        notifyPropertyChanged(BR.sd144);
    }

    @Bindable
    public String getSd145() {
        return sd145;
    }

    public void setSd145(String sd145) {
        this.sd145 = sd145;
        notifyPropertyChanged(BR.sd145);
    }

    @Bindable
    public String getSd146() {
        return sd146;
    }

    public void setSd146(String sd146) {
        this.sd146 = sd146;
        notifyPropertyChanged(BR.sd146);
    }

    @Bindable
    public String getSd147() {
        return sd147;
    }

    public void setSd147(String sd147) {
        this.sd147 = sd147;
        notifyPropertyChanged(BR.sd147);
    }

    @Bindable
    public String getSd148() {
        return sd148;
    }

    public void setSd148(String sd148) {
        this.sd148 = sd148;
        notifyPropertyChanged(BR.sd148);
    }

    @Bindable
    public String getSd149() {
        return sd149;
    }

    public void setSd149(String sd149) {
        this.sd149 = sd149;
        notifyPropertyChanged(BR.sd149);
    }

    @Bindable
    public String getSd961() {
        return sd961;
    }

    public void setSd961(String sd961) {
        this.sd961 = sd961;
        notifyPropertyChanged(BR.sd961);
    }

    @Bindable
    public String getSd961x() {
        return sd961x;
    }

    public void setSd961x(String sd961x) {
        this.sd961x = sd961x;
        notifyPropertyChanged(BR.sd961x);
    }

    @Bindable
    public String getSd962() {
        return sd962;
    }

    public void setSd962(String sd962) {
        this.sd962 = sd962;
        notifyPropertyChanged(BR.sd962);
    }

    @Bindable
    public String getSd962x() {
        return sd962x;
    }

    public void setSd962x(String sd962x) {
        this.sd962x = sd962x;
        notifyPropertyChanged(BR.sd962x);
    }

    @Bindable
    public String getSd963() {
        return sd963;
    }

    public void setSd963(String sd963) {
        this.sd963 = sd963;
        notifyPropertyChanged(BR.sd963);
    }

    @Bindable
    public String getSd963x() {
        return sd963x;
    }

    public void setSd963x(String sd963x) {
        this.sd963x = sd963x;
        notifyPropertyChanged(BR.sd963x);
    }

    @Bindable
    public String getSd964() {
        return sd964;
    }

    public void setSd964(String sd964) {
        this.sd964 = sd964;
        notifyPropertyChanged(BR.sd964);
    }

    @Bindable
    public String getSd964x() {
        return sd964x;
    }

    public void setSd964x(String sd964x) {
        this.sd964x = sd964x;
        notifyPropertyChanged(BR.sd964x);
    }

    @Bindable
    public String getSd965() {
        return sd965;
    }

    public void setSd965(String sd965) {
        this.sd965 = sd965;
        notifyPropertyChanged(BR.sd965);
    }

    @Bindable
    public String getSd965x() {
        return sd965x;
    }

    public void setSd965x(String sd965x) {
        this.sd965x = sd965x;
        notifyPropertyChanged(BR.sd965x);
    }

    @Bindable
    public String getSd966() {
        return sd966;
    }

    public void setSd966(String sd966) {
        this.sd966 = sd966;
        notifyPropertyChanged(BR.sd966);
    }

    @Bindable
    public String getSd966x() {
        return sd966x;
    }

    public void setSd966x(String sd966x) {
        this.sd966x = sd966x;
        notifyPropertyChanged(BR.sd966x);
    }

    @Bindable
    public String getSd100nr() {
        return sd100nr;
    }

    public void setSd100nr(String sd100nr) {
        this.sd100nr = sd100nr;
        notifyPropertyChanged(BR.sd100nr);
    }
}
