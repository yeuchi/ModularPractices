# ModularPractices
Exercise various Modular strategies

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
