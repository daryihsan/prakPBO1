/* Nama File    : MGaris.java
 * Deskripsi    : merupakan driver Garis
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 19 Februari 2025
 */
public class MGaris {
    public static void main(String[] args) {
        //Membuat objek titik untuk garis
        Titik T1 = new Titik(1, 2);  //Titik awal (1, 2)
        Titik T2 = new Titik(4, 6);  //Titik akhir (4, 6)

        //Membuat objek garis G1 dengan titik T1 dan T2
        Garis G1 = new Garis(T1, T2);
        System.out.println("Garis G1:");
        G1.printGaris();                                                //Mencetak titik awal dan akhir G1
        System.out.println("Panjang Garis G1: " + G1.panjangGaris());
        System.out.println("Gradien Garis G1: " + G1.gradien());
        System.out.println("Titik Tengah Garis G1: ");
        G1.titikTengahGaris().printTitik();                             //Mencetak titik tengah G1
        System.out.println("Persamaan Garis G1:");
        G1.persamaanGaris();                                            //Mencetak persamaan garis G1

        //Membuat objek garis G2 dengan konstruktor default (0,0) dan (1,1)
        Garis G2 = new Garis();
        System.out.println("\nGaris G2 (default):");
        G2.printGaris();                                                //Mencetak titik awal dan akhir G2
        System.out.println("Panjang Garis G2: " + G2.panjangGaris());
        System.out.println("Gradien Garis G2: " + G2.gradien());
        System.out.println("Titik Tengah Garis G2: ");
        G2.titikTengahGaris().printTitik();                             //Mencetak titik tengah G2
        
        //Mengubah titik awal dan akhir G2
        G2.setP1(2, 3);
        G2.setP2(5, 7);
        System.out.println("\nGaris G2 setelah diubah:");
        G2.printGaris();                                                //Mencetak titik awal dan akhir G2 setelah diubah
        System.out.println("Panjang Garis G2: " + G2.panjangGaris());
        System.out.println("Gradien Garis G2: " + G2.gradien());
        System.out.println("Persamaan Garis G2:");
        G2.persamaanGaris();                                            //Mencetak persamaan garis G2

        //Membuat objek garis G3 untuk testing sejajar dan tegak lurus
        Titik T3 = new Titik(2, 4);
        Titik T4 = new Titik(6, 8);
        Garis G3 = new Garis(T3, T4);
        System.out.println("\nGaris G3:");
        G3.printGaris();                                                //Mencetak titik awal dan akhir G3

        //Mengecek apakah G1 dan G3 sejajar
        System.out.println("Apakah G1 dan G3 sejajar? " + G1.isSejajar(G3));

        //Mengecek apakah G1 dan G3 tegak lurus
        System.out.println("Apakah G1 dan G3 tegak lurus? " + G1.isTegakLurus(G3));

        //Menampilkan jumlah objek garis yang telah dibuat
        System.out.println("\nJumlah Objek Garis: " + Garis.getCounterGaris());
    }
}
