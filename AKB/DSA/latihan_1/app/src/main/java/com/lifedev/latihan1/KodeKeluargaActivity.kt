package com.lifedev.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class KodeKeluargaActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kode_keluarga)
        val ButtonMasuk: Button = findViewById(R.id.btn_masuk_kode_keluarga)
        ButtonMasuk.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_masuk_kode_keluarga ->{
                val ButtonMasukIntent = Intent(this@KodeKeluargaActivity, DaftarKeluargaActivity::class.java)
                startActivity(ButtonMasukIntent)
            }
        }
    }

}
