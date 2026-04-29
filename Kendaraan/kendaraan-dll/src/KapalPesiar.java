import java.time.LocalDate;

public class KapalPesiar extends Kendaraan_laut implements Jarak {
    private int jumlahKamar;
    private String fasilitas;

    public KapalPesiar(String merek, String pemilik, LocalDate tahun_buat, String nomor_kendaraan, Mesin mesin, double kapasitas, String jenismesin, String tipe_lambung,
                       int jumlahKamar, String fasilitas) {
        super(merek, pemilik, tahun_buat, nomor_kendaraan, mesin, kapasitas, jenismesin, tipe_lambung);
        assert jumlahKamar >= 1 : "Logika Error: Kapal minimal harus punya 1 kamar!";
        this.jumlahKamar = jumlahKamar;
        this.fasilitas   = fasilitas;
    }

    public void setJumlahKamar(int jumlahKamar) { 
        assert jumlahKamar >= 1 : "Logika Error: Kapal minimal harus punya 1 kamar!";
        this.jumlahKamar = jumlahKamar; }
    public int getJumlahKamar()                 { return jumlahKamar; }
    public void setFasilitas(String fasilitas)  { this.fasilitas = fasilitas; }
    public String getFasilitas()                { return fasilitas; }

    @Override
    public void CetakInfo() {
        System.out.println("=== INFO KAPAL PESIAR ===");
        super.CetakInfo();
        System.out.println("  Jumlah Kamar : " + jumlahKamar + " kamar");
        System.out.println("  Fasilitas    : " + fasilitas);
    }

    @Override
    public String bergerak() {
        return "Kapal Pesiar " + merek+ " berlayar di lautan dengan lambung " + tipe_lambung;
    }

    @Override
    public String Jenisbahanbakar() {
        return "HFO (Heavy Fuel Oil)";
    }
    @Override
    public double hitungJarak() {
        // Contoh: Jarak laut = Tenaga Mesin / 100 * Sisa BBM
        return (this.mesin.getTenagaKuda() / 100.0) * this.mesin.getIsiBBM();
    }
}
