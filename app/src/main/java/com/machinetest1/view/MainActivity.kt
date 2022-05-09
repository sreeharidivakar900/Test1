package com.machinetest1.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmkotlinexample.viewmodel.MainActivityViewModel
import com.machinetest1.R
import com.machinetest1.databinding.ActivityMainBinding
import com.machinetest1.model.Abbrev
import com.machinetest1.model.Verses

class MainActivity : AppCompatActivity() {

    private lateinit var databinding: ActivityMainBinding

    lateinit var mainActivityViewModel: MainActivityViewModel

    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        context = this@MainActivity
        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        databinding.pBar.visibility = View.VISIBLE
        mainActivityViewModel.getBook()?.observe(this, Observer { Book ->

            val bookname = Book.book

            val ver = bookname?.name


            databinding.textView2.text = ver
            databinding.pBar.visibility = View.GONE
            })


    }
}
