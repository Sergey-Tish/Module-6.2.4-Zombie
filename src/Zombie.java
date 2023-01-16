public class Zombie extends Monster {
    public final static String scream = "Raaaauuughhhh";
    private int pointX;
    private int pointY;
    int route = 0;

    public Zombie(String name) {
        this(name, 0, 0);
    }

    public Zombie(String name, int x, int y) {
        super(name + " the Zombie", 5);
        pointX = x;
        pointY = y;
    }

    public void turnRight(int degrees) {
        turnLeft(-degrees);
    }

    public void turnLeft(int degrees) {
        route = (route + degrees) % 360;
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

    public void flyTo(int x, int y) {
        pointX = x;
        pointY = y;
    }

    public void move(int way) {
        int trend = route/180;
        pointX += way/;
    }

    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("Alice");
        zombie1.attack();
        zombie1.growl();
        zombie1.growl();
        zombie1.growl(true);
        zombie1.growl(false);

        Zombie zombie2 = new Zombie("Bob");
        zombie2.attack();
        zombie2.growl();
        System.out.println();

        Zombie zombie3 = new Zombie("Sombie");
        zombie3.attack();
        zombie3.growl();
        zombie3.growl(true);
        zombie3.growl(false);

        Zombie zombie4 = new Zombie("Fasty Mike", 20, 20);
        zombie4.flyTo(30, 30);
    }
}