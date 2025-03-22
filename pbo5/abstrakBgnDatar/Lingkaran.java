/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 18 Maret 2025
 */

public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public Lingkaran(){
        super(1, "Putih", "Hitam");        
        this.jari = 1.0;
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari \t: " + jari);
        System.out.println("Luas \t\t: " + getLuas());
        System.out.println("Keliling \t: " + getKeliling());
    }

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }
}
