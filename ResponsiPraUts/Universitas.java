/* Nama File    : Universitas.java
 * Deskripsi    : berisi atribut dan method dalam abstract class Universitas
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 25 Maret 2025
 */

import java.util.ArrayList;
import java.util.List;

public class Universitas {
    private String nama;
    private List<Fakultas> daftarFakultas;

    public Universitas() {
        this.nama = " ";
        this.daftarFakultas = new ArrayList<>();
    }

    public Universitas(String namaU) {
        this.nama = namaU;
        this.daftarFakultas = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String namaU) {
        this.nama = namaU;
    }

    public List<Fakultas> getDaftarFakultas() {
        return daftarFakultas;
    }

    public void tambahFakultas(Fakultas f) {
        daftarFakultas.add(f);
    }

    public void tampilkanFakultas() {
        if (daftarFakultas.isEmpty()) {
            System.out.println(nama + " belum memiliki fakultas.");
        } else {
            System.out.println("Daftar Fakultas di " + nama + ":");
            for (Fakultas f : daftarFakultas) {
                System.out.println("- " + f.getNama());
            }
        }
    }    

    @Override
    public String toString() {
        return "Universitas: " + nama + ", Jumlah Fakultas: " + daftarFakultas.size();
    }
}
