package com.example.recapitulationapps.domain.repository

import com.example.recapitulationapps.data.model.LoginResponse
import com.example.recapitulationapps.utils.State

interface AuthRepository {
    fun loginFirebase(email: String, password: String, result: (State<LoginResponse>) -> Unit)
}