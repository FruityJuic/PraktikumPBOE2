import java.time.LocalDate;

public class Mobil extends Kendaraan_darat implements Jarak{
    private int jumlahPintu;
    private int jumlahKursi;

    public Mobil(String merek, String pemilik, LocalDate tahun_buat, String nomor_kendaraan, Mesin mesin,
                 int jumlahRoda, String transmisi,
                 int jumlahPintu, int jumlahKursi) {
        super(merek, pemilik, tahun_buat, nomor_kendaraan, mesin, jumlahRoda, transmisi);
        assert(jumlahPintu >= 2):"jumlah pintu harus sama dengan lebih dari 2";
        this.jumlahPintu = jumlahPintu;
        this.jumlahKursi = jumlahKursi;
    }

    public Mobil() {
        super();
        this.jumlahPintu = 0;
        this.jumlahKursi = 0;
    }

    public void setJumlahPintu(int jumlahPintu) { 
        assert(jumlahPintu >= 2):"jumlah pintu harus sama dengan lebih dari 2";
        this.jumlahPintu = jumlahPintu; 
    }
    public int getJumlahPintu()                 { 
        return jumlahPintu; 
    }
    public void setJumlahKursi(int jumlahKursi) { 
        this.jumlahKursi = jumlahKursi; 
    }
    public int getJumlahKursi()                 { 
        return jumlahKursi; 
    }

    @Override
    public void CetakInfo() {
        System.out.println("=== INFO MOBIL ===");
        super.CetakInfo();
        System.out.println("Jumlah Pintu      : " + jumlahPintu);
        System.out.println("Jumlah Kursi      : " + jumlahKursi);
    }

    @Override
    public String bergerak() {
        return "Mobil " + merek + " melaju di jalan raya";
    }

    @Override
    public String Jenisbahanbakar() {
        return "Bensin / Solar";
    }
    @Override
    public double hitungJarak() {
        // Contoh: Jarak = Sisa BBM * 12 km/liter (asumsi efisiensi mobil)
        return this.mesin.getIsiBBM() * 12.0;
    }
}