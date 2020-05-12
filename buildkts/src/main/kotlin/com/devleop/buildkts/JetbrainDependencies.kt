object KotlinDependencies {
    private const val KOTLIN_VERSION = "1.3.11"
    private const val COROUTINE_VERSION = "1.1.0"

    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${KOTLIN_VERSION}"
    const val KOTLIN_STDLIB_JDK8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${KOTLIN_VERSION}"
    const val KOTLIN_TEST_JUNIT = "org.jetbrains.kotlin:kotlin-test-junit:${KOTLIN_VERSION}"
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect:${KOTLIN_VERSION}"

    const val KOTLINX_COROUTINES_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${COROUTINE_VERSION}"
    const val KOTLINX_COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${COROUTINE_VERSION}"
    const val KOTLINX_COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${COROUTINE_VERSION}"
}
