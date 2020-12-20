# ModularPractices
Exercise various Modular strategies. \
In Udacity 'Build-it-Bigger'<sup>[7]</sup> project, I learned to build library and Google-Cloud-End-Point (GCE) for modular Android development.
Below are 2020 common methods: aar, split-apk, etc.

### Android Dynamic Module (split-apk)
<img width="200" src="https://user-images.githubusercontent.com/1282659/102719813-df6e6580-42b5-11eb-88c4-549668efe1b4.png"> <img width="200" src="https://user-images.githubusercontent.com/1282659/102719811-dd0c0b80-42b5-11eb-8aa1-d0f6f51d5379.png"> 

Deepanshu <sup>[6]</sup> provides a excellent simple demonstration of dynamic module or split-apk. \
There are two modules: app -> dynamicfeature both producing apk artifacts. \
To navigate to an activity not defined in app manifest, we have to define intent with explicity package name path.

````
fun startDynamicModule() {
    val intent = Intent()
    intent.setClassName("com.ctyeung.dynamicmoduleex", "com.ctyeung.dynamicfeature.DynamicActivity")
    startActivity(intent)
}
````

For Android API 19 or older, multiple apks are merged into one at install-time. \
<img width="400" src="https://user-images.githubusercontent.com/1282659/102719819-e2695600-42b5-11eb-9de1-f810d5f3157a.png">

### Android Library (aar)

A feature module (UI content) can encapsulated in an Android Library for static build. \
Mr. Can Uludağ <sup>[5]</sup> provides an excellent demo with the following make-up.

application -> FeatureModuleA -> core \
<img width="200" src="https://user-images.githubusercontent.com/1282659/102717623-1f7b1b80-42a9-11eb-8caf-9f26437e0a16.png"> <img width="200" src="https://user-images.githubusercontent.com/1282659/102717624-2013b200-42a9-11eb-974e-5d33021bc73c.png">

##### Application 
This is a basic phone app with 1 activity / viewmodel and Koin for dependency injection. \
There is a notable consolidation of common dependencies by reference of FeatureModuleA.

````
dependencies {
    implementation project(':FeatureModuleA')
}
````

##### FeatureModuleA
This is a great demonstration of 'feature' modularization.\
One activity / viewmodel / layout is encapsulated. \
Again, there is a consolidation of common dependencies by reference of core. 

````
dependencies {
    implementation project(':core')
}
````

NOTE: activity must be defined in manifest to be resolvable.

````
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.ctyeung.featuremodulea">
    <application>
        <activity android:name=".FeatureScreenAActivity"></activity>
    </application>
</manifest>
````

##### core
Common dependencies are provided in this library. \
I am surprise to find FeatureScreenARouteContract here as well.


### Phone & Tablet Module

ModularEx Project using Gradle plugin, Quadrant <sup>[1]</sup> so there is no module dependencies. \
<img width="200" src="https://user-images.githubusercontent.com/1282659/102001388-76845d80-3cb7-11eb-8406-6646d3b0325a.png">
 
Fully qualified path is required to define the activity.

```
// navigate to feature module activity
fun onClickBtnPhone() {
        val intent = Intent()
        intent.setClassName("com.ctyeung.phonemodule", "com.ctyeung.phonemodule.MyPhoneModuleActivity")
        startActivity(intent)
    }
```
<img width="200" src="https://user-images.githubusercontent.com/1282659/102001391-78e6b780-3cb7-11eb-8847-2b5068bfe811.png"> <img width="200" src="https://user-images.githubusercontent.com/1282659/102001393-7a17e480-3cb7-11eb-9403-311ff3c357ac.png">

# Android Studio

<img width="467" alt="Screen Shot 2020-12-12 at 8 24 54 PM" src="https://user-images.githubusercontent.com/1282659/102001490-7042b100-3cb8-11eb-8512-b2536c637f15.png">


# References

1. Easy navigation in a multi-module Android project by Gael Marhic, April 7, 2020 \
https://proandroiddev.com/easy-navigation-in-a-multi-module-android-project-2374ecbaa0ae

2. Gradle Dependency Management: Using Gradle Extra Properties (ext), Sam Edwards (manage common dependencies in modules) \
https://handstandsam.com/2018/02/11/kotlin-buildsrc-for-better-gradle-dependency-management/

3. Gradle Build Experiment by Nikita Kozlov \
https://github.com/NikitaKozlov/GradleBuildExperiment/tree/3+1modules

4. Overview of play feature delivery - android developer \
https://developer.android.com/guide/app-bundle/play-feature-delivery

5. Another Navigation in Android Multi Module Architecture by Can Uludağ, April 19, 2020 \
https://medium.com/swlh/another-navigation-in-multi-module-architecture-1d4945c1fed0

6. Android Dynamic Feature Modules : The Future by Deepanshu, September 3, 2018 \
https://medium.com/mindorks/dynamic-feature-modules-the-future-4bee124c0f1#:~:text=To%20add%20a%20dynamic%20feature,Feature%20Module%20and%20click%20Next.

7. Udacity Build-It-Bigger project by Chi Yeung, May 28, 2018 \ 
https://github.com/yeuchi/BuildItBigger
