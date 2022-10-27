package com.hirakhalid.app_student

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        setListeners()

    }
    private fun initViews(){
        btnLogin=findViewById(R.id.login)
    }
    private fun setListeners(){
        btnLogin.setOnClickListener { startActivity(Intent(this, Login::class.java)) }
    }
}