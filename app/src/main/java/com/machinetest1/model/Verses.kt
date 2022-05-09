package com.machinetest1.model

import com.google.gson.annotations.SerializedName

data class Verses(
    @SerializedName("number" ) var number : Int?    = null,
    @SerializedName("text"   ) var text   : String? = null

)
