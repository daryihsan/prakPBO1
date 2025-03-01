/* Nama File    : Matkul.java
 * Deskripsi    : berisi atribut dan method dalam class Matkul
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 25 Februari 2025
 */

package kuliah;

public class Matkul {
    /**************ATRIBUT**************/
    private String idMatkul;
    private String NamaMK;
    private int SKS;
    
    /**********METHOD************/
    //konstruktor dengan parameter
    public Matkul(String idBaru, String mkBaru, int sksMK){
        this.idMatkul = idBaru;
        this.NamaMK = mkBaru;
        this.SKS = sksMK;
    }

    //konstruktor untuk membuat Matkul (' ',' ',0)
    public Matkul(){
        this.idMatkul = " ";
        this.NamaMK = " ";
        this.SKS = 0;
    }

    //mengembalikan nilai idMatkul
    public String getIdMatkul(){
        return idMatkul;
    }

    //mengembalikan nilai nama matkul
    public String getNamaMK(){
        return NamaMK;
    }

    //mengembalikan nilai SKS dari matkul
    public int getSKS(){
        return SKS;
    }

    //mengeset id matkul dengan nilai baru x
    public void setIdMatkul(String idBaru){
        this.idMatkul = idBaru;
    }

    //mengeset nama matkul dengan nilai baru y
    public void setNamaMK(String mkBaru){
        this.NamaMK = mkBaru;
    }

    //mengeset sks dengan nilai baru z
    public void setSKS(int sksMK){
        this.SKS = sksMK;
    }
}
