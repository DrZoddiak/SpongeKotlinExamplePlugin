plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
    implementation("org.spongepowered:spongegradle-plugin-development:2.2.0")
    implementation("com.github.johnrengelman:shadow:8.1.1")
}

