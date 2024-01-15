rootProject.name = "g1"

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    includeBuild("build-logic")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

// For sub projects, and we have the power  of Kotlin!
// include all projects from ../java folder
val ignoredSubFolders = listOf("gradle", "build")
file("java").listFiles()
        .filter{ it.isDirectory && !it.isHidden && !it.name.startsWith(".") && !ignoredSubFolders.contains(it.name) }
        .forEach {
            include(":${it.name}")
            project(":${it.name}").projectDir = file("../java/${it.name}")
        }
