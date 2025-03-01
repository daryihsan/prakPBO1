/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 25 Februari 2025
 */

package kuliah;

public class Dosen {
    /**************ATRIBUT**************/
    private String NIP; 
    private String NamaDos;
    private String Prodi; 

    /**********METHOD************/
    //konstruktor dengan parameter
    public Dosen(String NIPbaru, String namaBaru, String prodiBaru){
        this.NIP = NIPbaru;
        this.NamaDos = namaBaru;
        this.Prodi = prodiBaru;
    }

    //konstruktor untuk membuat Dosen (' ',' ',' ')
    public Dosen(){
        this.NIP = " ";
        this.NamaDos = " ";
        this.Prodi = " ";
    }

    //mengembalikan nilai NIP dosen
    public String getNIPDos(){
        return NIP;
    }

    //mengembalikan nilai Nama dosen
    public String getNamaDos(){
        return NamaDos;
    }

    //mengembalikan nilai prodi dosen
    public String getProdiDos(){
        return Prodi;
    }

    //mengeset NIP dosen dengan nilai baru x
    public void setNIP(String NIPbaru){
        this.NIP = NIPbaru;
    }

    //mengeset Nama dosen dengan nilai baru y
    public void setNama(String namaBaru){
        this.NamaDos = namaBaru;
    }

    //mengeset Prodi dosen dengan nilai baru z
    public void setProdi(String prodiBaru){
        this.Prodi = prodiBaru;
    }

    //menampilkan dosen dan atribut
    public void printDosen(){
        System.out.println("NIP Dosen : " + NIP);
        System.out.println("Nama Dosen : " + NamaDos);
        System.out.println("Prodi yang diampu : " + Prodi);
    }
}
