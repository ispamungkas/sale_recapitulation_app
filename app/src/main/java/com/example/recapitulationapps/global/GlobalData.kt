package com.example.recapitulationapps.global

import com.example.recapitulationapps.data.model.LoginResponse
import kotlinx.coroutines.flow.Flow

interface GlobalData {

    /**
     * Auth Global Source
     */
    suspend fun getUserSession(): Flow<LoginResponse>
    suspend fun setUserSession(loginResponse: LoginResponse): Flow<Int>
}