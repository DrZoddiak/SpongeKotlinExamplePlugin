package me.zodd

import com.google.inject.Inject
import org.apache.logging.log4j.Logger
import org.spongepowered.api.config.DefaultConfig
import org.spongepowered.configurate.CommentedConfigurationNode
import org.spongepowered.configurate.reference.ConfigurationReference
import org.spongepowered.plugin.PluginContainer

class Crimera @Inject internal constructor(
    plugin: PluginContainer,
    logger: Logger,
    @DefaultConfig(sharedRoot = false)
    config: ConfigurationReference<CommentedConfigurationNode>
) {

}