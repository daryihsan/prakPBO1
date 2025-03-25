/* Nama File    : CivitasAkademika.java
 * Deskripsi    : berisi atribut dan method dalam abstract class CivitasAkademika
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 25 Maret 2025
 */

public abstract class CivitasAkademika {
    private String nama;
    private String email;

    public CivitasAkademika() {
        this(" ", " ");
    }
    
    public CivitasAkademika(String namaCA, String emailCA) {
        this.nama = namaCA;
        this.email = emailCA;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String namaCA){
        this.nama = namaCA;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String emailCA){
        this.email = emailCA;
    }

    public abstract void printInfo();
}
