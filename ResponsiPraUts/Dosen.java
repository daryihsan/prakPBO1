/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam abstract class Dosen
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 25 Maret 2025
 */

public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counterDsn;

    public Dosen() {
        super();
        this.fakultas = null;
        counterDsn++;
    }

    public Dosen(String namaDsn, String emailDsn, String nipDsn, int masaKerjaDsn, Fakultas fakultasDsn) {
        super(namaDsn, emailDsn, nipDsn, masaKerjaDsn);
        this.fakultas = fakultasDsn;
        counterDsn++;
    }

    public static int getCounterDsn() {
        return counterDsn;
    }

    public int hitungGaji() {
        if (getFakultas() == null) {
            throw new IllegalStateException("Fakultas belum diatur untuk dosen ini.");
        }
        return getFakultas().getGajiPokok() + (int) (getMasaKerja() * 0.01 * getFakultas().getGajiPokok());
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultasDsn) {
        this.fakultas = fakultasDsn;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas\t: " + (getFakultas() != null ? getFakultas().getNama() : "Belum diatur"));
        System.out.println("Gaji\t\t: " + (getFakultas() != null ? hitungGaji() : "Belum bisa dihitung"));
    }
}
