package net.konohana.sakuya.compose.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Android", "JetPack Compose"))
        }
    }
}

data class Message(val txt1: String, val txt2: String)

@Composable
fun MessageCard(msg: Message) {
    Column {
        Text(text = msg.txt1)
        Text(text = msg.txt2)
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Button")
        }
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("これはサンプルです。", "Jetpack Composeのサンプルです。")
    )
}
