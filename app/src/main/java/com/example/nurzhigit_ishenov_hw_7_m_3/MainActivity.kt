package com.example.nurzhigit_ishenov_hw_7_m_3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.container_current_song, CurrentSongFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_songs, SongsFragment()).commit()
    }
}