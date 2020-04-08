package com.lifedev.latihan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SuksesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sukses)

        val intent = intent
        val nama = intent.getStringExtra("nama")

        val tvSukses = findViewById<TextView>(R.id.tvSukses)
        tvSukses.text = "Beres! Sekarang kamu\n udah bisa ngecek\n penggunaan HP "+nama+"\n tiap hari buat bantu kamu\n ngatur waktu :)"
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()

    }

    override fun onDestroy() {
        super.onDestroy()
        finishAffinity()
    }
}
