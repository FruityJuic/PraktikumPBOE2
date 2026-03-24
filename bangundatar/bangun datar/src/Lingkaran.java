/* Nama File    : Lingkaran.java
 * Deskripsi    : File berisi kode konstruksi,getter dan setter Lingkaran
 * Pembuat      : Rahmat Argyandha Aminuddin
 * Tanggal      : 24 Maret 2026
 */

public class Lingkaran extends BangunDatar 
{
    private double jari;

    public Lingkaran()
    {
        super();
        setJmlSisi(0); // Lingkaran direpresentasikan memiliki 0 sisi lurus
    }

    public Lingkaran(int jari) {
        this.jari = jari;
    }
    public Lingkaran(double diameter, String warna, String border)
    {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari()
    {
        return jari;
    }

    public void setJari(double jari)
    {
        this.jari = jari;
    }

    public double getLuas()
    {
        return Math.PI * jari * jari;
    }

    public double getKeliling()
    {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}