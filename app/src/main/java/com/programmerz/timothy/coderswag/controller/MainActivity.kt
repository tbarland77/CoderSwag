package com.programmerz.timothy.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.programmerz.timothy.coderswag.R
import com.programmerz.timothy.coderswag.adapters.CategoryAdapter
import com.programmerz.timothy.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter
    }
}
