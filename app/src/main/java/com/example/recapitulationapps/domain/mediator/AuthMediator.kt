package com.example.recapitulationapps.domain.mediator

import com.example.recapitulationapps.data.model.LoginResponse
import com.example.recapitulationapps.domain.repository.AuthRepository
import com.example.recapitulationapps.domain.usecase.AuthUseCase
import com.example.recapitulationapps.utils.State

class AuthMediator(
    private val repository: AuthRepository
): AuthUseCase {
    override fun login(email: String, password: String, result: (State<LoginResponse>) -> Unit) {
        repository.loginFirebase(email = email, password = password, result = result)
    }

}