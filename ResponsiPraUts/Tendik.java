/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam abstract class Tendik
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 25 Maret 2025
 */

public class Tendik extends Karyawan {
    private Universitas universitas;
    private static int counterTendik;

    public Tendik() {
        super();
        this.universitas = null;
        counterTendik++;
    }

    public Tendik(String namaTendik, String emailTendik, String nipTendik, int masaKerjaTendik, Universitas univTendik) {
        super(namaTendik, emailTendik, nipTendik, masaKerjaTendik);
        this.universitas = univTendik;
        counterTendik++;
    }

    public static int getCounterTendik() {
        return counterTendik;
    }

    public int hitungGaji() {
        return 4000000 + (int) (getMasaKerja() * 0.01 * 4000000);
    }

    public Universitas getUniversitas() {
        return universitas;
    }

    public void setUniversitas(Universitas univTendik) {
        this.universitas = univTendik;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Universitas\t: " + (getUniversitas() != null ? getUniversitas().getNama() : "Belum diatur"));
        System.out.println("Gaji\t\t: " + hitungGaji());
    }
}
