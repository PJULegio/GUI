package _2324L.win.gr14.GUI_05.zad3.start;

class AddingThread extends Thread {

    private Counter c;

    public AddingThread(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.inc(i);
        }
    }
}

class Counter {
    private int x = 0;
    synchronized void inc(int value) {
        int sum = x + value;
        x = sum;
    }
    public String toString() {
        return x + "";
    }
}

public class MainZad3 {

    public static void main(String[] args) {
        Counter c = new Counter();
        AddingThread at0 = new AddingThread(c);
        at0.start();
        AddingThread at1 = new AddingThread(c);
        at1.start();
        AddingThread at2 = new AddingThread(c);
        at2.start();

        while (at0.isAlive() || at1.isAlive() || at2.isAlive());

        System.out.println("Counter.x=" + c);
    }
}

