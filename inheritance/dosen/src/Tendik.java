import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tendik extends Pegawai {

    private String bidang;
    private String BUP;

    public Tendik(String NIP, String nama, LocalDate tanggal_lahir, int TMT, double gajipokok, String Fakultas, String bidang, String BUP) {
        super(NIP, nama, tanggal_lahir, TMT, gajipokok);
        this.bidang = bidang;
        this.BUP = hitungBUP();
    }
    public Tendik() {
        super();
        this.bidang = "";
        this.BUP = "";
    }
    public String bidang() {
        return bidang;
    }
    public String BUP() {
        return BUP;
    }
    public String hitungBUP(int usiaPensiun) {
        LocalDate birthDate = this.tanggal_lahir;
        LocalDate bupDate = birthDate.plusYears(usiaPensiun).withDayOfMonth(1).plusMonths(1);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return bupDate.format(outputFormatter);
    }
    public String hitungBUP() {
        return hitungBUP(65); 
    }
}
