package com.ctyeung.appmodulesex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOpen.setOnClickListener { v -> onClickBtnOpen() }
    }

    fun onClickBtnOpen() {
        val intent = Intent()
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        intent.setClassName("com.ctyeung.appmodulesex", "com.ctyeung.featuremodule.FeatureActivity")
        //val intent = Intent(this, FeatureActivity::class.java)
        applicationContext.startActivity(intent)
    }
}