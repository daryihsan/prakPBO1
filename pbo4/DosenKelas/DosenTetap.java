import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen{
    private String NIDN;

    public DosenTetap(){
    }

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gajiPokok, String Fakultas){
        super(NIP, nama, tanggal_lahir, TMT, gajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    public double getTunjangan() {
        int masaKerja = Period.between(getTMT(), LocalDate.now()).getYears();
        return 0.02 * masaKerja * getGajiPokok();
    }

    public LocalDate getBUP(int usiaPensiun) {
        LocalDate bup = getTanggal_lahir().plusYears(usiaPensiun);
        return LocalDate.of(bup.getYear(), bup.getMonth().plus(1), 1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP \t\t: " + getNIP());
        System.out.println("NIDN \t\t: " + getNIDN());
        System.out.println("Nama \t\t: " + getNama());
        System.out.println("Tanggal Lahir \t: " + getFormattedDate(getTanggal_lahir()));
        System.out.println("TMT \t\t: " + getFormattedDate(getTMT()));
        System.out.println("Jabatan \t: Dosen Tetap");
        System.out.println("Fakultas \t: " + getFakultas());
        System.out.println("Masa Kerja \t: " + getMasaKerja());
        System.out.println("BUP \t\t: " + getFormattedDate(getBUP(65)));
        System.out.println("Gaji Pokok \t: " + formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan \t: " + formatRupiah(getTunjangan()));
    }
}