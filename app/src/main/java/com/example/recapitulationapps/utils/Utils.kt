package com.example.recapitulationapps.utils

object Utils {
    fun String.isEmailValid(): Boolean {
        val emailRegex = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})"
        return emailRegex.toRegex().matches(this)
    }
    fun String.isPasswordValid(): Boolean {
        val passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$"
        return passwordRegex.toRegex().matches(this)
    }
}