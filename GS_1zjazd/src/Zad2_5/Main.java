package Zad2_5;

public class Main {
    public static void main(String[] args) {
        IGamer gracz1 = new GamerRandom();
        IGamer gracz2 = new GraczLoop();

        Arena arena = new Arena(gracz1, gracz2);

        arena.fight(10000);
    }
}
