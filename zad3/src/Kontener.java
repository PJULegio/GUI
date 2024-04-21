public class Kontener<T, V> {
    T zmienna;
    V wartosc; // ??????

    public Kontener(T zmienna, V wartosc) {
        this.zmienna = zmienna;
        this.wartosc = wartosc;
    }

    public void wypisz() {
        System.out.println(zmienna + " " + wartosc);
    }
}
