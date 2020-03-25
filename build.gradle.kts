plugins {
    application
    kotlin("jvm") version "1.3.70"
}

group = "com.github.yunir"
version = "0.1"

application {
    mainClassName = "MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}