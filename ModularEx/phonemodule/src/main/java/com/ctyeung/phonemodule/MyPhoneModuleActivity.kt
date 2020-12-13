package com.ctyeung.phonemodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_phone_module.*

class MyPhoneModuleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_phone_module)

        btnMain.setOnClickListener { v-> onClickBtnMain() }
    }

    fun onClickBtnMain() {
        val intent = Intent()
        intent.setClassName(this, "com.ctyeung.modularex.MainActivity")
        startActivity(intent)
    }
}
