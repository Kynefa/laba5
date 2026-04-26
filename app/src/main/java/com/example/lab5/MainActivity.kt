package com.example.lab5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnAccelerometer).setOnClickListener {
            startActivity(Intent(this, AccelerometerActivity::class.java))
        }

        findViewById<Button>(R.id.btnLight).setOnClickListener {
            startActivity(Intent(this, LightActivity::class.java))
        }

        findViewById<Button>(R.id.btnProximity).setOnClickListener {
            startActivity(Intent(this, ProximityActivity::class.java))
        }
    }
}
