package com.example.numberinceser

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var num = 0;

    fun AddingNumber(){
        num++
    }
}