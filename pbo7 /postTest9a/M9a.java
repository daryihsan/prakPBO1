/* Nama File    : M9a.java
 * Deskripsi    : berisi main driver untuk post test 9a
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 22 April 2025
 */

package tugas9a;

import java.util.ArrayList;
public class M9a {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Manager pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> employee = new ArrayList<Pegawai>();
        employee.add(pegawai1);
        employee.add(pegawai2);
        employee.add(pegawai3);

        for (Pegawai empPegawai : employee) {
            empPegawai.tampilData();
        }
    }
}

//2. Jelaskan manfaat polimorfisme pada kasus ini.
//Jawab:
//Dengan polimorfisme, kita bisa menangani berbagai tipe objek (Manager dan Programmer) 
//dengan cara general lewat referensi tipe induk (Pegawai). 
//Hal ini memungkinkan penambahan pegawai baru tanpa harus mengubah kode yang sudah ada, 
//hanya buat kelas turunan baru dan menyesuaikan implementasi tampilData() sesuai kebutuhan

//3. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa
//permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
//Jawab:
//Tanpa polimorfisme, jika kita menambah pegawai baru (misalnya pegawai4 dan pegawai5), 
//kita butuh logika tambahan di dalam main untuk menangani tiap jenis pegawai secara terpisah. 
//Misal, jika pegawai4 adalah Programmer, kita perlu menulis kode khusus untuk itu, 
//yang bisa mengakibatkan duplikasi. Dengan polimorfisme, penambahan pegawai baru bisa dilakukan lebih mudah, 
//hanya buat kelas baru dan memakai tampilData() yang ada.