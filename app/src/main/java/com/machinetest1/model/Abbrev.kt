package com.machinetest1.model

import com.google.gson.annotations.SerializedName

data class Abbrev(
    @SerializedName("pt" ) var pt : String? = null,
    @SerializedName("en" ) var en : String? = null

)
