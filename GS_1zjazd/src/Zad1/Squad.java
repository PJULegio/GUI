package Zad1;

public class Squad {
    private Hero[] hero;
    private int heroCount;
    private Leader leader;
    private String name;

    Squad(String name) {
        this.name = name;
        heroCount = 0;
        hero = new Hero[1];
    }

    public void setLeader(Leader l) {
        leader = l;
    }

    public void addHero(Hero h) throws TooManyHeroesExceptio {
        if(heroCount==hero.length) throw new TooManyHeroesExceptio();
        hero[heroCount] = h;
        heroCount++;
    }

    @Override
    public String toString() {
        String heroList = "";
        for(int i = 0; i < hero.length; i++) {
            heroList += hero[i].getName() + " ";
        }
        return name + ", leader: " + leader.getName() + ", heroes: " + heroList;
    }
}
