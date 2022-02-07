// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        maven {
            setUrl("https://maven.aliyun.com/repository/central/")
        }
        google()
        mavenCentral()

        repositories {
            maven { url = uri("./repository/") }
        }
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("jiagu:jiagu-plugin:1.0")
    }
}
allprojects {
    repositories {
        maven { setUrl("https://maven.aliyun.com/repository/central/") }
        google()
    }
}
