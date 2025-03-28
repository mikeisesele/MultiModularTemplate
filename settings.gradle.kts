pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        maven("https://jitpack.io")
        mavenCentral()
    }
}

rootProject.name = "MultiModularTemplate"
include(":app")
include(":core")
include(":core:base")
include(":core:common")
include(":core:securestore")
include(":core:testing")
include(":core:ui")
include(":core:network")
include(":core:di")
include(":core:localdata")
include(":feature")
include(":feature:news")
include(":core:models")
