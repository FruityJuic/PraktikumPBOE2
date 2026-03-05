public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    // konstruktor
    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }
    // konstruktor dengan parameter
    public MataKuliah (String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }
    // selektor
    public String getNamaMataKuliah(){
        return this.idMatkul;
    }
    public String Getnama(){
        return this.nama;
    }
    public Integer getSks(){
        return this.sks;
    }
    

    
    // mutator
    public void setidMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setsks(int sks){
        this.sks = sks;
    }
    

    
}
