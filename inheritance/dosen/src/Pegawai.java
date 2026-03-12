import java.time.LocalDate;

public class Pegawai {

    // parameter penyusun
   protected String NIP;
   protected String nama;
   protected LocalDate tanggal_lahir;
   protected int TMT;
   protected double gajipokok;
   protected int BUP;

   // konstruktor
   public Pegawai (String NIP, String nama, LocalDate tanggal_lahir, int TMT, int gajipokok, int BUP) {
          this.NIP = NIP;
          this.nama = nama;
          this.tanggal_lahir = tanggal_lahir;
          this.TMT = TMT;
          this.gajipokok = gajipokok;
          this.BUP = BUP;
   }

   // getter dan setter
   public String getNIP() {
        return this.NIP;
   }
   public String getNama() {
        return this.nama;
   }
   public LocalDate getTanggal_lahir() {
        return this.tanggal_lahir;
   }
   public int getTMT() {
        return this.TMT; 
   }
   public double getGajiPokok() {
        return this.gajipokok;
   }
   public int getBUP() {
        return this.BUP;
   }
     public void printInfo()
    {
        System.out.println("NIP adalah " + NIP);
        System.out.println("nama: " + nama);
        System.out.println("tanggal lahir: " + tanggal_lahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Gaji Pokok: " + gajipokok);
        System.out.println("BUP: " + BUP);
    }




}
