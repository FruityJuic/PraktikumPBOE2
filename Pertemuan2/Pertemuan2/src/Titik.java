
/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Rahmat Argyandha Aminuddin
 * Tanggal      : 1 Maret 2026
 */


public class Titik {
    double absis;
    double ordinat;

    // Constructor default
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // Constructor dengan parameter
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    double getJarak(Titik T){
        double dx = absis - T.getAbsis();
        double dy = ordinat - T.getOrdinat();
        return Math.sqrt(dx*dx + dy*dy);
    }

    double getJarakPusat(){
        double dx = absis - 0;
        double dy = ordinat - 0;
        return Math.sqrt(dx * dx + dy * dy);
    }

    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    Titik refleksiX() {
        Titik hasil = new Titik();
        hasil.setAbsis(-absis);
        hasil.setOrdinat(ordinat);
        return hasil;
    }

    Titik refleksiY() {
        Titik hasil = new Titik();
        hasil.setAbsis(absis);
        hasil.setOrdinat(-ordinat);
        return hasil;
    }

    double getRefleksiX() {
        return -absis;
    }

    double getRefleksiY() {
        return -ordinat;
    }

}