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
import edu.aku.hassannaqvi.hf_patient_v2.contracts.PDContract.COMPLAINTSTable;
import edu.aku.hassannaqvi.hf_patient_v2.core.MainApp;

public class Complaints extends BaseObservable implements Observable {

    private final String TAG = "Complaints";
    public String prno = _EMPTY_;
    public String facility = _EMPTY_;
    public String pc200 = _EMPTY_;
    public String pc201 = _EMPTY_;
    public String pc202 = _EMPTY_;
    public String pc203 = _EMPTY_;
    public String pc204 = _EMPTY_;
    public String pc205 = _EMPTY_;
    public String pc206 = _EMPTY_;
    public String pc207 = _EMPTY_;
    public String pc208 = _EMPTY_;
    public String pc209 = _EMPTY_;
    public String pc210 = _EMPTY_;
    public String pc211 = _EMPTY_;
    public String pc212 = _EMPTY_;
    public String pc213 = _EMPTY_;
    public String pc214 = _EMPTY_;
    public String pc215 = _EMPTY_;
    public String pc216 = _EMPTY_;
    public String pc217 = _EMPTY_;
    public String pc218 = _EMPTY_;
    public String pc219 = _EMPTY_;
    public String pc220 = _EMPTY_;
    public String pc221 = _EMPTY_;
    public String pc222 = _EMPTY_;
    public String pc223 = _EMPTY_;
    public String pc224 = _EMPTY_;
    public String pc225 = _EMPTY_;
    public String pc226 = _EMPTY_;
    public String pc227 = _EMPTY_;
    public String pc228 = _EMPTY_;
    public String pc229 = _EMPTY_;
    public String pc230 = _EMPTY_;
    public String pc231 = _EMPTY_;
    public String pc232 = _EMPTY_;
    public String pc233 = _EMPTY_;
    public String pc234 = _EMPTY_;
    public String pc235 = _EMPTY_;
    public String pc236 = _EMPTY_;
    public String pc237 = _EMPTY_;
    public String pc238 = _EMPTY_;
    public String pc239 = _EMPTY_;
    public String pc240 = _EMPTY_;
    public String pc241 = _EMPTY_;
    public String pc242 = _EMPTY_;
    public String pc243 = _EMPTY_;
    public String pc244 = _EMPTY_;
    public String pc245 = _EMPTY_;
    public String pc246 = _EMPTY_;
    public String pc247 = _EMPTY_;
    public String pc248 = _EMPTY_;
    public String pc249 = _EMPTY_;
    public String pc250 = _EMPTY_;
    public String pc251 = _EMPTY_;
    public String pc252 = _EMPTY_;
    public String pc253 = _EMPTY_;
    public String pc254 = _EMPTY_;
    public String pc255 = _EMPTY_;
    public String pc256 = _EMPTY_;
    public String pc257 = _EMPTY_;
    public String pc258 = _EMPTY_;
    public String pc259 = _EMPTY_;
    public String pc2961 = _EMPTY_;
    public String pc2961x = _EMPTY_;
    public String pc2962 = _EMPTY_;
    public String pc2962x = _EMPTY_;
    public String pc2963 = _EMPTY_;
    public String pc2963x = _EMPTY_;
    public String pc200nr = _EMPTY_;
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
    private String sComplaints = _EMPTY_;

    public Complaints() {
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
    public String getsComplaints() {
        return sComplaints;
    }

    public void setsComplaints(String sComplaints) {
        this.sComplaints = sComplaints;
        notifyPropertyChanged(BR.sComplaints);
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
    public String getPc200() {
        return pc200;
    }

    public void setPc200(String pc200) {
        this.pc200 = pc200;
        notifyPropertyChanged(BR.pc200);
    }

    @Bindable
    public String getPc201() {
        return pc201;
    }

    public void setPc201(String pc201) {
        this.pc201 = pc201;
        notifyPropertyChanged(BR.pc201);
    }

    @Bindable
    public String getPc202() {
        return pc202;
    }

    public void setPc202(String pc202) {
        this.pc202 = pc202;
        notifyPropertyChanged(BR.pc202);
    }

    @Bindable
    public String getPc203() {
        return pc203;
    }

    public void setPc203(String pc203) {
        this.pc203 = pc203;
        notifyPropertyChanged(BR.pc203);
    }

    @Bindable
    public String getPc204() {
        return pc204;
    }

    public void setPc204(String pc204) {
        this.pc204 = pc204;
        notifyPropertyChanged(BR.pc204);
    }

    @Bindable
    public String getPc205() {
        return pc205;
    }

    public void setPc205(String pc205) {
        this.pc205 = pc205;
        notifyPropertyChanged(BR.pc205);
    }

    @Bindable
    public String getPc206() {
        return pc206;
    }

    public void setPc206(String pc206) {
        this.pc206 = pc206;
        notifyPropertyChanged(BR.pc206);
    }

    @Bindable
    public String getPc207() {
        return pc207;
    }

    public void setPc207(String pc207) {
        this.pc207 = pc207;
        notifyPropertyChanged(BR.pc207);
    }

    @Bindable
    public String getPc208() {
        return pc208;
    }

    public void setPc208(String pc208) {
        this.pc208 = pc208;
        notifyPropertyChanged(BR.pc208);
    }

    @Bindable
    public String getPc209() {
        return pc209;
    }

    public void setPc209(String pc209) {
        this.pc209 = pc209;
        notifyPropertyChanged(BR.pc209);
    }

    @Bindable
    public String getPc210() {
        return pc210;
    }

    public void setPc210(String pc210) {
        this.pc210 = pc210;
        notifyPropertyChanged(BR.pc210);
    }

    @Bindable
    public String getPc211() {
        return pc211;
    }

    public void setPc211(String pc211) {
        this.pc211 = pc211;
        notifyPropertyChanged(BR.pc211);
    }

    @Bindable
    public String getPc212() {
        return pc212;
    }

    public void setPc212(String pc212) {
        this.pc212 = pc212;
        notifyPropertyChanged(BR.pc212);
    }

    @Bindable
    public String getPc213() {
        return pc213;
    }

    public void setPc213(String pc213) {
        this.pc213 = pc213;
        notifyPropertyChanged(BR.pc213);
    }

    @Bindable
    public String getPc214() {
        return pc214;
    }

    public void setPc214(String pc214) {
        this.pc214 = pc214;
        notifyPropertyChanged(BR.pc214);
    }

    @Bindable
    public String getPc215() {
        return pc215;
    }

    public void setPc215(String pc215) {
        this.pc215 = pc215;
        notifyPropertyChanged(BR.pc215);
    }

    @Bindable
    public String getPc216() {
        return pc216;
    }

    public void setPc216(String pc216) {
        this.pc216 = pc216;
        notifyPropertyChanged(BR.pc216);
    }

    @Bindable
    public String getPc217() {
        return pc217;
    }

    public void setPc217(String pc217) {
        this.pc217 = pc217;
        notifyPropertyChanged(BR.pc217);
    }

    @Bindable
    public String getPc218() {
        return pc218;
    }

    public void setPc218(String pc218) {
        this.pc218 = pc218;
        notifyPropertyChanged(BR.pc218);
    }

    @Bindable
    public String getPc219() {
        return pc219;
    }

    public void setPc219(String pc219) {
        this.pc219 = pc219;
        notifyPropertyChanged(BR.pc219);
    }

    @Bindable
    public String getPc220() {
        return pc220;
    }

    public void setPc220(String pc220) {
        this.pc220 = pc220;
        notifyPropertyChanged(BR.pc220);
    }

    @Bindable
    public String getPc221() {
        return pc221;
    }

    public void setPc221(String pc221) {
        this.pc221 = pc221;
        notifyPropertyChanged(BR.pc221);
    }

    @Bindable
    public String getPc222() {
        return pc222;
    }

    public void setPc222(String pc222) {
        this.pc222 = pc222;
        notifyPropertyChanged(BR.pc222);
    }

    @Bindable
    public String getPc223() {
        return pc223;
    }

    public void setPc223(String pc223) {
        this.pc223 = pc223;
        notifyPropertyChanged(BR.pc223);
    }

    @Bindable
    public String getPc224() {
        return pc224;
    }

    public void setPc224(String pc224) {
        this.pc224 = pc224;
        notifyPropertyChanged(BR.pc224);
    }

    @Bindable
    public String getPc225() {
        return pc225;
    }

    public void setPc225(String pc225) {
        this.pc225 = pc225;
        notifyPropertyChanged(BR.pc225);
    }

    @Bindable
    public String getPc226() {
        return pc226;
    }

    public void setPc226(String pc226) {
        this.pc226 = pc226;
        notifyPropertyChanged(BR.pc226);
    }

    @Bindable
    public String getPc227() {
        return pc227;
    }

    public void setPc227(String pc227) {
        this.pc227 = pc227;
        notifyPropertyChanged(BR.pc227);
    }

    @Bindable
    public String getPc228() {
        return pc228;
    }

    public void setPc228(String pc228) {
        this.pc228 = pc228;
        notifyPropertyChanged(BR.pc228);
    }

    @Bindable
    public String getPc229() {
        return pc229;
    }

    public void setPc229(String pc229) {
        this.pc229 = pc229;
        notifyPropertyChanged(BR.pc229);
    }

    @Bindable
    public String getPc230() {
        return pc230;
    }

    public void setPc230(String pc230) {
        this.pc230 = pc230;
        notifyPropertyChanged(BR.pc230);
    }

    @Bindable
    public String getPc231() {
        return pc231;
    }

    public void setPc231(String pc231) {
        this.pc231 = pc231;
        notifyPropertyChanged(BR.pc231);
    }

    @Bindable
    public String getPc232() {
        return pc232;
    }

    public void setPc232(String pc232) {
        this.pc232 = pc232;
        notifyPropertyChanged(BR.pc232);
    }

    @Bindable
    public String getPc233() {
        return pc233;
    }

    public void setPc233(String pc233) {
        this.pc233 = pc233;
        notifyPropertyChanged(BR.pc233);
    }

    @Bindable
    public String getPc234() {
        return pc234;
    }

    public void setPc234(String pc234) {
        this.pc234 = pc234;
        notifyPropertyChanged(BR.pc234);
    }

    @Bindable
    public String getPc235() {
        return pc235;
    }

    public void setPc235(String pc235) {
        this.pc235 = pc235;
        notifyPropertyChanged(BR.pc235);
    }

    @Bindable
    public String getPc236() {
        return pc236;
    }

    public void setPc236(String pc236) {
        this.pc236 = pc236;
        notifyPropertyChanged(BR.pc236);
    }

    @Bindable
    public String getPc237() {
        return pc237;
    }

    public void setPc237(String pc237) {
        this.pc237 = pc237;
        notifyPropertyChanged(BR.pc237);
    }

    @Bindable
    public String getPc238() {
        return pc238;
    }

    public void setPc238(String pc238) {
        this.pc238 = pc238;
        notifyPropertyChanged(BR.pc238);
    }

    @Bindable
    public String getPc239() {
        return pc239;
    }

    public void setPc239(String pc239) {
        this.pc239 = pc239;
        notifyPropertyChanged(BR.pc239);
    }

    @Bindable
    public String getPc240() {
        return pc240;
    }

    public void setPc240(String pc240) {
        this.pc240 = pc240;
        notifyPropertyChanged(BR.pc240);
    }

    @Bindable
    public String getPc241() {
        return pc241;
    }

    public void setPc241(String pc241) {
        this.pc241 = pc241;
        notifyPropertyChanged(BR.pc241);
    }

    @Bindable
    public String getPc242() {
        return pc242;
    }

    public void setPc242(String pc242) {
        this.pc242 = pc242;
        notifyPropertyChanged(BR.pc242);
    }

    @Bindable
    public String getPc243() {
        return pc243;
    }

    public void setPc243(String pc243) {
        this.pc243 = pc243;
        notifyPropertyChanged(BR.pc243);
    }

    @Bindable
    public String getPc244() {
        return pc244;
    }

    public void setPc244(String pc244) {
        this.pc244 = pc244;
        notifyPropertyChanged(BR.pc244);
    }

    @Bindable
    public String getPc245() {
        return pc245;
    }

    public void setPc245(String pc245) {
        this.pc245 = pc245;
        notifyPropertyChanged(BR.pc245);
    }

    @Bindable
    public String getPc246() {
        return pc246;
    }

    public void setPc246(String pc246) {
        this.pc246 = pc246;
        notifyPropertyChanged(BR.pc246);
    }

    @Bindable
    public String getPc247() {
        return pc247;
    }

    public void setPc247(String pc247) {
        this.pc247 = pc247;
        notifyPropertyChanged(BR.pc247);
    }

    @Bindable
    public String getPc248() {
        return pc248;
    }

    public void setPc248(String pc248) {
        this.pc248 = pc248;
        notifyPropertyChanged(BR.pc248);
    }

    @Bindable
    public String getPc249() {
        return pc249;
    }

    public void setPc249(String pc249) {
        this.pc249 = pc249;
        notifyPropertyChanged(BR.pc249);
    }

    @Bindable
    public String getPc250() {
        return pc250;
    }

    public void setPc250(String pc250) {
        this.pc250 = pc250;
        notifyPropertyChanged(BR.pc250);
    }

    @Bindable
    public String getPc251() {
        return pc251;
    }

    public void setPc251(String pc251) {
        this.pc251 = pc251;
        notifyPropertyChanged(BR.pc251);
    }

    @Bindable
    public String getPc252() {
        return pc252;
    }

    public void setPc252(String pc252) {
        this.pc252 = pc252;
        notifyPropertyChanged(BR.pc252);
    }

    @Bindable
    public String getPc253() {
        return pc253;
    }

    public void setPc253(String pc253) {
        this.pc253 = pc253;
        notifyPropertyChanged(BR.pc253);
    }

    @Bindable
    public String getPc254() {
        return pc254;
    }

    public void setPc254(String pc254) {
        this.pc254 = pc254;
        notifyPropertyChanged(BR.pc254);
    }

    @Bindable
    public String getPc255() {
        return pc255;
    }

    public void setPc255(String pc255) {
        this.pc255 = pc255;
        notifyPropertyChanged(BR.pc255);
    }

    @Bindable
    public String getPc256() {
        return pc256;
    }

    public void setPc256(String pc256) {
        this.pc256 = pc256;
        notifyPropertyChanged(BR.pc256);
    }

    @Bindable
    public String getPc257() {
        return pc257;
    }

    public void setPc257(String pc257) {
        this.pc257 = pc257;
        notifyPropertyChanged(BR.pc257);
    }

    @Bindable
    public String getPc258() {
        return pc258;
    }

    public void setPc258(String pc258) {
        this.pc258 = pc258;
        notifyPropertyChanged(BR.pc258);
    }

    @Bindable
    public String getPc259() {
        return pc259;
    }

    public void setPc259(String pc259) {
        this.pc259 = pc259;
        notifyPropertyChanged(BR.pc259);
    }

    @Bindable
    public String getPc2961() {
        return pc2961;
    }

    public void setPc2961(String pc2961) {
        this.pc2961 = pc2961;
        notifyPropertyChanged(BR.pc2961);
    }

    @Bindable
    public String getPc2961x() {
        return pc2961x;
    }

    public void setPc2961x(String pc2961x) {
        this.pc2961x = pc2961x;
        notifyPropertyChanged(BR.pc2961x);
    }

    @Bindable
    public String getPc2962() {
        return pc2962;
    }

    public void setPc2962(String pc2962) {
        this.pc2962 = pc2962;
        notifyPropertyChanged(BR.pc2962);
    }

    @Bindable
    public String getPc2962x() {
        return pc2962x;
    }

    public void setPc2962x(String pc2962x) {
        this.pc2962x = pc2962x;
        notifyPropertyChanged(BR.pc2962x);
    }

    @Bindable
    public String getPc2963() {
        return pc2963;
    }

    public void setPc2963(String pc2963) {
        this.pc2963 = pc2963;
        notifyPropertyChanged(BR.pc2963);
    }

    @Bindable
    public String getPc2963x() {
        return pc2963x;
    }

    public void setPc2963x(String pc2963x) {
        this.pc2963x = pc2963x;
        notifyPropertyChanged(BR.pc2963x);
    }

    @Bindable
    public String getPc200nr() {
        return pc200nr;
    }

    public void setPc200nr(String pc200nr) {
        this.pc200nr = pc200nr;
        notifyPropertyChanged(BR.pc200nr);
    }


    public Complaints Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_SYNCED_DATE));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_ISTATUS96x));

        sCOMPHydrate(cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_SCOMP)));

        return this;
    }

    public void sCOMPHydrate(String string) throws JSONException {
        Log.d(TAG, "sCOMPHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.pc200 = json.getString("pc200");
            this.pc201 = json.getString("pc201");
            this.pc202 = json.getString("pc202");
            this.pc203 = json.getString("pc203");
            this.pc204 = json.getString("pc204");
            this.pc205 = json.getString("pc205");
            this.pc206 = json.getString("pc206");
            this.pc207 = json.getString("pc207");
            this.pc208 = json.getString("pc208");
            this.pc209 = json.getString("pc209");
            this.pc210 = json.getString("pc210");
            this.pc211 = json.getString("pc211");
            this.pc212 = json.getString("pc212");
            this.pc213 = json.getString("pc213");
            this.pc214 = json.getString("pc214");
            this.pc215 = json.getString("pc215");
            this.pc216 = json.getString("pc216");
            this.pc217 = json.getString("pc217");
            this.pc218 = json.getString("pc218");
            this.pc219 = json.getString("pc219");
            this.pc220 = json.getString("pc220");
            this.pc221 = json.getString("pc221");
            this.pc222 = json.getString("pc222");
            this.pc223 = json.getString("pc223");
            this.pc224 = json.getString("pc224");
            this.pc225 = json.getString("pc225");
            this.pc226 = json.getString("pc226");
            this.pc227 = json.getString("pc227");
            this.pc228 = json.getString("pc228");
            this.pc229 = json.getString("pc229");
            this.pc230 = json.getString("pc230");
            this.pc231 = json.getString("pc231");
            this.pc232 = json.getString("pc232");
            this.pc233 = json.getString("pc233");
            this.pc234 = json.getString("pc234");
            this.pc235 = json.getString("pc235");
            this.pc236 = json.getString("pc236");
            this.pc237 = json.getString("pc237");
            this.pc238 = json.getString("pc238");
            this.pc239 = json.getString("pc239");
            this.pc240 = json.getString("pc240");
            this.pc241 = json.getString("pc241");
            this.pc242 = json.getString("pc242");
            this.pc243 = json.getString("pc243");
            this.pc244 = json.getString("pc244");
            this.pc245 = json.getString("pc245");
            this.pc246 = json.getString("pc246");
            this.pc247 = json.getString("pc247");
            this.pc248 = json.getString("pc248");
            this.pc249 = json.getString("pc249");
            this.pc250 = json.getString("pc250");
            this.pc251 = json.getString("pc251");
            this.pc252 = json.getString("pc252");
            this.pc253 = json.getString("pc253");
            this.pc254 = json.getString("pc254");
            this.pc255 = json.getString("pc255");
            this.pc256 = json.getString("pc256");
            this.pc257 = json.getString("pc257");
            this.pc258 = json.getString("pc258");
            this.pc259 = json.getString("pc259");
            this.pc2961 = json.getString("pc2961");
            this.pc2961x = json.getString("pc2961x");
            this.pc2962 = json.getString("pc2962");
            this.pc2962x = json.getString("pc2962x");
            this.pc2963 = json.getString("pc2963");
            this.pc2963x = json.getString("pc2963x");
            this.pc200nr = json.getString("pc200nr");

        }
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(COMPLAINTSTable.COLUMN_ID, this.id);
        json.put(COMPLAINTSTable.COLUMN_UID, this.uid);
        json.put(COMPLAINTSTable.COLUMN_USERNAME, this.userName);
        json.put(COMPLAINTSTable.COLUMN_SYSDATE, this.sysDate);
        json.put(COMPLAINTSTable.COLUMN_DEVICEID, this.deviceId);
        json.put(COMPLAINTSTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(COMPLAINTSTable.COLUMN_APPVERSION, this.appver);
        json.put(COMPLAINTSTable.COLUMN_SYNCED, this.synced);
        json.put(COMPLAINTSTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(COMPLAINTSTable.COLUMN_ISTATUS, this.iStatus);
        json.put(COMPLAINTSTable.COLUMN_ISTATUS96x, this.iStatus96x);

        json.put(COMPLAINTSTable.COLUMN_SCOMP, new JSONObject(sCOMPtoString()));
        return json;
    }

    public String sCOMPtoString() throws JSONException {
        Log.d(TAG, "sCOMPtoString: ");
        JSONObject json = new JSONObject();
        json.put("pc200", pc200)
                .put("pc201", pc201)
                .put("pc202", pc202)
                .put("pc203", pc203)
                .put("pc204", pc204)
                .put("pc205", pc205)
                .put("pc206", pc206)
                .put("pc207", pc207)
                .put("pc208", pc208)
                .put("pc209", pc209)
                .put("pc210", pc210)
                .put("pc211", pc211)
                .put("pc212", pc212)
                .put("pc213", pc213)
                .put("pc214", pc214)
                .put("pc215", pc215)
                .put("pc216", pc216)
                .put("pc217", pc217)
                .put("pc218", pc218)
                .put("pc219", pc219)
                .put("pc220", pc220)
                .put("pc221", pc221)
                .put("pc222", pc222)
                .put("pc223", pc223)
                .put("pc224", pc224)
                .put("pc225", pc225)
                .put("pc226", pc226)
                .put("pc227", pc227)
                .put("pc228", pc228)
                .put("pc229", pc229)
                .put("pc230", pc230)
                .put("pc231", pc231)
                .put("pc232", pc232)
                .put("pc233", pc233)
                .put("pc234", pc234)
                .put("pc235", pc235)
                .put("pc236", pc236)
                .put("pc237", pc237)
                .put("pc238", pc238)
                .put("pc239", pc239)
                .put("pc240", pc240)
                .put("pc241", pc241)
                .put("pc242", pc242)
                .put("pc243", pc243)
                .put("pc244", pc244)
                .put("pc245", pc245)
                .put("pc246", pc246)
                .put("pc247", pc247)
                .put("pc248", pc248)
                .put("pc249", pc249)
                .put("pc250", pc250)
                .put("pc251", pc251)
                .put("pc252", pc252)
                .put("pc253", pc253)
                .put("pc254", pc254)
                .put("pc255", pc255)
                .put("pc256", pc256)
                .put("pc257", pc257)
                .put("pc258", pc258)
                .put("pc259", pc259)
                .put("pc2961", pc2961)
                .put("pc2961x", pc2961x)
                .put("pc2962", pc2962)
                .put("pc2962x", pc2962x)
                .put("pc2963", pc2963)
                .put("pc2963x", pc2963x)
                .put("pc200nr", pc200nr);
        return json.toString();
    }

}
