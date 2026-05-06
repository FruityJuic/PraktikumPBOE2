/*nama: Rahmat Argyandha Aminuddin
  nim: 24060124130061
  lab: E2 */


package anabul;
public class Anjing extends Anabul {

    public Anjing(String nama, String Gerak, String Bersuara) {
        super(nama, Gerak, Bersuara);
    }
    public Anjing() {
        super();
    }
    @Override
    public void Gerak() {
        System.out.println("melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(" menggonggong");
    }
}
