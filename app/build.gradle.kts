plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
    id 'org.jmailen.kotlinter'
}

android {
    compileSdk 33

    defaultConfig {
        applicationId "vegabobo.dsusideloader"
        minSdk 29
        targetSdk 33
        versionCode 4
        versionName "1.03"
        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled true
            shrinkResources true
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
}
dependencies {
    implementation 'org.tukaani:xz:1.9'
    implementation 'com.github.topjohnwu.libsu:core:5.0.1'
    implementation 'androidx.core:core-ktx:1.8.0'
    implementation 'androidx.appcompat:appcompat:1.4.2'
    implementation 'androidx.fragment:fragment-ktx:1.4.1'
    implementation 'androidx.preference:preference-ktx:1.2.0'
    implementation 'com.google.android.material:material:1.6.1'
}

// remove this line to disable ktlint
preBuild.dependsOn(lintKotlin)
lintKotlin.dependsOn(formatKotlin)