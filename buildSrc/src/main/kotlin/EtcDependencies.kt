import org.gradle.kotlin.dsl.DependencyHandlerScope

object EtcDependencies {
    const val TIMBER = "com.jakewharton.timber:timber:${Versions.EtcVersion.TIMBER_VER}"

    const val GLIDE = "com.github.bumptech.glide:glide:${Versions.EtcVersion.GLIDE_VER}"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${Versions.EtcVersion.GLIDE_VER}"

    const val STETHO = "com.facebook.stetho:stetho:${Versions.EtcVersion.STETHO_VER}"
    const val STETHO_OKHTTP3 =
        "com.facebook.stetho:stetho-okhttp3:${Versions.EtcVersion.STETHO_VER}"


    const val JUNIT = "junit:junit:${Versions.EtcVersion.JUNUIT_VER}"
    const val MOCKITO = "org.mockito:mockito-core:${Versions.EtcVersion.MOCKITO_VER}"
    const val HAMCREST = "org.hamcrest:hamcrest-all:${Versions.EtcVersion.HAMCREST_VER}"

    fun DependencyHandlerScope.timber() {
        "implementation"(TIMBER)
    }

    fun DependencyHandlerScope.glide() {
        "implementation"(GLIDE)
        "kapt"(GLIDE_COMPILER)
    }

    fun DependencyHandlerScope.stetho() {
        "implementation"(STETHO)
        "implementation"(STETHO_OKHTTP3)
    }

    fun DependencyHandlerScope.testEtc() {
        "testImplementation"(JUNIT)
        "testImplementation"(MOCKITO)
        "testImplementation"(HAMCREST)
    }
}