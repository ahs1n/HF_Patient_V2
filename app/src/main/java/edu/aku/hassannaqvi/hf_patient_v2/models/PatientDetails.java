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
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;

public class PatientDetails extends BaseObservable implements Observable {

    private final String TAG = "PatientDetails";
    public String prno = _EMPTY_;
    public String facility = _EMPTY_;
    public String facilityCode = _EMPTY_;
    public String vdate = _EMPTY_;
    public String vtime = _EMPTY_;
    public String ss100 = _EMPTY_;
    public String ss101 = _EMPTY_;
    public String ss102 = _EMPTY_;
    public String ss103 = _EMPTY_;
    public String ss104y = _EMPTY_;
    public String ss104m = _EMPTY_;
    public String ss104d = _EMPTY_;
    public String ss105 = _EMPTY_;
    public String ss106 = _EMPTY_;
    public String ss107 = _EMPTY_;
    public String ss10701 = _EMPTY_;
    public String ss10702 = _EMPTY_;
    public String ss10703 = _EMPTY_;
    public String ss10704 = _EMPTY_;
    public String ss108 = _EMPTY_;
    public String ss10899 = _EMPTY_;
    public String ss201s = _EMPTY_;
    public String ss201d = _EMPTY_;
    public String ss201nr = _EMPTY_;
    public String ss202 = _EMPTY_;
    public String ss202nr = _EMPTY_;
    public String ss203 = _EMPTY_;
    public String ss203nr = _EMPTY_;
    public String ss204 = _EMPTY_;
    public String ss204a = _EMPTY_;
    public String ss204nr = _EMPTY_;
    public String ss205 = _EMPTY_;
    public String ss205nr = _EMPTY_;
    public String ss301 = _EMPTY_;
    public String ss302 = _EMPTY_;
    public String ss300nr = _EMPTY_;
    public String ss303 = _EMPTY_;
    public String ss303nr = _EMPTY_;
    public String ss304 = _EMPTY_;
    public String ss304nr = _EMPTY_;
    public String ss401 = _EMPTY_;
    public String ss401nr = _EMPTY_;
    public String ss501 = _EMPTY_;
    public String ss502 = _EMPTY_;
    public String ss503 = _EMPTY_;
    public String ss504 = _EMPTY_;
    public String ss5nr = _EMPTY_;
    public String ss601 = _EMPTY_;
    public String sh10101 = _EMPTY_;
    public String sh10102 = _EMPTY_;
    public String sh10103 = _EMPTY_;
    public String sh10104 = _EMPTY_;
    public String sh10105 = _EMPTY_;
    public String sh10106 = _EMPTY_;
    public String sh10107 = _EMPTY_;
    public String sh10108 = _EMPTY_;
    public String sh10109 = _EMPTY_;
    public String sh10196 = _EMPTY_;
    public String sh10196x = _EMPTY_;
    public String sh101nr = _EMPTY_;
    public String sh201 = _EMPTY_;
    public String sh202 = _EMPTY_;
    public String sh203 = _EMPTY_;
    public String sh204 = _EMPTY_;
    public String sh204nr = _EMPTY_;
    public String sh205 = _EMPTY_;
    public String sh301 = _EMPTY_;
    public String sh302 = _EMPTY_;
    public String sh304 = _EMPTY_;
    public String sh401 = _EMPTY_;
    public String sh401nr = _EMPTY_;
    public String se101 = _EMPTY_;
    public String se102 = _EMPTY_;
    public String se103 = _EMPTY_;
    public String se104 = _EMPTY_;
    public String se105 = _EMPTY_;
    public String se106 = _EMPTY_;
    public String se107 = _EMPTY_;
    public String se108 = _EMPTY_;
    public String se109 = _EMPTY_;
    public String se110 = _EMPTY_;
    public String se111 = _EMPTY_;
    public String se112 = _EMPTY_;
    public String se113 = _EMPTY_;
    public String se201 = _EMPTY_;
    public String se202 = _EMPTY_;
    public String se203 = _EMPTY_;
    public String se204 = _EMPTY_;
    public String se205 = _EMPTY_;
    public String se206 = _EMPTY_;
    public String se207 = _EMPTY_;
    public String se208 = _EMPTY_;
    public String se301 = _EMPTY_;
    public String se302 = _EMPTY_;
    public String se401 = _EMPTY_;
    public String se402 = _EMPTY_;
    public String se403 = _EMPTY_;
    public String se404 = _EMPTY_;
    public String se405 = _EMPTY_;
    public String se406 = _EMPTY_;
    public String se407 = _EMPTY_;
    public String se408 = _EMPTY_;
    public String se409 = _EMPTY_;
    public String se410 = _EMPTY_;
    public String se411 = _EMPTY_;
    public String se412 = _EMPTY_;
    public String se41296x = _EMPTY_;
    public String se413 = _EMPTY_;
    public String se41396x = _EMPTY_;
    public String se414 = _EMPTY_;
    public String se415 = _EMPTY_;
    public String se416 = _EMPTY_;
    public String se417 = _EMPTY_;
    public String se418 = _EMPTY_;
    public String se419 = _EMPTY_;
    public String se420 = _EMPTY_;
    public String se421 = _EMPTY_;
    public String se422 = _EMPTY_;
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
    private String sScreening = _EMPTY_;
    private String sHistory = _EMPTY_;
    private String sExamination = _EMPTY_;

    public PatientDetails() {
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
    public String getsScreening() {
        return sScreening;
    }

    public void setsScreening(String sScreening) {
        this.sScreening = sScreening;
        notifyPropertyChanged(BR.sScreening);
    }

    @Bindable
    public String getsHistory() {
        return sHistory;
    }

    public void setsHistory(String sHistory) {
        this.sHistory = sHistory;
        notifyPropertyChanged(BR.sHistory);
    }

    @Bindable
    public String getsExamination() {
        return sExamination;
    }

    public void setsExamination(String sExamination) {
        this.sExamination = sExamination;
        notifyPropertyChanged(BR.sExamination);
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
    public String getVtime() {
        return vtime;
    }

    public void setVtime(String vtime) {
        this.vtime = vtime;
        notifyPropertyChanged(BR.vtime);
    }

    @Bindable
    public String getSs100() {
        return ss100;
    }

    public void setSs100(String ss100) {
        this.ss100 = ss100;
        notifyPropertyChanged(BR.ss100);
    }

    @Bindable
    public String getSs101() {
        return ss101;
    }

    public void setSs101(String ss101) {
        this.ss101 = ss101;
        notifyPropertyChanged(BR.ss101);
    }

    @Bindable
    public String getSs102() {
        return ss102;
    }

    public void setSs102(String ss102) {
        this.ss102 = ss102;
        notifyPropertyChanged(BR.ss102);
    }

    @Bindable
    public String getSs103() {
        return ss103;
    }

    public void setSs103(String ss103) {
        this.ss103 = ss103;
        setSs10702(ss104y.length() > 0 && Integer.parseInt(ss104y) > 13 && ss103.equals("2") && ss105.equals("3") ? this.ss10702 : "");
        setSs10704(ss104y.length() > 0 && Integer.parseInt(ss104y) > 13 && ss103.equals("2") && ss105.equals("3") ? this.ss10704 : "");
        notifyPropertyChanged(BR.ss103);
    }

    @Bindable
    public String getSs104y() {
        return ss104y;
    }

    public void setSs104y(String ss104y) {
        this.ss104y = ss104y;
        setSs10702(ss104y.length() > 0 && Integer.parseInt(ss104y) > 13 && ss103.equals("2") && ss105.equals("3") ? this.ss10702 : "");
        setSs10703(ss104y.length() > 0 && Integer.parseInt(ss104y) < 5 ? this.ss10703 : "");
        setSs10704(ss104y.length() > 0 && Integer.parseInt(ss104y) > 13 && ss103.equals("2") && ss105.equals("3") ? this.ss10704 : "");
        setSs105(ss104y.length() > 0 && Integer.parseInt(ss104y) > 13 ? this.ss105 : "");
        setSs601(ss104y.length() > 0 && Integer.parseInt(ss104y) < 5 ? this.ss601 : "");
        notifyPropertyChanged(BR.ss104y);
    }

    @Bindable
    public String getSs104m() {
        return ss104m;
    }

    public void setSs104m(String ss104m) {
        this.ss104m = ss104m;
        notifyPropertyChanged(BR.ss104m);
    }

    @Bindable
    public String getSs104d() {
        return ss104d;
    }

    public void setSs104d(String ss104d) {
        this.ss104d = ss104d;
        notifyPropertyChanged(BR.ss104d);
    }

    @Bindable
    public String getSs105() {
        return ss105;
    }

    public void setSs105(String ss105) {
        this.ss105 = ss105;
        setSs10702(ss104y.length() > 0 && Integer.parseInt(ss104y) > 13 && ss103.equals("2") && ss105.equals("3") ? this.ss10702 : "");
        setSs10704(ss104y.length() > 0 && Integer.parseInt(ss104y) > 13 && ss103.equals("2") && ss105.equals("3") ? this.ss10704 : "");
        notifyPropertyChanged(BR.ss105);
    }

    @Bindable
    public String getSs106() {
        return ss106;
    }

    public void setSs106(String ss106) {
        this.ss106 = ss106;
        notifyPropertyChanged(BR.ss106);
    }

    @Bindable
    public String getSs107() {
        return ss107;
    }

    public void setSs107(String ss107) {
        this.ss107 = ss107;
        notifyPropertyChanged(BR.ss107);
    }

    @Bindable
    public String getSs10701() {
        return ss10701;
    }

    public void setSs10701(String ss10701) {
        if (this.ss10701.equals(ss10701)) return; // for all checkboxes
        this.ss10701 = ss10701;
        notifyPropertyChanged(BR.ss10701);
    }

    @Bindable
    public String getSs10702() {
        return ss10702;
    }

    public void setSs10702(String ss10702) {
        if (this.ss10702.equals(ss10702)) return; // for all checkboxes
        this.ss10702 = ss10702;
        notifyPropertyChanged(BR.ss10702);
    }

    @Bindable
    public String getSs10703() {
        return ss10703;
    }

    public void setSs10703(String ss10703) {
        if (this.ss10703.equals(ss10703)) return; // for all checkboxes
        this.ss10703 = ss10703;
        notifyPropertyChanged(BR.ss10703);
    }

    @Bindable
    public String getSs10704() {
        return ss10704;
    }

    public void setSs10704(String ss10704) {
        if (this.ss10704.equals(ss10704)) return; // for all checkboxes
        this.ss10704 = ss10704;
        notifyPropertyChanged(BR.ss10704);
    }

    @Bindable
    public String getSs108() {
        return ss108;
    }

    public void setSs108(String ss108) {
        this.ss108 = ss108;
        notifyPropertyChanged(BR.ss108);
    }

    @Bindable
    public String getSs10899() {
        return ss10899;
    }

    public void setSs10899(String ss10899) {
        if (this.ss10899.equals(ss10899)) return; // for all checkboxes
        this.ss10899 = ss10899;
        setSs108(ss10899.equals("999") ? "" : this.ss108);
        notifyPropertyChanged(BR.ss10899);
    }

    @Bindable
    public String getSs201s() {
        return ss201s;
    }

    public void setSs201s(String ss201s) {
        this.ss201s = ss201s;
        notifyPropertyChanged(BR.ss201s);
    }

    @Bindable
    public String getSs201d() {
        return ss201d;
    }

    public void setSs201d(String ss201d) {
        this.ss201d = ss201d;
        notifyPropertyChanged(BR.ss201d);
    }

    @Bindable
    public String getSs201nr() {
        return ss201nr;
    }

    public void setSs201nr(String ss201nr) {
        if (this.ss201nr.equals(ss201nr)) return; // for all checkboxes
        this.ss201nr = ss201nr;
        setSs201s(ss201nr.equals("999") ? "" : this.ss201s);
        setSs201d(ss201nr.equals("999") ? "" : this.ss201d);
        notifyPropertyChanged(BR.ss201nr);
    }

    @Bindable
    public String getSs202() {
        return ss202;
    }

    public void setSs202(String ss202) {
        this.ss202 = ss202;
        notifyPropertyChanged(BR.ss202);
    }

    @Bindable
    public String getSs202nr() {
        return ss202nr;
    }

    public void setSs202nr(String ss202nr) {
        if (this.ss202nr.equals(ss202nr)) return; // for all checkboxes
        this.ss202nr = ss202nr;
        setSs202(ss202nr.equals("999") ? "" : this.ss202);
        notifyPropertyChanged(BR.ss202nr);
    }

    @Bindable
    public String getSs203() {
        return ss203;
    }

    public void setSs203(String ss203) {
        this.ss203 = ss203;
        notifyPropertyChanged(BR.ss203);
    }

    @Bindable
    public String getSs203nr() {
        return ss203nr;
    }

    public void setSs203nr(String ss203nr) {
        if (this.ss203nr.equals(ss203nr)) return; // for all checkboxes
        this.ss203nr = ss203nr;
        setSs203(ss203nr.equals("999") ? "" : this.ss203);
        notifyPropertyChanged(BR.ss203nr);
    }

    @Bindable
    public String getSs204() {
        return ss204;
    }

    public void setSs204(String ss204) {
        this.ss204 = ss204;
        notifyPropertyChanged(BR.ss204);
    }

    @Bindable
    public String getSs204a() {
        return ss204a;
    }

    public void setSs204a(String ss204a) {
        this.ss204a = ss204a;
        notifyPropertyChanged(BR.ss204a);
    }

    @Bindable
    public String getSs204nr() {
        return ss204nr;
    }

    public void setSs204nr(String ss204nr) {
        if (this.ss204nr.equals(ss204nr)) return; // for all checkboxes
        this.ss204nr = ss204nr;
        setSs204(ss204nr.equals("999") ? "" : this.ss204);
        setSs204a(ss204nr.equals("999") ? "" : this.ss204a);
        notifyPropertyChanged(BR.ss204nr);
    }

    @Bindable
    public String getSs205() {
        return ss205;
    }

    public void setSs205(String ss205) {
        this.ss205 = ss205;
        notifyPropertyChanged(BR.ss205);
    }

    @Bindable
    public String getSs205nr() {
        return ss205nr;
    }

    public void setSs205nr(String ss205nr) {
        if (this.ss205nr.equals(ss205nr)) return; // for all checkboxes
        this.ss205nr = ss205nr;
        setSs205(ss205nr.equals("999") ? "" : this.ss205);
        notifyPropertyChanged(BR.ss205nr);
    }

    @Bindable
    public String getSs301() {
        return ss301;
    }

    public void setSs301(String ss301) {
        this.ss301 = ss301;
        notifyPropertyChanged(BR.ss301);
    }

    @Bindable
    public String getSs302() {
        return ss302;
    }

    public void setSs302(String ss302) {
        this.ss302 = ss302;
        notifyPropertyChanged(BR.ss302);
    }

    @Bindable
    public String getSs300nr() {
        return ss300nr;
    }

    public void setSs300nr(String ss300nr) {
        if (this.ss300nr.equals(ss300nr)) return; // for all checkboxes
        this.ss300nr = ss300nr;
        setSs301(ss300nr.equals("999") ? "" : this.ss301);
        setSs302(ss300nr.equals("999") ? "" : this.ss302);
        notifyPropertyChanged(BR.ss300nr);
    }

    @Bindable
    public String getSs303() {
        return ss303;
    }

    public void setSs303(String ss303) {
        this.ss303 = ss303;
        notifyPropertyChanged(BR.ss303);
    }

    @Bindable
    public String getSs303nr() {
        return ss303nr;
    }

    public void setSs303nr(String ss303nr) {
        if (this.ss303nr.equals(ss303nr)) return; // for all checkboxes
        this.ss303nr = ss303nr;
        setSs303(ss303nr.equals("999") ? "" : this.ss303);
        notifyPropertyChanged(BR.ss303nr);
    }

    @Bindable
    public String getSs304() {
        return ss304;
    }

    public void setSs304(String ss304) {
        this.ss304 = ss304;
        notifyPropertyChanged(BR.ss304);
    }

    @Bindable
    public String getSs304nr() {
        return ss304nr;
    }

    public void setSs304nr(String ss304nr) {
        if (this.ss304nr.equals(ss304nr)) return; // for all checkboxes
        this.ss304nr = ss304nr;
        setSs304(ss304nr.equals("999") ? "" : this.ss304);
        notifyPropertyChanged(BR.ss304nr);
    }

    @Bindable
    public String getSs401() {
        return ss401;
    }

    public void setSs401(String ss401) {
        this.ss401 = ss401;
        notifyPropertyChanged(BR.ss401);
    }

    @Bindable
    public String getSs401nr() {
        return ss401nr;
    }

    public void setSs401nr(String ss401nr) {
        if (this.ss401nr.equals(ss401nr)) return; // for all checkboxes
        this.ss401nr = ss401nr;
        setSs401(ss401nr.equals("999") ? "" : this.ss401);
        notifyPropertyChanged(BR.ss401nr);
    }

    @Bindable
    public String getSs501() {
        return ss501;
    }

    public void setSs501(String ss501) {
        this.ss501 = ss501;
        notifyPropertyChanged(BR.ss501);
    }

    @Bindable
    public String getSs502() {
        return ss502;
    }

    public void setSs502(String ss502) {
        this.ss502 = ss502;
        notifyPropertyChanged(BR.ss502);
    }

    @Bindable
    public String getSs503() {
        return ss503;
    }

    public void setSs503(String ss503) {
        this.ss503 = ss503;
        notifyPropertyChanged(BR.ss503);
    }

    @Bindable
    public String getSs504() {
        return ss504;
    }

    public void setSs504(String ss504) {
        this.ss504 = ss504;
        notifyPropertyChanged(BR.ss504);
    }

    @Bindable
    public String getSs5nr() {
        return ss5nr;
    }

    public void setSs5nr(String ss5nr) {
        if (this.ss5nr.equals(ss5nr)) return; // for all checkboxes
        this.ss5nr = ss5nr;
        setSs501(ss5nr.equals("999") ? "" : this.ss501);
        setSs502(ss5nr.equals("999") ? "" : this.ss502);
        setSs503(ss5nr.equals("999") ? "" : this.ss503);
        setSs504(ss5nr.equals("999") ? "" : this.ss504);
        notifyPropertyChanged(BR.ss5nr);
    }

    @Bindable
    public String getSs601() {
        return ss601;
    }

    public void setSs601(String ss601) {
        this.ss601 = ss601;
        notifyPropertyChanged(BR.ss601);
    }

    @Bindable
    public String getSh10101() {
        return sh10101;
    }

    public void setSh10101(String sh10101) {
        if (this.sh10101.equals(sh10101)) return; // for all checkboxes
        this.sh10101 = sh10101;
        notifyPropertyChanged(BR.sh10101);
    }

    @Bindable
    public String getSh10102() {
        return sh10102;
    }

    public void setSh10102(String sh10102) {
        if (this.sh10102.equals(sh10102)) return; // for all checkboxes
        this.sh10102 = sh10102;
        notifyPropertyChanged(BR.sh10102);
    }

    @Bindable
    public String getSh10103() {
        return sh10103;
    }

    public void setSh10103(String sh10103) {
        if (this.sh10103.equals(sh10103)) return; // for all checkboxes
        this.sh10103 = sh10103;
        notifyPropertyChanged(BR.sh10103);
    }

    @Bindable
    public String getSh10104() {
        return sh10104;
    }

    public void setSh10104(String sh10104) {
        if (this.sh10104.equals(sh10104)) return; // for all checkboxes
        this.sh10104 = sh10104;
        notifyPropertyChanged(BR.sh10104);
    }

    @Bindable
    public String getSh10105() {
        return sh10105;
    }

    public void setSh10105(String sh10105) {
        if (this.sh10105.equals(sh10105)) return; // for all checkboxes
        this.sh10105 = sh10105;
        notifyPropertyChanged(BR.sh10105);
    }

    @Bindable
    public String getSh10106() {
        return sh10106;
    }

    public void setSh10106(String sh10106) {
        if (this.sh10106.equals(sh10106)) return; // for all checkboxes
        this.sh10106 = sh10106;
        notifyPropertyChanged(BR.sh10106);
    }

    @Bindable
    public String getSh10107() {
        return sh10107;
    }

    public void setSh10107(String sh10107) {
        if (this.sh10107.equals(sh10107)) return; // for all checkboxes
        this.sh10107 = sh10107;
        notifyPropertyChanged(BR.sh10107);
    }

    @Bindable
    public String getSh10108() {
        return sh10108;
    }

    public void setSh10108(String sh10108) {
        if (this.sh10108.equals(sh10108)) return; // for all checkboxes
        this.sh10108 = sh10108;
        notifyPropertyChanged(BR.sh10108);
    }

    @Bindable
    public String getSh10109() {
        return sh10109;
    }

    public void setSh10109(String sh10109) {
        if (this.sh10109.equals(sh10109)) return; // for all checkboxes
        this.sh10109 = sh10109;
        notifyPropertyChanged(BR.sh10109);
    }

    @Bindable
    public String getSh10196() {
        return sh10196;
    }

    public void setSh10196(String sh10196) {
        if (this.sh10196.equals(sh10196)) return; // for all checkboxes
        this.sh10196 = sh10196;
        setSh10196x(sh10196.equals("96") ? this.sh10196x : "");
        notifyPropertyChanged(BR.sh10196);
    }

    @Bindable
    public String getSh10196x() {
        return sh10196x;
    }

    public void setSh10196x(String sh10196x) {
        this.sh10196x = sh10196x;
        notifyPropertyChanged(BR.sh10196x);
    }

    @Bindable
    public String getSh101nr() {
        return sh101nr;
    }

    public void setSh101nr(String sh101nr) {
        if (this.sh101nr.equals(sh101nr)) return; // for all checkboxes
        this.sh101nr = sh101nr;
        setSh10101(sh101nr.equals("999") ? "" : this.sh10101);
        setSh10102(sh101nr.equals("999") ? "" : this.sh10102);
        setSh10103(sh101nr.equals("999") ? "" : this.sh10103);
        setSh10104(sh101nr.equals("999") ? "" : this.sh10104);
        setSh10105(sh101nr.equals("999") ? "" : this.sh10105);
        setSh10106(sh101nr.equals("999") ? "" : this.sh10106);
        setSh10107(sh101nr.equals("999") ? "" : this.sh10107);
        setSh10108(sh101nr.equals("999") ? "" : this.sh10108);
        setSh10109(sh101nr.equals("999") ? "" : this.sh10109);
        setSh10196(sh101nr.equals("999") ? "" : this.sh10196);
        notifyPropertyChanged(BR.sh101nr);
    }

    @Bindable
    public String getSh201() {
        return sh201;
    }

    public void setSh201(String sh201) {
        this.sh201 = sh201;
        notifyPropertyChanged(BR.sh201);
    }

    @Bindable
    public String getSh202() {
        return sh202;
    }

    public void setSh202(String sh202) {
        this.sh202 = sh202;
        notifyPropertyChanged(BR.sh202);
    }

    @Bindable
    public String getSh203() {
        return sh203;
    }

    public void setSh203(String sh203) {
        this.sh203 = sh203;
        notifyPropertyChanged(BR.sh203);
    }

    @Bindable
    public String getSh204() {
        return sh204;
    }

    public void setSh204(String sh204) {
        this.sh204 = sh204;
        notifyPropertyChanged(BR.sh204);
    }

    @Bindable
    public String getSh204nr() {
        return sh204nr;
    }

    public void setSh204nr(String sh204nr) {
        if (this.sh204nr.equals(sh204nr)) return; // for all checkboxes
        this.sh204nr = sh204nr;
        setSh204(sh204nr.equals("999") ? "" : this.sh204);
        notifyPropertyChanged(BR.sh204nr);
    }

    @Bindable
    public String getSh205() {
        return sh205;
    }

    public void setSh205(String sh205) {
        this.sh205 = sh205;
        notifyPropertyChanged(BR.sh205);
    }

    @Bindable
    public String getSh301() {
        return sh301;
    }

    public void setSh301(String sh301) {
        this.sh301 = sh301;
        notifyPropertyChanged(BR.sh301);
    }

    @Bindable
    public String getSh302() {
        return sh302;
    }

    public void setSh302(String sh302) {
        this.sh302 = sh302;
        notifyPropertyChanged(BR.sh302);
    }

    @Bindable
    public String getSh304() {
        return sh304;
    }

    public void setSh304(String sh304) {
        this.sh304 = sh304;
        notifyPropertyChanged(BR.sh304);
    }

    @Bindable
    public String getSh401() {
        return sh401;
    }

    public void setSh401(String sh401) {
        this.sh401 = sh401;
        notifyPropertyChanged(BR.sh401);
    }

    @Bindable
    public String getSh401nr() {
        return sh401nr;
    }

    public void setSh401nr(String sh401nr) {
        if (this.sh401nr.equals(sh401nr)) return; // for all checkboxes
        this.sh401nr = sh401nr;
        setSh401(sh401nr.equals("999") ? "" : this.sh401);
        notifyPropertyChanged(BR.sh401nr);
    }

    @Bindable
    public String getSe101() {
        return se101;
    }

    public void setSe101(String se101) {
        this.se101 = se101;
        notifyPropertyChanged(BR.se101);
    }

    @Bindable
    public String getSe102() {
        return se102;
    }

    public void setSe102(String se102) {
        this.se102 = se102;
        notifyPropertyChanged(BR.se102);
    }

    @Bindable
    public String getSe103() {
        return se103;
    }

    public void setSe103(String se103) {
        this.se103 = se103;
        notifyPropertyChanged(BR.se103);
    }

    @Bindable
    public String getSe104() {
        return se104;
    }

    public void setSe104(String se104) {
        this.se104 = se104;
        notifyPropertyChanged(BR.se104);
    }

    @Bindable
    public String getSe105() {
        return se105;
    }

    public void setSe105(String se105) {
        this.se105 = se105;
        notifyPropertyChanged(BR.se105);
    }

    @Bindable
    public String getSe106() {
        return se106;
    }

    public void setSe106(String se106) {
        this.se106 = se106;
        notifyPropertyChanged(BR.se106);
    }

    @Bindable
    public String getSe107() {
        return se107;
    }

    public void setSe107(String se107) {
        this.se107 = se107;
        notifyPropertyChanged(BR.se107);
    }

    @Bindable
    public String getSe108() {
        return se108;
    }

    public void setSe108(String se108) {
        this.se108 = se108;
        notifyPropertyChanged(BR.se108);
    }

    @Bindable
    public String getSe109() {
        return se109;
    }

    public void setSe109(String se109) {
        this.se109 = se109;
        notifyPropertyChanged(BR.se109);
    }

    @Bindable
    public String getSe110() {
        return se110;
    }

    public void setSe110(String se110) {
        this.se110 = se110;
        notifyPropertyChanged(BR.se110);
    }

    @Bindable
    public String getSe111() {
        return se111;
    }

    public void setSe111(String se111) {
        this.se111 = se111;
        notifyPropertyChanged(BR.se111);
    }

    @Bindable
    public String getSe112() {
        return se112;
    }

    public void setSe112(String se112) {
        this.se112 = se112;
        notifyPropertyChanged(BR.se112);
    }

    @Bindable
    public String getSe113() {
        return se113;
    }

    public void setSe113(String se113) {
        this.se113 = se113;
        notifyPropertyChanged(BR.se113);
    }

    @Bindable
    public String getSe201() {
        return se201;
    }

    public void setSe201(String se201) {
        this.se201 = se201;
        notifyPropertyChanged(BR.se201);
    }

    @Bindable
    public String getSe202() {
        return se202;
    }

    public void setSe202(String se202) {
        this.se202 = se202;
        notifyPropertyChanged(BR.se202);
    }

    @Bindable
    public String getSe203() {
        return se203;
    }

    public void setSe203(String se203) {
        this.se203 = se203;
        notifyPropertyChanged(BR.se203);
    }

    @Bindable
    public String getSe204() {
        return se204;
    }

    public void setSe204(String se204) {
        this.se204 = se204;
        notifyPropertyChanged(BR.se204);
    }

    @Bindable
    public String getSe205() {
        return se205;
    }

    public void setSe205(String se205) {
        this.se205 = se205;
        notifyPropertyChanged(BR.se205);
    }

    @Bindable
    public String getSe206() {
        return se206;
    }

    public void setSe206(String se206) {
        this.se206 = se206;
        notifyPropertyChanged(BR.se206);
    }

    @Bindable
    public String getSe207() {
        return se207;
    }

    public void setSe207(String se207) {
        this.se207 = se207;
        notifyPropertyChanged(BR.se207);
    }

    @Bindable
    public String getSe208() {
        return se208;
    }

    public void setSe208(String se208) {
        this.se208 = se208;
        notifyPropertyChanged(BR.se208);
    }

    @Bindable
    public String getSe301() {
        return se301;
    }

    public void setSe301(String se301) {
        this.se301 = se301;
        notifyPropertyChanged(BR.se301);
    }

    @Bindable
    public String getSe302() {
        return se302;
    }

    public void setSe302(String se302) {
        this.se302 = se302;
        notifyPropertyChanged(BR.se302);
    }

    @Bindable
    public String getSe401() {
        return se401;
    }

    public void setSe401(String se401) {
        this.se401 = se401;
        setSe402(se401.equals("1") ? this.se402 : "");
        notifyPropertyChanged(BR.se401);
    }

    @Bindable
    public String getSe402() {
        return se402;
    }

    public void setSe402(String se402) {
        this.se402 = se402;
        notifyPropertyChanged(BR.se402);
    }

    @Bindable
    public String getSe403() {
        return se403;
    }

    public void setSe403(String se403) {
        this.se403 = se403;
        notifyPropertyChanged(BR.se403);
    }

    @Bindable
    public String getSe404() {
        return se404;
    }

    public void setSe404(String se404) {
        this.se404 = se404;
        notifyPropertyChanged(BR.se404);
    }

    @Bindable
    public String getSe405() {
        return se405;
    }

    public void setSe405(String se405) {
        this.se405 = se405;
        notifyPropertyChanged(BR.se405);
    }

    @Bindable
    public String getSe406() {
        return se406;
    }

    public void setSe406(String se406) {
        this.se406 = se406;
        notifyPropertyChanged(BR.se406);
    }

    @Bindable
    public String getSe407() {
        return se407;
    }

    public void setSe407(String se407) {
        this.se407 = se407;
        notifyPropertyChanged(BR.se407);
    }

    @Bindable
    public String getSe408() {
        return se408;
    }

    public void setSe408(String se408) {
        this.se408 = se408;
        notifyPropertyChanged(BR.se408);
    }

    @Bindable
    public String getSe409() {
        return se409;
    }

    public void setSe409(String se409) {
        this.se409 = se409;
        notifyPropertyChanged(BR.se409);
    }

    @Bindable
    public String getSe410() {
        return se410;
    }

    public void setSe410(String se410) {
        this.se410 = se410;
        notifyPropertyChanged(BR.se410);
    }

    @Bindable
    public String getSe411() {
        return se411;
    }

    public void setSe411(String se411) {
        this.se411 = se411;
        notifyPropertyChanged(BR.se411);
    }

    @Bindable
    public String getSe412() {
        return se412;
    }

    public void setSe412(String se412) {
        this.se412 = se412;
        setSe41296x(se412.equals("1") ? this.se41296x : "");
        notifyPropertyChanged(BR.se412);
    }

    @Bindable
    public String getSe41296x() {
        return se41296x;
    }

    public void setSe41296x(String se41296x) {
        this.se41296x = se41296x;
        notifyPropertyChanged(BR.se41296x);
    }

    @Bindable
    public String getSe413() {
        return se413;
    }

    public void setSe413(String se413) {
        this.se413 = se413;
        setSe41396x(se413.equals("1") ? this.se41396x : "");
        notifyPropertyChanged(BR.se413);
    }

    @Bindable
    public String getSe41396x() {
        return se41396x;
    }

    public void setSe41396x(String se41396x) {
        this.se41396x = se41396x;
        notifyPropertyChanged(BR.se41396x);
    }

    @Bindable
    public String getSe414() {
        return se414;
    }

    public void setSe414(String se414) {
        this.se414 = se414;
        notifyPropertyChanged(BR.se414);
    }

    @Bindable
    public String getSe415() {
        return se415;
    }

    public void setSe415(String se415) {
        this.se415 = se415;
        notifyPropertyChanged(BR.se415);
    }

    @Bindable
    public String getSe416() {
        return se416;
    }

    public void setSe416(String se416) {
        this.se416 = se416;
        notifyPropertyChanged(BR.se416);
    }

    @Bindable
    public String getSe417() {
        return se417;
    }

    public void setSe417(String se417) {
        this.se417 = se417;
        notifyPropertyChanged(BR.se417);
    }

    @Bindable
    public String getSe418() {
        return se418;
    }

    public void setSe418(String se418) {
        this.se418 = se418;
        notifyPropertyChanged(BR.se418);
    }

    @Bindable
    public String getSe419() {
        return se419;
    }

    public void setSe419(String se419) {
        this.se419 = se419;
        notifyPropertyChanged(BR.se419);
    }

    @Bindable
    public String getSe420() {
        return se420;
    }

    public void setSe420(String se420) {
        this.se420 = se420;
        notifyPropertyChanged(BR.se420);
    }

    @Bindable
    public String getSe421() {
        return se421;
    }

    public void setSe421(String se421) {
        this.se421 = se421;
        notifyPropertyChanged(BR.se421);
    }

    @Bindable
    public String getSe422() {
        return se422;
    }

    public void setSe422(String se422) {
        this.se422 = se422;
        notifyPropertyChanged(BR.se422);
    }


    public PatientDetails Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_USERNAME));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_PROJECT_NAME));
        this.facility = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_FACILITY));
        this.facilityCode = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_FACILITY_CODE));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_SYNCED_DATE));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_ISTATUS96x));

        //For childCount
        //this.sA = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SA));

        sPDHydrate(cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_SPD)));
        sHISHydrate(cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_SHIS)));
        sEXMHydrate(cursor.getString(cursor.getColumnIndexOrThrow(PDContract.PDTable.COLUMN_SEXM)));

        return this;
    }

    public void sPDHydrate(String string) throws JSONException {
        Log.d(TAG, "sPDHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.prno = json.getString("prno");
            this.vdate = json.getString("vdate");
            this.vtime = json.getString("vtime");
            this.ss100 = json.getString("ss100");
            this.ss101 = json.getString("ss101");
            this.ss102 = json.getString("ss102");
            this.ss103 = json.getString("ss103");
            this.ss104y = json.getString("ss104y");
            this.ss104m = json.getString("ss104m");
            this.ss104d = json.getString("ss104d");
            this.ss105 = json.getString("ss105");
            this.ss106 = json.getString("ss106");
            this.ss107 = json.getString("ss107");
            this.ss10701 = json.getString("ss10701");
            this.ss10702 = json.getString("ss10702");
            this.ss10703 = json.getString("ss10703");
            this.ss10704 = json.getString("ss10704");
            this.ss108 = json.getString("ss108");
            this.ss10899 = json.getString("ss10899");
            this.ss201s = json.getString("ss201s");
            this.ss201d = json.getString("ss201d");
            this.ss201nr = json.getString("ss201nr");
            this.ss202 = json.getString("ss202");
            this.ss202nr = json.getString("ss202nr");
            this.ss203 = json.getString("ss203");
            this.ss203nr = json.getString("ss203nr");
            this.ss204 = json.getString("ss204");
            this.ss204a = json.getString("ss204a");
            this.ss204nr = json.getString("ss204nr");
            this.ss205 = json.getString("ss205");
            this.ss205nr = json.getString("ss205nr");
            this.ss301 = json.getString("ss301");
            this.ss302 = json.getString("ss302");
            this.ss300nr = json.getString("ss300nr");
            this.ss303 = json.getString("ss303");
            this.ss303nr = json.getString("ss303nr");
            this.ss304 = json.getString("ss304");
            this.ss304nr = json.getString("ss304nr");
            this.ss401 = json.getString("ss401");
            this.ss401nr = json.getString("ss401nr");
            this.ss501 = json.getString("ss501");
            this.ss502 = json.getString("ss502");
            this.ss503 = json.getString("ss503");
            this.ss504 = json.getString("ss504");
            this.ss5nr = json.getString("ss5nr");
            this.ss601 = json.getString("ss601");
        }
    }

    public void sHISHydrate(String string) throws JSONException {
        Log.d(TAG, "sHISHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.sh10101 = json.getString("sh10101");
            this.sh10102 = json.getString("sh10102");
            this.sh10103 = json.getString("sh10103");
            this.sh10104 = json.getString("sh10104");
            this.sh10105 = json.getString("sh10105");
            this.sh10106 = json.getString("sh10106");
            this.sh10107 = json.getString("sh10107");
            this.sh10108 = json.getString("sh10108");
            this.sh10109 = json.getString("sh10109");
            this.sh10196 = json.getString("sh10196");
            this.sh10196x = json.getString("sh10196x");
            this.sh101nr = json.getString("sh101nr");
            this.sh201 = json.getString("sh201");
            this.sh202 = json.getString("sh202");
            this.sh203 = json.getString("sh203");
            this.sh204 = json.getString("sh204");
            this.sh204nr = json.getString("sh204nr");
            this.sh205 = json.getString("sh205");
            this.sh301 = json.getString("sh301");
            this.sh302 = json.getString("sh302");
            this.sh304 = json.getString("sh304");
            this.sh401 = json.getString("sh401");
            this.sh401nr = json.getString("sh401nr");
        }
    }

    public void sEXMHydrate(String string) throws JSONException {
        Log.d(TAG, "sEXMHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.se101 = json.getString("se101");
            this.se102 = json.getString("se102");
            this.se103 = json.getString("se103");
            this.se104 = json.getString("se104");
            this.se105 = json.getString("se105");
            this.se106 = json.getString("se106");
            this.se107 = json.getString("se107");
            this.se108 = json.getString("se108");
            this.se109 = json.getString("se109");
            this.se110 = json.getString("se110");
            this.se111 = json.getString("se111");
            this.se112 = json.getString("se112");
            this.se113 = json.getString("se113");
            this.se201 = json.getString("se201");
            this.se202 = json.getString("se202");
            this.se203 = json.getString("se203");
            this.se204 = json.getString("se204");
            this.se205 = json.getString("se205");
            this.se206 = json.getString("se206");
            this.se207 = json.getString("se207");
            this.se208 = json.getString("se208");
            this.se301 = json.getString("se301");
            this.se302 = json.getString("se302");
            this.se401 = json.getString("se401");
            this.se402 = json.getString("se402");
            this.se403 = json.getString("se403");
            this.se404 = json.getString("se404");
            this.se405 = json.getString("se405");
            this.se406 = json.getString("se406");
            this.se407 = json.getString("se407");
            this.se408 = json.getString("se408");
            this.se409 = json.getString("se409");
            this.se410 = json.getString("se410");
            this.se411 = json.getString("se411");
            this.se412 = json.getString("se412");
            this.se41296x = json.getString("se41296x");
            this.se413 = json.getString("se413");
            this.se41396x = json.getString("se41396x");
            this.se414 = json.getString("se414");
            this.se415 = json.getString("se415");
            this.se416 = json.getString("se416");
            this.se417 = json.getString("se417");
            this.se418 = json.getString("se418");
            this.se419 = json.getString("se419");
            this.se420 = json.getString("se420");
            this.se421 = json.getString("se421");
            this.se422 = json.getString("se422");

        }
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(PDContract.PDTable.COLUMN_ID, this.id);
        json.put(PDContract.PDTable.COLUMN_UID, this.uid);
        json.put(PDContract.PDTable.COLUMN_USERNAME, this.userName);
        json.put(PDContract.PDTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(PDContract.PDTable.COLUMN_FACILITY, this.facility);
        json.put(PDContract.PDTable.COLUMN_FACILITY_CODE, this.facilityCode);
        json.put(PDContract.PDTable.COLUMN_SYSDATE, this.sysDate);
        json.put(PDContract.PDTable.COLUMN_DEVICEID, this.deviceId);
        json.put(PDContract.PDTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(PDContract.PDTable.COLUMN_APPVERSION, this.appver);
        json.put(PDContract.PDTable.COLUMN_SYNCED, this.synced);
        json.put(PDContract.PDTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(PDContract.PDTable.COLUMN_ISTATUS, this.iStatus);
        json.put(PDContract.PDTable.COLUMN_ISTATUS96x, this.iStatus96x);

        json.put(PDContract.PDTable.COLUMN_SPD, new JSONObject(sPDtoString()));
        json.put(PDContract.PDTable.COLUMN_SHIS, new JSONObject(sHIStoString()));
        json.put(PDContract.PDTable.COLUMN_SEXM, new JSONObject(sEXMtoString()));
        return json;
    }

    public String sPDtoString() throws JSONException {
        Log.d(TAG, "sPDtoString: ");
        JSONObject json = new JSONObject();
        json.put("prno", prno)
                .put("vdate", vdate)
                .put("vtime", vtime)
                .put("ss100", ss100)
                .put("ss101", ss101)
                .put("ss102", ss102)
                .put("ss103", ss103)
                .put("ss104y", ss104y)
                .put("ss104m", ss104m)
                .put("ss104d", ss104d)
                .put("ss105", ss105)
                .put("ss106", ss106)
//                .put("ss107", ss107)
                .put("ss10701", ss10701)
                .put("ss10702", ss10702)
                .put("ss10703", ss10703)
                .put("ss10704", ss10704)
                .put("ss108", ss108)
                .put("ss10899", ss10899)
                .put("ss201s", ss201s)
                .put("ss201d", ss201d)
                .put("ss201nr", ss201nr)
                .put("ss202", ss202)
                .put("ss202nr", ss202nr)
                .put("ss203", ss203)
                .put("ss203nr", ss203nr)
                .put("ss204", ss204)
                .put("ss204a", ss204a)
                .put("ss204nr", ss204nr)
                .put("ss205", ss205)
                .put("ss205nr", ss205nr)
                .put("ss301", ss301)
                .put("ss302", ss302)
                .put("ss300nr", ss300nr)
                .put("ss303", ss303)
                .put("ss303nr", ss303nr)
                .put("ss304", ss304)
                .put("ss304nr", ss304nr)
                .put("ss401", ss401)
                .put("ss401nr", ss401nr)
                .put("ss501", ss501)
                .put("ss502", ss502)
                .put("ss503", ss503)
                .put("ss504", ss504)
                .put("ss5nr", ss5nr)
                .put("ss601", ss601);
        return json.toString();
    }

    public String sHIStoString() throws JSONException {
        Log.d(TAG, "sHIStoString: ");
        JSONObject json = new JSONObject();
        json.put("sh10101", sh10101)
                .put("sh10102", sh10102)
                .put("sh10103", sh10103)
                .put("sh10104", sh10104)
                .put("sh10105", sh10105)
                .put("sh10106", sh10106)
                .put("sh10107", sh10107)
                .put("sh10108", sh10108)
                .put("sh10109", sh10109)
                .put("sh10196", sh10196)
                .put("sh10196x", sh10196x)
                .put("sh101nr", sh101nr)
                .put("sh201", sh201)
                .put("sh202", sh202)
                .put("sh203", sh203)
                .put("sh204", sh204)
                .put("sh204nr", sh204nr)
                .put("sh205", sh205)
                .put("sh301", sh301)
                .put("sh302", sh302)
                .put("sh304", sh304)
                .put("sh401", sh401)
                .put("sh401nr", sh401nr);
        return json.toString();
    }

    public String sEXMtoString() throws JSONException {
        Log.d(TAG, "sEXMtoString: ");
        JSONObject json = new JSONObject();
        json.put("se101", se101)
                .put("se102", se102)
                .put("se103", se103)
                .put("se104", se104)
                .put("se105", se105)
                .put("se106", se106)
                .put("se107", se107)
                .put("se108", se108)
                .put("se109", se109)
                .put("se110", se110)
                .put("se111", se111)
                .put("se112", se112)
                .put("se113", se113)
                .put("se201", se201)
                .put("se202", se202)
                .put("se203", se203)
                .put("se204", se204)
                .put("se205", se205)
                .put("se206", se206)
                .put("se207", se207)
                .put("se208", se208)
                .put("se301", se301)
                .put("se302", se302)
                .put("se401", se401)
                .put("se402", se402)
                .put("se403", se403)
                .put("se404", se404)
                .put("se405", se405)
                .put("se406", se406)
                .put("se407", se407)
                .put("se408", se408)
                .put("se409", se409)
                .put("se410", se410)
                .put("se411", se411)
                .put("se412", se412)
                .put("se41296x", se41296x)
                .put("se413", se413)
                .put("se41396x", se41396x)
                .put("se414", se414)
                .put("se415", se415)
                .put("se416", se416)
                .put("se417", se417)
                .put("se418", se418)
                .put("se419", se419)
                .put("se420", se420)
                .put("se421", se421)
                .put("se422", se422);
        return json.toString();
    }

}
