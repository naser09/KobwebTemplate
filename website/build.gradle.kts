import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
}
group = "io.github.naser09"
version = "1.0.0"
kobweb{
    app{
        index{
            description.set("Template by Naser's CodeLab")
        }
    }
}
kotlin{
    configAsKobwebApplication("website",false)
    sourceSets{
        val jsMain by getting{
            dependencies {
                implementation(compose.html.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk)
                implementation(libs.silk.icons.fa)
            }
        }
    }
}