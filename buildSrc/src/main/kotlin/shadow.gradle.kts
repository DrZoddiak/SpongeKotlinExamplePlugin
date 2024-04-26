import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.gradle.jvm.tasks.Jar

plugins {
    id("com.github.johnrengelman.shadow")
}

tasks {
    tasks.withType(ShadowJar::class) {
        archiveClassifier.set("")
        configurations = listOf(project.configurations.findByName("shadow"))
        archiveBaseName.set("${project.name}-${project.version}")
    }
    tasks.withType(Jar::class) {
        enabled = false
    }
}