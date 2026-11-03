plugins {
    alias(libs.plugins.internalConvention)
}

description = "GLB loading through cgltf"

dependencies {
    implementation(projects.libs.lang)
    runtimeOnly(project(":native:zig-lib"))
}

internalConvention.configureBenchmark(project)

extensions.configure<me.champeau.jmh.JmhParameters> {
    warmupIterations.set(3)
    warmup.set("1s")
    iterations.set(5)
    timeOnIteration.set("1s")
    fork.set(1)
    timeUnit.set("us")
    jvmArgsAppend.set(
        listOf("--add-modules=jdk.incubator.vector", "--enable-native-access=ALL-UNNAMED", "-Xms512m", "-Xmx512m")
    )
}

afterEvaluate {
    tasks.withType<Test>().configureEach {
        jvmArgs = jvmArgs.orEmpty().map {
            if (it == "-Xadd-modules=jdk.incubator.vector") "--add-modules=jdk.incubator.vector" else it
        } + "--enable-native-access=ALL-UNNAMED"
    }
}

//val benchmarkOptimization = providers.gradleProperty("com.varlanv.klab.optimize")
//tasks.named("jmh") {
//    doFirst {
//        require(benchmarkOptimization.get() == "fast") {
//            "Use -Pcom.varlanv.klab.optimize=fast to benchmark optimized native C"
//        }
//    }
//}
