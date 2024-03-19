package Zad1;

public class Hero {
    private String name;
    private int value;

    Hero(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void sayHelloTo(Hero otherHero) {
        System.out.println("Hi " + otherHero.getName() + "!");
    }

    public String getName() {
        return name;
    }
}
