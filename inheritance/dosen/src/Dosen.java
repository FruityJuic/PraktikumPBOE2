import java.time.LocalDate;

public class Dosen extends Pegawai {

    private String Fakultas;

    public Dosen(String NIP, String nama, LocalDate tanggal_lahir, int TMT, double gajipokok, String Fakultas) {
        super(NIP, nama, tanggal_lahir, TMT, gajipokok);
        this.Fakultas = Fakultas;
    }
    public Dosen () {
        this.Fakultas = "";
        this.NIP = "";
        this.nama = "";
        this.tanggal_lahir = LocalDate.of(2000, 1, 1);
        this.TMT = 0;
        this.gajipokok = 0.0;
   }

    public String GetFakultas() {
        return Fakultas;
    }
    




}