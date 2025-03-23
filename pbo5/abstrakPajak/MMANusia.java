/* Nama File    : MMANusia.java
 * Deskripsi    : berisi main driver untuk Manusia 
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 18 Maret 2025
 */

import java.time.LocalDate;

public class MMANusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo",LocalDate.of(2006, 4, 1),"Jl. Seroja",15000000,"198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy",LocalDate.of(2000, 1, 1),"Jl.Air",55000000,"000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha",LocalDate.of(1997, 1, 9),"Jl. Bunga 9 Tembalang",5000000,"wonogiri");
        PNS p2 = new PNS("Panji",LocalDate.of(2010, 4, 1),"",10000000,"198004212010041002");
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("Jumlah Manusia \t\t= " + Manusia.getCounterManusia());
        System.out.println("Jumlah PNS \t\t= " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha \t= " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani \t\t= " + Petani.getCounterPetani());

        System.out.println();

        System.out.println("Pajak PNS p1 \t\t= " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 \t= " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 \t= " + pt1.hitungPajak());

        System.out.println();

        System.out.println("Masa Kerja p1 \t\t= " + p1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pe1 \t\t= " + pe1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pt1 \t\t= " + pt1.hitungMasaKerja() + " tahun");

        System.out.println();

        p1.cetakInfo();
        System.out.println();

        pe1.cetakInfo();
        System.out.println();

        pt1.cetakInfo();
        System.out.println();

    }
}
