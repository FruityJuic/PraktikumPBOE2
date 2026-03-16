import java.time.LocalDate;

public class Pegawai {

    // parameter penyusun
   protected String NIP;
   protected String nama;
   protected LocalDate tanggal_lahir;
   protected int TMT;
   protected double gajipokok;


   // konstruktor
   public Pegawai (String NIP, String nama, LocalDate tanggal_lahir, int TMT, double gajipokok) {
          this.NIP = NIP;
          this.nama = nama;
          this.tanggal_lahir = tanggal_lahir;
          this.TMT = TMT;
          this.gajipokok = gajipokok;

   }
   public Pegawai () {
          this.NIP = "kosong";
          this.nama = "nama";
          this.tanggal_lahir = LocalDate.of(2000, 1, 1);
          this.TMT = 0;
          this.gajipokok = 0.0;
   }


   // getter dan setter
   public String getNIP() {
        return NIP;
   }
   public String getNama() {
        return nama;
   }
   public LocalDate getTanggal_lahir() {
        return tanggal_lahir;
   }
   public int getTMT() {
        return TMT; 
   }
   public double getGajiPokok() {
        return gajipokok;
   }
     public void printInfo()
    {
        System.out.println("NIP adalah " + NIP);
        System.out.println("nama: " + nama);
        System.out.println("tanggal lahir: " + tanggal_lahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Gaji Pokok: " + gajipokok);

    }
}
