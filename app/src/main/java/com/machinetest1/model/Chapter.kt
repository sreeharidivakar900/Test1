package com.machinetest1.model

import com.google.gson.annotations.SerializedName

data class Chapter(
    @SerializedName("number" ) var number : Int? = null,
    @SerializedName("verses" ) var verses : Int? = null
)
