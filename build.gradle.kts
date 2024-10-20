plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // Spring Boot Starters
    implementation("org.springframework.boot:spring-boot-starter:3.3.4")
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.4")
    implementation("org.springframework.boot:spring-boot-configuration-processor:3.3.0")
    implementation("org.springframework.boot:spring-boot-starter-actuator:3.3.4")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.3.4")
    implementation("org.springframework.boot:spring-boot-starter-validation:3.3.4")
    implementation("org.springframework.boot:spring-boot-starter-logging:3.3.4")
    implementation("org.springframework.boot:spring-boot-starter-security:3.3.4")

    // Reactor
    implementation("io.projectreactor:reactor-core:3.6.10")

    // Ktor
    implementation("io.ktor:ktor-client-core:2.3.12")
    implementation("io.ktor:ktor-client-cio-jvm:2.3.12")
    implementation("io.ktor:ktor-client-serialization:2.3.12")

    // Kotlin Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.7.3")

    // Lombok
    compileOnly("org.projectlombok:lombok:1.18.24")

    // Testing Dependencies
    implementation("org.springframework.boot:spring-boot-starter:3.3.4")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.3.4")
    testImplementation("org.mockito:mockito-core:5.2.0")
    testImplementation("org.assertj:assertj-core:3.24.2")
    testImplementation("org.testng:testng:7.10.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.8.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}