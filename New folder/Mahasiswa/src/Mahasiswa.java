/* Nama File    : Mahasiswa.java
 * Deskripsi    : Main program untuk menguji class mahasiswa
 * Pembuat      : Rahmat Argyandha A
 * Tanggal      : 4 Maret 2026
 */



import java.util.ArrayList;

public class Mahasiswa {
    /**** ATRIBUT ****/
    private String NIM;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /**** METHOD ****/
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = "";
        this.nama = "";
        this.prodi = "";
    }
    // konstruktor dengan parameter
    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;

    }
    // selektor
    String getNIM() {
        return this.NIM;
    }
    String getnama() {
        return this.nama;
    }
    String getProdi() {
        return this.prodi;
    }
    Dosen getDosenWali() {
        return this.dosenWali;
    }
    Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    // mutator
    public void setNIM(String NIM) {
        this.NIM = NIM;   
    }
     //getJumlahSKS()
    public int getJumlahSKS(){
        int totalSKS = 0;
        for (int i = 0; i < listMatKul.size(); i++){
            totalSKS = totalSKS + listMatKul.get(i).getSks();
        }
        return totalSKS;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }
    public void setDosenWali(Dosen dosenwali) {
        this.dosenWali = dosenwali;
    }
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }
    public void addMatkul(MataKuliah newMatkul) {
        this.listMatKul.add(newMatkul);
    }
    public void printDetailMhs() {
        System.out.println("NIM Mahasiswa : " + NIM);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Prodi : " + prodi);

        int i;
        for (i = 0; i < listMatKul.size(); i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1) + " yang diambil : " + listMatKul.get(i).getNamaMataKuliah());
        }
    }
    public void printMhs() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
    public int getJumlahMatkul() {
        return this.listMatKul.size();
    }
}