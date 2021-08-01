package com.example.test1

import android.net.Uri
import java.io.Serializable

data class Freak(
    val firstName: String,
    val lastName: String,
    val role: String,
    val norm: String,
    val level: String,
    val description: String,
    val image: String,
    val skills: List<String>,
    val projects: List<String>
):Serializable



