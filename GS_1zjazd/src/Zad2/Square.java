package Zad2;

public class Square implements Comparable<Square> {
    private int length, number;
    private static int counter = 1;

    public Square(int length) {
        this.length = length;
        this.number = counter;
        counter++;
    }

    public int getArea() {
        return this.length * this.length;
    }

    @Override
    public String toString() {
        return this.number + ": " + this.getArea();
    }

    @Override
    public int compareTo(Square comparedSquare) {
        return this.length - comparedSquare.length;
    }

    // Useful resource:
    // https://www.codejava.net/java-core/collections/sorting-arrays-examples-with-comparable-and-comparator
}
