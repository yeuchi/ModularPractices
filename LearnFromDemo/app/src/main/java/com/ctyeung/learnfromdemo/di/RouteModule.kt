package com.ctyeung.learnfromdemo.di

import com.ctyeung.core.route.FeatureScreenARouteContract
//import com.ctyeung.core.route.FeatureScreenBRouteContract
import com.ctyeung.featuremodulea.FeatureScreenARoute
//import com.ctyeung.featuremoduleb.FeatureScreenBRoute
import org.koin.dsl.module

val routeModule = module {
    factory<FeatureScreenARouteContract> { FeatureScreenARoute() }
    //factory<FeatureScreenBRouteContract> { FeatureScreenBRoute() }
}