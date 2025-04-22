/* Nama File    : Programmer.java
 * Deskripsi    : berisi method dalam class Programmer
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 22 April 2025
 */

package tugas9a;

public class Programmer extends Pegawai {
    double bonus = 450000;

    public Programmer(String nama){
        super(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}


