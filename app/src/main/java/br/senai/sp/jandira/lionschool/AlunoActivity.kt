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

class AlunoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme {
                Greeting4("Android")
            }
        }
    }
}
@Composable
fun Greeting4(name: String) {
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
                    .width(220.dp)
                    .height(80.dp)
                    .padding(top = 30.dp, end = 1.dp)
                ){
                    Text(text = stringResource(id = R.string.name),
                        fontWeight = FontWeight(700),
                        fontFamily = FontFamily.Serif,
                        color = Color.White,
                        fontSize = 18.sp,
                    )
                }
                Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .width(200.dp)
                                .height(40.dp),
                    colors = ButtonDefaults.buttonColors(Color( 0,0,0))
                ) {
                    Image(painter = painterResource(id = R.drawable.baseline_arrow_back_24), contentDescription = "")
                }

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
                            .width(400.dp)
                            .padding(16.dp, top = 36.dp)

                    ){
                        Text(text = stringResource(id = R.string.cursos),
                            fontSize = 27.sp,
                            textAlign = TextAlign.Center,
                            color = Color(129,94,224)
                        )

                        Row(modifier = Modifier
                            .width(350.dp)
                            .padding(top = 30.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,


                            ){
                            Button(
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(32.dp),
                                onClick = {/*TODO*/ },
                                colors = ButtonDefaults.buttonColors(Color( 108,45,250)),
                                shape = RoundedCornerShape(25.dp)

                            ){
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(
                                        text = stringResource(id = R.string.todos),
                                        color = Color.White,
                                        fontSize = 14.sp
                                    )
                                }//column
                            }//button

                            Button(
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(32.dp),
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(Color( 87,167,240)),
                                shape = RoundedCornerShape(25.dp)
                            )
                            {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(
                                        text = stringResource(id = R.string.cursando),
                                        color = Color.White,
                                        fontSize = 14.sp
                                    )
                                }//column
                            }//button
                            Button(
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(32.dp),
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(Color( 192,76,247)),
                                shape = RoundedCornerShape(25.dp)
                            )
                            {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(
                                        text = stringResource(id = R.string.finalizado),
                                        color = Color.White,
                                        fontSize = 14.sp

                                    )
                                }//column
                            }//button
                        }

                        Column(modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 20.dp)
                            ,
                            horizontalAlignment = Alignment.CenterHorizontally) {
                            Row(modifier = Modifier
                                .width(300.dp)
                                .height(100.dp)
                                .background(Color.Magenta), verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.pessoa) , contentDescription = "",
                                    modifier = Modifier
                                        .size(75.dp)
                                )
                                Text(
                                    text = stringResource(id = R.string.aluno),
                                    fontSize = 16.sp,
                                    color = Color.White,
                                    modifier = Modifier
                                        .width(200.dp)
                                        .height(50.dp),
                                    textAlign = TextAlign.Center
                                )
                            }
                        }//Column
                    }//Column
                }//card
            }//row
        }//Column
    }//Surface
}
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    LionSchoolTheme {
//        Greeting4("Android")
//    }
//}