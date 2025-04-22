/* Nama File    : MAnabul.java
 * Deskripsi    : berisi main driver untuk Anabul
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 22 April 2025
 */

package tugas9b;

public class MAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Kucing");
        Anabul anjing = new Anjing("Anjing");
        Anabul burung = new Burung("Burung");

        kucing.gerak();
        kucing.bersuara();

        anjing.gerak();
        anjing.bersuara();

        burung.gerak();
        burung.bersuara();
    }
}
