package com.example.mad_practical_9_22172012007

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity(),AnimationListener{
    lateinit var  TwinAnimation:Animation
    lateinit var logoanimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var logoimg:ImageView = findViewById(R.id.imageView1)
        logoimg.setBackgroundResource(R.drawable.logo_animation)
        logoanimation = logoimg.background as AnimationDrawable
        var tweenanimation = AnimationUtils.loadAnimation(this, R.anim.tween_animation)
        tweenanimation.setAnimationListener(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if(hasFocus)
        {
            logoanimation.start()
        }
        else
        {
            logoanimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {

    }

    override fun onAnimationRepeat(p0: Animation?) {

    }
}