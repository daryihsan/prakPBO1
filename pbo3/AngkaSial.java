/* Nama File    : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri 
 *                Pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Dary Ihsan Amanullah
 * Tanggal      : 25 Februari 2025
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!");
        }
    }
}

//1
//Jika angka == 13, maka eksepsi dilempar (throw), sehingga eksekusi langsung berpindah ke blok catch.
//Karena terjadi eksepsi, baris 12 tidak akan dieksekusi saat angka 13 diproses.
//Sehingga baris 12 tidak dieksekusi jika angka adalah 13

//2
//Jika terjadi eksepsi AngkaSialException, program akan langsung masuk ke blok catch, dan baris ini akan dieksekusi.
//Dalam kasus angka 13, metode cobaAngka(13) akan melempar eksepsi, sehingga program masuk ke blok catch dan mencetak pesan dari ase.getMessage().
//Sehingga baris 21 pasti dieksekusi jika angka 13 diproses