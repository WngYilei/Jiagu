plugins {
    `kotlin-dsl`
    id("java")
    id("java-library")
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    maven { setUrl("https://maven.aliyun.com/repository/central/") }
    google()
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
    implementation("com.android.tools.build:gradle:7.0.2")
}


group = "jiagu"
version = "1.0"
publishing {
    repositories {
        maven(url = "../repository")
    }
}


gradlePlugin{
    plugins {
        register("jiaguPlugin") {
            id = "jiagu-plugin"
            implementationClass = "jiagu.JiaguPlugin"
        }
    }
}