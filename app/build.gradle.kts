
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.melapelo.mihon"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.melapelo.mihon"
        minSdk = 23
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
    }
}
