package com.example.mad_practical_9_22172012007

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmAnimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alarmimage = findViewById<ImageView>(R.id.alarm1)
        alarmimage.setImageResource(R.drawable.alarm_animation_list)
        alarmAnimation = alarmimage.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus)
        {
            alarmAnimation.start()
        }
        else
        {
            alarmAnimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }
}