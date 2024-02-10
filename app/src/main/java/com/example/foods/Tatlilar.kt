package com.example.foods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tatlilar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tatlilar)

    }

    override fun onBackPressed() {
         val home_go=Intent(this@Tatlilar,MainActivity::class.java)
        startActivity(home_go)
        finish()
    }
}