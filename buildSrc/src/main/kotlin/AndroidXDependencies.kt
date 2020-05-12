import Versions.AndroidXVersion.LIFECYCLE_VER
import Versions.AndroidXVersion.PAGING_VER
import Versions.AndroidXVersion.ROOM_VER
import Versions.AndroidXVersion.ESPRESSO_VER
import org.gradle.kotlin.dsl.DependencyHandlerScope

object AndroidXDependencies {

    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMMPAT}"

    const val CORE_KTX = "androidx.core:core-ktx:1.2.0"

    const val MULTIDEX = "androidx.multidex:multidex:2.0.1"

    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:1.1.0"

    const val ANNOTATION = "androidx.annotation:annotation:1.0.2"

    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.0.0-beta5"

    const val LIFECYCLE_EXTENSION = "androidx.lifecycle:lifecycle-extensions:$LIFECYCLE_VER"
    const val LIFECYCLE_COMPILER = "androidx.lifecycle:lifecycle-compiler:$LIFECYCLE_VER"

    const val PAGING_RUNTIME = "androidx.paging:paging-runtime:$PAGING_VER"
    const val PAGING_KTX = "androidx.paging:paging-runtime-ktx:$PAGING_VER"

    const val ROOM_RUNTIME = "androidx.room:room-runtime:$ROOM_VER"
    const val ROOM_COMPILER = "androidx.room:room-compiler:$ROOM_VER"
    const val ROOM_RXJAVA2 = "androidx.room:room-rxjava2:$ROOM_VER"

    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:$ESPRESSO_VER"
    const val ESPRESSO_INTENTS = "androidx.test.espresso:espresso-intents:$ESPRESSO_VER"
    const val ESPRESSO_CONTRIB = "androidx.test.espresso:espresso-contrib:$ESPRESSO_VER"
    const val ESPRESSO_IDLING_CONCURRENT =
        "androidx.test.espresso.idling:idling-concurrent:$ESPRESSO_VER"
    const val ESPRESSO_IDLING_RESOURCE =
        "androidx.test.espresso:espresso-idling-resource:$ESPRESSO_VER"

    const val ARCH_CORE_TESTING = "androidx.arch.core:core-testing:2.1.0"
    const val TEST_RULES = "androidx.test:rules:1.2.0"

    fun DependencyHandlerScope.androidx() {
        "implementation"(APPCOMPAT)
        "implementation"(CORE_KTX)
        "implementation"(MULTIDEX)
        "implementation"(FRAGMENT_KTX)
        "implementation"(ANNOTATION)
        "implementation"(CONSTRAINT_LAYOUT)
        "implementation"(LIFECYCLE_EXTENSION)
        "kapt"(LIFECYCLE_COMPILER)
        "implementation"(PAGING_RUNTIME)
        "implementation"(PAGING_KTX)
        "implementation"(ROOM_RUNTIME)
        "implementation"(ROOM_RXJAVA2)
        "kapt"(ROOM_COMPILER)
    }


    fun DependencyHandlerScope.androidxTest() {
        "testImplementation"(ESPRESSO_CORE)
        "testImplementation"(ESPRESSO_INTENTS)
        "testImplementation"(ESPRESSO_CONTRIB)
        "testImplementation"(ESPRESSO_IDLING_CONCURRENT)
        "testImplementation"(ESPRESSO_IDLING_RESOURCE)
        "testImplementation"(ARCH_CORE_TESTING)
        "testImplementation"(TEST_RULES)
    }
}
