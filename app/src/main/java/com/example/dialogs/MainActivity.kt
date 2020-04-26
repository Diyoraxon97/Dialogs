package com.example.dialogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            val dialog=SimpleAlertDialog(this)
            dialog.show()
        }
        button2.setOnClickListener {
            val dialog=AlertDialogSingleChoice(this)
            dialog.show()
        }
    }
}
