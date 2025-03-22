/* Nama File    : Dosen.java
 * Deskripsi    : berisi main driver untuk bangun datar
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 18 Maret 2025
 */

public class MBangun {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar() {        }; karena abstract class, maka tidak bisa menginstansiasi objek menggunakan new
        BangunDatar Segi = new Persegi();
        System.out.println("=== BangunDatar ===");
        Segi.printInfo();
        System.out.println();

        Persegi Segi1 = new Persegi();
        Persegi Segi2 = new Persegi(4, "Biru", "Hitam");
        System.out.println("=== Persegi Default ===");
        Segi1.printInfo();
        Segi1.zoomIn();
        System.out.println("=== Setelah Zoom In");
        Segi1.printInfo();
        System.out.println();

        System.out.println("=== Persegi dengan Parameter ===");
        Segi2.printInfo();
        Segi2.zoomOut();
        System.out.println("=== Setelah Zoom Out");
        Segi2.printInfo();
        System.out.println();

        BangunDatar Ling = new Lingkaran();
        Lingkaran Ling1 = new Lingkaran(14, "Merah", "Biru");
        System.out.println("=== Lingkaran Default ===");
        Ling.printInfo();
        System.out.println();

        System.out.println("=== Lingkaran 1 dengan Parameter ===");
        Ling1.printInfo();
        Ling1.zoom(80);
        System.out.println("=== Setelah Zoom Percent");
        Ling1.printInfo();
        System.out.println();

        Lingkaran Ling2 = new Lingkaran(11.2, "Abu", "Ungu");
        System.out.println("=== Lingkaran 2 dengan Parameter ===");
        Ling2.printInfo();
        System.out.println();

        BangunDatar.printCounterBangunDatar();
        System.out.println();

        System.out.println("=== Lingkaran 1 sama luas dengan Persegi 1?");
        System.out.println(Ling1.isEqualLuas(Segi));
        System.out.println("=== Persegi 1 sama luas dengan Persegi 2?");
        System.out.println(Segi1.isEqualKll(Segi2));
        System.out.println("=== Lingkaran 1 sama luas dengan Lingkaran 2?");
        System.out.println(Ling1.isEqualLuas(Ling2));
    }
}
