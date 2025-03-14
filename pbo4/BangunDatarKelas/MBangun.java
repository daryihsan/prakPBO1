public class MBangun {
    public static void main(String[] args) {
        BangunDatar Segi = new BangunDatar();
        System.out.println("=== BangunDatar ===");
        Segi.printInfo();
        System.out.println();

        Persegi Segi1 = new Persegi();
        Persegi Segi2 = new Persegi(4, "Biru", "Hitam");
        System.out.println("=== Persegi Default ===");
        Segi1.printInfo();
        System.out.println();

        System.out.println("=== Persegi dengan Parameter ===");
        Segi2.printInfo();
        System.out.println();

        Lingkaran Ling = new Lingkaran();
        Lingkaran Ling1 = new Lingkaran(14, "Merah", "Biru");
        System.out.println("=== Lingkaran Default ===");
        Ling.printInfo();
        System.out.println();

        System.out.println("=== Lingkaran dengan Parameter ===");
        Ling1.printInfo();
        System.out.println();

        BangunDatar.printCounterBangunDatar();
    }
}
