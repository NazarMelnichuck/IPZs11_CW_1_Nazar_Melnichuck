package ua.edu.lntu.cw_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw_1.ui.theme.IPZs11_CW_1_Nazar_MelnichuckTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZs11_CW_1_Nazar_MelnichuckTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp()
{
    val logo = painterResource(R.drawable.android_logo)
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF999999)),
        verticalArrangement = Arrangement.Center
    ){
        Column(
            modifier = Modifier. fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .background(Color(0xFF555555))
                    .size(150.dp)
                    .padding(12.dp)
            ) {
                Image(
                    painter = logo, contentDescription = null,
                    modifier = Modifier
                        .size(150.dp)
                )
            }
            Text(
                "Nazar Melnichuck",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                "Web Developer",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Column (
        ){
        }
    }
}

@Composable
fun Items(painter: Painter, description: String) {
    Row(
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painter, contentDescription = null,
            modifier = Modifier
                .size(24.dp)
        )

        Text(
            text = "$description",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF3ddc84)
        )
    }
}