plugins {
    kotlin("jvm") version "1.9.23"
    `maven-publish`
    id("org.jetbrains.kotlinx.dataframe") version "0.13.1"
}

group = "net.nashat"
version = "1.0"

repositories {
    mavenCentral()
    mavenLocal()
    maven("https://packages.jetbrains.team/maven/p/kds/kotlin-ds-maven")
}

dependencies {
    implementation("org.apache.commons:commons-math3:3.6.1")
    implementation("org.jetbrains.kotlinx:dataframe:0.13.1")
    implementation("org.jetbrains.kotlinx:kotlin-statistics-jvm:0.4.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            artifactId = "ideal-pubsub"
        }
    }
}