package com.ctyeung.learnfromdemo

import android.app.Application
import com.ctyeung.learnfromdemo.di.routeModule
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(routeModule)
        }
    }
}