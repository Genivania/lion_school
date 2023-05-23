package br.senai.sp.jandira.lionschool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.ui.theme.LionSchoolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme {
                Greeting()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting() {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ){
        Column( modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .padding(start = 32.dp, end = 32.dp, top = 28.dp),
        ){
            Row(
                modifier = Modifier.width(400.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            )
            {
                Text(text = stringResource(id = R.string.name),
                    fontWeight = FontWeight(800),
                    fontFamily = FontFamily.Serif,
                    color = Color.White,
                    fontSize = 22.sp

                )
                Image(painter = painterResource(id = R.drawable.exit), contentDescription = "")
            }
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(top = 180.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lion),
                    contentDescription = "",
                    modifier = Modifier.size(300.dp)
                )
                Button(
                    modifier = Modifier
                        .width(140.dp),
                    colors = ButtonDefaults.buttonColors(Color( 0,117,255)),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = stringResource(id = R.string.button),
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Column(modifier = Modifier.fillMaxSize()
                    .padding(bottom = 16.dp),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Text(text = stringResource(id = R.string.faleConosco),
                        fontFamily = FontFamily.Serif,
                        color = Color.White,
                        fontSize = 22.sp,
                    )
                }
            }//Column
        }//Column
    } //Surface
}// greting



   
