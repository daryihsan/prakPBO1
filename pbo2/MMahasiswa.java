/* Nama File    : MMahasiswa.java
 * Deskripsi    : main driver untuk Mahasiswa
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 25 Februari 2025
 */

package kuliah;

public class MMahasiswa {
    public static void main(String[] args) {
        Matkul PBO = new Matkul("PBO", "Pemrograman Berorientasi Objek", 3);
        Matkul MBD = new Matkul("MBD", "Manajemen Basis Data", 3);
        Matkul Siscer = new Matkul("SSC", "Sistem Cerdas", 3);
        Matkul GKV = new Matkul("GKV", "Grafika dan Komputasi Visual", 3);
        Matkul ASA = new Matkul("ASA", "Analisis dan Strategi Algoritma", 3);
        Matkul RPL = new Matkul("RPL", "Rekayasa Perangkat Lunak", 3);

        Mahasiswa M1 = new Mahasiswa("213", "Nama", "infor");

        Dosen D1 = new Dosen("123", "Hadi", "Informatika");

        Kendaraan K1 = new Kendaraan("BG1234H", "Motor");

        M1.setDoswal(D1);
        M1.setKdrnMhs(K1);
        M1.addMK(PBO);
        M1.addMK(MBD);
        M1.addMK(GKV);
        M1.addMK(Siscer);
        M1.addMK(ASA);
        M1.addMK(RPL);
        System.out.println("Jumlah Matkul = " + M1.getJumMK());
        System.out.println("Jumlah SKS Matkul = " + M1.getJumSKS());
        M1.printDetailMHS();
    }
}
