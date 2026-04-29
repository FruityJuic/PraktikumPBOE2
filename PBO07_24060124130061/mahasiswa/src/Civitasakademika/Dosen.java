package Civitasakademika;

public class Dosen extends Civitas {

    private String NIP;

    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    @Override 
    public String getNomor() {
        return NIP;
    } 
}
