package com.ctyeung.modularex

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ctyeung.modularex.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPhoneModule.setOnClickListener{ v-> onClickBtnPhone()}
    }

    fun onClickBtnPhone() {
        val intent = Intent()
        intent.setClassName("com.ctyeung.phonemodule", "com.ctyeung.phonemodule.MyPhoneModuleActivity")
        startActivity(intent)
    }
}