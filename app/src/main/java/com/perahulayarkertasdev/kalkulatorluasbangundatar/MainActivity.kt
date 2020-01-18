package com.perahulayarkertasdev.kalkulatorluasbangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.persegi)
        button.setOnClickListener{
            startActivity(Intent(this, LuasPersegi::class.java))
        }
    }
}
