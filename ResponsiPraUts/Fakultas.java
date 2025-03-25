/* Nama File    : Fakultas.java
 * Deskripsi    : berisi atribut dan method dalam abstract class Fakultas
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 25 Maret 2025
 */

import java.util.ArrayList;
import java.util.List;

public class Fakultas {
    private String nama;
    private int tarifUKT;
    private int gajiPokok;
    private List<Mahasiswa> daftarMahasiswa;
    private List<Dosen> daftarDosen;
    
    public Fakultas(){
        this(" ", 0, 0);
        this.daftarMahasiswa = new ArrayList<>(); 
        this.daftarDosen = new ArrayList<>();
    }
    
    public Fakultas(String namaF, int tarifUKTFak, int gajiPokokFak) {
        this.nama = namaF;
        this.tarifUKT = tarifUKTFak;
        this.gajiPokok = gajiPokokFak;
        this.daftarMahasiswa = new ArrayList<>(); 
        this.daftarDosen = new ArrayList<>();
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String namaF) {
        this.nama = namaF;
    }
    
    public int getTarifUKT() {
        return tarifUKT;
    }

    public void setTarifUKT(int tarifUKTFak){
        this.tarifUKT = tarifUKTFak;
    }
    
    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokokFak){
        this.gajiPokok = gajiPokokFak;
    }

    public List<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public List<Dosen> getDaftarDosen() {
        return daftarDosen;
    }
    
    public void tambahDosen(Dosen d) {
        daftarDosen.add(d);
    }    

    public void tampilkanInfo() {
        System.out.println("Fakultas\t\t: " + nama);
        System.out.println("Tarif UKT\t\t: Rp" + tarifUKT);
        System.out.println("Gaji Pokok\t\t: Rp" + gajiPokok);
    }    
}
