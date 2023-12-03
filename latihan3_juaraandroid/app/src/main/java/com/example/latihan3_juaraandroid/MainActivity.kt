package com.example.latihan3_juaraandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.latihan3_juaraandroid.ui.theme.Latihan3_juaraandroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Latihan3_juaraandroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(message = stringResource(R.string.selamat_ulang_tahun_diki), from = stringResource(
                                            R.string.bela_khansa))
//                    stringResource() adalah teks diekstrak ke resource string agar aplikasi mudah diterjemahkan ke bahasa lain.
                }
            }
        }
    }
}

//---------
//Cuplikan kode ini adalah contoh dari fungsi composable sederhana yang meneruskan data
// (parameter fungsi name) dan menggunakannya untuk merender elemen teks di layar.
//@Composable
//fun Greeting(name: String) {
//    Text(
//        text = "Hello $name!"
//    )
//}

//--------------
@Composable
//membuat Composable Anda menerima parameter Modifier, dan meneruskan modifier tersebut ke turunan
// pertamanya
fun GreetingText(message: String,from: String, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
//perlu meneruskan parameter pengubah ke elemen turunan dalam composable.
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        //    lineHeight untuk menyertakan tinggi baris
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
//        alignment.centerHorizontally untuk  teks nama pengirim agar sejajar dengan bagian tengah layar
    }
}
//-----------
@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)
 Box {
     Image(
         painter = image,
         contentDescription = null,
         contentScale = ContentScale.Crop,
         alpha = 0.5F
     )
//     composable image  adalah elemen UI yang menampilkan gambar di aplikasi.
//     ContentScale.Crop untuk mempertahankan rasio aspek sehingga lebar dan tinggi gambar sama
//     dengan, atau lebih besar dari, dimensi layar yang sesuai
// alpha untuk ubah opasitas gambar latar belakang

     GreetingText(message = message,
         from = from,
         modifier = Modifier
             .fillMaxSize()
             .padding(8.dp)
     )
 }
}
//-----------
//Fungsi composable ini membantu melihat pratinjau fungsi Greeting()
@Preview(showBackground = false)
@Composable
fun BirthdayCardPreview() {
    Latihan3_juaraandroidTheme {
//        Greeting("Dhiki Adriansyah")
        GreetingImage("Selamat Ulang Tahun Diki","BelaKhansa")
    }
}