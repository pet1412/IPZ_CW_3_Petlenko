package ua.edu.lntu.cw_3

import android.content.ClipData.Item
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.cw_3.ui.theme.IPZ_CW_3_PetlenkoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_3_PetlenkoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    LazyColumn(
        contentPadding = PaddingValues(15.dp),
        content = {
            items(3){
                Item()
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IPZ_CW_3_PetlenkoTheme {
        Greeting()
    }
}

@Composable
fun Item(){
    Column {
        Text(text = stringResource(id = R.string.day1_day))
        Text(text = stringResource(id = R.string.day1_name))
        Image(
            painter = painterResource(id = R.drawable.day_1),
            contentDescription = null
        )
        Text(text = stringResource(id = R.string.day1_bottom))
        Spacer(modifier = Modifier.height(12.dp))

    }
}
