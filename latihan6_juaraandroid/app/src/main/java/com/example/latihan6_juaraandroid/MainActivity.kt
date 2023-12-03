package com.example.latihan6_juaraandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.latihan6_juaraandroid.ui.theme.Latihan6_juaraandroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Latihan6_juaraandroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadran()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadran(){
    Column(Modifier.fillMaxWidth()){
        Row(Modifier.weight(1f)){
            KartuSatu(
                judul = stringResource(R.string.kiri_atas),
            deskripsi = stringResource(R.string.kiri_atas_dua),
                warnaLatarBelakang = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            KartuSatu(
                judul = stringResource(R.string.kanan_atas),
                deskripsi = stringResource(R.string.kanan_atas_dua),
                warnaLatarBelakang = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )

        }


        Row(Modifier.weight(1f)){
            KartuSatu(
                judul = stringResource(R.string.kanan_bawah),
                deskripsi = stringResource(R.string.kanan_bawah_dua),
                warnaLatarBelakang = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            KartuSatu(
                judul = stringResource(R.string.kiri_bawah),
                deskripsi = stringResource(R.string.kiri_bawah_dua),
                warnaLatarBelakang = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }

}

@Composable
private fun KartuSatu(judul: String, deskripsi: String, warnaLatarBelakang: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(warnaLatarBelakang)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = judul,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = deskripsi,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Latihan6_juaraandroidTheme {
        ComposeQuadran()
    }
}