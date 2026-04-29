package Civitasakademika;

public abstract class Civitas {
    protected String nama;
    public abstract String getNomor();

    public Civitas(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
