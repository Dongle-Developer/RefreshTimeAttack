
import org.gradle.kotlin.dsl.DependencyHandlerScope

object ProjectDependencies {
    const val GRADLE_TOOLS = "com.android.tools.build:gradle:${Versions.GRADLE}"
    const val GRADLE_API = "com.android.tools.build:gradle-api:${Versions.GRADLE}"

    fun DependencyHandlerScope.buildSrcGradle() {
        "implementation"(GRADLE_TOOLS)
        "implementation"(GRADLE_API)
    }
}