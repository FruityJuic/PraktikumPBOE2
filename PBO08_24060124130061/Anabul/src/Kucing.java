/*nama: Rahmat Argyandha Aminuddin
  nim: 24060124130061
  lab: E2 */

package anabul;
public class Kucing extends Anabul{
    protected double bobot;

    public Kucing(String nama, String Gerak, String Bersuara, double bobot) {
        super(nama, Gerak, Bersuara);
        this.bobot = bobot;
    }

    public Kucing() {
        super();
    }
    @Override
    public void Gerak() {
        System.out.println("melata");
    }
    public double getBobot() {
        return bobot;
    }


    @Override
    public void Bersuara() {
        System.out.println(" mengeong");
    }
}
