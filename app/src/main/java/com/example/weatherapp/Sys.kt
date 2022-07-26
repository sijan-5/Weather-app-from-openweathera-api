package com.example.weatherapp

import java.io.Serializable

data class Sys (
    val type: Int,
    val country: String,
    val sunrise : Long,
    val sunset : Long
        ) :Serializable