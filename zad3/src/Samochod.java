public class Samochod {
    private String marka;
    private String nrRejestracyjny;

    public Samochod(String nrRejestracyjny, String marka) {
        this.marka = marka;
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public String getMarka() {
        return marka;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public String get() { return marka + " " + nrRejestracyjny; }

    @Override
    public String toString() {
        return marka + " " + nrRejestracyjny;
    }

}
