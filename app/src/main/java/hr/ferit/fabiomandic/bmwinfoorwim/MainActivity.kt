package hr.ferit.fabiomandic.bmwinfoorwim

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import hr.ferit.fabiomandic.bmwinfoorwim.ui.theme.BMWinfoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BMWinfoTheme {
                BMWInfoScreen()
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BMWInfoScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color(0xFFB3E5FC),
                elevation = 0.dp
            ) {
                Text(
                    text = "BMW Info",
                    modifier = Modifier.padding(horizontal = 16.dp),
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp),
                    color = Color.Black
                )
            }
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFB3E5FC)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = { /* TODO: Home action */ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF5C6BC0)),
                        shape = CircleShape
                    ) {
                        Text(text = "Home", color = Color.White)
                    }
                    Button(
                        onClick = { /* TODO: Models action */ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF5C6BC0)),
                        shape = CircleShape
                    ) {
                        Text(text = "Models", color = Color.White)
                    }
                }


                Text(
                    text = "BMW Info",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp),
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    painter = painterResource(id = R.drawable.bmw_car), // Placeholder image
                    contentDescription = "BMW Car",
                    modifier = Modifier
                        .size(200.dp)
                        .padding(16.dp)
                )


                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .background(Color.White, RoundedCornerShape(24.dp))
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Default.Search, contentDescription = "Search Icon", tint = Color.Gray)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Search",
                        modifier = Modifier.weight(1f),
                        color = Color.Gray
                    )
                    Icon(Icons.Filled.Mic, contentDescription = "Mic Icon", tint = Color.Gray) // Ispravljena ikona
                }


                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    val categories = listOf("Coupe", "Sedan", "SUV", "Jeep")
                    categories.forEach { category ->
                        Button(
                            onClick = { /* TODO: Category action */ },
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF5C6BC0)),
                            shape = CircleShape
                        ) {
                            Text(text = category, color = Color.White)
                        }
                    }
                }


                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Card(
                        modifier = Modifier
                            .size(100.dp),
                        shape = RoundedCornerShape(8.dp),
                        elevation = 4.dp
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.LightGray),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "Model")
                        }
                    }
                    Card(
                        modifier = Modifier
                            .size(100.dp),
                        shape = RoundedCornerShape(8.dp),
                        elevation = 4.dp
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.LightGray),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "Model")
                        }
                    }
                }


                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = { /* TODO: Add new model action */ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF5C6BC0)),
                    shape = RoundedCornerShape(24.dp)
                ) {
                    Text(text = "+ Add new model", color = Color.White)
                }
            }
        }
    )
}
