import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        /*{ // Zadanie 1
            ICalc myAdd = (a, b) -> a + b;

            System.out.println(myAdd.oblicz(5, 2));

            ICalc mySubtract = (a, b) -> a - b;
            System.out.println(mySubtract.oblicz(5, 2));

            ICalc myMultiply = (a, b) -> a * b;
            System.out.println(myMultiply.oblicz(5, 2));

            ICalc myDivide = (a, b) -> a / b;
            System.out.println(myDivide.oblicz(5, 2));
        }*/

        { // Zadanie 2
            Animal gepard = new Animal("gepard", 40, 50, 100);
            Animal pies = new Animal("pies", 20, 30, 50);
            Animal zebra = new Animal("zebra", 400, 100, 70);

            List<Animal> animals = new ArrayList<>();
            animals.add(gepard);
            animals.add(pies);
            animals.add(zebra);

            // 1 sposob
            for(Animal e : animals) {
                if(e.getTopSpeed() > 60) {
                    System.out.println(e.getName());
                }
            }

            // 2 sposob strumienie
            animals.stream()
                    .filter(a -> a.getWeight() > 40)
                    .filter(a -> a.getTopSpeed() > 60)
                    .map(a -> a.getName().toUpperCase())
                    .forEach(System.out::println);

            // ZADANIE 3
            Predicate<Animal> checkWeight = animal -> animal.getWeight() > 30;
            Predicate<Animal> checkSpeed = animal -> animal.getTopSpeed() > 60;

            animals.stream()
                    .filter(checkWeight)
                    .filter(checkSpeed)
                    .map(a -> a.getName().toUpperCase())
                    .forEach(System.out::println);

            // ZADANIE 4
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int inputWeight = scanner.nextInt();
            int inputSpeed = scanner.nextInt();

            Predicate<Animal> checkWeight4 = animal -> animal.getWeight() > inputWeight;
            Predicate<Animal> checkSpeed4 = animal -> animal.getTopSpeed() > inputSpeed;

            animals.stream()
                    .filter(checkWeight4)
                    .filter(checkSpeed4)
                    .map(a -> a.getName().toUpperCase())
                    .forEach(System.out::println);

            // ZADANIE 5
            System.out.println(animals);
            animals.sort((o1, o2) -> o1.getTopSpeed() - o2.getTopSpeed());
            System.out.println(animals);
        }
    }
}
