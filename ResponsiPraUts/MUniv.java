/* Nama File    : MUniv.java
 * Deskripsi    : berisi main driver untuk Universitas 
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 25 Maret 2025
 */

public class MUniv {
    public static void main(String[] args) {
        Universitas undip = new Universitas("Universitas Diponegoro");

        Fakultas informatika = new Fakultas("Informatika", 7500000, 5000000);
        Fakultas ekonomi = new Fakultas("Ekonomi", 7000000, 4800000);
        undip.tambahFakultas(informatika);
        undip.tambahFakultas(ekonomi);

        Mahasiswa M1 = new Mahasiswa("Dary Ihsan Amanullah", "dary@email.com", "24060123130073", 4, informatika);
        Mahasiswa M2 = new Mahasiswa("Andi", "andi@email.com", "24060123130075", 2, ekonomi);
        informatika.tambahMahasiswa(M1);
        informatika.tambahMahasiswa(M2);

        Dosen D1 = new Dosen("Hadi", "hadi@email.com", "123456789", 10, informatika);
        Dosen D2 = new Dosen("Rina", "rina@email.com", "987654321", 8, ekonomi);
        informatika.tambahDosen(D1);
        informatika.tambahDosen(D2);

        Tendik T1 = new Tendik("Budi", "budi@email.com", "876543210", 5, undip);
        Tendik T2 = new Tendik("Siti", "siti@email.com", "765432109", 3, undip);

        System.out.println("=== Data Universitas ===");
        System.out.println("Nama Universitas: " + undip.getNama());

        System.out.println("\n=== Data Fakultas ===");
        for (Fakultas f : undip.getDaftarFakultas()) {
            System.out.println("- " + f.getNama());
        }

        System.out.println("\n=== Data Mahasiswa ===");
        for (Mahasiswa m : informatika.getDaftarMahasiswa()) {
            m.printInfo();
            System.out.println();
        }
        System.out.println("Jumlah Mahasiswa: " + Mahasiswa.getCounterMhs());

        System.out.println("\n=== Data Dosen ===");
        for (Dosen d : informatika.getDaftarDosen()) {
            d.printInfo();
            System.out.println();
        }
        System.out.println("Jumlah Dosen\t: " + Dosen.getCounterDsn());

        System.out.println("\n=== Data Tendik ===");
        T1.printInfo();
        System.out.println();
        T2.printInfo();
        System.out.println("\nJumlah Tendik\t: " + Tendik.getCounterTendik());
    }
}
