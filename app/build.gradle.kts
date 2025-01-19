plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "hr.ferit.fabiomandic.bmwinfoorwim"
    compileSdk = 35

    defaultConfig {
        applicationId = "hr.ferit.fabiomandic.bmwinfoorwim"
        minSdk = 24
        targetSdk = 34
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
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.get() // Koristi verziju Compose-a iz libs.versions.toml
    }
}

dependencies {
    // Osnovne Android ovisnosti
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // Jetpack Compose osnovne ovisnosti
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.compose.runtime.livedata)
    implementation(libs.androidx.compose.material) // Stari Material dizajn (ako ga koristite)
    implementation(libs.androidx.compose.material3) // Novi Material3 dizajn
    implementation(libs.androidx.compose.tooling.preview)

    // Dodajte ovisnost za material-icons-extended
    implementation("androidx.compose.material:material-icons-extended:1.4.0") // Provjerite verziju Compose-a koju koristite

    // Alati za testiranje i debugging
    debugImplementation(libs.androidx.compose.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Dodatne Android ovisnosti
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.recyclerview)

    // Testiranje
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.ui.test.junit4)
}
