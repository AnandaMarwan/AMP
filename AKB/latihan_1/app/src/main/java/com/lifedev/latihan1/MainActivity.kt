package com.lifedev.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonMulai: Button = findViewById(R.id.btn_masuk_splash_screen)
        ButtonMulai.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when (v.id){
            R.id.btn_masuk_splash_screen ->{
                val ButtonMulaiIntent = Intent(this@MainActivity, KodeKeluargaActivity::class.java)
                startActivity(ButtonMulaiIntent)
            }
        }

    }
}


/*
*  TANGGAL PENGERJAAN : 7 APRIL 2020
*  WAKTU : 09.00 - 15.00
* " MENGERJAKAN SEMUA CLASS DAN LAYOUT SERTA VALIDASINYA DAN APKNYA.'
*
*
* NIM : 10117157
* NAMA : ANANDA MARWANAYA PUTRA
* KELAS : IF 4
*
* */
