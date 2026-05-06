/*nama: Rahmat Argyandha Aminuddin
  nim: 24060124130061
  lab: E2 */


package Civitasakademika;

public class Main {
    public static void main(String[] args) {

        // e. buat objek dosen
        Dosen d1 = new Dosen("Pak Budi", "D001");
        Dosen d2 = new Dosen("Bu Sari", "D002");

        // e. buat objek mahasiswa
        Mahasiswa m1 = new Mahasiswa("Andi", "M001");
        Mahasiswa m2 = new Mahasiswa("Budi", "M002");
        Mahasiswa m3 = new Mahasiswa("Citra", "M003");
        Mahasiswa m4 = new Mahasiswa("Dina", "M004");
        Mahasiswa m5 = new Mahasiswa("Eko", "M005");

        // i. set dosen wali
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        // b. buat seminar
        Seminar seminar = new Seminar();

        // f. registrasi semua peserta
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        // c. countPeserta
        System.out.println("Total Peserta: " + seminar.CountPeserta());

        // g. tampil peserta
        seminar.tampilPeserta();

        // h. countMahasiswa
        System.out.println("Jumlah Mahasiswa: " + seminar.CountMahasiswa());

        // j. tampil data mahasiswa
        System.out.println("\nData Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}