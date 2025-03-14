import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;
import java.text.NumberFormat;

public class Pegawai {
    private String NIP;
    private String nama;
    private LocalDate tanggal_lahir;
    private LocalDate TMT;
    private double gajiPokok;

    public Pegawai(){
    }

    public Pegawai(String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTanggal_lahir(){
        return tanggal_lahir;
    } 

    public void setTanggal_lahir(LocalDate tanggal_lahir){
        this.tanggal_lahir = tanggal_lahir;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public String getFormattedDate(LocalDate date) {
        return date.getDayOfMonth() + " " + date.getMonth().getDisplayName(TextStyle.FULL, Locale.of("id", "ID")) + " " + date.getYear();
    }

    public String getMasaKerja() {
        Period period = Period.between(TMT, LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    public String formatRupiah(double amount) {
        return NumberFormat.getCurrencyInstance(Locale.of("id", "ID")).format(amount);
    }

    public void printInfo() {
    }
}
