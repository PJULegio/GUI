package Zad2_4;

public class Main {
    public static void main(String[] args) {
        Spiewak s1 = new Spiewak("Eminem") {
            @Override
            public String spiewaj() {
                return "I'm a Rap Hero!";
            }
        };

        Spiewak s2 = new Spiewak("Eagles") {
            @Override
            public String spiewaj() {
                return "Hotel trapped Me Forever, I can't escape!";
            }
        };

        Spiewak s3 = new Spiewak("Dzem") {
            @Override
            public String spiewaj() {
                return "Dobra zabawa!";
            }
        };

        Spiewak sp[] = {s1, s2, s3};

        for (Spiewak s : sp) System.out.println(s);

        System.out.println("\n" + Spiewak.najglosniej(sp));
    }
}
