import Versions.NetworkVersions.MOSHI_VER
import Versions.NetworkVersions.OKHTTP3_VER
import Versions.NetworkVersions.KOTSHI_VER
import Versions.NetworkVersions.RETROFIT2_VER
import org.gradle.kotlin.dsl.DependencyHandlerScope

object NetworkDependencies {

    const val MOSHI = "com.squareup.moshi:moshi:$MOSHI_VER"
    const val MOSHI_KOTLIN = "com.squareup.moshi:moshi-kotlin:$MOSHI_VER"

    const val OKHTTP3 = "com.squareup.okhttp3:okhttp:$OKHTTP3_VER"
    const val OKHTTP3_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:$OKHTTP3_VER"
    const val OKHTTP3_MOCK_WEB_SERVER = "com.squareup.okhttp3:mockwebserver:$OKHTTP3_VER"

    const val KOTSHI = "se.ansman.kotshi:api:$KOTSHI_VER"
    const val KOTSHI_COMPILER = "se.ansman.kotshi:compiler:$KOTSHI_VER"

    const val RETROFIT2 = "com.squareup.retrofit2:retrofit:$RETROFIT2_VER"
    const val RETROFIT2_ADAPTER_RXJAVA2 = "com.squareup.retrofit2:adapter-rxjava2:$RETROFIT2_VER"
    const val RETROFIT2_CONVERTER_MOSHI = "com.squareup.retrofit2:converter-moshi:$RETROFIT2_VER"
    const val RETROFIT2_CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:$RETROFIT2_VER"
    const val RETROFIT2_MOCK = "com.squareup.retrofit2:retrofit-mock:$RETROFIT2_VER"

    fun DependencyHandlerScope.retrofit2() {
        "implementation"(RETROFIT2)
        "implementation"(RETROFIT2_ADAPTER_RXJAVA2)
        "implementation"(RETROFIT2_CONVERTER_MOSHI)
        "implementation"(RETROFIT2_CONVERTER_GSON)
        "testImplementation"(RETROFIT2_MOCK)
    }

    fun DependencyHandlerScope.moshi() {
        "implementation"(MOSHI)
        "implementation"(MOSHI_KOTLIN)
    }

    fun DependencyHandlerScope.kotshi() {
        "implementation"(KOTSHI)
        "kapt"(KOTSHI_COMPILER)
    }

    fun DependencyHandlerScope.okhttp3() {
        "implementation"(OKHTTP3)
        "implementation"(OKHTTP3_LOGGING_INTERCEPTOR)
        "testImplementation"(OKHTTP3_MOCK_WEB_SERVER)
    }
}
