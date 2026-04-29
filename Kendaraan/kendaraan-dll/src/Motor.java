import java.time.LocalDate;

public class Motor extends Kendaraan_darat implements Jarak {
    private String jenisMotor;
    private String tipeRantai;

    // Perbaikan Konstruktor: Urutan parameter harus sesuai dengan super (Kendaraan_darat)
    public Motor(String merek, String pemilik, LocalDate tahun_buat, String nomor_kendaraan, Mesin mesin,
                 int jumlahRoda, String transmisi, String jenisMotor, String tipeRantai) {
        super(merek, pemilik, tahun_buat, nomor_kendaraan, mesin, jumlahRoda, transmisi);
        this.jenisMotor = jenisMotor;
        this.tipeRantai = tipeRantai;
    }

    // Konstruktor Tanpa Parameter (Default)
    public Motor() {
        super();
        this.jenisMotor = "";
        this.tipeRantai = "";
    }

    public void setJenisMotor(String jenisMotor)    { this.jenisMotor = jenisMotor; }
    public String getJenisMotor()                   { return jenisMotor; }
    public void setTipeRantai(String tipeRantai)    { this.tipeRantai = tipeRantai; }
    public String getTipeRantai()                   { return tipeRantai; }


    @Override
    public void CetakInfo() {
        System.out.println("=== INFO MOTOR ===");
        super.CetakInfo();
        System.out.println("Jenis Motor       : " + jenisMotor);
        System.out.println("Tipe Rantai       : " + tipeRantai);
    }

    @Override
    public String bergerak() {
        // Gunakan getMerek() jika atribut merek di Kendaraan bersifat private
        return "Motor ini melaju dengan jenis " + jenisMotor;
    }

    @Override
    public String Jenisbahanbakar() {
        return "Bensin";
    }

    // Implementasi interface Jarak
    @Override
    public double hitungJarak() {
        // Mengambil kapasitasBBM dari objek mesin yang ada di parent (Kendaraan)
        double bbm = this.mesin.getKapasitasBBM();
        double konsumsi = 40.0; // Asumsi 1 liter = 40km
        double jarak = bbm * konsumsi;
        return jarak;
    }
}