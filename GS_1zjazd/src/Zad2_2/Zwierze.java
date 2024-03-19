package Zad2_2;

public class Zwierze implements IAnimalBehaviours {

    @Override
    public void move() {
        System.out.println("moving");
    }

    @Override
    public void speak() {
        System.out.println("speaking");
    }

    public static void main(String[] args) {
        new Zwierze().move();
        new Zwierze().speak();
    }
}
