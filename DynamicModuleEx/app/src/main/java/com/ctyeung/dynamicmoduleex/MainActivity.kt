package com.ctyeung.dynamicmoduleex

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus

/*
 * https://medium.com/mindorks/dynamic-feature-modules-the-future-4bee124c0f1#:~:text=To%20add%20a%20dynamic%20feature,Feature%20Module%20and%20click%20Next.
 */
class MainActivity : AppCompatActivity() {

    private var mySessionId = 0

    companion object {
        private val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button = findViewById(R.id.btnStart)

        btn.setOnClickListener { v-> startDynamicModule() }
    }

    fun startDynamicModule() {
        val intent = Intent()
        intent.setClassName("com.ctyeung.dynamicmoduleex", "com.ctyeung.dynamicfeature.DynamicActivity")
        startActivity(intent)
    }

//    private fun downloadDynamicModule() {
//        val splitInstallManager = SplitInstallManagerFactory.create(this)
//        val request = SplitInstallRequest
//                .newBuilder()
//                .addModule("dynamic-module")
//                .build()
//        val listener = SplitInstallStateUpdatedListener { splitInstallSessionState ->
//            if (splitInstallSessionState.sessionId() == mySessionId) {
//                when (splitInstallSessionState.status()) {
//                    SplitInstallSessionStatus.INSTALLED -> {
//                        Log.d(MainActivity.TAG, "Dynamic Module downloaded")
//                        Toast.makeText(this@MainActivity, "Dynamic Module downloaded", Toast.LENGTH_SHORT).show()
//                    }
//                }
//            }
//        }
//        splitInstallManager.registerListener(listener)
//        splitInstallManager.startInstall(request)
//                .addOnFailureListener { e -> Log.d(MainActivity.TAG, "Exception: $e") }
//                .addOnSuccessListener { sessionId -> mySessionId = sessionId }
//    }
}