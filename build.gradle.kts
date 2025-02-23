plugins {
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25"
    id("org.springframework.boot") version "3.3.5"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "org.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("com.linecorp.armeria:armeria-bom:1.26.0"))
    implementation("com.linecorp.armeria:armeria")
    implementation("com.linecorp.armeria:armeria-grpc")
    implementation("com.linecorp.armeria:armeria-spring-boot3-starter")
    implementation("com.linecorp.armeria:armeria-grpc-kotlin")
    implementation("com.linecorp.armeria:armeria-kotlin")
    implementation("com.linecorp.armeria:armeria-spring")

    implementation("org.springframework.boot:spring-boot-starter-web:3.0.5")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
//
//kotlin {
//    compilerOptions {
//        freeCompilerArgs.addAll("-Xjsr305=strict")
//    }
//}

tasks.withType<Test> {
    useJUnitPlatform()
}
