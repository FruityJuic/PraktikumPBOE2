/*nama: Rahmat Argyandha Aminuddin
  nim: 24060124130061
  lab: E2 */

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
