package com.kichou.imad.meditationui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.kichou.imad.meditationui.ui.HomeSceen
import com.kichou.imad.meditationui.ui.theme.MeditationUITheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUITheme {

               HomeSceen()



            }
        }
    }
}

