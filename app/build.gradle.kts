plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.tarvifai_dashboard_act_02"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.tarvifai_dashboard_act_02"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation("com.intuit.sdp:sdp-android:1.1.1")
    implementation("com.airbnb.android:lottie:5.0.3")
    implementation("com.github.AtifSayings:Animatoo:1.0.1")
    implementation("com.applandeo:material-calendar-view:1.9.0-rc03")
    implementation("com.google.android.material:material:1.5.0")
    implementation("de.hdodenhof:circleimageview:3.1.0")
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}