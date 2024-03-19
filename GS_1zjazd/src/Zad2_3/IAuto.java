package Zad2_3;

public interface IAuto {
    default void move() {
        System.out.println("Move Auto");
    }
}
