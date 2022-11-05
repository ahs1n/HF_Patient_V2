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
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract.DIAGNOSISTable;
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
        if (this.sd101.equals(sd101)) return; // for all checkboxes
        this.sd101 = sd101;
        notifyPropertyChanged(BR.sd101);
    }

    @Bindable
    public String getSd102() {
        return sd102;
    }

    public void setSd102(String sd102) {
        if (this.sd102.equals(sd102)) return; // for all checkboxes
        this.sd102 = sd102;
        notifyPropertyChanged(BR.sd102);
    }

    @Bindable
    public String getSd103() {
        return sd103;
    }

    public void setSd103(String sd103) {
        if (this.sd103.equals(sd103)) return; // for all checkboxes
        this.sd103 = sd103;
        notifyPropertyChanged(BR.sd103);
    }

    @Bindable
    public String getSd104() {
        return sd104;
    }

    public void setSd104(String sd104) {
        if (this.sd104.equals(sd104)) return; // for all checkboxes
        this.sd104 = sd104;
        notifyPropertyChanged(BR.sd104);
    }

    @Bindable
    public String getSd105() {
        return sd105;
    }

    public void setSd105(String sd105) {
        if (this.sd105.equals(sd105)) return; // for all checkboxes
        this.sd105 = sd105;
        notifyPropertyChanged(BR.sd105);
    }

    @Bindable
    public String getSd106() {
        return sd106;
    }

    public void setSd106(String sd106) {
        if (this.sd106.equals(sd106)) return; // for all checkboxes
        this.sd106 = sd106;
        notifyPropertyChanged(BR.sd106);
    }

    @Bindable
    public String getSd107() {
        return sd107;
    }

    public void setSd107(String sd107) {
        if (this.sd107.equals(sd107)) return; // for all checkboxes
        this.sd107 = sd107;
        notifyPropertyChanged(BR.sd107);
    }

    @Bindable
    public String getSd108() {
        return sd108;
    }

    public void setSd108(String sd108) {
        if (this.sd108.equals(sd108)) return; // for all checkboxes
        this.sd108 = sd108;
        notifyPropertyChanged(BR.sd108);
    }

    @Bindable
    public String getSd109() {
        return sd109;
    }

    public void setSd109(String sd109) {
        if (this.sd109.equals(sd109)) return; // for all checkboxes
        this.sd109 = sd109;
        notifyPropertyChanged(BR.sd109);
    }

    @Bindable
    public String getSd110() {
        return sd110;
    }

    public void setSd110(String sd110) {
        if (this.sd110.equals(sd110)) return; // for all checkboxes
        this.sd110 = sd110;
        notifyPropertyChanged(BR.sd110);
    }

    @Bindable
    public String getSd111() {
        return sd111;
    }

    public void setSd111(String sd111) {
        if (this.sd111.equals(sd111)) return; // for all checkboxes
        this.sd111 = sd111;
        notifyPropertyChanged(BR.sd111);
    }

    @Bindable
    public String getSd112() {
        return sd112;
    }

    public void setSd112(String sd112) {
        if (this.sd112.equals(sd112)) return; // for all checkboxes
        this.sd112 = sd112;
        notifyPropertyChanged(BR.sd112);
    }

    @Bindable
    public String getSd113() {
        return sd113;
    }

    public void setSd113(String sd113) {
        if (this.sd113.equals(sd113)) return; // for all checkboxes
        this.sd113 = sd113;
        notifyPropertyChanged(BR.sd113);
    }

    @Bindable
    public String getSd114() {
        return sd114;
    }

    public void setSd114(String sd114) {
        if (this.sd114.equals(sd114)) return; // for all checkboxes
        this.sd114 = sd114;
        notifyPropertyChanged(BR.sd114);
    }

    @Bindable
    public String getSd115() {
        return sd115;
    }

    public void setSd115(String sd115) {
        if (this.sd115.equals(sd115)) return; // for all checkboxes
        this.sd115 = sd115;
        notifyPropertyChanged(BR.sd115);
    }

    @Bindable
    public String getSd116() {
        return sd116;
    }

    public void setSd116(String sd116) {
        if (this.sd116.equals(sd116)) return; // for all checkboxes
        this.sd116 = sd116;
        notifyPropertyChanged(BR.sd116);
    }

    @Bindable
    public String getSd117() {
        return sd117;
    }

    public void setSd117(String sd117) {
        if (this.sd117.equals(sd117)) return; // for all checkboxes
        this.sd117 = sd117;
        notifyPropertyChanged(BR.sd117);
    }

    @Bindable
    public String getSd118() {
        return sd118;
    }

    public void setSd118(String sd118) {
        if (this.sd118.equals(sd118)) return; // for all checkboxes
        this.sd118 = sd118;
        notifyPropertyChanged(BR.sd118);
    }

    @Bindable
    public String getSd119() {
        return sd119;
    }

    public void setSd119(String sd119) {
        if (this.sd119.equals(sd119)) return; // for all checkboxes
        this.sd119 = sd119;
        notifyPropertyChanged(BR.sd119);
    }

    @Bindable
    public String getSd120() {
        return sd120;
    }

    public void setSd120(String sd120) {
        if (this.sd120.equals(sd120)) return; // for all checkboxes
        this.sd120 = sd120;
        notifyPropertyChanged(BR.sd120);
    }

    @Bindable
    public String getSd121() {
        return sd121;
    }

    public void setSd121(String sd121) {
        if (this.sd121.equals(sd121)) return; // for all checkboxes
        this.sd121 = sd121;
        notifyPropertyChanged(BR.sd121);
    }

    @Bindable
    public String getSd122() {
        return sd122;
    }

    public void setSd122(String sd122) {
        if (this.sd122.equals(sd122)) return; // for all checkboxes
        this.sd122 = sd122;
        notifyPropertyChanged(BR.sd122);
    }

    @Bindable
    public String getSd123() {
        return sd123;
    }

    public void setSd123(String sd123) {
        if (this.sd123.equals(sd123)) return; // for all checkboxes
        this.sd123 = sd123;
        notifyPropertyChanged(BR.sd123);
    }

    @Bindable
    public String getSd124() {
        return sd124;
    }

    public void setSd124(String sd124) {
        if (this.sd124.equals(sd124)) return; // for all checkboxes
        this.sd124 = sd124;
        notifyPropertyChanged(BR.sd124);
    }

    @Bindable
    public String getSd125() {
        return sd125;
    }

    public void setSd125(String sd125) {
        if (this.sd125.equals(sd125)) return; // for all checkboxes
        this.sd125 = sd125;
        notifyPropertyChanged(BR.sd125);
    }

    @Bindable
    public String getSd126() {
        return sd126;
    }

    public void setSd126(String sd126) {
        if (this.sd126.equals(sd126)) return; // for all checkboxes
        this.sd126 = sd126;
        notifyPropertyChanged(BR.sd126);
    }

    @Bindable
    public String getSd127() {
        return sd127;
    }

    public void setSd127(String sd127) {
        if (this.sd127.equals(sd127)) return; // for all checkboxes
        this.sd127 = sd127;
        notifyPropertyChanged(BR.sd127);
    }

    @Bindable
    public String getSd128() {
        return sd128;
    }

    public void setSd128(String sd128) {
        if (this.sd128.equals(sd128)) return; // for all checkboxes
        this.sd128 = sd128;
        notifyPropertyChanged(BR.sd128);
    }

    @Bindable
    public String getSd129() {
        return sd129;
    }

    public void setSd129(String sd129) {
        if (this.sd129.equals(sd129)) return; // for all checkboxes
        this.sd129 = sd129;
        notifyPropertyChanged(BR.sd129);
    }

    @Bindable
    public String getSd130() {
        return sd130;
    }

    public void setSd130(String sd130) {
        if (this.sd130.equals(sd130)) return; // for all checkboxes
        this.sd130 = sd130;
        notifyPropertyChanged(BR.sd130);
    }

    @Bindable
    public String getSd131() {
        return sd131;
    }

    public void setSd131(String sd131) {
        if (this.sd131.equals(sd131)) return; // for all checkboxes
        this.sd131 = sd131;
        notifyPropertyChanged(BR.sd131);
    }

    @Bindable
    public String getSd132() {
        return sd132;
    }

    public void setSd132(String sd132) {
        if (this.sd132.equals(sd132)) return; // for all checkboxes
        this.sd132 = sd132;
        notifyPropertyChanged(BR.sd132);
    }

    @Bindable
    public String getSd133() {
        return sd133;
    }

    public void setSd133(String sd133) {
        if (this.sd133.equals(sd133)) return; // for all checkboxes
        this.sd133 = sd133;
        notifyPropertyChanged(BR.sd133);
    }

    @Bindable
    public String getSd134() {
        return sd134;
    }

    public void setSd134(String sd134) {
        if (this.sd134.equals(sd134)) return; // for all checkboxes
        this.sd134 = sd134;
        notifyPropertyChanged(BR.sd134);
    }

    @Bindable
    public String getSd135() {
        return sd135;
    }

    public void setSd135(String sd135) {
        if (this.sd135.equals(sd135)) return; // for all checkboxes
        this.sd135 = sd135;
        notifyPropertyChanged(BR.sd135);
    }

    @Bindable
    public String getSd136() {
        return sd136;
    }

    public void setSd136(String sd136) {
        if (this.sd136.equals(sd136)) return; // for all checkboxes
        this.sd136 = sd136;
        notifyPropertyChanged(BR.sd136);
    }

    @Bindable
    public String getSd137() {
        return sd137;
    }

    public void setSd137(String sd137) {
        if (this.sd137.equals(sd137)) return; // for all checkboxes
        this.sd137 = sd137;
        notifyPropertyChanged(BR.sd137);
    }

    @Bindable
    public String getSd138() {
        return sd138;
    }

    public void setSd138(String sd138) {
        if (this.sd138.equals(sd138)) return; // for all checkboxes
        this.sd138 = sd138;
        notifyPropertyChanged(BR.sd138);
    }

    @Bindable
    public String getSd139() {
        return sd139;
    }

    public void setSd139(String sd139) {
        if (this.sd139.equals(sd139)) return; // for all checkboxes
        this.sd139 = sd139;
        notifyPropertyChanged(BR.sd139);
    }

    @Bindable
    public String getSd140() {
        return sd140;
    }

    public void setSd140(String sd140) {
        if (this.sd140.equals(sd140)) return; // for all checkboxes
        this.sd140 = sd140;
        notifyPropertyChanged(BR.sd140);
    }

    @Bindable
    public String getSd141() {
        return sd141;
    }

    public void setSd141(String sd141) {
        if (this.sd141.equals(sd141)) return; // for all checkboxes
        this.sd141 = sd141;
        notifyPropertyChanged(BR.sd141);
    }

    @Bindable
    public String getSd142() {
        return sd142;
    }

    public void setSd142(String sd142) {
        if (this.sd142.equals(sd142)) return; // for all checkboxes
        this.sd142 = sd142;
        notifyPropertyChanged(BR.sd142);
    }

    @Bindable
    public String getSd143() {
        return sd143;
    }

    public void setSd143(String sd143) {
        if (this.sd143.equals(sd143)) return; // for all checkboxes
        this.sd143 = sd143;
        notifyPropertyChanged(BR.sd143);
    }

    @Bindable
    public String getSd144() {
        return sd144;
    }

    public void setSd144(String sd144) {
        if (this.sd144.equals(sd144)) return; // for all checkboxes
        this.sd144 = sd144;
        notifyPropertyChanged(BR.sd144);
    }

    @Bindable
    public String getSd145() {
        return sd145;
    }

    public void setSd145(String sd145) {
        if (this.sd145.equals(sd145)) return; // for all checkboxes
        this.sd145 = sd145;
        notifyPropertyChanged(BR.sd145);
    }

    @Bindable
    public String getSd146() {
        return sd146;
    }

    public void setSd146(String sd146) {
        if (this.sd146.equals(sd146)) return; // for all checkboxes
        this.sd146 = sd146;
        notifyPropertyChanged(BR.sd146);
    }

    @Bindable
    public String getSd147() {
        return sd147;
    }

    public void setSd147(String sd147) {
        if (this.sd147.equals(sd147)) return; // for all checkboxes
        this.sd147 = sd147;
        notifyPropertyChanged(BR.sd147);
    }

    @Bindable
    public String getSd148() {
        return sd148;
    }

    public void setSd148(String sd148) {
        if (this.sd148.equals(sd148)) return; // for all checkboxes
        this.sd148 = sd148;
        notifyPropertyChanged(BR.sd148);
    }

    @Bindable
    public String getSd149() {
        return sd149;
    }

    public void setSd149(String sd149) {
        if (this.sd149.equals(sd149)) return; // for all checkboxes
        this.sd149 = sd149;
        notifyPropertyChanged(BR.sd149);
    }

    @Bindable
    public String getSd961() {
        return sd961;
    }

    public void setSd961(String sd961) {
        if (this.sd961.equals(sd961)) return; // for all checkboxes
        this.sd961 = sd961;
        setSd961x(sd961.equals("961") ? this.sd961x : "");
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
        if (this.sd962.equals(sd962)) return; // for all checkboxes
        this.sd962 = sd962;
        setSd962x(sd962.equals("962") ? this.sd962x : "");
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
        if (this.sd963.equals(sd963)) return; // for all checkboxes
        this.sd963 = sd963;
        setSd963x(sd963.equals("963") ? this.sd963x : "");
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
        if (this.sd964.equals(sd964)) return; // for all checkboxes
        this.sd964 = sd964;
        setSd964x(sd964.equals("964") ? this.sd964x : "");
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
        if (this.sd965.equals(sd965)) return; // for all checkboxes
        this.sd965 = sd965;
        setSd965x(sd965.equals("965") ? this.sd965x : "");
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
        if (this.sd966.equals(sd966)) return; // for all checkboxes
        this.sd966 = sd966;
        setSd966x(sd966.equals("966") ? this.sd966x : "");
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
        if (this.sd100nr.equals(sd100nr)) return; // for all checkboxes
        this.sd100nr = sd100nr;
        setSd100(sd100nr.equals("999") ? "" : this.sd100);
        setSd101(sd100nr.equals("999") ? "" : this.sd101);
        setSd102(sd100nr.equals("999") ? "" : this.sd102);
        setSd103(sd100nr.equals("999") ? "" : this.sd103);
        setSd104(sd100nr.equals("999") ? "" : this.sd104);
        setSd105(sd100nr.equals("999") ? "" : this.sd105);
        setSd106(sd100nr.equals("999") ? "" : this.sd106);
        setSd107(sd100nr.equals("999") ? "" : this.sd107);
        setSd108(sd100nr.equals("999") ? "" : this.sd108);
        setSd109(sd100nr.equals("999") ? "" : this.sd109);
        setSd110(sd100nr.equals("999") ? "" : this.sd110);
        setSd111(sd100nr.equals("999") ? "" : this.sd111);
        setSd112(sd100nr.equals("999") ? "" : this.sd112);
        setSd113(sd100nr.equals("999") ? "" : this.sd113);
        setSd114(sd100nr.equals("999") ? "" : this.sd114);
        setSd115(sd100nr.equals("999") ? "" : this.sd115);
        setSd116(sd100nr.equals("999") ? "" : this.sd116);
        setSd117(sd100nr.equals("999") ? "" : this.sd117);
        setSd118(sd100nr.equals("999") ? "" : this.sd118);
        setSd119(sd100nr.equals("999") ? "" : this.sd119);
        setSd120(sd100nr.equals("999") ? "" : this.sd120);
        setSd121(sd100nr.equals("999") ? "" : this.sd121);
        setSd122(sd100nr.equals("999") ? "" : this.sd122);
        setSd123(sd100nr.equals("999") ? "" : this.sd123);
        setSd124(sd100nr.equals("999") ? "" : this.sd124);
        setSd125(sd100nr.equals("999") ? "" : this.sd125);
        setSd126(sd100nr.equals("999") ? "" : this.sd126);
        setSd127(sd100nr.equals("999") ? "" : this.sd127);
        setSd128(sd100nr.equals("999") ? "" : this.sd128);
        setSd129(sd100nr.equals("999") ? "" : this.sd129);
        setSd130(sd100nr.equals("999") ? "" : this.sd130);
        setSd131(sd100nr.equals("999") ? "" : this.sd131);
        setSd132(sd100nr.equals("999") ? "" : this.sd132);
        setSd133(sd100nr.equals("999") ? "" : this.sd133);
        setSd134(sd100nr.equals("999") ? "" : this.sd134);
        setSd135(sd100nr.equals("999") ? "" : this.sd135);
        setSd136(sd100nr.equals("999") ? "" : this.sd136);
        setSd137(sd100nr.equals("999") ? "" : this.sd137);
        setSd138(sd100nr.equals("999") ? "" : this.sd138);
        setSd139(sd100nr.equals("999") ? "" : this.sd139);
        setSd140(sd100nr.equals("999") ? "" : this.sd140);
        setSd141(sd100nr.equals("999") ? "" : this.sd141);
        setSd142(sd100nr.equals("999") ? "" : this.sd142);
        setSd143(sd100nr.equals("999") ? "" : this.sd143);
        setSd144(sd100nr.equals("999") ? "" : this.sd144);
        setSd145(sd100nr.equals("999") ? "" : this.sd145);
        setSd146(sd100nr.equals("999") ? "" : this.sd146);
        setSd147(sd100nr.equals("999") ? "" : this.sd147);
        setSd148(sd100nr.equals("999") ? "" : this.sd148);
        setSd149(sd100nr.equals("999") ? "" : this.sd149);
        setSd961(sd100nr.equals("999") ? "" : this.sd961);
        setSd962(sd100nr.equals("999") ? "" : this.sd962);
        setSd963(sd100nr.equals("999") ? "" : this.sd963);
        setSd964(sd100nr.equals("999") ? "" : this.sd964);
        setSd965(sd100nr.equals("999") ? "" : this.sd965);
        setSd966(sd100nr.equals("999") ? "" : this.sd966);
        notifyPropertyChanged(BR.sd100nr);
    }


    public Diagnosis Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(DIAGNOSISTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(DIAGNOSISTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(DIAGNOSISTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(DIAGNOSISTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(DIAGNOSISTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(DIAGNOSISTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(DIAGNOSISTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(DIAGNOSISTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(DIAGNOSISTable.COLUMN_SYNCED_DATE));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(DIAGNOSISTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndexOrThrow(DIAGNOSISTable.COLUMN_ISTATUS96x));

        sDIAGHydrate(cursor.getString(cursor.getColumnIndexOrThrow(DIAGNOSISTable.COLUMN_SDIAG)));

        return this;
    }

    public void sDIAGHydrate(String string) throws JSONException {
        Log.d(TAG, "sDIAGHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.sd100 = json.getString("sd100");
            this.sd101 = json.getString("sd101");
            this.sd102 = json.getString("sd102");
            this.sd103 = json.getString("sd103");
            this.sd104 = json.getString("sd104");
            this.sd105 = json.getString("sd105");
            this.sd106 = json.getString("sd106");
            this.sd107 = json.getString("sd107");
            this.sd108 = json.getString("sd108");
            this.sd109 = json.getString("sd109");
            this.sd110 = json.getString("sd110");
            this.sd111 = json.getString("sd111");
            this.sd112 = json.getString("sd112");
            this.sd113 = json.getString("sd113");
            this.sd114 = json.getString("sd114");
            this.sd115 = json.getString("sd115");
            this.sd116 = json.getString("sd116");
            this.sd117 = json.getString("sd117");
            this.sd118 = json.getString("sd118");
            this.sd119 = json.getString("sd119");
            this.sd120 = json.getString("sd120");
            this.sd121 = json.getString("sd121");
            this.sd122 = json.getString("sd122");
            this.sd123 = json.getString("sd123");
            this.sd124 = json.getString("sd124");
            this.sd125 = json.getString("sd125");
            this.sd126 = json.getString("sd126");
            this.sd127 = json.getString("sd127");
            this.sd128 = json.getString("sd128");
            this.sd129 = json.getString("sd129");
            this.sd130 = json.getString("sd130");
            this.sd131 = json.getString("sd131");
            this.sd132 = json.getString("sd132");
            this.sd133 = json.getString("sd133");
            this.sd134 = json.getString("sd134");
            this.sd135 = json.getString("sd135");
            this.sd136 = json.getString("sd136");
            this.sd137 = json.getString("sd137");
            this.sd138 = json.getString("sd138");
            this.sd139 = json.getString("sd139");
            this.sd140 = json.getString("sd140");
            this.sd141 = json.getString("sd141");
            this.sd142 = json.getString("sd142");
            this.sd143 = json.getString("sd143");
            this.sd144 = json.getString("sd144");
            this.sd145 = json.getString("sd145");
            this.sd146 = json.getString("sd146");
            this.sd147 = json.getString("sd147");
            this.sd148 = json.getString("sd148");
            this.sd149 = json.getString("sd149");
            this.sd961 = json.getString("sd961");
            this.sd961x = json.getString("sd961x");
            this.sd962 = json.getString("sd962");
            this.sd962x = json.getString("sd962x");
            this.sd963 = json.getString("sd963");
            this.sd963x = json.getString("sd963x");
            this.sd964 = json.getString("sd964");
            this.sd964x = json.getString("sd964x");
            this.sd965 = json.getString("sd965");
            this.sd965x = json.getString("sd965x");
            this.sd966 = json.getString("sd966");
            this.sd966x = json.getString("sd966x");
            this.sd100nr = json.getString("sd100nr");

        }
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(DIAGNOSISTable.COLUMN_ID, this.id);
        json.put(DIAGNOSISTable.COLUMN_UID, this.uid);
        json.put(DIAGNOSISTable.COLUMN_USERNAME, this.userName);
        json.put(DIAGNOSISTable.COLUMN_SYSDATE, this.sysDate);
        json.put(DIAGNOSISTable.COLUMN_DEVICEID, this.deviceId);
        json.put(DIAGNOSISTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(DIAGNOSISTable.COLUMN_APPVERSION, this.appver);
        json.put(DIAGNOSISTable.COLUMN_SYNCED, this.synced);
        json.put(DIAGNOSISTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(DIAGNOSISTable.COLUMN_ISTATUS, this.iStatus);
        json.put(DIAGNOSISTable.COLUMN_ISTATUS96x, this.iStatus96x);

        json.put(DIAGNOSISTable.COLUMN_SDIAG, new JSONObject(sDIAGtoString()));
        return json;
    }

    public String sDIAGtoString() throws JSONException {
        Log.d(TAG, "sDIAGtoString: ");
        JSONObject json = new JSONObject();
        json.put("sd100", sd100)
                .put("sd101", sd101)
                .put("sd102", sd102)
                .put("sd103", sd103)
                .put("sd104", sd104)
                .put("sd105", sd105)
                .put("sd106", sd106)
                .put("sd107", sd107)
                .put("sd108", sd108)
                .put("sd109", sd109)
                .put("sd110", sd110)
                .put("sd111", sd111)
                .put("sd112", sd112)
                .put("sd113", sd113)
                .put("sd114", sd114)
                .put("sd115", sd115)
                .put("sd116", sd116)
                .put("sd117", sd117)
                .put("sd118", sd118)
                .put("sd119", sd119)
                .put("sd120", sd120)
                .put("sd121", sd121)
                .put("sd122", sd122)
                .put("sd123", sd123)
                .put("sd124", sd124)
                .put("sd125", sd125)
                .put("sd126", sd126)
                .put("sd127", sd127)
                .put("sd128", sd128)
                .put("sd129", sd129)
                .put("sd130", sd130)
                .put("sd131", sd131)
                .put("sd132", sd132)
                .put("sd133", sd133)
                .put("sd134", sd134)
                .put("sd135", sd135)
                .put("sd136", sd136)
                .put("sd137", sd137)
                .put("sd138", sd138)
                .put("sd139", sd139)
                .put("sd140", sd140)
                .put("sd141", sd141)
                .put("sd142", sd142)
                .put("sd143", sd143)
                .put("sd144", sd144)
                .put("sd145", sd145)
                .put("sd146", sd146)
                .put("sd147", sd147)
                .put("sd148", sd148)
                .put("sd149", sd149)
                .put("sd961", sd961)
                .put("sd961x", sd961x)
                .put("sd962", sd962)
                .put("sd962x", sd962x)
                .put("sd963", sd963)
                .put("sd963x", sd963x)
                .put("sd964", sd964)
                .put("sd964x", sd964x)
                .put("sd965", sd965)
                .put("sd965x", sd965x)
                .put("sd966", sd966)
                .put("sd966x", sd966x)
                .put("sd100nr", sd100nr);
        return json.toString();
    }
}
