package com.example.recapitulationapps.utils

sealed class Result<T>(message: T? = null, data: T? = null) {
    class Loading<T>() : Result<Nothing>()
    class Error<T>(message: T) : Result<T>(message = message)
    class Success<T>(data: T, message: T) : Result<T>(data = data, message = message)
}