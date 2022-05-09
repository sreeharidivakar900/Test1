package com.example.mvvmkotlinexample.model

import com.google.gson.annotations.SerializedName
import com.machinetest1.model.Books
import com.machinetest1.model.Chapter
import com.machinetest1.model.Verses

data class Book (
 //   val bookName: String? = null
    @SerializedName("book"    ) var book    : Books?             = Books(),
    @SerializedName("chapter" ) var chapter : Chapter?          = Chapter(),
    @SerializedName("verses"  ) var verses  : ArrayList<Verses> = arrayListOf()
)
