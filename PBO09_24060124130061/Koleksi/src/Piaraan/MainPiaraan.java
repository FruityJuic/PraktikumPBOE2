package Piaraan;

// Nama File    : MainPiaraan.java
// NIM          : 24060124130061
// Nama         : Rahmat Argyandha Aminuddin
// Tanggal      : 13 Mei

public class MainPiaraan {
    public static void main(String[] args) {

        // Membuat objek Piaraan
        Piaraan p = new Piaraan();

        // Membuat objek Anabul/Kucing
        Kucing k1 = new Kucing("Milo", 4.5);
        Kucing k2 = new Kucing("Oyen", 5.2);
        Kucing k3 = new Kucing("Kitty", 3.8);

        // Menambahkan anabul ke antrean
        p.enqueueAnabul(k1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(k3);

        // Menampilkan semua anabul
        System.out.println("=== Daftar Anabul ===");
        p.showAnabul();

        // Menampilkan jumlah anabul
        System.out.println("\nJumlah Anabul : " + p.getNbelm());

        // Mengecek member
        System.out.println("Apakah Milo ada? " + p.isMember(k1));

        // Menampilkan anabul terdepan
        System.out.println("\nAnabul terdepan : " + p.getanabul().getNama());

        // Menghapus anabul dari antrean
        Anabul keluar = p.dequeueAnabul();
        System.out.println("Anabul keluar : " + keluar.getNama());

        // Menampilkan daftar setelah dequeue
        System.out.println("\n=== Daftar Setelah Dequeue ===");
        p.showAnabul();

        // Menghitung jumlah kucing
        System.out.println("\nJumlah Kucing : " + p.countKucing());

        // Menghitung total bobot kucing
        System.out.println("Total Bobot Kucing : " + p.bobotKucing());

        // Menampilkan jenis anabul
        System.out.println("\n=== Jenis Anabul ===");
        p.showJenisAnabul();
    }
}