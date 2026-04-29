package anabul;
public abstract class Anabul {

    protected String nama;
    public String Gerak;
    public String Bersuara;
    public abstract void Gerak();
    public abstract void Bersuara();


    public Anabul(String nama, String Gerak, String Bersuara){
        this.nama = nama;
        this.Gerak = Gerak;
        this.Bersuara = Bersuara;
    }
    public Anabul() {
        this.nama = "";
        this.Gerak = "";
        this.Bersuara = "";
    }
        // Getter & Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter & Setter untuk Gerak
    public String getGerak() {
        return Gerak;
    }

    public void setGerak(String gerak) {
        this.Gerak = gerak;
    }

    // Getter & Setter untuk Bersuara
    public String getBersuara() {
        return Bersuara;
    }

    public void setBersuara(String bersuara) {
        this.Bersuara = bersuara;
    }


} 
