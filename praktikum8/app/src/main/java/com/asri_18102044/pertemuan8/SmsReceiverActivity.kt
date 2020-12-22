package com.asri_18102044.pertemuan8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sms_receiver.*

class SmsReceiverActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_SMS_NO = "extra_sms_no"
        const val EXTRA_SMS_MESSAGE = "extra_sms_message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms_receiver)

        title = getString(R.string.incoming_message)
        val senderNo = intent.getStringExtra(EXTRA_SMS_NO)
        val senderMessage = intent.getStringExtra(EXTRA_SMS_MESSAGE)
        tv_from.text = getString(R.string.coming_from)+": "+senderNo
        tv_message.text = senderMessage
        tv_alert.text = "SMS ini " + senderMessage?.let { checkPenipuan(it) }
        btn_close.setOnClickListener { finish() }
    }

    fun checkPenipuan(message: String): String {
        val blacklist = arrayOf("hadiah", "blogspot", "wordpress", "pulsa", "selamat",
            "transfer", "mobil", "polisi", "rumah")

        var detectedWord = 0
        var listDetectedWord = mutableListOf<String>()
        blacklist.map {
            if (message.contains(it) && !listDetectedWord.contains(it)) {
                listDetectedWord.add(it)
                detectedWord++
            }
        }

        if (detectedWord >= 2) {
            return "Penipuan"
        }
        return "Bukan Penipuan"
    }
}