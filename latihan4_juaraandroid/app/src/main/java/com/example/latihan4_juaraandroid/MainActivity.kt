package com.example.latihan4_juaraandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.latihan4_juaraandroid.ui.theme.Latihan4_juaraandroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Latihan4_juaraandroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AplikasiArtikelCompose()
                }
            }
        }
    }
}

@Composable
fun AplikasiArtikelCompose(){
    KartuArtikel(
        judul = stringResource(R.string.Judul_Jetpack_Compose_tutorial),
        deskripsiPendek = stringResource(R.string.deskripsi_pendek_compose),
        deskripsiPanjang = stringResource(R.string.deskripsi_panjang_compose),
        fotoPainter = painterResource(R.drawable.bg_compose_background)
    )

}

@Composable
private fun KartuArtikel(judul: String, deskripsiPendek: String, deskripsiPanjang: String, fotoPainter: Painter, modifier: Modifier = Modifier){
    Column(modifier = modifier) {
        Image(painter = fotoPainter, contentDescription = null)
        Text(
            text = judul,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = deskripsiPendek,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = deskripsiPanjang,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify,
            fontSize = 14.sp
        )

    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Latihan4_juaraandroidTheme {
        AplikasiArtikelCompose()
    }
}