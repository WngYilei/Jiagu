package jiagu

import org.gradle.api.provider.Property

abstract class JiaguExtension {
    abstract val jarPath: Property<String>
    abstract val username: Property<String>
    abstract val pwd: Property<String>
}