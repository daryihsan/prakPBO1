package latihan;
/* Nama File    : Coba.java
 * Deskripsi    : berisi method dalam class Coba
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 22 April 2025
 */

public class coba {
    public static void main(String[] args) {
        //{ 15 menit } Polimorfisme Ad Hoc: Coercion
        int output1 = 'a';
        System.out.println(output1);
        //Berhasil. 'a' bertipe char dan bisa coercion otomatis ke int,
        //karena char disimpan sebagai kode ASCII ('a' = 97)

        double x = 15.5;
        int output2 = x;
        System.out.println(output2);
        //Gagal. Double ke int harusnya pakai casting eksplisit, 
        //harus (int)x, kalau tidak akan error
        //karena bisa kehilangan data (pecahan).

        int y = 25;
        double output3 = y;
        System.out.println(output3);
        //Berhasil. Int ke double bisa casting implisit (coercion otomatis), 
        //nilai 25 di-convert ke 25.0.

        int z = 78;
        char output4 = (char) z;
        System.out.println(output4);
        //Berhasil. Int ke char harus pakai casting eksplisit, 
        //harus char(z) dan sudah dilakukan. 
        //78 dalam ASCII adalah huruf N. 

        char a = 'a';
        double output5 = a;
        System.out.println(output5);
        //Berhasil. Char ke double bisa casting implisit (coercion otomatis), 
        //'a' diubah menjadi 97.0
    }
}
