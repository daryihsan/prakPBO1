/* Nama File    : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 4 Maret 2025
 */

class lingkaran{
    private double jariJari;
    public lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKll(){
        double kell = 2*Math.PI*jariJari;
        return kell;
    }
}

public class asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari>0):"jari jari tak boleh nol!";
        lingkaran l = new lingkaran(jariJari);
        double kell = l.hitungKll();
        System.out.println("keliling lingkaran = " + kell);
    }
}

//Secara konsep, program memiliki kesalahan dalam penempatan asersi dan cara validasi nilai jari-jari.
//Perbaikannya adalah meletakkan asersi dalam konstruktor dan menambahkan pengecekan dengan exception handling.
//Asersi tidak boleh menjadi satu-satunya cara untuk validasi input, karena dapat dinonaktifkan saat runtime.