import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{
    private String bidang;

    public Tendik(){
    }

    public Tendik (String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gajiPokok, String bidang){
        super(NIP, nama, tanggal_lahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang(){
        return bidang;
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    public double getTunjangan() {
        int masaKerja = Period.between(getTMT(), LocalDate.now()).getYears();
        return 0.01 * masaKerja * getGajiPokok();
    }

    public LocalDate getBUP(int usiaPensiun) {
        LocalDate bup = getTanggal_lahir().plusYears(usiaPensiun);
        return LocalDate.of(bup.getYear(), bup.getMonth().plus(1), 1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP : " + getNIP());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getFormattedDate(getTanggal_lahir()));
        System.out.println("TMT : " + getFormattedDate(getTMT()));
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " + getMasaKerja());
        System.out.println("BUP : " + getFormattedDate(getBUP(55)));
        System.out.println("Gaji Pokok : " + formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan : " + formatRupiah(getTunjangan()));
    }
}
