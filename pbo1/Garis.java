/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 18 Februari 2025
 */

public class Garis {
    /****************************/
    Titik P1;
    Titik P2;
    static int counterGaris = 0;

    /**********METHOD************/
    //konstruktor dengan parameter
    Garis(Titik P1, Titik P2){
        this.P1 = new Titik(P1.getAbsis(), P1.getOrdinat());
        this.P2 = new Titik(P2.getAbsis(), P2.getOrdinat());
        counterGaris++;
    }

    //konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    Garis(){
        this.P1 = new Titik(0,0);
        this.P2 = new Titik(1,1);
        counterGaris++;
    }

    //mengembalikan nilai counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }

    //mengembalikan nilai P1
    Titik getP1(){
        return P1;
    }

    //mengembalikan nilai P2
    Titik getP2(){
        return P2;
    }

    //mengeset absis titik dengan nilai baru 
    void setP1(double x, double y){
        P1.setAbsis(x);
        P1.setOrdinat(y);
    }

    //mengeset ordinat titik dengan nilai baru 
    void setP2(double x, double y){
        P2.setAbsis(x);
        P2.setOrdinat(y);
    }

    //mencari panjang garis
    double panjangGaris(){
        return Math.sqrt(Math.pow(P1.getAbsis()-P2.getAbsis(), 2) + Math.pow(P1.getOrdinat() - P2.getOrdinat(), 2));
    }

    //mencari gradien dari garis
    double gradien(){
        return Double.parseDouble(String.format("%.5f", (P2.getOrdinat()-P1.getOrdinat()) / (P2.getAbsis()-P1.getAbsis())));
    }

    //mencari titik tengah dari garis
    Titik titikTengahGaris(){
        double tengahX = (P1.getAbsis() + P1.getAbsis()) / 2;
        double tengahY = (P1.getOrdinat() + P1.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    //mengetahui apakah kedua garis sejajar atau tidak
    boolean isSejajar(Garis G){
        return this.gradien() == G.gradien();
    }

    //mengetahui apakah kedua garis tegak lurus atau tidak
    boolean isTegakLurus(Garis G){
        return this.gradien() * G.gradien() == -1;
    }

    //menampilkan garis ke layar
    void printGaris(){
        System.out.println("Titik awal = (" + P1.getAbsis() + ", " + P1.getOrdinat() + ")");
        System.out.println("Titik akhir = (" + P2.getAbsis() + ", " + P2.getOrdinat() + ")");
    }

    //menampilkan persamaan garis
    void persamaanGaris(){
        double c = P1.getOrdinat() - (this.gradien() * P1.getAbsis());
        double c2 = Double.parseDouble(String.format("%.5f", c));
        if(c < 0){
            System.out.println("y = " + this.gradien() + "x - " +  c2);
        }
        else{
            System.out.println("y = " + this.gradien() + "x + " +  c2);
        }
    } 
}
