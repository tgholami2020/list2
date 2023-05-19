package com.example.listexample2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listexample2.ui.theme.ListExample2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListExample2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    
                    Column(modifier = Modifier
                        .width(400.dp)
                        .height(200.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.padding(16.dp))
                        Image(painter = painterResource(id = R.drawable.flo), contentDescription ="" )

                        LazyColumn(){
                            items(names){
                                Row(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween

                                ) {
                                    Icon(imageVector =Icons.Default.Create, contentDescription = "")
                                    Text(text =  "مراقبت مو")
                                }
                            }
                        }
                    }


                }
            }
        }
    }
}
@Composable
fun addNames(names:String){

}
data class MyListTitle( var title:String)

var names= listOf (
            MyListTitle ("مراقبت مو"),
            MyListTitle ("مراقبت پوست"),
            MyListTitle ("مراقبت بدن"),
            MyListTitle ("عطر و آرایشی")
)
@Composable
fun MyList(modifier: Modifier=Modifier
           ){
    Row() {
        Icon(imageVector =Icons.Default.Add, contentDescription = "")
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ListExample2Theme {
        MyList(modifier = Modifier.padding(16.dp))
    }
}