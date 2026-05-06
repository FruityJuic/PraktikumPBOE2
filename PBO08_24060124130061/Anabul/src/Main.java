/*nama: Rahmat Argyandha Aminuddin
  nim: 24060124130061
  lab: E2 */
package anabul;

public class Main {
    public static void main(String[] args) {

        // ======================
        // DATUM GENERIK
        // ======================
        Datum<Kucing> dataKucing = new Datum<>();

        Anggora anggoraObj = new Anggora("Milo", "Berjalan", "Mengeong", 2.5);
        dataKucing.setIsi(anggoraObj);

        System.out.println("Isi datum: " + dataKucing.getIsi().nama);

        // ======================
        // INTEGER SWAP
        // ======================
        Box<Integer> intA = new Box<>(3);
        Box<Integer> intB = new Box<>(6);

        OperatorGenerik.Tukar(intA, intB);
        System.out.println(intA.value + " " + intB.value);

        // ======================
        // STRING SWAP
        // ======================
        Box<String> s1 = new Box<>("Hello");
        Box<String> s2 = new Box<>("World");

        OperatorGenerik.Tukar(s1, s2);
        System.out.println(s1.value + " " + s2.value);

        // ======================
        // ANABUL SWAP
        // ======================
        Box<Kucing> k1 = new Box<>(new Anggora("Milo", "Berjalan", "Mengeong", 3));
        Box<Kucing> k2 = new Box<>(new KembangTelon("Oyen", "Berlari", "Miaw", 4));

        OperatorGenerik.Tukar(k1, k2);
        System.out.println(k1.value.nama + " " + k2.value.nama);

        // ======================
        // DATA ARRAY GENERIK
        // ======================
        Data<Kucing> data = new Data<>();

        data.setIsi(0, new Anggora("Milo", "Berjalan", "Mengeong", 3));
        data.setIsi(1, new KembangTelon("Oyen", "Berlari", "Miaw", 4));

        // getIsi
        Kucing k = data.getIsi(0);
        System.out.println(k.nama);

        // getSize
        System.out.println("Jumlah data: " + data.getSize());
    }
}