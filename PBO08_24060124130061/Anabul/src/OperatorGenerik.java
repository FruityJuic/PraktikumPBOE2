/*nama: Rahmat Argyandha Aminuddin
  nim: 24060124130061
  lab: E2 */
package anabul;

public class OperatorGenerik {

    public static <T> void Tukar(Box<T> a, Box<T> b) {
        T temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    // Fungsi Bobot2
    public static double Bobot2(Kucing k1, Kucing k2) {
        return k1.getBobot() + k2.getBobot();
    }
}
