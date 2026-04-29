import java.time.LocalDate;

public abstract class Kendaraan_darat extends Kendaraan {
    // Atribut dengan modifier '#' (Protected) sesuai diagram
    protected int jumlahRoda;
    protected String transmisi;
    protected static int Counterkendaraandarat = 0;

    // Konstruktor
    public Kendaraan_darat(String merek, String pemilik, LocalDate tahun_buat, String nomor_kendaraan, Mesin mesin, int jumlahRoda, String transmisi) {
        // Menggunakan super untuk memanggil konstruktor class Kendaraan
        super(merek, pemilik, tahun_buat, nomor_kendaraan, mesin);
        assert(jumlahRoda > 1):"jumlah roda harus lebih dari 1";
        this.jumlahRoda = jumlahRoda;
        this.transmisi = transmisi;
        Counterkendaraandarat++;
    }
    public Kendaraan_darat() {
        super();
        this.jumlahRoda = 0;
        this.transmisi = "";
    }

    // Setter - Menggunakan void (Aksi simpan)
    public void setJumlahRoda(int jumlahRoda) {
        assert(jumlahRoda > 1):"jumlah roda harus lebih dari 1";
        this.jumlahRoda = jumlahRoda;

    }

    public void setTransmisi(String transmisi) {
        this.transmisi = transmisi;
    }

    // Getter - Non-void (Mengambil data)
    public int getJumlahRoda() {
        return this.jumlahRoda;
    }

    public String getTransmisi() {
        return this.transmisi;
    }
    public static int getCounterKendaraanDarat() {
        return Counterkendaraandarat;
    }

    // Override cetakInfo dari class Kendaraan
    @Override
    public void CetakInfo() {
        super.CetakInfo(); // Mencetak info merk, pemilik, dll dari parent
        System.out.println("Jumlah Roda       : " + jumlahRoda);
        System.out.println("Transmisi         : " + transmisi);
    }
}