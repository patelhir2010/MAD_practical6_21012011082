package com.example.mad_practical6_21012011082

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPlay: FloatingActionButton = findViewById(R.id.play_button)
        buttonPlay.setOnClickListener {
            playPause()
        }

        val buttonStop: FloatingActionButton = findViewById(R.id.stop_button)
        buttonStop.setOnClickListener {
            stop()
        }
    }

    fun playPause() {
        Intent(applicationContext, MyService::class.java).putExtra(
            MyService.PLAYERKEY,
            MyService.PLAYERVALUE
        ).apply { startService(this) }
    }

    fun stop() {
        Intent(applicationContext, MyService::class.java).putExtra(
            MyService.PLAYERKEY,
            MyService.PLAYERVALUE
        ).apply { stopService(this) }
    }
}
