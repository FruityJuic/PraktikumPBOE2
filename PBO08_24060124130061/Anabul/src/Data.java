package anabul;

class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public void setIsi(int index, T nilai) {
        if (index >= 0 && index < 100) {
            ruang[index] = nilai;
            banyak++;
        }
    }

    public T getIsi(int index) {
        if (index >= 0 && index < 100) {
            return ruang[index];
        }
        return null;
    }

    public int getSize() {
        return banyak;
    }
}