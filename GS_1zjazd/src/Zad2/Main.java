package Zad2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square[] squares = new Square[5];
        for(int i = 0; i < squares.length; i++) {
            squares[i] = new Square((int)(Math.random() * 100 % 20));
        }

        /* for (int i = 0; i < squares.length; i++) {
            System.out.println(squares[i]);
        }*/

        System.out.println(Arrays.toString(squares));
        Arrays.sort(squares);
        System.out.println(Arrays.toString(squares));
    }
}
