plugins {
    application
    kotlin("jvm") version "1.3.70"
}

group = "com.github.yunir"
version = "1.0"

application {
    mainClassName = "MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.1.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.1.0")
    implementation("org.jsoup:jsoup:1.10.3")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    test {
        useJUnitPlatform()
    }
    build {
        finalizedBy("unstable")
    }
}

tasks.register("unstable") {
    group = "chance"
    doLast {
        if (Math.random() > 0.5) throw TaskExecutionException(this, Exception("Try again..."))
    }
}

buildscript {
    repositories {
        maven {
            url = uri("/path/to/.m2/repository")
        }
    }
    dependencies {
        classpath("com.yunir:quote-when-fail:1.1")
    }
}
apply(plugin = "com.yunir.quote-when-fail")
