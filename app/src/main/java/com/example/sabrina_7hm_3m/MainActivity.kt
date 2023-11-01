package com.example.sabrina_7hm_3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.main_container, MainFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.music_container, MusicFragment()).commit()

    }
}