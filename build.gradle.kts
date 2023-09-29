buildscript {
    repositories {
        maven("https://repo.maven.apache.org/maven2/")
        google() // Direct URL is not supported by F-Droid
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.1.2")
        classpath(kotlin("gradle-plugin", version = "1.8.20"))
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
        classpath("com.squareup.sqldelight:gradle-plugin:1.5.4")
    }
}

allprojects {
    repositories {
        maven("https://repo.maven.apache.org/maven2/")
        google() // Direct URL is not supported by F-Droid
        maven("https://jitpack.io")
    }
}

task("clean") {
    delete(rootProject.buildDir)
}
