/* Nama File    : Manusia.java
 * Deskripsi    : File berisi kode konstruksi,getter dan setter Manusia
 * Pembuat      : Rahmat Argyandha Aminuddin
 * Tanggal      : 24 Maret 2026
 */

import java.time.LocalDate;

public abstract class Manusia {
   
    // kode protected supaya bisa diakses oleh keturunannya
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public abstract int hitungMasaKerja();

    public Manusia (String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    public Manusia() {
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.of(2000, 1, 1);
        this.alamat = "";
        this.pendapatan = 0.0;
    }
    // getter
    public String getNama() {
        return this.nama;
    }
    public LocalDate getTgl() {
        return this.tgl_mulai_kerja;
    }
    public String getalamat() {
        return this.alamat;
    }
    public double getpendapatan() {
        return this.pendapatan;
    }
    public static int getCounterMns() {
        return counterMns;
    }

    //setter
    public String setNama(String nama) {
        return this.nama = nama;
    }
    public LocalDate setTgl(LocalDate tgl_mulai_kerja) {
        return this.tgl_mulai_kerja = tgl_mulai_kerja;
    }
    public String setAlamat(String alamat) {
        return this.alamat = alamat;
    }
    public double setPendapat(double pendapatan) {
        return this.pendapatan = pendapatan;
    }

    public void cetakInfo () {
        System.out.println("nama dia adalah " + nama);
        System.out.println("tanggal dia mulai kerja adalah "+ tgl_mulai_kerja);
        System.out.println("alamat dia di " + alamat);
        System.err.println("pendapatan dia adalah " + pendapatan);
    }

}
