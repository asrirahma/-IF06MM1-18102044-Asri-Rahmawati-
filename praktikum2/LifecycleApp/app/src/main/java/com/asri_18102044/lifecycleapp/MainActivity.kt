package com.asri_18102044.lifecycleapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPage.setOnClickListener {
            val intent = Intent(this, HalamanDuaActivity::class.java)
            startActivity(intent)
        }
        printState("Asri Rahmawati 18102044")
    }

    fun printState(msg: String) {
        Log.d("ActivityState", msg)
        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        printState("Halaman satu On Start")
    }

    override fun onResume() {
        super.onResume()
        printState("Halaman satu On Resume")
    }

    override fun onPause() {
        super.onPause()
        printState("Halaman satu On Pause")
    }

    override fun onStop() {
        super.onStop()
        printState("Halaman satu On Stop")
    }

    override fun onRestart() {
        super.onRestart()
        printState("Halaman satu On Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        printState("Halaman satu On Destroy")
    }
}