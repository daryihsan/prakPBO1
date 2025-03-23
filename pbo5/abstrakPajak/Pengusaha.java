/* Nama File    : Pengusaha.java
 * Deskripsi    : berisi atribut dan method dalam class Pengusaha
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 18 Maret 2025
 */

import java.time.LocalDate;

public class Pengusaha extends Manusia implements IPajak {
    private String npwp;
    private static int counterPgsh;
 
    public Pengusaha(){
        super();
        this.npwp = " ";
        counterPgsh++;
    }
 
    public Pengusaha(String namaPNS, LocalDate tglMulai, String alamatPNS, double gaji, String npwpPgsh){
        if (tglMulai.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Tanggal mulai kerja tidak bisa di masa depan!");
        }

        setNama(namaPNS);
        setTglMulaiKerja(tglMulai);
        setAlamat(alamatPNS);
        setPendapatan(gaji);
        this.npwp = npwpPgsh;
        counterPgsh++;
    }
 
    public String getNPWP(){
        return npwp;
    }
 
    public void setNPWP(String npwpPgsh){
        this.npwp = npwpPgsh;
    }
 
    public static int getCounterPengusaha(){
        return counterPgsh;
    }
 
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Nama \t\t\t: " + getNama());
        System.out.println("NPWP \t\t\t: " + getNPWP());
        System.out.println("Tanggal Mulai kerja \t: " + getTglMulaiKerja());
        System.out.println("Alamat \t\t\t: " + getAlamat());
        System.out.printf("Pendapatan \t\t: %.0f\n", getPendapatan());
        System.out.println("Masa Kerja \t\t: " + hitungMasaKerja() + " tahun");
        System.out.printf("Pajak \t\t\t: %.0f\n", hitungPajak());
    }
 
    @Override
    public int hitungMasaKerja(){
        int tahunMulai = getTglMulaiKerja().getYear();
        int tahunSekarang = LocalDate.now().getYear();
        return (tahunSekarang - tahunMulai) + 7;
    }
 
    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan(); 
    }
 }
 
