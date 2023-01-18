public class GiantSnake extends Monster {


    public final static String scream = "Raaaauuughhhh";
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

    public void growl(boolean bool) {
        if (bool) {
            System.out.print(scream.toUpperCase());
        } else {
            growl();
        }
    }

    public void attack() {
        super.attack();
        growl();
    }

    public void turnRight(int degrees) {
        turnLeft(-degrees);
    }

    public void turnLeft(int degrees) {
        route = (route + degrees) % 360;
    }

    public void flyTo(int x, int y) {
        pointX = x;
        pointY = y;
    }

    public void move(int way) {
        int trend = route / 180;
        pointX += way/route;
    }
}
