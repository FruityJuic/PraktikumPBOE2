/* Nama File    : MGaris.java
 * Deskripsi    : Main program untuk menguji class Garis dengan titik spesifik
 * Pembuat      : Rahmat Argyandha A
 * Tanggal      : 4 Maret 2026
 */

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek titik sesuai permintaanmu
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        
        // Membuat objek garis G1
        Garis G1 = new Garis(t1, t2);

        // Menampilkan output operasional
        System.out.println("=== Output Pengujian Garis ===");
        G1.printGaris(); // Menampilkan "Garis dari (-2,0) ke (0,4)"
        System.out.println("\nPanjang Garis: " + G1.getPanjang());
        System.out.println("Gradien Garis: " + G1.getGradien());
        System.out.println("Persamaan Garis: " + G1.getPersamaanGaris());
        
        // Opsional: Menampilkan jumlah total garis yang dibuat
        System.out.println("\nTotal objek Garis yang ada: " + Garis.getCounterGaris());
    }
}