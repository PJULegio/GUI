package Zad2_3;

public interface IBoat {
    default void move() {
        System.out.println("Move Boat");
    }
}
