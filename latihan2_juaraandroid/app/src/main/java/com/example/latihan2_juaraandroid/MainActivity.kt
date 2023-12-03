package com.example.latihan2_juaraandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//--------------
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
//--------------------
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.latihan2_juaraandroid.ui.theme.Latihan2_juaraandroidTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        Fungsi onCreate() adalah titik entri ke aplikasi ini dan memanggil fungsi lain untuk
//        membuat antarmuka pengguna

        super.onCreate(savedInstanceState)
        setContent {
//Fungsi setContent() dalam fungsi onCreate() digunakan untuk menentukan tata letak Anda melalui
// fungsi composable.

            Latihan2_juaraandroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Dhiki Adriansyah")
                }
            }
        }
    }
}

//  Semua fungsi yang ditandai dengan anotasi @Composable dapat dipanggil dari fungsi setContent()
//  atau dari fungsi Composable lainnya
@Composable
fun Greeting(name: String) {
    Surface(color = Color.Yellow) {
//        Surface adalah penampung yang menampilkan bagian UI tempat Anda dapat mengubah tampilan,
//        seperti warna latar belakang atau batas.

        Text(text = "Hai nama saya adalah $name!", modifier = Modifier.padding(24.dp))
//        Modifier untuk menambah atau mendekorasi composable
    }
}

@Preview(showBackground = true)
//Android Studio secara default menggunakan tema terang untuk editor sehingga perbedaan antara
// showBackground = true dan showBackground = false mungkin akan sulit dilihat.
@Composable
fun GreetingPreview() {
//    fungsi GreetingPreview() adalah fitur keren yang memungkinkan Anda melihat tampilan aplikasi
//    tanpa harus mem-build seluruh aplikasi
    Latihan2_juaraandroidTheme {
        Greeting("Dhiki Adriansyah")
    }
}