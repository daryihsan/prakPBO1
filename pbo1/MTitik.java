/* Nama File    : MTitik.java
 * Deskripsi    : merupakan driver Titik
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 18 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();  //Membuat objek titik T1 (0,0)
        T1.setAbsis(3);        //Mengubah absis T1 dengan nilai 3 
        T1.setOrdinat(4);      //Mengubah ordinat T1 dengan nilai 4
        T1.printTitik();         //Mencetak koordinat T1 ke layar
        T1.geser(3, 4);      //Menggeser T1 sejauh (3,4)
        T1.printTitik();         //Mencetak koordinat T1 ke layar
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        Titik T2 = new Titik(5,7);  //Membuat objek titik T2 
        T2.printTitik();         //Mencetak koordinat T1 ke layar
        T2.setAbsis(-10);        //Mengubah absis T1 dengan nilai 3 
        T2.setOrdinat(-10);      //Mengubah ordinat T1 dengan nilai 4
        T2.printTitik();         //Mencetak koordinat T1 ke layar
        T2.printCount();
        
        //Menghitung kuadran
        int kuadranT1 = T1.getKuadran();
        System.out.println("Kuadran T1 : " + kuadranT1);

        int kuadranT2 = T2.getKuadran();
        System.out.println("Kuadran T2 : " + kuadranT2);

        //Menghitung jarak T ke pusat
        double jarakT1KePusat = T1.getJarakPusat();
        System.out.println("Jarak T1 ke pusat : " + jarakT1KePusat);

        double jarakT2KePusat = T2.getJarakPusat();
        System.out.println("Jarak T2 ke pusat : " + jarakT2KePusat);

        //Menghitung jarak antara T1 dan T2
        double jarakT1KeT2 = T1.getJarak2Titik(T2);
        System.out.println("Jarak T1 ke T2 : " + jarakT1KeT2);

        //Refleksi T1 terhadap sumbu X
        T1.refleksiX();
        System.out.print("T1 setelah refleksi X : ");
        T1.printTitik();

        //Refleksi T2 terhadap sumbu Y
        T2.refleksiY();
        System.out.print("T2 setelah refleksi Y : ");
        T2.printTitik();

        //Mendapatkan refleksi T1 terhadap sumbu X
        Titik T1RefleksiX = T1.getRefleksiX();
        System.out.print("Refleksi T1 terhadap sumbu X : ");
        T1RefleksiX.printTitik();

        //Mendapatkan refleksi T2 terhadap sumbu Y
        Titik T2RefleksiY = T2.getRefleksiY();
        System.out.print("Refleksi T2 terhadap sumbu Y : ");
        T2RefleksiY.printTitik();
    }
}
    

