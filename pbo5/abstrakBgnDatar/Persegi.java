/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 18 Maret 2025
 */

public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi(){
        super(4, "Putih", "Hitam");
        this.sisi = 1.0;
    }

    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi \t\t: " + sisi);
        System.out.println("Luas \t\t: " + getLuas());
        System.out.println("Keliling \t: " + getKeliling());
        System.out.println("Diagonal \t: " + getDiagonal());
    }

    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
}
