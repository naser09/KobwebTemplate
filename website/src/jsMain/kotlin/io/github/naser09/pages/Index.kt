package io.github.naser09.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.css.visibility
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage(){
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally){
        TopBar(Modifier.fillMaxWidth())
        Text("Home")
    }
}
@Composable
fun TopBar(modifier: Modifier){
    val context = rememberPageContext()
    val breakpoint = rememberBreakpoint()
    Row (modifier.fillMaxWidth().padding(5.px), verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween){
        H1 {
            Text("Abu Naser's Portfolio.")
        }
        if (breakpoint>=Breakpoint.MD){
            Div {
                Row {
                    Button(onClick = {
                        context.router.navigateTo("/")
                    }){
                        Text("Home")
                    }
                    Button(onClick = {
                        context.router.navigateTo("/project")
                    }){
                        Text("Project")
                    }
                    Button(onClick = {}){
                        Text("Videos")
                    }
                    Button(onClick = {}){
                        Text("About")
                    }
                    Button(onClick = {}){
                        Text("Contact")
                    }
                }
            }
        }else{
            val isVisible = remember { mutableStateOf(false) }
                Column {
                    Button(modifier = Modifier
                        .attrsModifier {
                           style {
                               position(Position.Absolute)
                               right(5.px)
                               top(5.px)
                           }
                    }, onClick = { isVisible.value = isVisible.value.not() }){
                        FaBars()
                    }
                    Div (Modifier.position(Position.Relative).toAttrs{
                        style {
                            display(DisplayStyle.Flex)
                            flexDirection(FlexDirection.Column)
                            top(45.px)
                            visibility(if (isVisible.value) Visibility.Visible else Visibility.Hidden)
                        }
                    }){
                        Button(onClick = {
                            context.router.navigateTo("/")
                        }){
                            Text("Home")
                        }
                        Button(onClick = {
                            context.router.navigateTo("/project")
                        }){
                            Text("Project")
                        }
                        Button(onClick = {}){
                            Text("Videos")
                        }
                        Button(onClick = {}){
                            Text("Github")
                        }
                        Button(onClick = {}){
                            Text("About")
                        }
                        Button(onClick = {}){
                            Text("Contact")
                        }
                    }
                }
            }
        }
}