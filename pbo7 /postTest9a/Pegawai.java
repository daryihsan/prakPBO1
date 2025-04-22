/* Nama File    : Pegawai.java
 * Deskripsi    : berisi method dalam class Pegawai
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 22 April 2025
 */

package tugas9a;

public class Pegawai {
    String nama;
    double gajiPokok = 5000000;

    public Pegawai(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
