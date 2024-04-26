plugins {
    id("spongeplugin")
}

group = "me.zodd"
version = "1.0-SNAPSHOT"

sponge {
    plugin("crimera") {
        version(project.version.toString())
        displayName("Crimera")
        entrypoint("me.zodd.Crimera")
        description("Will eventually do something!")
    }
}

