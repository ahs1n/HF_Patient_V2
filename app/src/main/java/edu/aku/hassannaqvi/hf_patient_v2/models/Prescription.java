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

public class Prescription extends BaseObservable implements Observable {

    private final String TAG = "PatientDetails";
    public String prno = _EMPTY_;
    public String facility = _EMPTY_;
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
    private String sPrescription = _EMPTY_;

    public Prescription() {
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
    public String getsPrescription() {
        return sPrescription;
    }

    public void setsPrescription(String sPrescription) {
        this.sPrescription = sPrescription;
        notifyPropertyChanged(BR.sPrescription);
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
    public String getMp101() {
        return mp101;
    }

    public void setMp101(String mp101) {
        this.mp101 = mp101;
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
        this.mp102 = mp102;
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
        this.mp103 = mp103;
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
        this.mp104 = mp104;
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
        this.mp105 = mp105;
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
        this.mp106 = mp106;
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
        this.mp107 = mp107;
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
        this.mp108 = mp108;
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
        this.mp109 = mp109;
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
        this.mp110 = mp110;
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
        this.mp111 = mp111;
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
        this.mp112 = mp112;
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
        this.mp113 = mp113;
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
        this.mp114 = mp114;
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
        this.mp115 = mp115;
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
        this.mp116 = mp116;
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
        this.mp117 = mp117;
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
        this.mp118 = mp118;
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
        this.mp119 = mp119;
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
        this.mp120 = mp120;
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
        this.mp121 = mp121;
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
        this.mp122 = mp122;
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
        this.mp123 = mp123;
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
        this.mp124 = mp124;
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
        this.mp125 = mp125;
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
        this.mp126 = mp126;
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
        this.mp127 = mp127;
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
        this.mp128 = mp128;
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
        this.mp129 = mp129;
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
        this.mp130 = mp130;
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
        this.mp131 = mp131;
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
        this.mp132 = mp132;
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
        this.mp133 = mp133;
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
        this.mp134 = mp134;
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
        this.mp135 = mp135;
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
        this.mp136 = mp136;
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
        this.mp137 = mp137;
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

}
