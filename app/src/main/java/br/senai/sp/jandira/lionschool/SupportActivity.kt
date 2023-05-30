package br.senai.sp.jandira.lionschool
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.ui.theme.LionSchoolTheme


class SupportActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme {
                Greeting2("Android")
            }
        }
    }
}

@Composable
fun Greeting3(name: String) {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {

        Column( modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            ,
        ){
            Row(
                modifier = Modifier
                    .width(400.dp)
                    .height(200.dp)
                    .padding(start = 16.dp, end = 16.dp, top = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ){
                Image(painter = painterResource(id = R.drawable.lion), contentDescription = "" )

                Column( modifier = Modifier
                    .width(250.dp)
                    .height(80.dp)
                    .padding(top = 30.dp, end = 1.dp)
                ){
                    Text(text = stringResource(id = R.string.name),
                        fontWeight = FontWeight(700),
                        fontFamily = FontFamily.Serif,
                        color = Color.White,
                        fontSize = 18.sp,
                    )}
                Image(painter = painterResource(id = R.drawable.baseline_arrow_back_24), contentDescription = "")
            }//Row
            Row(
                modifier = Modifier
                    .fillMaxSize(), horizontalArrangement = Arrangement.Center
            ){
                Card(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Black),
                    shape = RoundedCornerShape(80.dp, 80.dp, 0.dp, 0.dp),

                    ){
                    Column (
                        modifier = Modifier
                            .padding(36.dp),
                        verticalArrangement = Arrangement.Center

                    ){
                        Row() {
                            Image(painter = painterResource(id = R.drawable.phone), contentDescription = "")
                            Text(text = stringResource(id = R.string.telefone))
                        }
                        Row() {
                            Image(painter = painterResource(id = R.drawable.email), contentDescription = "")
                            Text(text = stringResource(id = R.string.email))
                        }
                        Row() {
                            Image(painter = painterResource(id = R.drawable.baseline_location_on_24), contentDescription = "")
                            Text(text = stringResource(id = R.string.endereco))
                        }
                        Row() {

                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = stringResource(id = R.string.copyright))
                        }
                    }//Column
                }//card
            }//row
        }//Column
    }//Surface
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LionSchoolTheme {
        Greeting3("Android")
    }
}


