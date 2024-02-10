package com.example.foods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Drinks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)

    }
    override fun onBackPressed() {
        val home_go=Intent(this@Drinks,MainActivity::class.java)
        startActivity(home_go)
        finish()

    }
}