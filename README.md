# ModularPractices
Exercise various Modular strategies

### Phone & Tablet Module
```
// navigate to feature module activity
fun onClickBtnPhone() {
        val intent = Intent()
        intent.setClassName("com.ctyeung.phonemodule", "com.ctyeung.phonemodule.MyPhoneModuleActivity")
        startActivity(intent)
    }
```

# References

1. Easy navigation in a multi-module Android project by Gael Marhic, April 7, 2020 \ 
https://proandroiddev.com/easy-navigation-in-a-multi-module-android-project-2374ecbaa0ae
