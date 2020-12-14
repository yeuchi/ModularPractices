package com.ctyeung.featuremodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FeatureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)
        val btn:Button = findViewById(R.id.btnOpen)
        btn.setOnClickListener { v -> onClickOpenMain() }
    }

    fun onClickOpenMain() {
        val intent = Intent()
        intent.setClassName("com.ctyeung.appmodulesex", "com.ctyeung.appmodulesex.MainActivity")
        startActivity(intent)
    }
}
