package Zad2_5;

public class Arena {
    private IGamer gamerOne, gamerTwo;
    private int scoreOne, scoreTwo;

    public Arena(IGamer gamerOne, IGamer gamerTwo) {
        this.gamerOne = gamerOne;
        this.gamerTwo = gamerTwo;
        scoreOne = 0;
        scoreTwo = 0;
    }

    public void fight(int liczbaRund) {
        for(int i = 0; i < liczbaRund; i++) {
            System.out.println("Runda " + i + ":");
            System.out.print("Wygral gracz: ");

            if(gamerOne.play() == 1 && gamerTwo.play() == 2) {
                System.out.println(gamerTwo.name());
                scoreTwo++;
                System.out.println("Zagrano: Kamien na Papier");
            } else if (gamerOne.play() == 1 && gamerTwo.play() == 3) {
                System.out.println(gamerOne.name());
                scoreOne++;
                System.out.println("Zagrano: Kamien na Nozyce");
            } else if (gamerOne.play() == 2 && gamerTwo.play() == 1) {
                System.out.println(gamerOne.name());
                scoreOne++;
                System.out.println("Zagrano: Papier na Kamien");
            } else if (gamerOne.play() == 2 && gamerTwo.play() == 3) {
                System.out.println(gamerTwo.name());
                scoreTwo++;
                System.out.println("Zagrano: Papier na Nozyce");
            } else if (gamerOne.play() == 3 && gamerTwo.play() == 1) {
                System.out.println(gamerTwo.name());
                scoreTwo++;
                System.out.println("Zagrano: Nozyce na Kamien");
            } else if (gamerOne.play() == 3 && gamerTwo.play() == 2) {
                System.out.println(gamerOne.name());
                scoreOne++;
                System.out.println("Zagrano: Nozyce na Papier");
            } else {
                System.out.println("REMIS");
                switch (gamerOne.play()) {
                    case 1 -> { System.out.println("Zagrano: Kamien na Kamien"); }
                    case 2 -> { System.out.println("Zagrano: Papier na Papier"); }
                    default -> { System.out.println("Zagrano: Nozyce na Nozyce"); }
                }
            }
        }

        System.out.println("\nWynik po rozegraniu " + liczbaRund + " rund:");
        System.out.println(gamerOne.name() + " wynik: " + scoreOne);
        System.out.println(gamerTwo.name() + " wynik: " + scoreTwo);
        System.out.print("Wygrywa gracz: ");
        System.out.println(scoreOne > scoreTwo ? gamerOne.name() : scoreOne != scoreTwo ? gamerTwo.name() : "Remis");
    }
}
