// NIM          : 24060124130061
// Nama         : Rahmat Argyandha Aminuddin
// Tanggal      : 13 Mei

// Nama File    : MainTeman.java

public class MainTeman {
    public static void main(String[] args) {

        // Membuat objek Teman
        Teman t = new Teman();

        // Menambahkan nama teman
        t.addNama("Andi");
        t.addNama("Budi");
        t.addNama("Citra");
        t.addNama("Andi");

        // Menampilkan daftar teman
        t.showTeman();

        // Menampilkan jumlah elemen
        System.out.println("\nJumlah teman : " + t.getNbelm());

        // Mengambil nama berdasarkan indeks
        System.out.println("Teman indeks ke-1 : " + t.getNama(1));

        // Mengubah nama berdasarkan indeks
        t.setNama(1, "Bagas");
        System.out.println("\nSetelah setNama:");
        t.showTeman();

        // Mengecek apakah nama ada
        System.out.println("\nApakah Andi member? " + t.isMember("Andi"));
        System.out.println("Apakah Dika member? " + t.isMember("Dika"));

        // Mengganti nama
        boolean hasil = t.gantiNama("Citra", "Clara");
        System.out.println("\nGanti nama berhasil? " + hasil);

        // Menampilkan daftar setelah ganti nama
        t.showTeman();

        // Menghitung jumlah nama tertentu
        System.out.println("\nJumlah nama Andi : " + t.countNama("Andi"));

        // Menghapus nama
        t.delNama("Andi");

        System.out.println("\nSetelah hapus Andi:");
        t.showTeman();

        // Menampilkan jumlah akhir
        System.out.println("\nJumlah teman sekarang : " + t.getNbelm());
    }
}