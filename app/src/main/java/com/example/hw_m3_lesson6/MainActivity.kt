package com.example.hw_m3_lesson6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.top_container, TopFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.bottom_container, BottomFragment()).commit()
    }


}