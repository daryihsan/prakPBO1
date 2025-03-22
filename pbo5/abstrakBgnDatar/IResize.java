/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi method dalam interface IResize
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 18 Maret 2025
 */

public interface IResize {
    //menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    //mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);    
}