import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.DefaultConfig
import org.gradle.api.JavaVersion
import org.gradle.api.Project

fun Project.androidApplicationConfig(
    appId: String,
    appVersionCode: Int = Apps.VERSION_CODE,
    appVersionName: String = Apps.VERSION_NAME
) {
    applyPlugins()
    androidLibraryConfig {
        applicationId = appId
        versionCode = appVersionCode
        versionName = appVersionName
    }
}

fun Project.applyPlugins() {
    plugins.run {
        apply("com.android.application")
        apply("kotlin-android")
        apply("kotlin-android-extensions")
        apply("kotlin-kapt")
    }
}

fun Project.androidLibraryConfig(defaultConfigExtensions: (DefaultConfig.() -> Unit)? = null) {
    android.run {
        compileSdkVersion(Apps.COMPILE_SDK)
        defaultConfig {
            defaultConfigExtensions?.invoke(this)
            minSdkVersion(Apps.MIN_SDK)
            targetSdkVersion(Apps.TARGET_SDK)
            testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
        }
        buildTypes {
            getByName("debug") {
                isMinifyEnabled = false
            }
            getByName("release") {
                isMinifyEnabled = true
                proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
                consumerProguardFiles("consumer-rules.pro")
            }
        }

        sourceSets {
            getByName("main").java.srcDirs("src/main/kotlin")
            getByName("test").java.srcDirs("src/integrationTests/kotlin", "src/unitTests/kotlin")
            getByName("testDebug").java.srcDirs("src/debugUnitTests/kotlin")
            getByName("testRelease").java.srcDirs("src/releaseUnitTests/kotlin")
            getByName("androidTest").java.srcDirs("src/functionalTests/kotlin")
//            main.java.srcDirs += 'src/main/kotlin'
//
//            // Unit tests live in src/unitTest.
//            test.java.srcDir 'src/unitTests/kotlin'
//
//            // Integration tests live in src/integrationTest.
//            test.java.srcDir 'src/integrationTests/kotlin'
//
//            // Unit tests for debug build type specific code live in src/debugUnitTest.
//            testDebug.java.srcDir 'src/debugUnitTests/kotlin'
//
//            // Unit tests for release build type specific code live in src/releaseUnitTest.
//            testRelease.java.srcDir 'src/releaseUnitTests/kotlin'
//
//            // Functional tests live in src/functionalTests.
//            androidTest.java.srcDir 'src/functionalTests/kotlin'
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
    }
}


val Project.android: BaseExtension
    get() = extensions.findByName("android") as? BaseExtension
        ?: error("Project '$name' is not an Android module")