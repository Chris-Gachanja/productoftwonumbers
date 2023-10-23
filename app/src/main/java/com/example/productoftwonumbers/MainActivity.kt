package com.example.productoftwonumbers


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.productoftwonumbers.ui.theme.ProductOfTwoNumbersTheme

class MainActivity : ComponentActivity() {
    @override protected void onCreate(Bundle savedInstanceState: Bundle?) {
        { super.onCreate(savedInstanceState)};
        setContentView(R.layout.activity_main);
           Button btnAdd = (Button)findViewById(R.id.btnAdd);
            btnAdd.setOnClickListener(new view.onClickListener())
            {
            ProductOfTwoNumbersTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Product")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProductOfTwoNumbersTheme {
        Greeting("Android")
    }
}