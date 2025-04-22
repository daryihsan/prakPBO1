/* Nama File    : Manager.java
 * Deskripsi    : berisi method dalam class Manager
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 22 April 2025
 */

package tugas9a;

public class Manager extends Pegawai {
    double tunjangan = 700000;

    public Manager(String nama){
        super(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}

