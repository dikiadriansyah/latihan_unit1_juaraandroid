fun main(){
//    ucapanUlangTahun()

//    -----------
//println(ucapanKelulusan())

//    -----------
//println(promosiMobil("Toyota"))
    /*
   Mobil dengan merk Toyota
   Mobil dengan warna merah
    */

//    println(promosiMobil("Mitsubishi"))
    /*
      Mobil dengan merk Mitsubishi
      Mobil dengan warna merah
       */
//---------
// println(promosiMotor("Honda", 2000))
    /*
    Motor dengan merk Honda
Motor dengan pembuatan tahun 2000
     */
//    ------------------------
//    println(promosiMotor("Suzuki", 2003))
    /*
       Motor dengan merk Suzuki
   Motor dengan pembuatan tahun 2003
        */
//    ------------------------
//println(promosiMotor(nama = "Yamaha", tahun = 2004))
    /*
    Motor dengan merk Yamaha
Motor dengan pembuatan tahun 2004
     */
//    ------------------
    println(promosiLaptop(tahun = 2015))
    println(promosiLaptop("Samsung",tahun = 2019))
    /*
    Dijual Laptop merk Lenovo, dibuat tahun 2015
Dijual Laptop merk Samsung, dibuat tahun 2019
     */
//    ------------------------

}


//fun ucapanUlangTahun(){
//    println("Selamat Ulang Tahun, Diki")
//    println("Anda sekarang berusia 24 tahun")
//}
/*
    Selamat Ulang Tahun, Diki
Anda sekarang berusia 24 tahun
     */

//fun ucapanUlangTahun(): Unit{
//    Unit berarti fungsi tidak menampilkan nilai.

//    println("Selamat Ulang Tahun, Diki")
//    println("Anda sekarang berusia 24 tahun")
//}
//----------------------
//fun ucapanKelulusan(): String{
//    println("Selamat Kelulusan, Diki")
//    println("dengan IPK 4.00")
//A 'return' expression required in a function with a block body
//}

//fun ucapanKelulusan(): String{
//val nama = "Hai Diki"
//    val ucapan = "Selamat Kelulusan"
//    return "$nama\n$ucapan "
    /*
    Hai Diki
Selamat Kelulusan
     */
//}
//-----------------
//fun promosiMobil(nama: String):String{
//        val merk = "Mobil dengan merk $nama"
//    val warna = "Mobil dengan warna merah"
//    return "$merk\n$warna"
//}
//------------------------------
//fun promosiMotor(nama: String, tahun: Int):String{
//        val merk = "Motor dengan merk $nama"
//    val tahunPembuatan = "Motor dengan pembuatan tahun $tahun"
//    return "$merk\n$tahunPembuatan"
//}
// kode diatas memiliki nama fungsi: promosiMotor, dengan 2 parameter, tipe pengembalian berupa String, dan body fungsi
// yaitu variabel dan return statement
//---------------------------
fun promosiLaptop(nama: String = "Lenovo", tahun: Int):String{
return "Dijual Laptop merk $nama, dibuat tahun $tahun"
}
