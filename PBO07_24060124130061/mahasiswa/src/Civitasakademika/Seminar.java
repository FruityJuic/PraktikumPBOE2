/*nama: Rahmat Argyandha Aminuddin
  nim: 24060124130061
  lab: E2 */

package Civitasakademika;

public class Seminar {
    private Civitas[] peserta;
    private int banyakpeserta;

    public Seminar() {
        peserta = new Civitas[100];
        banyakpeserta = 0;
    }

    public void registrasi(Civitas c) {
        if (banyakpeserta < peserta.length) {
            peserta[banyakpeserta] = c;
            banyakpeserta++;
        } else {
            System.err.println("peserta penuh");
        }
    }

    public int CountPeserta() {
        return banyakpeserta;
    }

    public void tampilPeserta() {
        System.out.println("Daftar Peserta");
        for(int i = 0; i < banyakpeserta; i++) {
            System.out.println(peserta[i].getNomor() + "-" + peserta[i].getNama());
        }
    }

    public int CountMahasiswa() {
        int Count = 0;
        for(int i = 0; i < banyakpeserta; i++) {
            if (peserta[i] instanceof Mahasiswa) {
                Count++;
            }
        }
        return Count;
    }
    
}
