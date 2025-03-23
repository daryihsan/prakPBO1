/* Nama File    : Petani.java
 * Deskripsi    : berisi atribut dan method dalam class Petani
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 18 Maret 2025
 */

import java.time.LocalDate;

public class Petani extends Manusia implements IPajak {
    private String asal_kota;
    private static int counterPetani;
 
    public Petani(){
        super();
        this.asal_kota = " ";
        counterPetani++;
    }
 
    public Petani(String namaPNS, LocalDate tglMulai, String alamatPNS, double gaji, String askot){
        if (tglMulai.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Tanggal mulai kerja tidak bisa di masa depan!");
        }

        setNama(namaPNS);
        setTglMulaiKerja(tglMulai);
        setAlamat(alamatPNS);
        setPendapatan(gaji);
        this.asal_kota = askot;
        counterPetani++;
    }
 
    public String getAsalKota(){
        return asal_kota;
    }
 
    public void setAsalKota(String askot){
        this.asal_kota = askot;
    }
 
    public static int getCounterPetani(){
        return counterPetani;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Nama \t\t\t: " + getNama());
        System.out.println("Asal Kota \t\t: " + getAsalKota());
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
        return (tahunSekarang - tahunMulai) + 0;
    }
 
    @Override
    public double hitungPajak(){
        return 0; 
    }
}
