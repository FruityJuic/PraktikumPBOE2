/* Nama File    : MTitik2.java
 * Deskripsi    : Berisi aplikasi dari Titik.java
 * Pembuat      : Rahmat Argyandha Aminuddin
 * Tanggal      : 1 Maret 2026
 */

public class MTitik2 {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        
        T1.setAbsis(3);         // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);       // Mengubah ordinat T1 dengan nilai 4
        T1.printTitik();        // Mencetak koordinat T1 ke layar

        T1.geser(3, 4);         // Menggeser T1 sejauh (3,4)
        T1.printTitik();        // Menampilkan koordinat T1 setelah digeser
        Titik T2 = new Titik(0, 0);

        // Menghitung jarak
        double jarak = T1.getJarak(T2);

        // Menampilkan hasil
        System.out.println("Titik 1: (" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");
        System.out.println("Titik 2: (" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");
        System.out.println("Jarak kedua titik = " + jarak);

        T2.setAbsis(4);
        T2.setOrdinat(5);

        double japus = T2.getJarakPusat();

        // getjarakpusat
        System.out.println("Jarak titik T2 dengan titik pusat adalah " + japus);

        T1.setAbsis(-9);
        T1.setOrdinat(1);

        int beliau = T1.getKuadran();

        System.out.println("beliau berada di kuadran = " + beliau);

        Titik Tbaru = T1.refleksiX();
        Titik Tbaru1 = T1.refleksiY();
        
        System.out.println("Hasil refleksi = (" + Tbaru.getAbsis() + ", " + Tbaru.getOrdinat() + ")");
        System.out.println("Hasil refleksi = (" + Tbaru1.getAbsis() + ", " + Tbaru1.getOrdinat() + ")");
    }
}


