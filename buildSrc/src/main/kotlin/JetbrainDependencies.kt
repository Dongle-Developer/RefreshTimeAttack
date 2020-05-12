import Versions.JetBrainVersions.COROUTINE_VER
import Versions.KOTLIN
import org.gradle.kotlin.dsl.DependencyHandlerScope

object KotlinDependencies {

    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${KOTLIN}"
    const val KOTLIN_STDLIB_JDK8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${KOTLIN}"
    const val KOTLIN_TEST_JUNIT = "org.jetbrains.kotlin:kotlin-test-junit:${KOTLIN}"
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect:${KOTLIN}"

    const val KOTLINX_COROUTINES_CORE =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${COROUTINE_VER}"
    const val KOTLINX_COROUTINES_ANDROID =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${COROUTINE_VER}"
    const val KOTLINX_COROUTINES_TEST =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${COROUTINE_VER}"

    fun DependencyHandlerScope.jetBrainKotlin() {
        "implementation"(KOTLIN_GRADLE_PLUGIN)
        "implementation"(KOTLIN_STDLIB_JDK8)
    }

    fun DependencyHandlerScope.coroutines() {
        "implementation"(KOTLINX_COROUTINES_CORE)
        "implementation"(KOTLINX_COROUTINES_ANDROID)
        "testImplementation"(KOTLINX_COROUTINES_TEST)
    }
}



