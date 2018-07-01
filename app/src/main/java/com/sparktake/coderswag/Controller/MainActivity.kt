package com.sparktake.coderswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sparktake.coderswag.Adapters.CategoryAdapter
import com.sparktake.coderswag.R
import com.sparktake.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter


//        categoryListView.setOnItemClickListener { adapterView, view, i, l ->
//            val category = DataService.categories[i]
//            Toast.makeText(this, "You clicked ont the ${category.title} cell", Toast.LENGTH_LONG).show()
//        }
    }
}



















































