package com.hirakhalid.app_student

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Home : AppCompatActivity() {
    private lateinit var clickProfile: ImageView
    private lateinit var clickResult: ImageView
    private lateinit var clickAttendance: ImageView
    private lateinit var clickCourse: ImageView
    private lateinit var clickBooks: ImageView
    private lateinit var clickAnnouncement: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initViews()
        setListeners()

    }
    private fun initViews(){
        clickProfile=findViewById(R.id.box_profile)
        clickResult=findViewById(R.id.box_result)
        clickAttendance=findViewById(R.id.box_attendance)
        clickCourse=findViewById(R.id.box_course)
        clickBooks=findViewById(R.id.box_books)
        clickAnnouncement=findViewById(R.id.box_announcement)
    }
    private fun setListeners(){
        clickProfile.setOnClickListener { startActivity(Intent(this, Profile::class.java)) }
        clickResult.setOnClickListener { startActivity(Intent(this, Result::class.java)) }
        clickAttendance.setOnClickListener { startActivity(Intent(this, Attendance::class.java)) }
        clickCourse.setOnClickListener { startActivity(Intent(this, Course::class.java)) }
        clickBooks.setOnClickListener { startActivity(Intent(this, Books::class.java)) }
        clickAnnouncement.setOnClickListener { startActivity(Intent(this, Announcement::class.java)) }

    }
}