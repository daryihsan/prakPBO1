/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 25 Februari 2025
 */

package kuliah;

public class Kendaraan {
    /**************ATRIBUT**************/
    private String noPlat;
    private String Jenis;

    /**********METHOD************/
    //konstruktor dengan parameter
    public Kendaraan(String platBaru, String jenisMobil){
        this.noPlat = platBaru;
        this.Jenis = jenisMobil;
    }

    //konstruktor untuk membuat Kendaraam (' ',' ',0)
    public Kendaraan(){
        this.noPlat = " ";
        this.Jenis = " ";
    }

    //mengembalikan nilai nomor plat
    public String getNoPlat(){
        return noPlat;
    }

    //mengembalikan nilai jenis
    public String getJenis(){
        return Jenis;
    }

    //mengeset nomor plat dengan nilai baru x
    public void setNoPlat(String platBaru){
        this.noPlat = platBaru;
    }

    //mengeset jenis dengan nilai baru y
    public void setJenis(String jenisMobil){
        this.Jenis = jenisMobil;
    }

    //menampilkan dosen dan atribut
    public void printKendaraan(){
        System.out.println("Plat Kendaraan Mahasiswa : " + noPlat);
        System.out.println("Jenis Kendaraan Mahasiswa : " + Jenis);
    }
}
