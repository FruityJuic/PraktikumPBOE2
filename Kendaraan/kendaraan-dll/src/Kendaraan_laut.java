import java.time.LocalDate;

public abstract class Kendaraan_laut extends Kendaraan {
    // Atribut dengan modifier '#' (Protected) sesuai diagram
    protected double kapasitas;
    protected String jenismesin;
    protected String tipe_lambung;
    protected static int CounterKendaraanLaut = 0;

     // Konstruktor
    public Kendaraan_laut(String merek, String pemilik, LocalDate tahun_buat, String nomor_kendaraan, Mesin mesin, double kapasitas, String jenismesin, String tipe_lambung) {
        // Menggunakan super untuk memanggil konstruktor class Kendaraan
        super(merek, pemilik, tahun_buat, nomor_kendaraan, mesin);
        this.kapasitas = kapasitas;
        this.jenismesin = jenismesin;
        this.tipe_lambung = tipe_lambung;
        CounterKendaraanLaut++;
    }
    public Kendaraan_laut() {
        super();
        this.kapasitas = 0.0;
        this.jenismesin = "";
        this.tipe_lambung = "";
    }
    // --- SETTER (Void - Aksi Mengubah Data) ---
    public void setKapasitas(double kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void setJenisMesin(String jenismesin) {
        this.jenismesin = jenismesin;
    }

    public void setTipeLambung(String tipe_lambung) {
        this.tipe_lambung = tipe_lambung;
    }

    // --- GETTER (Non-Void - Mengambil Data) ---
    public double getKapasitas() {
        return this.kapasitas;
    }

    public String getJenisMesin() {
        return this.jenismesin; 
    }

    public String getTipeLambung() {
        return this.tipe_lambung;
    }
    public static int getCounterKendaraanLaut() {
        return CounterKendaraanLaut;
    }

    // --- OVERRIDE CETAK INFO ---
    @Override
    public void CetakInfo() {
        super.CetakInfo(); // Memanggil cetakInfo dari class Kendaraan
        System.out.println("Kapasitas Kapal   : " + kapasitas + " Ton/m3");
        System.out.println("Jenis Mesin       : " + jenismesin);
        System.out.println("Tipe Lambung      : " + tipe_lambung);
    }
}

