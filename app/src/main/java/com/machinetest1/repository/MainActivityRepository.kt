package com.example.mvvmkotlinexample.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.mvvmkotlinexample.model.Book
import com.example.mvvmkotlinexample.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object MainActivityRepository {

    val serviceSetterGetter = MutableLiveData<Book>()

    fun getServicesApiCall(): MutableLiveData<Book> {

        val call = RetrofitClient.apiInterface.getServices()

        call.enqueue(object: Callback<Book> {
            override fun onFailure(call: Call<Book>, t: Throwable) {
                // TODO("Not yet implemented")
                Log.v("DEBUG : ", t.message.toString())
            }

            override fun onResponse(
                call: Call<Book>,
                response: Response<Book>
            ) {
                // TODO("Not yet implemented")

                println(response.body().toString())
                val data = response.body()

                val msg = data!!.book

                serviceSetterGetter.value = Book(msg)
            }
        })

        return serviceSetterGetter
    }
}
