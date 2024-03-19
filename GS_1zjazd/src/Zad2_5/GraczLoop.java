package Zad2_5;

public class GraczLoop implements IGamer {
    private int count;

    public GraczLoop() {
        count = 1;
    }

    @Override
    public int play() {
        switch (count) {
            case 1 -> {
                this.count = 2;
                return 1;
            }
            case 2 -> {
                this.count = 3;
                return 2;
            }
            default ->  {
                this.count = 1;
                return 3;
            }
        }
    }

    @Override
    public String name() {
        return "Loop";
    }
}
