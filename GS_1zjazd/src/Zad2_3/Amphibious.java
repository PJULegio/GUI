package Zad2_3;

import java.util.Objects;

public class Amphibious implements IAuto, IBoat {
    private String terrain;
    public Amphibious(String terrain) {
        this.terrain = terrain;
    }


    @Override
    public void move() {
        if(Objects.equals(terrain, "ground"))
            IAuto.super.move();
        else if (Objects.equals(terrain, "water")) {
            IBoat.super.move();
        }
    }
}
