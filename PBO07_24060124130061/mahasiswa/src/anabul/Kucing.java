package anabul;
public class Kucing extends Anabul{

    public Kucing(String nama, String Gerak, String Bersuara) {
        super(nama, Gerak, Bersuara);
    }

    public Kucing() {
        super();
    }
    @Override
    public void Gerak() {
        System.out.println("melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(" mengeong");
    }
}
