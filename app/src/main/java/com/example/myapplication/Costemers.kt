package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Costemers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_costemers)
    }
    fun animals(view: View){
        val intent= Intent(applicationContext,Animals::class.java)
        startActivity(intent)

    }
    fun baits(view: View){
        val intent=Intent(applicationContext,Baits::class.java)
        startActivity(intent)
    }
}