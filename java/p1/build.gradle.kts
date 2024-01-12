/**
 * Three things to consider in build.gradle files:
 *   1. setup plugins
 *   2. config plugin extension
 *   3. specify dependencies
 *      dependencies can be external, sub-projects, or binary repos
 *
 *  Build file should not contain too many Kotlin files, use plugins to write Kotlin scripts
 */

// Define plugins
plugins {
    java
    application
}

dependencies {
}

application {
    // Define the main class for the application.
    mainClass.set("com.p1.P1")
}