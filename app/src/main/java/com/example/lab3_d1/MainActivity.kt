package com.example.lab3_d1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab1.ui.theme.Lab1Theme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab3_d1Theme {
                ImageWithText()
            }
        }
    }
}

@Composable
fun ImageWithText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.picture),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(16.dp)
                .padding(bottom = 80.dp)
        ) {
            Text(
                text = "Виклик...",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 32.sp
            )
            Text(
                text = "Abdul Manul",
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(top = 8.dp),
                fontSize = 58.sp
            )
            Spacer(modifier = Modifier.height(72.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 1.dp)
            ) {
                IconButton(
                    onClick = { /* do */ },
                    modifier = Modifier.size(96.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.microphone),
                        contentDescription = "Microphone",
                        modifier = Modifier.size(58.dp)
                    )
                }
                Spacer(modifier = Modifier.width(32.dp))
                IconButton(
                    onClick = { /* do */ },
                    modifier = Modifier.size(96.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.callend),
                        contentDescription = "callend",
                        modifier = Modifier.size(82.dp)
                    )
                }
                Spacer(modifier = Modifier.width(32.dp))
                IconButton(
                    onClick = { /* do */ },
                    modifier = Modifier.size(96.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.speakeron),
                        contentDescription = "Speakeron",
                        modifier = Modifier.size(58.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ImageWithTextPreview() {
    Lab3_d1Theme {
        ImageWithText()
    }
}
