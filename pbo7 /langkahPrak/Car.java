/* Nama File    : Car.java
 * Deskripsi    : berisi method dalam class Car
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 22 April 2025
 */

package latihan;

public class Car extends Vehicle{
    @Override
    void calRent(int jarak, float harga){
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}

//Method calRent di Car tidak pakai @Override (di modul), 
//karena signature methodnya beda (jarak, harga vs distance, price)
//jadi bukan override yang "baik"
//sehingga di sini saya override sendiri