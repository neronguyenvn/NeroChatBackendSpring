import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.kotlin.jpa)
}

configure<KotlinJvmProjectExtension> {
    jvmToolchain(21)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
