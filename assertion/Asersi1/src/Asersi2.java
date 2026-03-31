/** *
 File     : Asersi2.java
 Deskripsi: Program untuk menunjukkan asersi lingkaran
*/

class Lingkaran{
    private double jarijari;
    public Lingkaran(double jarijari) {
        assert(jarijari > 0):"jari jari tidak boleh 0";
        this.jarijari = jarijari;
    }
    public double hitungkeliling() {
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jarijari = 0;
        Lingkaran l = new Lingkaran(jarijari);
        double kelilingLingkaran = l.hitungkeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}
