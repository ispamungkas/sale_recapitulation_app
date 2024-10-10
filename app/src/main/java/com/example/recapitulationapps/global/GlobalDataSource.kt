package com.example.recapitulationapps.global

import com.example.recapitulationapps.data.model.LoginResponse
import com.example.recapitulationapps.global.data.AuthGlobalSource
import kotlinx.coroutines.flow.Flow

class GlobalDataSource(
    private val authGlobalSource: AuthGlobalSource
): GlobalData{
    override suspend fun getUserSession(): Flow<LoginResponse> {
        return authGlobalSource.getUserSession()
    }

    override suspend fun setUserSession(loginResponse: LoginResponse): Flow<Int> {
        return authGlobalSource.saveUserSession(loginResponse = loginResponse)
    }
}