package com.example.favouriteplaces.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.favouriteplaces.MainActivity
import com.example.favouriteplaces.R
import android.animation.ObjectAnimator
import android.view.View
import android.widget.TextView

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private val SPLASH_DELAY: Long = 2000 // 2 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        val appNameText = findViewById<TextView>(R.id.appNameText)
        ObjectAnimator.ofFloat(appNameText, View.ALPHA, 0f, 1f).apply {
            duration = 1000
            start()
        }


        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_DELAY)
    }
}
