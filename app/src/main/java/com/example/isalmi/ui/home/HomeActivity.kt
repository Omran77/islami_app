package com.example.isalmi.ui.home

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import com.example.isalmi.R
import com.example.isalmi.ui.home.faragments.HadethFragment
import com.example.isalmi.ui.home.faragments.QuranFragment
import com.example.isalmi.ui.home.faragments.RadioFragment
import com.example.isalmi.ui.home.faragments.TasbehFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class HomeActivity : AppCompatActivity() {
    lateinit var bottomNavigationBar:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNavigationBar=findViewById(R.id.bottom_navigation_bar)
        bottomNavigationBar.setOnItemSelectedListener {
            menuItem->
            if(menuItem.itemId==R.id.navigatoin_quran){
                pushFragment(QuranFragment())
            }
            else if (menuItem.itemId==R.id.navigatoin_hadeth){
                pushFragment(HadethFragment())
            } else if (menuItem.itemId==R.id.navigatoin_sebha){
                pushFragment(TasbehFragment())
            }else if (menuItem.itemId==R.id.navigatoin_radio){
                pushFragment(RadioFragment())
            }
        return@setOnItemSelectedListener true
        }
        bottomNavigationBar.selectedItemId=R.id.navigatoin_quran


    }

    private fun pushFragment(fragment:Fragment) {
        supportFragmentManager.
        beginTransaction().
        replace(R.id.fragment_container, fragment) //fragment_container =====>FrameLayout
            .commit()
    }
}

