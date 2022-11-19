package com.example.hw_m3_lesson6

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private var name : TextView? = null
    private var artist : TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        name = findViewById(R.id.name)
        artist = findViewById(R.id.artist)

        name?.text = intent.getStringExtra(KEY_FOR_NAME)
        artist?.text = intent.getStringExtra(KEY_FOR_ARTIST)


    }



    companion object {
        const val KEY_FOR_NAME : String = "nameKey"
        const val KEY_FOR_ARTIST : String = "artistKey"
    }
}