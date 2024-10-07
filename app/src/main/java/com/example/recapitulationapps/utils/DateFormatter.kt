package com.example.recapitulationapps.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object DateFormatter {

    private const val pattern = "yyyy-MM-dd"

    fun dateStringToMillis(date: String): Long {
        val simpleDateFormat = SimpleDateFormat(pattern, Locale.getDefault())
        return simpleDateFormat.parse(date)?.time ?: 0L
    }

    fun millisToDateString(millis: Long): String {
        val simpleDateFormat = SimpleDateFormat(pattern, Locale.getDefault())
            .format(millis)
        return simpleDateFormat
    }

    fun currentDate(): String {
        val date = Date()
        val formatter = SimpleDateFormat(pattern, Locale.getDefault())
        return formatter.format(date)
    }

}