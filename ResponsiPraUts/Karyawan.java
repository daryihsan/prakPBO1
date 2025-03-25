/* Nama File    : Karyawan.java
 * Deskripsi    : berisi atribut dan method dalam abstract class Karyawan
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 25 Maret 2025
 */

public abstract class Karyawan extends CivitasAkademika{
    protected String nip;
    protected int masaKerja;
    
    public Karyawan() {
        super();
        this.nip = " ";
        this.masaKerja = 0;
    }

    public Karyawan(String namaKry, String emailKry, String nipKry, int masaKerjaKry) {
        super(namaKry, emailKry);
        this.nip = nipKry;
        this.masaKerja = masaKerjaKry;
    }
    
    public String getNip() {
        return nip;
    }

    public void setNip(String nipKry) {
        this.nip = nipKry;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerjaKry) {
        this.masaKerja = masaKerjaKry;
    }

    public abstract int hitungGaji();

    @Override
    public void printInfo() {
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Email\t\t: " + getEmail());
        System.out.println("NIP\t\t: " + getNip());
        System.out.println("Masa Kerja\t: " + getMasaKerja() + " tahun");
    }
}
