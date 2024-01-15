tasks.register("exampleTask") {
    val myPropValue = rootProject.findProperty("my.path") ?: "not found"
    println("Property value of my.path: $myPropValue")
}