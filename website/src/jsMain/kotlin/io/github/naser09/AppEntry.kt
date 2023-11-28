package io.github.naser09

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import org.jetbrains.compose.web.css.vh

@App
@Composable
fun AppEntry(content:@Composable ()->Unit){
    SilkApp {
        Surface (modifier = Modifier.height(100.vh)){
            content()
        }
    }
}