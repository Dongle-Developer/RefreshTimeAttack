import org.gradle.kotlin.dsl.DependencyHandlerScope

object RxDependencies {
    const val RX_JAVA = "io.reactivex.rxjava3:rxjava:${Versions.RxVersion.RX_JAVA_VER}"
    const val RX_KOTLIN = "io.reactivex.rxjava3:rxkotlin:${Versions.RxVersion.RX_KOTLIN_VER}"
    const val RX_ANDROID = "io.reactivex.rxjava3:rxandroid:${Versions.RxVersion.RX_ANDROID_VER}"
    const val RX_BINDING = "com.jakewharton.rxbinding3:rxbinding:${Versions.RxVersion.RX_BINDING_VER}"

    fun DependencyHandlerScope.rxJava() {
        "implementation"(RX_JAVA)
        "implementation"(RX_KOTLIN)
        "implementation"(RX_ANDROID)
        "implementation"(RX_BINDING)
    }
}