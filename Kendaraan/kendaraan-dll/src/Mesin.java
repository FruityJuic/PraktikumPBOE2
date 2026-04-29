public class Mesin {
    // Atribut Private sesuai simbol '-' di diagram
    private String tipeMesin;
    private int tenagaKuda;
    private double kapasitasBBM;
    private int isiBBM;

    // Konstruktor Parameter
    public Mesin(String tipeMesin, int tenagaKuda, double kapasitasBBM, int isiBBM) {
        this.tipeMesin = tipeMesin;
        this.tenagaKuda = tenagaKuda;
        this.kapasitasBBM = kapasitasBBM;
        this.isiBBM = isiBBM;
    }

    // Konstruktor Default (Tanpa Parameter)
    public Mesin() {
        this.tipeMesin = "Standar";
        this.tenagaKuda = 0;
        this.kapasitasBBM = 0.0;
        this.isiBBM = 0;
    }

    // --- SETTER (Void) ---
    public void setTipeMesin(String tipeMesin) {
        this.tipeMesin = tipeMesin;
    }

    public void setTenagaKuda(int tenagaKuda) {
        this.tenagaKuda = tenagaKuda;
    }
    public void setIsiBbm(int isiBBM) {
        this.isiBBM = isiBBM;
    }

    // --- GETTER (Non-Void) ---
    public String getTipeMesin() {
        return this.tipeMesin;
    }

    public double getKapasitasBBM() {
        return this.kapasitasBBM;
    }
    public int getIsiBBM() {
        return this.isiBBM;
    }
    public int getTenagaKuda() {
        return this.tenagaKuda;
    }

    // --- METHOD LAINNYA ---

    public void bergerak() {
        System.out.println("Mesin sedang beroperasi...");
    }

    public void cetakInfo() {
        System.out.println("--- INFO MESIN ---");
        System.out.println("Tipe Mesin    : " + tipeMesin);
        System.out.println("Tenaga Kuda   : " + tenagaKuda + " HP");
        System.out.println("Kapasitas BBM : " + kapasitasBBM + " Liter");
    }
    // --- OVERLOADING METHOD isiBBM (3 Variasi) ---

    // 1. Mengisi bensin dengan jumlah spesifik (Liter)
    public void isiBBM(int jumlah) {
        this.isiBBM = this.isiBBM + jumlah;
        System.out.println("Berhasil mengisi bensin sebanyak: " + jumlah + " Liter.");
        System.out.println("Total bensin sekarang: " + this.isiBBM + " Liter.");
    }

    // 2. Mengisi bensin sampai penuh (Full Tank)
    // Ciri Overloading: Tidak pakai parameter
    public void isiBBM() {
        this.isiBBM = (int) this.kapasitasBBM; // Mengisi sesuai kapasitas maksimal
        System.out.println("Tangki diisi sampai penuh (Full Tank)!");
        System.out.println("Bensin sekarang: " + this.isiBBM + " Liter.");
    }

    // 3. Mengisi bensin berdasarkan harga (Rupiah)
    // Ciri Overloading: Tipe data parameter berbeda (misal String untuk jenis bensin)
    public void isiBBM(int harga, int hargaPerLiter) {
        int jumlahLiter = harga / hargaPerLiter;
        this.isiBBM += jumlahLiter;
        System.out.println("Membeli bensin seharga Rp" + harga);
        System.out.println("Mendapatkan: " + jumlahLiter + " Liter.");
    }
}