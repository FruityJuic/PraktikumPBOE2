/* Nama File    : Petani.java
 * Deskripsi    : File berisi petani
 * Pembuat      : Rahmat Argyandha Aminuddin
 * Tanggal      : 24 Maret 2026
 */


import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements pajak{

    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }
    public Petani() {
        super();
        this.asal_kota = "";
    }

    // getter
    public String getasal_kota() {
        return this.asal_kota;
    }
    public static int getCounterPetani() {
        return counterPetani;
    }

    //setter
    public String setasal_kota(String asal_kota) {
        return this.asal_kota = asal_kota;
    }

    // hitung pajak
    @Override
    public double hitungPajak() {
        return 0.0;
    }

    // hitung masakerja
    @Override
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();

        Period selisih = Period.between(this.getTgl(), sekarang);

        int totalMasaKerja = selisih.getYears() + 0;

        return totalMasaKerja;
    }

    // cetak info
    @Override
    public void cetakInfo () {
        System.out.println("nama dia adalah " + nama);
        System.out.println("tanggal dia mulai kerja adalah "+ tgl_mulai_kerja);
        System.out.println("alamat dia di " + alamat);
        System.out.println("pendapatan dia adalah " + pendapatan);
        System.out.println("asal kota dia adalah " + asal_kota);
        System.out.println("pajak dia adalah " + hitungPajak());
        System.out.println("dia bekerja selama "+ hitungMasaKerja() + " tahun");
    }
}
