/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam abstract class Mahasiswa
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 25 Maret 2025
 */

public class Mahasiswa extends CivitasAkademika {
    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int counterMhs;

    public Mahasiswa() {
        super();
        this.nim = " ";
        this.semester = 0;
        this.fakultas = null;
        counterMhs++;
    }

    public Mahasiswa(String namaMhs, String emailMhs, String nimMhs, int smtMhs, Fakultas fakultasMhs) {
        super(namaMhs, emailMhs);
        this.nim = nimMhs;
        this.semester = smtMhs;
        this.fakultas = fakultasMhs;
        counterMhs++;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nimMhs) {
        this.nim = nimMhs;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int smtMhs) {
        this.semester = smtMhs;
    }

    public static int getCounterMhs() {
        return counterMhs;
    }

    public int hitungUKT() {
        if (getFakultas() == null) {
            throw new IllegalStateException("Fakultas belum diatur untuk mahasiswa ini.");
        }
        return (int) (getFakultas().getTarifUKT() * Math.pow(0.95, semester - 1));
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultasMhs) {
        this.fakultas = fakultasMhs;
    }

    @Override
    public void printInfo() {
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Email\t\t: " + getEmail());
        System.out.println("NIM\t\t: " + getNim());
        System.out.println("Semester\t: " + getSemester());
        System.out.println("Fakultas\t: " + (getFakultas() != null ? getFakultas().getNama() : "Belum diatur"));
        System.out.println("UKT\t\t: " + (getFakultas() != null ? hitungUKT() : "Belum bisa dihitung"));
    }
}
