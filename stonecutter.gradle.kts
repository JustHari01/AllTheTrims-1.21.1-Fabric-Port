plugins {
    id("dev.kikugie.stonecutter")
}

stonecutter active "1.21.1-fabric" /* [SC] DO NOT EDIT */

stonecutter registerChiseled tasks.register("chiseledBuildAndCollect", stonecutter.chiseled) {
    group = "project"
    ofTask("buildAndCollect")
}

stonecutter configureEach {
    val current = project.property("loom.platform")
    val platforms = listOf("fabric", "neoforge").map { it to (it == current) }
    consts(platforms)
}
