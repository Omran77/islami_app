package com.example.isalmi.ui.splash

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.window.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.isalmi.R
import com.example.isalmi.ui.home.HomeActivity

class SplashActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_Isalmi)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper())
            .postDelayed(Runnable {
                startHomeActivity()
        }
            ,2000)

    }
    fun startHomeActivity(){
        val intent=Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}