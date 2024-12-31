package io.github.selcukdinc.mywishlistapp.utils

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun getCurrentDate(): String {
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val currentDate = LocalDate.now().format(formatter)
    return currentDate
}