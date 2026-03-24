/* Nama File    : Main.java
 * Deskripsi    : Main class untuk menjalankan class bangundatar
 * Pembuat      : Rahmat Argyandha Aminuddin
 * Tanggal      : 24 Maret 2026
 */

public class Main {
    public static void main(String[] args)
    {

        BangunDatar P1 = new Persegi(10); 
        Persegi P2 = new Persegi(5); 
        BangunDatar L1 = new Lingkaran(7); 
        Lingkaran K1 = new Lingkaran (14); 

        // Demo Persegi
        Persegi p = new Persegi(5, "Merah", "Hitam");
        System.out.println("\n--- PERSEGI ---");
        p.printInfo();
        System.out.println("Diagonal: " + p.getDiagonal());

        // Demo Lingkaran
        Lingkaran l = new Lingkaran(10, "Biru", "Putih");
        System.out.println("\n--- LINGKARAN ---");
        l.printInfo();

        // Counter
        System.out.println("\n========================================");
        BangunDatar.printCounterBangunDatar();
        System.out.println("========================================");
    }
}
