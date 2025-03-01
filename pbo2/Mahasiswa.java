/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 25 Februari 2025
 */

package kuliah;

import java.util.ArrayList;

public class Mahasiswa {
    /**************ATRIBUT**************/
    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList<Matkul> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraanMhs;
    
    /**********METHOD************/
    //konstruktor dengan parameter
    public Mahasiswa(String nimBaru, String namaMhs, String prodiMhs){
        this.NIM = nimBaru;
        this.Nama = namaMhs;
        this.Prodi = prodiMhs;
        this.listMatkul = new ArrayList<>();
    }

    //konstruktor untuk membuat Mahasiswa (' ',' ', ' ', <>)
    public Mahasiswa(){
        this.NIM = " ";
        this.Nama = " ";
        this.Prodi = " ";
        this.listMatkul = new ArrayList<>(); //inisisalisasi ArrayList kosong
    }

    //mengembalikan nim mhs
    public String getNim(){
        return NIM;
    }

    //mengembalikan nama mhs
    public String getNamaMHS(){
        return Nama;
    }

    //mengembalikan prodi mhs
    public String getProdi(){
        return Prodi;
    }

    //mengeset doswal ke object mahasiswa
    public void setDoswal(Dosen dosenNew){
        this.dosenWali = dosenNew;
    }

    //mengeset kendaraan ke object mahasiswa
    public void setKdrnMhs(Kendaraan kdrnNew){
        this.kendaraanMhs = kdrnNew;
    }

    //mengeset matkul ke dalam list matkul mhs
    public void addMK(Matkul mkBaru){
        if(listMatkul.size() < 50){
            listMatkul.add(mkBaru);
        }
        else{
            System.out.println("Maksimal matkul adalah 50");
        }
    }

    //mengembalikan jumlah sks pada mahasiswa
    public int getJumSKS(){
        int totSKS = 0;
        for(Matkul mkBaru : listMatkul){
            totSKS = totSKS + mkBaru.getSKS();
        }
        return totSKS;
    }

    //mengembalikan jumlah matkul dari mahasiswa
    public int getJumMK(){
        return listMatkul.size();
    }

    //menampilkan atribut dan nilai dari atribut mahasiswa
    public void printMHS(){
        System.out.println("NIM : " + NIM);
        System.out.println("Nama  : " + Nama);
        System.out.println("Prodi  : " + Prodi);
    }

    //menampilkan mahasiswa secara detail
    public void printDetailMHS(){
        printMHS();
        System.out.println("Jumlah Matkul yang diambil " + getNamaMHS() + " : " + getJumMK());
        System.out.println("Total SKS yang diambil" + getNamaMHS() + " : " + getNamaMHS());
        System.out.println("Matkul yang diambil" + getNamaMHS() + " : ");
        int i;
        for(i = 0; i < listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getNamaMK());
        }
        if(dosenWali != null){
            dosenWali.printDosen();
        }
        if(kendaraanMhs != null){
            kendaraanMhs.printKendaraan();
        }
    }
}
