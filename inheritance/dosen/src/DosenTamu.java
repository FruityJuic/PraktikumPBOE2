import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DosenTamu extends Dosen {
    private String NIDK;
    private String BUP;

    public DosenTamu(String NIP, String nama, LocalDate tanggal_lahir, int TMT, double gajipokok, String Fakultas, String NIDK, String BUP) {
        super(NIP, nama, tanggal_lahir, TMT, gajipokok, Fakultas);
        this.NIDK = NIDK;
        this.BUP = hitungBUP();
    }
    public DosenTamu() {
        super();
        this.NIDK = "";
        this.BUP = "";
    }
    public String getNIDK() {
        return NIDK;
    }
    public String getBUP() {
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
    public double getTunjangan() {
        return getGajiPokok() * 0.20;
    }
}
