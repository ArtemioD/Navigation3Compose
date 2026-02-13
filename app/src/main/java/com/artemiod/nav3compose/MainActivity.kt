package com.artemiod.nav3compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.artemiod.nav3compose.advance_navigation.AdvanceNavigationWrapper
import com.artemiod.nav3compose.animation_navigation.AnimationNavigationWrapper
import com.artemiod.nav3compose.basic_navigation.BasicNavigationWrapper
import com.artemiod.nav3compose.medium_navigation.MediumNavigationWrapper
import com.artemiod.nav3compose.ui.theme.Nav3ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Nav3ComposeTheme {
                //BasicNavigationWrapper()
                //MediumNavigationWrapper()
                //AdvanceNavigationWrapper()
                AnimationNavigationWrapper()
            }
        }
    }
}

