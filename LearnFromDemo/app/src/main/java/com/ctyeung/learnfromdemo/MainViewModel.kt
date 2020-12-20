package com.ctyeung.learnfromdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ctyeung.core.route.FeatureScreenARouteContract
//import com.ctyeung.core.route.FeatureScreenBRouteContract
import org.koin.core.KoinComponent
import org.koin.core.inject

class MainViewModel: ViewModel(), KoinComponent {

    private val featureScreenARoute: FeatureScreenARouteContract by inject()
   // private val featureScreenBRoute: FeatureScreenBRouteContract by inject()
    val featureScreenARouteNavigation = MutableLiveData<FeatureScreenARouteContract>()
//    val featureScreenBRouteNavigation = MutableLiveData<FeatureScreenBRouteContract>()

    fun navigateFeatureScreenAClicked() {
        featureScreenARoute.setup("Han Solo")
        featureScreenARouteNavigation.postValue(featureScreenARoute)
    }

//    fun navigateFeatureScreenBClicked() {
//        featureScreenBRoute.setup("Luke Skywalker")
//        featureScreenBRouteNavigation.postValue(featureScreenBRoute)
//    }
}