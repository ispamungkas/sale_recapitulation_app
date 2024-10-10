package com.example.recapitulationapps.utils

sealed class State<T> {
    data object Loading: State<Nothing>()
    data class Error(val message: String): State<Nothing>()
    data class Success<T>(val data: T, val message: String): State<T>()
}