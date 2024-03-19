package Zad2_4;

public abstract class Spiewak {
    private final String nazwisko;
    private final int numerStartowy;
    private static int counter = 0;

    public Spiewak(String nazwisko) {
        this.nazwisko = nazwisko;
        this.numerStartowy = counter;
        counter++;
    }

    public abstract String spiewaj();

    @Override
    public String toString() {
        return "Spiewak{id=" + numerStartowy + ", name='" + nazwisko + "'}";
    }

    public static Spiewak najglosniej(Spiewak[] array) {
        int loudestId = 0, bigLetters, bigLettersMax = 0;

        for (Spiewak s : array) {
            bigLetters = 0;

            for(int i = 0; i < s.spiewaj().length(); i++)
                if(s.spiewaj().charAt(i) >= 'A' && s.spiewaj().charAt(i) < 'Z') bigLetters++;

            if(bigLetters > bigLettersMax) {
                loudestId = s.numerStartowy;
                bigLettersMax = bigLetters;
            }
        }

        return array[loudestId];
    }
}
