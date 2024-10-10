package com.example.recapitulationapps.domain.usecase

import com.example.recapitulationapps.data.model.LoginResponse
import com.example.recapitulationapps.utils.State

interface AuthUseCase {
    fun login(email: String, password: String, result: (State<LoginResponse>) -> Unit)
}