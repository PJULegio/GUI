package Zad2_5;

public class GamerRandom implements IGamer {
    @Override
    public int play() {
        return (int)(Math.random() * 100 % 3) + 1;
    }

    @Override
    public String name() {
        return "Random";
    }
}
