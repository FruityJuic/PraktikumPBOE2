/* Nama File    : MGaris.java
 * Deskripsi    : Berisi aplikasi dari Titik.java
 * Pembuat      : Rahmat Argyandha Aminuddin
 * Tanggal      : 4 Maret 2026
 */
/* Nama File    : MGaris.java
 * Deskripsi    : Main program untuk menguji class Garis
 * Pembuat       : Rahmat Argyandha Aminuddin
 * Tanggal       : 26 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {
        // 1. Membuat objek Titik
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Titik t3 = new Titik(2, 0);
        Titik t4 = new Titik(0, -4);

        // 2. Membuat objek Garis G1 (menggunakan parameter)
        Garis G1 = new Garis(t1, t2);
        
        // 3. Membuat objek Garis G2 (menggunakan parameter lain untuk cek sejajar/tegak lurus)
        Garis G2 = new Garis(t3, t4);

        // 4. Menampilkan informasi G1
        System.out.println("--- Informasi Garis 1 ---");
        G1.printGaris();
        System.out.println("\nPanjang Garis     : " + G1.getPanjang());
        System.out.println("Gradien Garis      : " + G1.getGradien());
        System.out.println("Persamaan Garis    : " + G1.getPersamaanGaris());
        
        // Mencari Titik Tengah G1
        Titik tengahG1 = G1.getTitikTengah();
        System.out.print("Titik Tengah G1    : ");
        tengahG1.printTitik(); 
        System.out.println("\n");

        // 5. Pengujian Relasi antar dua garis (G1 dan G2)
        System.out.println("--- Perbandingan G1 dan G2 ---");
        System.out.println("G1 sejajar G2      : " + G1.isSejajar(G2));
        System.out.println("G1 tegak lurus G2  : " + G1.isTegakLurus(G2));
        
        // 6. Menampilkan Counter Garis
        System.out.println("\nJumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}