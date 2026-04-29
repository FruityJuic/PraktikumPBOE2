import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        
        Mesin mesinmobil = new Mesin("V6 Turbo VTEC", 300, 400, 50);
        Mobil b1 = new Mobil("Honda", "Lepi", LocalDate.of(1999, 1, 1), "55213", mesinmobil, 4, "Manual", 4, 5);
        b1.CetakInfo();
        System.out.println("jarak yang ditempuh mobil = "+ b1.hitungJarak());
        try {
        Mesin mesinKapal = new Mesin("Diesel Turbo", 5000, 1000.0, 2000);
        KapalPesiar kp1 = new KapalPesiar(
        "Norwegian Cruise Line", 
        "Gerard", 
        LocalDate.of(1995, 2, 12), 
        "23242", 
        mesinKapal, 
        50,       // Jumlah Kamar
        "Otomatis", 
        "Pesiar", 
        2000,     // Kapasitas Penumpang
        "Sangat Mewah");
        kp1.CetakInfo();
        System.out.println("jarak yang ditempuh kapal pesiar = "+ kp1.hitungJarak());

}       catch (Exception e) {
        System.out.println("Gagal membuat kapal: " + e.getMessage());
      }
       try {
        Mesin mesinVespa = new Mesin("2-Tak", 10, 5.0,50);

    
        Motor m1 = new Motor(
        "Vespa", 
        "Fauzan", 
        LocalDate.of(2022, 5, 20), // Tanggal yang valid
        "H1234",                   // Max 5 karakter
        mesinVespa,                // Tidak null
        2,                         // Roda minimal 2
        "Manual", 
        "Klasik", 
        "Rantai"
    );
        m1.CetakInfo();
        System.out.println("jarak yang ditempuh motor = "+ m1.hitungJarak());
        


    }   catch (Exception e) {
        System.out.println("Gagal mendaftarkan motor: " + e.getMessage());
        }

        Mesin mesinBus = new Mesin("Diesel Turbo Intercooler", 350, 100.0,500);
        Bus j1 = new Bus(
        "Mercedes-Benz OH 1626",   
        "PO. Quinta",             
        LocalDate.of(2023, 5, 20), 
        "B7001",                   
        mesinBus,                   
        6,                          
        "Semi-Automatic",           
        45,                        
        1500);
        j1.CetakInfo();
        System.out.println("jarak yang ditempuh bus = "+ j1.hitungJarak());

        Mesin mesinSedan = new Mesin("V6 VTEC", 200, 50.0,75);

        Sedan s1 = new Sedan("Honda Civic", "Arga", LocalDate.of(2014, 1, 1), "B1234", mesinSedan, 250, "CVT", false);

        s1.CetakInfo();
        System.out.println("jarak yang ditempuh sedan = "+ s1.hitungJarak());
        System.out.println("===============Pembatas===============");
        System.out.println("jumlah kendaraan yang ada " + Kendaraan.getCounterKendaraan());
        System.out.println("jumlah kendaraat darat yang ada "+ Kendaraan_darat.getCounterKendaraanDarat());
        System.out.println("jumlah kendaraan laut yang tersedia "+ Kendaraan_laut.getCounterKendaraanLaut());



        
 }
}
