plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
    id 'kotlin-kapt'
    id 'dagger.hilt.android.plugin'
}

android {
    namespace 'com.pathfinder.growth'
    compileSdk 33

    defaultConfig {
        applicationId "com.pathfinder.growth"
        minSdk 24
        targetSdk 33
        versionCode 1
        versionName "0.1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary true
        }
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = '1.8'
    }

    buildFeatures {
        compose true
    }

    composeOptions {
        kotlinCompilerExtensionVersion compose_version
    }

    packagingOptions {
        resources {
            excludes += '/META-INF/{AL2.0,LGPL2.1}'
        }
    }
}

dependencies {
    // Mevcut bağımlılıklar burada olacak, onları silmeyin!

    // Compose
    implementation "androidx.compose.ui:ui:1.4.0"
    implementation "androidx.compose.material3:material3:1.1.0-beta02"
    implementation "androidx.compose.ui:ui-tooling-preview:1.4.0"

    // Navigation
    implementation "androidx.navigation:navigation-compose:2.5.3"

    // Hilt (Dependency Injection)
    implementation "com.google.dagger:hilt-android:2.44"
    kapt "com.google.dagger:hilt-compiler:2.44"

    // Room (Veritabanı)
    implementation "androidx.room:room-runtime:2.5.0"
    implementation "androidx.room:room-ktx:2.5.0"
    kapt "androidx.room:room-compiler:2.5.0"
}
}