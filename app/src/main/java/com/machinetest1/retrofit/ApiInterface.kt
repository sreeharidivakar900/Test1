package com.example.mvvmkotlinexample.retrofit

import com.example.mvvmkotlinexample.model.Book
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("verses/nvi/sl/23/")
    fun getServices() : Call<Book>

}
