package com.lifedev.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class DaftarKeluargaActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_keluarga)


        val edtnama =findViewById<EditText>(R.id.edt_nama)
        val ButtonSelanjutnya = findViewById<Button>(R.id.btn_selanjutnya)
        ButtonSelanjutnya.setOnClickListener{
            val nama = edtnama.text.toString()
            val intent = Intent(this@DaftarKeluargaActivity,SuksesActivity::class.java)
            intent.putExtra("nama",nama)
            startActivity(intent)

        }
    }


}
