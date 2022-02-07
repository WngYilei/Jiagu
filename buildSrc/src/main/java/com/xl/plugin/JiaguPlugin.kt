//package com.xl.plugin
//
//import com.android.build.api.artifact.SingleArtifact
//import com.android.build.api.variant.AndroidComponentsExtension
//import org.gradle.api.Plugin
//import org.gradle.api.Project
//import org.gradle.kotlin.dsl.create
//import org.gradle.kotlin.dsl.register
//
//class JiaguPlugin : Plugin<Project> {
//    override fun apply(project: Project) {
//
//        val androidComponents = project.extensions.getByType(AndroidComponentsExtension::class.java)
//        val jiaguExtension  = project.extensions.create<JiaguExtension>("jiagu")
//        androidComponents.onVariants {
//            project.tasks.register<ApkTask>("${it.name}DisplayApks") {
//                apkFolder.set(it.artifacts.get(SingleArtifact.APK))
//                builtArtifactsLoader.set(it.artifacts.getBuiltArtifactsLoader())
//                jiagu = jiaguExtension
//                group="apk"
//            }
//
////            val apkProducer = project.tasks.register("apk${it.name}Task", ApkTask2::class.java)
////            it.artifacts.use(apkProducer).wiredWithDirectories(
////                ApkTask2::inputApk,
////                ApkTask2::outputApk
////            ).toTransform(SingleArtifact.APK)
//        }
//
//
//    }
//}