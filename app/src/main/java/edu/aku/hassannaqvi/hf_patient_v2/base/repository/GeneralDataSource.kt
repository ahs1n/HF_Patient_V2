package edu.aku.hassannaqvi.hf_patient_v2.base.repository

import edu.aku.hassannaqvi.hf_patient_v2.models.*
import kotlinx.coroutines.flow.Flow

interface GeneralDataSource {

    /*
    * For login Start
    * */
    suspend fun getLoginInformation(username: String, password: String): Users?
    /*
    * For login End
    * */

    /*
    * For MainActivity Start
    * */
    suspend fun getFormsByDate(date: String): Flow<ArrayList<Form>>

    suspend fun getUploadStatus(): Flow<FormIndicatorsModel>

    suspend fun getFormStatus(date: String): Flow<FormIndicatorsModel>

    suspend fun getFacilitiesFromDB(): ArrayList<HealthFacilities>

    /*
    * For SectionH1 & Identification
    * */
    suspend fun getCampsFromDB(campNo: String, distCode: String): Camps

    suspend fun getUcsByDistrictsFromDB(dCode: String): ArrayList<UCs>

    suspend fun getFacilitiesByUCFromDB(ucCode: String): ArrayList<HealthFacilities>

    suspend fun getFormByDistrictsFromDB(distCode: String, cluster: String, hhno: String): Form
    /*
    * For SectionH1 & Identification End
    * */

}