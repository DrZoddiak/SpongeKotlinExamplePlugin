import org.spongepowered.plugin.metadata.model.PluginDependency

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
        dependency("mckotlin-sponge") {
            version("1.4.0-k1.9.21")
            loadOrder(PluginDependency.LoadOrder.AFTER)
            optional(false)
        }
    }
}

