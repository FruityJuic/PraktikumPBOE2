/*nama: Rahmat Argyandha Aminuddin
  nim: 24060124130061
  lab: E2 */

package anabul;
public class Burung extends Anabul {

    public Burung(String nama, String Gerak, String Bersuara) {
        super(nama, Gerak, Bersuara);
    }
    public Burung() {
        super();
    }

    @Override
    public void Gerak() {
        System.out.println(" terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println( " bercuit?");
    }
}