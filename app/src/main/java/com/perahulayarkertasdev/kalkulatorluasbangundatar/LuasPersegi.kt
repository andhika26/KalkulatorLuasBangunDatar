package com.perahulayarkertasdev.kalkulatorluasbangundatar

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.graphics.Color

import kotlinx.android.synthetic.main.activity_luas_persegi.*
import kotlinx.android.synthetic.main.content_luas_persegi.*

class LuasPersegi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luas_persegi)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            it.setBackgroundColor(Color.YELLOW)
            val snack = Snackbar.make(it,"Pilih Bangun Datar?",Snackbar.LENGTH_LONG)
            snack.setAction("PILIH", View.OnClickListener {
                // executed when DISMISS is clicked
                startActivity(Intent(this, MainActivity::class.java))
            })
            snack.show()
        }

        btnHitung.setOnClickListener {
            // Null safety if
            if (edtPanjang.text.toString().isEmpty()){
                edtPanjang.error = "Panjang harus di isi"
                // Lalu langsung return atau menghentikan jalannya code, tidak dilanjutkan code berikutnya
                return@setOnClickListener
            }


            // Menggunakan elvis operator ?: "default" agar tidak bernilai null
            // tapi akan memberikan nilai default dari penggunaaan elvis operator
            val panjang = edtPanjang.text.toString().toIntOrNull() ?: 0

            val hasil = panjang * panjang
            txtHasil.text = hasil.toString()
        }
    }



}
