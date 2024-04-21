import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1 i 2
        {
            Kontener<String, Integer> kontener1 = new Kontener<>("Test", 15);
            kontener1.wypisz();

            Kontener<Integer, Float> kontener2 = new Kontener<>(12, 15F);
            kontener2.wypisz();
        }

        // Zadanie 3
        {
            ArrayList<String> ciagStringow = new ArrayList<>();
            ciagStringow.add("Ala");
            ciagStringow.add("ma");
            ciagStringow.add("ma");
            ciagStringow.add("kota");

            System.out.println("\nDlugosc ciagu stringow: " + ciagStringow.size());
            for (String e : ciagStringow) {
                System.out.println(e);
            }

            ciagStringow.remove("ma");

            System.out.println("\nDlugosc ciagu stringow: " + ciagStringow.size());
            for (String e : ciagStringow) {
                System.out.println(e);
            }

            ciagStringow.removeAll(ciagStringow);

            System.out.println("\nDlugosc ciagu stringow: " + ciagStringow.size());
            for (String e : ciagStringow) {
                System.out.println(e);
            }
        }

        // Zadanie 4
        {
            Set<Integer> hashSet = new HashSet<>();
            hashSet.add(31);
            hashSet.add(28);
            hashSet.add(31);
            hashSet.add(30);
            hashSet.add(31);
            hashSet.add(30);

            System.out.println(hashSet);
        }

        // Zadanie 5
        {
            Map<String, Integer> miesiace = new HashMap<>();
            miesiace.put("Styczen", 31);
            miesiace.put("Luty", 28);
            miesiace.put("Marzec", 31);
            miesiace.put("Kwiecien", 30);

            System.out.println("\n" + miesiace.get("Marzec"));
            System.out.println(miesiace);
        }

        // Zadanie 6
        {
            Osoba kowalski = new Osoba("Jan", "Kowalski");
            Osoba nowak = new Osoba("Adam", "Nowak");
            Osoba krawczyk = new Osoba("Bartosz", "Krawczyk");
            Osoba heniek = new Osoba("Kierownik", "Heniek");

            Samochod skoda1 = new Samochod("WA00001", "Skoda");
            Samochod skoda2 = new Samochod("SC36010", "Skoda");
            Samochod mazda1 = new Samochod("WA01234", "Mazda");
            Samochod mazda2 = new Samochod("DW01ASD", "Mazda");
            Samochod bmw = new Samochod("WA12690", "BMW");
            Samochod volvo = new Samochod("KR60606", "Volvo");

            Map<Osoba, ArrayList<Samochod>> mapa = new HashMap<>();

            mapa.computeIfAbsent(kowalski, k -> new ArrayList<>()).add(skoda1);
            mapa.computeIfAbsent(kowalski, k -> new ArrayList<>()).add(bmw);
            mapa.computeIfAbsent(nowak, k -> new ArrayList<>()).add(mazda2);
            mapa.computeIfAbsent(krawczyk, k -> new ArrayList<>()).add(volvo);
            mapa.computeIfAbsent(krawczyk, k -> new ArrayList<>()).add(mazda1);
            mapa.computeIfAbsent(krawczyk, k -> new ArrayList<>()).add(skoda2);
            mapa.computeIfAbsent(heniek, k -> new ArrayList<>());

            for(Map.Entry<Osoba, ArrayList<Samochod>> e : mapa.entrySet()) {
                if(e.getValue().size() != 0)
                    System.out.println(e.getKey() + " -> " + e.getValue());
                else
                    System.out.println(e.getKey() + " -> [Brak samochodow]");
            }

            System.out.println("-------------------");
            System.out.println("Samochody, których numery rejestracyjne zaczynaja sie na WA: ");
            for (Map.Entry<Osoba, ArrayList<Samochod>> e : mapa.entrySet()) {
                for(int i=0; i < e.getValue().size(); i++) {
                    if (e.getValue().get(i).getNrRejestracyjny().charAt(0) == 'W'
                            && e.getValue().get(i).getNrRejestracyjny().charAt(1) == 'A')
                        System.out.print(e.getValue().get(i) + "  ");
                }
            };

            System.out.println("\n-------------------");
            for (Map.Entry<Osoba, ArrayList<Samochod>> e : mapa.entrySet()) {
                System.out.println(e.getKey() + " posiada " + e.getValue().size() + " pojazdy");
            }

            System.out.println("-------------------");
            System.out.println(mapa.get(nowak).get(0));
        }

    }

    // Set - tylko wyjątkowe wartości, może się przydać do indeksowania w projekcie
}
