/* Nama File    : PNS.java
 * Deskripsi    : berisi atribut dan method dalam class PNS
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 18 Maret 2025
 */

import java.time.LocalDate;

public class PNS extends Manusia implements IPajak {
    private String nip;
    private static int counterPNS;

    public PNS(){
        super();
        this.nip = " ";
        counterPNS++;
    }

    public PNS(String namaPNS, LocalDate tglMulai, String alamatPNS, double gaji, String nipPNS){
        if (tglMulai.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Tanggal mulai kerja tidak bisa di masa depan!");
        }

        setNama(namaPNS);
        setTglMulaiKerja(tglMulai);
        setAlamat(alamatPNS);
        setPendapatan(gaji);
        this.nip = nipPNS;
        counterPNS++;
    }

    public String getNIP(){
        return nip;
    }

    public void setNIP(String nipPNS){
        this.nip = nipPNS;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Nama \t\t\t: " + getNama());
        System.out.println("NIP \t\t\t: " + getNIP());
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
        return (tahunSekarang - tahunMulai) + 3;
    }

    @Override
    public double hitungPajak(){
        return 0.1 * getPendapatan(); 
    }
}
