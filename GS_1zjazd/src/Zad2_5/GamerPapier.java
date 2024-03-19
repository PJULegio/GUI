package Zad2_5;

public class GamerPapier implements IGamer {
    @Override
    public int play() {
        return 2;
    }

    @Override
    public String name() {
        return "Gracz papier";
    }
}
