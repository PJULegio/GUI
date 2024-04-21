import java.util.List;

public class Main {
    public static void main(String[] args) {
        { // Zadanie 1
            ICalc myAdd = (a, b) -> a + b;

            System.out.println(myAdd.oblicz(5, 2));

            ICalc mySubtract = (a, b) -> a - b;
            System.out.println(mySubtract.oblicz(5, 2));

            ICalc myMultiply = (a, b) -> a * b;
            System.out.println(myMultiply.oblicz(5, 2));

            ICalc myDivide = (a, b) -> a / b;
            System.out.println(myDivide.oblicz(5, 2));
        }

        { // Zadanie 2
            Animal gepard = new Animal("Gepard", 40, 50, 100);
            Animal pies = new Animal("Pies", 20, 30, 50);
            Animal zebra = new Animal("Zebra", 400, 100, 70);

            List<Animal> animals = new List<>();
        }
    }
}
