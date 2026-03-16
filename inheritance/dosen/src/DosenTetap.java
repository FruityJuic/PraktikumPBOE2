import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DosenTetap extends Dosen {

    private String NIDN;
    private String BUP;

    public DosenTetap(String NIP, String nama, LocalDate tanggal_lahir, int TMT, double gajipokok, String Fakultas, String NIDN, String BUP) {
        super(NIP, nama, tanggal_lahir, TMT, gajipokok, Fakultas);
        this.NIDN = NIDN;
        this.BUP = hitungBUP();
    }
    public DosenTetap () {
        super();
        this.NIDN = "";
        this.BUP = "";
    }

    public String GetNIDN() {
        return NIDN;
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
    public double getTunjangan() {
        return getGajiPokok() * 0.20;
    }

}
