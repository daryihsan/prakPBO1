/* Nama File    : Kucing.java
 * Deskripsi    : berisi method dalam class Kucing
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 22 April 2025
 */

package tugas9b;

class Kucing extends Anabul {
    public Kucing(String nama){
        this.nama = nama;
    }

    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan 4 kaki");
    }
    
    @Override
    public void bersuara(){
        System.out.println(nama + " berbunyi : meong");
    }
}

