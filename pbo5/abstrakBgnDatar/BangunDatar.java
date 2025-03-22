/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam abstract class BangunDatar
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 18 Maret 2025
 */

public abstract class BangunDatar{
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi \t: " + jmlSisi);
        System.out.println("Warna \t\t: " + warna);
        System.out.println("Border \t\t: " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Total objek BangunDatar yang dibuat: " + counterBangunDatar);
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKll(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}