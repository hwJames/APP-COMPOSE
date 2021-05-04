package com.github.hwjames.compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextView("123")
        }
    }
}

@Composable
fun TextView(text: String = "test") {
    Text(text = text)
}

@Preview
@Composable
fun PreviewGreeting() {
    TextView("Android Test 123")
}
