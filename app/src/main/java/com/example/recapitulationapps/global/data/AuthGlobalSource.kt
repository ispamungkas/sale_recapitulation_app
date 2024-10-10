package com.example.recapitulationapps.global.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.recapitulationapps.data.model.LoginResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "auth")

class AuthGlobalSource(private val context: Context) {

    object Auth {
        val unixCode: Preferences.Key<String> = stringPreferencesKey(name = "unixCode")
        val email: Preferences.Key<String> = stringPreferencesKey(name = "email")
    }

    suspend fun saveUserSession(loginResponse: LoginResponse): Flow<Int>{
       return flow {
           context.dataStore.edit { preference ->
               if (loginResponse.unixCode != null && loginResponse.email != null) {
                   preference[Auth.unixCode] = loginResponse.unixCode
                   preference[Auth.email] = loginResponse.email
                   emit(value = 1)
               } else {
                   emit(value = 0)
               }
           }
       }
    }

    suspend fun getUserSession(): Flow<LoginResponse> {
        return flow {
            context.dataStore.data.map { preference ->
                emit(
                    value = LoginResponse(
                        unixCode = preference[Auth.unixCode],
                        email = preference[Auth.email]
                    )
                )
            }
        }
    }

}