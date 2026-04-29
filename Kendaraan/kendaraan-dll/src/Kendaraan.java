import java.time.LocalDate;

public abstract class Kendaraan {

    // atribut
    protected String merek;
    protected String pemilik;
    protected LocalDate tahun_buat;
    protected String nomor_kendaraan;
    protected static int counterkendaraan = 0;
    protected Mesin mesin;

    // abstract method
    public abstract String bergerak();
    public abstract String Jenisbahanbakar();

    // konstruktor
    public Kendaraan (String merek, String pemilik, LocalDate tahun_buat, String nomor_kendaraan, Mesin mesin) {
        assert(pemilik != null):"Data gagal disimpan: Nama pemilik tidak boleh kosong!";
        assert(nomor_kendaraan != null && nomor_kendaraan.length() <= 5):"nomor kendaraan ga boleh kosong dan maksimal panjang 5 angka";
        this.merek = merek;
        this.pemilik = pemilik;
        this.tahun_buat = tahun_buat;
        this.nomor_kendaraan = nomor_kendaraan;
        this.mesin = mesin;
        counterkendaraan++;
    }
    public Kendaraan() {
        this.merek = "";
        this.pemilik = "";
        this.tahun_buat = LocalDate.of(2000, 1, 1);
        this.nomor_kendaraan = "";
        this.mesin = new Mesin();
    }

    // setter
    public void setMerek(String merek) {
        this.merek = merek;
    }
    public void setPemilik(String pemilik) {
        assert(pemilik != null):"Data gagal disimpan: Nama pemilik tidak boleh kosong!";
        this.pemilik = pemilik;
    }
    public void setTahunbuat(LocalDate tahun_buat) {
        this.tahun_buat = tahun_buat;
    }
    public void setNomorkendaraan(String nomor_kendaraan) {
        assert(nomor_kendaraan != null && nomor_kendaraan.length() <= 5):"nomor kendaraan ga boleh kosong dan maksimal panjang 5 angka";
        this.nomor_kendaraan = nomor_kendaraan;
    }

    // getter
    public String getMerek() {
        return this.merek;
    }
    public String getPemilik() {
        return this.pemilik;
    }
    public LocalDate getTahunbuat() {
        return this.tahun_buat;
    }
    public String getNomorkendaraan() {
        return this.nomor_kendaraan;
    }
    public static int getCounterKendaraan() {
        return counterkendaraan++;
    }

    // fungsi menampilkan semuanya
    public void CetakInfo() {
        System.out.println("merek kendaraan dia adalah " + merek);
        System.out.println("Pemiliknya adalah " + pemilik);
        System.out.println("Tahun dibuatnya adalah tahun " + tahun_buat);
        System.out.println("nomor kendaraannya adalah " + nomor_kendaraan);
    }
    
}
