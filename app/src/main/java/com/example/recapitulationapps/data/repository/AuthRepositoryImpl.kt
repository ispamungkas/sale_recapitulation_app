package com.example.recapitulationapps.data.repository

import android.content.Context
import com.example.recapitulationapps.data.RemoteDataSource
import com.example.recapitulationapps.data.model.LoginResponse
import com.example.recapitulationapps.domain.repository.AuthRepository
import com.example.recapitulationapps.utils.State
import com.google.firebase.auth.FirebaseAuth

class AuthRepositoryImpl(
    private val auth: FirebaseAuth,
    private val remoteDataSource: RemoteDataSource
): AuthRepository {

    override fun loginFirebase(
        email: String,
        password: String,
        result: (State<LoginResponse>) -> Unit
    ) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { value ->
                if (value.isSuccessful) {
                    val authResult = value.result
                    authResult.user?.let {
                        val log = LoginResponse(
                            unixCode = it.uid,
                            email = it.email
                        )
                        result.invoke(State.Success(data = log, message = "Login Successfully"))
                    }
                } else {
                    result.invoke(State.Error(message = "Authentication failed, please try again"))
                }
            }
            .addOnFailureListener { error ->
                result.invoke(State.Error(message = "Something wen't wrong, please try again later"))
            }
    }

}