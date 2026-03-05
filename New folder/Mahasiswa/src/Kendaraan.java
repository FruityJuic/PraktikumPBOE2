public class Kendaraan {
    private String Plat;
    private String Merek;

    public Kendaraan(){
        this.Plat = "";
        this.Merek = "";
    }

    public Kendaraan(String Plat, String Merek){
        this.Plat = Plat;
        this.Merek = Merek;
    }
    public String getPlat(){
        return this.Plat;
    }
    public String getMerek(){
        return this.Merek;
    }
    
}

