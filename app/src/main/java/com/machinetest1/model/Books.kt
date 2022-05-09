package com.machinetest1.model

import com.google.gson.annotations.SerializedName

data class Books(
    @SerializedName("abbrev"  ) var abbrev  : Abbrev? = Abbrev(),
    @SerializedName("name"    ) var name    : String? = null,
    @SerializedName("author"  ) var author  : String? = null,
    @SerializedName("group"   ) var group   : String? = null,
    @SerializedName("version" ) var version : String? = null
)
