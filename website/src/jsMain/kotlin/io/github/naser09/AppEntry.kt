package io.github.naser09

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import io.github.naser09.pages.TopBar
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

@App
@Composable
fun App(content:@Composable ()->Unit){
    SilkApp {
        Surface (modifier = Modifier.height(100.vh)){
            content()
        }
    }
}