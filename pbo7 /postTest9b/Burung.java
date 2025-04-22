/* Nama File    : Burung.java
 * Deskripsi    : berisi method dalam class Burung
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 22 April 2025
 */

package tugas9b;

class Burung extends Anabul {
    public Burung(String nama){
        this.nama = nama;
    }

    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan sayap");
    }

    @Override
    public void bersuara(){
        System.out.println(nama + " berbunyi : cicicuit");
    }
}

