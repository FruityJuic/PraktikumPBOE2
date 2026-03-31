/** *
 File     : Asersi1.java
 Deskripsi: Program untuk menunjukkan asersi
*/


public class Asersi {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("X bilangan positif");
        } else {
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif"); 
        }
    }
}
