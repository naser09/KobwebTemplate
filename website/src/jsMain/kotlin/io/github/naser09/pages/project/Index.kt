package io.github.naser09.pages.project

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import io.github.naser09.pages.TopBar
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun ProjectPage(){
    val context = rememberPageContext()
    Column (
        modifier = Modifier.width(100.vw),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally){
        TopBar(Modifier.fillMaxWidth())
        Button(onClick = {
            context.router.navigateTo("/")
        }){
            Text("Project")
        }
    }
}