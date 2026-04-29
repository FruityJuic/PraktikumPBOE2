import java.time.LocalDate;

public class Sedan extends Kendaraan_darat implements Jarak {
    private boolean isRoof;

    public Sedan(String merek, String pemilik, LocalDate tahun_buat, String nomor_kendaraan, Mesin mesin, int jumlahRoda, String transmisi,
                 boolean isRoof) {
        super(merek, pemilik, tahun_buat, nomor_kendaraan, mesin, jumlahRoda, transmisi);
        this.isRoof = isRoof;
    }

    public Sedan() {
        super();
        this.isRoof = false;
    }

    public void setIsRoof(boolean isRoof) { this.isRoof = isRoof; }
    public boolean getIsRoof()            { return isRoof; }

    @Override
    public void CetakInfo() {
        System.out.println("=== INFO SEDAN ===");
        super.CetakInfo();
        System.out.println("Sunroof           : " + (isRoof ? "Ada" : "Tidak Ada"));
    }

    @Override
    public String bergerak() {
        return "Sedan " + merek + " melaju mulus di jalan raya";
    }

    @Override
    public String Jenisbahanbakar() {
        return "Pertamax";
    }
    @Override
    public double hitungJarak() {
        // Contoh: Jarak = Sisa BBM * 12 km/liter (asumsi efisiensi mobil)
        return this.mesin.getIsiBBM() * 12.0;
    }
}