package com.example.foods

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var ButtonTatli: Button
    private lateinit var buttonTuzlu: Button
    private lateinit var buttondrink: Button
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = getPreferences(MODE_PRIVATE)

        // Hoşgeldiniz mesajını göster - Eğer daha önce gösterilmişse gösterme
        if (!sharedPreferences.getBoolean("isWelcomeMessageShown", false)) {
            Toast.makeText(this, "Hoşgeldiniz :)", Toast.LENGTH_SHORT).show()

            // SharedPreferences'a kaydet
            with(sharedPreferences.edit()) {
                putBoolean("isWelcomeMessageShown", true)
                apply()
            }
        }
        println("deneme")

        ButtonTatli = findViewById(R.id.ButtonTatli)
        buttonTuzlu = findViewById(R.id.buttonTuzlu)
        buttondrink = findViewById(R.id.buttondrink)

        ButtonTatli.setOnClickListener {
            val sugargo = Intent(this@MainActivity, Tatlilar::class.java)
            startActivity(sugargo)
        }

        buttonTuzlu.setOnClickListener {
            val saltgo = Intent(this@MainActivity, Tuzlular::class.java)
            startActivity(saltgo)
        }

        buttondrink.setOnClickListener {
            val drinkgo = Intent(this@MainActivity, Drinks::class.java)
            startActivity(drinkgo)
        }
    }

    override fun onBackPressed() {
       finish()
    }
}
