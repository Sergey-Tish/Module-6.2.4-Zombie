public class GiantSnake extends Monster {


    public final static String scream = "Ssssss";
    private int pointX;
    private int pointY;
    int route = 0;

    public GiantSnake(String name) {
        this(name, 0, 0);
    }

    public GiantSnake(String name, int x, int y) {
        super(name + " the GiantSnake", 5);
        pointX = x;
        pointY = y;
    }

    @Override
    public void growl() {
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean loud) {
        if (loud) {
            System.out.print(scream.toUpperCase());
            super.growl();
        } else {
            growl();
        }
    }

    public void attack() {
        super.attack();
        growl();
        System.out.println("     ...and hid in the grass");
    }
}
