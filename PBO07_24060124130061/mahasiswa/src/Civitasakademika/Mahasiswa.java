package Civitasakademika;

public class Mahasiswa extends Civitas{
    private String NIM;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String NIM) {
        super(nama);
        this.NIM = NIM;
    }
    
    @Override
    public String getNomor() {
        return NIM;
    }
    // i. setWali
    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    // j. tampilDataMahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + nama);
        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        } else {
            System.out.println("Dosen Wali: Belum ada");
        }
        System.out.println();
    }
    
}
