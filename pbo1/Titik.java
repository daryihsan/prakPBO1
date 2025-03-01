/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 18 Februari 2025
 */

public class Titik {
    /****************************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /**********METHOD************/
    //konstruktor dengan parameter
    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //print jumlah titik
    void printCount(){
        System.out.println("Jumlah titik = " + counterTitik);
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //mencari kuadran dari titik
    int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        }
        else if(absis < 0 && ordinat > 0){
            return 2;
        }
        else if(absis < 0 && ordinat < 0){
            return 3;
        }
        else if(absis > 0 && ordinat < 0){
            return 4;
        }
        else{
            return 0;
        }
    }

    //mencari jarak titik ke origin
    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    //mencari jarak antar 2 titik
    double getJarak2Titik(Titik T){
        return Math.sqrt(Math.pow(absis-T.absis, 2) + Math.pow(ordinat - T.ordinat, 2));
    }

    //refleksi titik thd sb x
    void refleksiX(){
        ordinat = ordinat*(-1);  
    }

    //refleksi titik thd sb y
    void refleksiY(){
        absis = absis*(-1);  
    }

    //menghasilkan titik dari refleksi titik awal thd sb x
    Titik getRefleksiX(){
        Titik T1;
        T1 = new Titik();
        T1.ordinat = ordinat*(-1);
        T1.absis = absis;
        return T1;
    }

    //menghasilkan titik dari refleksi titik awal thd sb y
    Titik getRefleksiY(){
        Titik T1 = new Titik(absis * (-1), ordinat);
        return T1;
    }
} /*end class Titik*/
