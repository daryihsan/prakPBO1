/* Nama File    : Manusia.java
 * Deskripsi    : berisi atribut dan method dalam abstract class Manusia
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 18 Maret 2025
 */

import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    public Manusia(){
        counterMns++;
    }

    public Manusia(String namaMns, LocalDate tglMulai, String alamatMns, double gaji){
        if (tglMulai.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Tanggal mulai kerja tidak bisa di masa depan!");
        }
        
        this.nama = namaMns;
        this.tglMulaiKerja = tglMulai;
        this.alamat = alamatMns;
        this.pendapatan = gaji;
        counterMns++;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String namaMns){
        this.nama = namaMns;
    }

    public LocalDate getTglMulaiKerja(){
        return tglMulaiKerja;
    }

    public void setTglMulaiKerja(LocalDate tglMulai){
        this.tglMulaiKerja = tglMulai;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamatMns){
        this.alamat = alamatMns;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public void setPendapatan(double gaji){
        this.pendapatan = gaji;
    }

    public static int getCounterManusia() {
        return counterMns;
    }

    public void cetakInfo(){
    }

    public abstract int hitungMasaKerja();
}
