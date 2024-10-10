package com.example.recapitulationapps.data.repository

import com.example.recapitulationapps.domain.repository.AuthRepository
import com.example.recapitulationapps.utils.State
import com.google.firebase.auth.FirebaseAuth

class AuthRepositoryImpl(
    private val auth: FirebaseAuth
): AuthRepository {
    override fun loginFirebase(email: String, password: String, result: (State<String>) -> Unit) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { value ->
                if (value.isSuccessful) {
                    result.invoke(State.Success(data = "Berhasil Login"))
                }
            }
            .addOnFailureListener { error ->
                result.invoke(State.Error(message = "Something wen't wrong when connecting firebase"))
            }
    }

}