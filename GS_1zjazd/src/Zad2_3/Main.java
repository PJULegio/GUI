package Zad2_3;

public class Main {
    public static void main(String[] args) {
        new Auto().move();
        new Boat().move();
        new Amphibious("ground").move();
        new Amphibious("water").move();
    }
}
