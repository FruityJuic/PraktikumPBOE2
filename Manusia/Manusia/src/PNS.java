/* Nama File    : PNS.java
 * Deskripsi    : File berisi PNS
 * Pembuat      : Rahmat Argyandha Aminuddin
 * Tanggal      : 24 Maret 2026
 */


import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements pajak {
    
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    public PNS() {
        super();
        this.nip = "";
    }

    // getter
    public String getnip() {
        return this.nip;
    }
    public static int getCounterPNS() {
        return counterPNS;
    }

    //setter
    public String setnip(String nip) {
        return this.nip = nip;
    }

    // hitungpajak
    @Override
    public double hitungPajak() {
        return 0.1 * this.getpendapatan();
    }

    // hitung masa kerja
    @Override
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();

        Period selisih = Period.between(this.getTgl(), sekarang);

        int totalMasaKerja = selisih.getYears() + 1;
        return totalMasaKerja;

    }

    // cetak info
    @Override
    public void cetakInfo () {
        System.out.println("nama dia adalah " + nama);
        System.out.println("tanggal dia mulai kerja adalah "+ tgl_mulai_kerja);
        System.out.println("alamat dia di " + alamat);
        System.out.println("pendapatan dia adalah " + pendapatan);
        System.out.println("nip dia adalah "+ nip);
        System.out.println("pajak dia adalah " + hitungPajak());
        System.out.println("dia bekerja selama "+ hitungMasaKerja() + " tahun");
    }
}
