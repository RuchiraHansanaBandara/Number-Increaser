package com.example.numberinceser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)



        buttonadd.setOnClickListener {
            viewModel.AddingNumber()
            textView.text = viewModel.num.toString()
        }


    }
}