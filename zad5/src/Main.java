import java.util.ArrayList;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*{ // Zadanie 1
            Runnable runnableOut = () -> {
                for(int i = 0; i < 20; i++)
                    for (int j = 0; j < 9; j++)
                        System.out.print(j + " ");
            };

            Runnable runnableErr = () -> {
                for(int i = 0; i < 20; i++)
                    for (int j = 0; j < 9; j++)
                        System.err.print(j + " ");
            };

            Thread thread1 = new Thread(runnableOut);
            Thread thread2 = new Thread(runnableErr);

            thread1.start();
            thread2.start();
        }

        { // Zadanie 2
            petla(1);
            petla(2);
            petla(3);
            czasy.put(4, new ArrayList<>());
            czasy.put(5, new ArrayList<>());
            petlaWatkowa();
            System.out.println(czasy.get(1).get(1) - czasy.get(1).get(0) + "ms");
            System.out.println(czasy.get(2).get(1) - czasy.get(2).get(0) + "ms");
            System.out.println(czasy.get(3).get(1) - czasy.get(3).get(0) + "ms");
            System.out.println(czasy.get(4).get(1) - czasy.get(4).get(0) + "ms | " + (czasy.get(5).get(1) - czasy.get(5).get(0)) + "ms");
        }*/

        { // Zadanie 4
            Account konto1 = new Account(10_000);
            Account konto2 = new Account(10_000);
            System.out.println("Suma: " + (konto1.getBalance() + konto2.getBalance()));

            Runnable transakcje1 = () -> {
                konto1.setBalance(-50);
                konto2.setBalance(50);
            };

        }
    }
    static HashMap<Integer, ArrayList<Long>> czasy = new HashMap<>(); // Zadanie 2
    private static void petla(int index) { // Zadanie 2
        czasy.put(index, new ArrayList<>());
        czasy.get(index).add(System.currentTimeMillis());
        for(int i = 0; i <= 1_000_000; i++)
            System.out.println(i);
        czasy.get(index).add(System.currentTimeMillis());
    }

    static Runnable petlaParzysta = () -> {
        czasy.get(5).add(System.currentTimeMillis());
        for(int i = 0; i <= 1_000_000; i += 2)
            System.out.println(i);
        czasy.get(5).add(System.currentTimeMillis());
    };

    static Runnable petlaNieparzysta = () -> {
        czasy.get(4).add(System.currentTimeMillis());
        for (int i = 1; i <= 1_000_000; i += 2)
            System.out.println(i);
        czasy.get(4).add(System.currentTimeMillis());
    };

    private static void petlaWatkowa() { // Zadanie 2
        Thread thread1 = new Thread(petlaParzysta);
        Thread thread2 = new Thread(petlaNieparzysta);

        thread1.start();
        thread2.start();
        while(thread1.isAlive() || thread2.isAlive());
    }
}