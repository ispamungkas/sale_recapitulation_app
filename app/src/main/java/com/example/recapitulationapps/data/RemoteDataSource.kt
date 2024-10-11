package com.example.recapitulationapps.data

import com.example.recapitulationapps.data.datasource.DataSource
import com.example.recapitulationapps.data.model.LoginResponse
import com.example.recapitulationapps.global.GlobalDataSource

class RemoteDataSource(
    private val dataSource: DataSource,
    private val globalDataSource: GlobalDataSource
) {


    /**
     * Source from Global Data Source
     * -- DataStore Preference
     * */
    suspend fun getUserSession() = globalDataSource.getUserSession()
    suspend fun saveUserSession(loginResponse: LoginResponse) =  globalDataSource.setUserSession(loginResponse = loginResponse)

}