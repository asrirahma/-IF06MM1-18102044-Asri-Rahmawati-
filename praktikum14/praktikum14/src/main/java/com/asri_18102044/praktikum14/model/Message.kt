package com.asri_18102044.praktikum14.model

import com.google.gson.annotations.SerializedName

data class Message(
    @SerializedName("message")
    var message: String? = null
)
