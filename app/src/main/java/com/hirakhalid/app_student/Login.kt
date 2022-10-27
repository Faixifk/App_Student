package com.hirakhalid.app_student

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    private lateinit var btnlogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initViews()
        setListeners()
    }
    private fun initViews(){
        btnlogin=findViewById(R.id.login)
    }
    private fun setListeners(){
        btnlogin.setOnClickListener { startActivity(Intent(this, Home::class.java)) }
    }
}