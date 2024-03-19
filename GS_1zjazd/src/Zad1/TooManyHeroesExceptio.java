package Zad1;

public class TooManyHeroesExceptio extends ArrayIndexOutOfBoundsException {
    public TooManyHeroesExceptio() {
        super("Too many heroes!!!");
    }
}
