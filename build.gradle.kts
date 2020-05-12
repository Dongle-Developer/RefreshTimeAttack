buildscript {

    repositories {
        google()
        jcenter()
        maven("https://jitpack.io")
    }

    dependencies {
        classpath(ProjectDependencies.GRADLE_TOOLS)
        classpath(kotlin("gradle-plugin", version = Versions.KOTLIN))
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
