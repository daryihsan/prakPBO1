/* Nama File    : Anjing.java
 * Deskripsi    : berisi method dalam class Anjing
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 22 April 2025
 */

package tugas9b;

class Anjing extends Anabul {
    public Anjing(String nama){
        this.nama = nama;
    }

    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan 4 kaki");
    }

    @Override
    public void bersuara(){
        System.out.println(nama + " berbunyi : guk-guk");
    }
}

