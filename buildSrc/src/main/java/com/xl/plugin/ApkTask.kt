//package com.xl.plugin
//
//import org.gradle.api.DefaultTask
//import org.gradle.api.file.DirectoryProperty
//import com.android.build.api.variant.BuiltArtifactsLoader
//import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
//import org.gradle.api.provider.Property
//import org.gradle.api.tasks.*
//import java.io.File
//
//abstract class ApkTask : DefaultTask() {
//
//    @get:Input
//    abstract var jiagu: JiaguExtension
//
//    @get:InputFiles
//    abstract val apkFolder: DirectoryProperty
//
//    @get:Internal
//    abstract val builtArtifactsLoader: Property<BuiltArtifactsLoader>
//
//    @TaskAction
//    fun taskAction() {
//        val builtArtifacts = builtArtifactsLoader.get().load(apkFolder.get()) ?: throw RuntimeException("Cannot load APKs")
//
//        val baseAppModuleExtension =
//            project.extensions.getByType(BaseAppModuleExtension::class.java)
//        val signingConfig = baseAppModuleExtension.signingConfigs.getByName("release")
//        builtArtifacts.elements.forEach {
//            val apk = File(it.outputFile)
//            project.exec {
//                commandLine(
//                    "java",
//                    "-jar",
//                    jiagu.jarPath.get(),
//                    "-login",
//                    jiagu.username.get(),
//                    jiagu.pwd.get()
//                )
//                commandLine("java", "-jar", jiagu.jarPath.get(), "-importsign", signingConfig.storeFile?.absolutePath,
//                    signingConfig.storePassword, signingConfig.keyAlias, signingConfig.keyPassword)
//
//                commandLine("java", "-jar", jiagu.jarPath.get(), "-jiagu", apk.absolutePath, apk.parent, "-autosign")
//            }
//        }
//    }
//}