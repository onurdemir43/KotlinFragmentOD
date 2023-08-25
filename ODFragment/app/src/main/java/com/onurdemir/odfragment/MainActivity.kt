package com.onurdemir.odfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun homePage (view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val homePage = BlankFragment()
        fragmentTransaction.replace(R.id.frameLayout,homePage).commit()

    }

    fun profile (view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val profile = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout,profile).commit()

    }

    fun discover (view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val discover = BlankFragment3()
        fragmentTransaction.replace(R.id.frameLayout,discover).commit()

    }

}