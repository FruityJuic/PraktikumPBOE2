/* Nama File    : Pengusaha.java
 * Deskripsi    : File berisi pengusaha
 * Pembuat      : Rahmat Argyandha Aminuddin
 * Tanggal      : 24 Maret 2026
 */


import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements pajak{
    
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    public Pengusaha() {
        super();
        this.npwp = "";
    }

    //getter
    public String getNpwp() {
        return this.npwp;
    }
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // setter
    public String setNpwp(String npwp) {
        return this.npwp = npwp;
    }

    // hitung pajak
    @Override
    public double hitungPajak() {
        return 0.15 * getpendapatan();
    }

    // hitung masakerja
    @Override
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();

        Period selisih = Period.between(this.getTgl(), sekarang);

        int totalMasaKerja = selisih.getYears() + 6;

        return totalMasaKerja;
    }

    // cetak info
    @Override
    public void cetakInfo () {
        System.out.println("nama dia adalah " + nama);
        System.out.println("tanggal dia mulai kerja adalah "+ tgl_mulai_kerja);
        System.out.println("alamat dia di " + alamat);
        System.out.println("pendapatan dia adalah " + pendapatan);
        System.out.println("npwp dia adalah " + npwp);
        System.out.println("pajak dia adalah " + hitungPajak());
        System.out.println("dia bekerja selama "+ hitungMasaKerja() + " tahun");
    }
} 
