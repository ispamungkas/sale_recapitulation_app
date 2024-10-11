package com.example.recapitulationapps.utils

sealed class State<T>(data: T? = null,message: String? = null) {
    data class Loading<T>(val data : T? = null): State<T>(data = data)
    data class Error<T>(val data : T? = null, val message: String): State<T>(data = data, message = message)
    data class Success<T>(val data : T?, val message: String?): State<T>(data = data, message = message)
}