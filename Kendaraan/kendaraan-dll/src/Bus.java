import java.time.LocalDate;

public class Bus extends Kendaraan_darat implements Jarak {
    private int jumlahPenumpang;
    private double hargaTiket;

    public Bus(String merek, String pemilik, LocalDate tahun_buat, String nomor_kendaraan, Mesin mesin,
            int jumlahRoda, String transmisi,
            int jumlahPenumpang, double hargaTiket) {
        super(merek, pemilik, tahun_buat, nomor_kendaraan, mesin, jumlahRoda, transmisi);
        assert(jumlahPenumpang > 10):"jumlah penumpang harus lebih dari 10";
        this.jumlahPenumpang = jumlahPenumpang;
        this.hargaTiket = hargaTiket;
    }

    public Bus() {
        super();
        this.jumlahPenumpang = 0;
        this.hargaTiket = 0;
    }

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public int getJumlahPenumpang() {
        assert(jumlahPenumpang > 10):"jumlah penumpang harus lebih dari 10";
        return jumlahPenumpang;
    }

    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(double hargaTiket, double diskon) {
        this.hargaTiket = hargaTiket - (hargaTiket * diskon);
    }

    @Override
    public void CetakInfo() {
        System.out.println("=== INFO BUS ===");
        super.CetakInfo();
        System.out.println("Jumlah Penumpang : " + jumlahPenumpang);
        System.out.println("Harga Tiket      : " + hargaTiket);
    }

    @Override
    public String bergerak() {
        return "Bus " + merek + " berjalan mengangkut penumpang";
    }

    @Override
    public String Jenisbahanbakar() {
        return "Solar";
    }
    @Override
    public double hitungJarak() {
        // Contoh: Jarak = Sisa BBM * 8.0 km/liter (bus lebih boros)
        return this.mesin.getIsiBBM() * 8.0;
    }
}