

import Versions.GoogleVersions.PLAY_SERVICES_VER
import Versions.GoogleVersions.FIREBASE_VER
import Versions.GoogleVersions.DAGGER_VER
import org.gradle.kotlin.dsl.DependencyHandlerScope

object GoogleDependencies {

    const val GOOGLE_SERVICES = "com.google.gms:google-services:4.0.2"

    const val PLAY_SERVICES_MAPS =
        "com.google.android.gms:play-services-maps:${PLAY_SERVICES_VER}"
    const val PLAY_SERVICES_LOCATION =
        "com.google.android.gms:play-services-location:${PLAY_SERVICES_VER}"
    const val PLAY_SERVICES_AUTH =
        "com.google.android.gms:play-services-auth:${PLAY_SERVICES_VER}"

    const val PLACES = "com.google.android.libraries.places:places:1.1.0"

    const val FIREBASE_CORE = "com.google.firebase:firebase-core:16.0.7"
    const val FIREBASE_INVITES = "com.google.firebase:firebase-invites:${FIREBASE_VER}"
    const val FIREBASE_MESSAGING = "com.google.firebase:firebase-messaging:17.3.4"
    const val FIREBASE_CONFIG = "com.google.firebase:firebase-config:${FIREBASE_VER}"
    const val FIREBASE_AUTH = "com.google.firebase:firebase-auth:${FIREBASE_VER}"
    const val FIREBASE_PREF = "com.google.firebase:firebase-perf:${FIREBASE_VER}"

    const val MATERIAL = "com.google.android.material:material:1.0.0"

    const val DAGGER = "com.google.dagger:dagger:${DAGGER_VER}"
    const val DAGGER_ANDROID = "com.google.dagger:dagger-android:${DAGGER_VER}"
    const val DAGGER_ANDROID_SUPPORT = "com.google.dagger:dagger-android-support:${DAGGER_VER}"
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:${DAGGER_VER}"
    const val DAGGER_ANDROID_PROCESSOR =
        "com.google.dagger:dagger-android-processor:${DAGGER_VER}"

    fun DependencyHandlerScope.googleServices() {
        "implementation"(GOOGLE_SERVICES)
        "implementation"(PLAY_SERVICES_MAPS)
        "implementation"(PLAY_SERVICES_LOCATION)
        "implementation"(PLAY_SERVICES_AUTH)
        "implementation"(PLACES)
    }

    fun DependencyHandlerScope.dagger() {
        "implementation"(DAGGER)
        "implementation"(DAGGER_ANDROID)
        "implementation"(DAGGER_ANDROID_SUPPORT)
        "kapt"(DAGGER_COMPILER)
        "kapt"(DAGGER_ANDROID_PROCESSOR)
    }

    fun DependencyHandlerScope.fireBase() {
        "implementation"(FIREBASE_CORE)
        "implementation"(FIREBASE_INVITES)
        "implementation"(FIREBASE_MESSAGING)
        "implementation"(FIREBASE_CONFIG)
        "implementation"(FIREBASE_AUTH)
        "implementation"(FIREBASE_PREF)
    }
}
