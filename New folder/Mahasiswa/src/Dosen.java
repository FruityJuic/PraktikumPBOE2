public class Dosen {
    /******ATRIBUT */
    private String nip;
    private String prodi;
    private String nama;

    // konstruktor
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }
    // konstruktor dengan parameter
    public Dosen (String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
    // setter
    public String getNipDosen(){
        return this.nip;
    }
    public String getNamaDosen(){
        return this.nama;
    }
    public String getProdiDosen(){
        return this.prodi;
    }
    // mutator
    public void setNip (String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    // selektor
}
