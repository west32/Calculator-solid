plugins {
    id("java")
}

group = "io.bartek.cat"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation ("org.mockito:mockito-core:4.6.1")
}

tasks.test {
    useJUnitPlatform()
}