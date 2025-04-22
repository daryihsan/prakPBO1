/* Nama File    : Sewa.java
 * Deskripsi    : berisi method dalam class Sewa
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 22 April 2025
 */

package latihan;

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 1000);  //pakai method nya vehicle
        mobil.calRent(50,1000);       //pakai method nya car
        bis.calRent(50,1000);
    }
}

//{ 20 menit } Polimorfisme Universal: Inclusion
//Anggap jika kita mempunyai method hitungSewa(Vehicle v), analisalah keuntungan
//penggunaan teknik polimorfisme inclusion.
//jawab
//jadi, dengan inclusion, kita bisa dapat keuntungan seperti
//Satu method hitungSewa bisa menerima semua subclassnya Vehicle
//Tak perlu buat method yang beda untuk tiap jenis kendaraan
//Kalau ada subclass baru (misal Truck), method tetap bisa dipakai tanpa perubahan
//Method yang dijalankan sesuai dengan tipe objek sebenarnya (kalau dioverride)
