public class Zombie extends Monster {
    public final static String scream = "Raaaauuughhhh";
    private int pointX = 0;
    private int pointY = 0;


    public Zombie (String name) {
        this(name + " the Zombie", 0,0);
    }
    public Zombie (String name, int x, int y) {
        super(name, 5);
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
    } //7777

    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("Alice");
        zombie1.attack();
        zombie1.growl();
        Zombie zombie2 = new Zombie("Bob");
        zombie2.attack();
        zombie2.growl();
        System.out.println();
        zombie1.growl();
        zombie1.growl(true);
        zombie1.growl(false);

        Zombie zombie3 = new Zombie("Sombie");
        zombie3.attack();
        zombie3.growl();
        zombie3.growl(true);
        zombie3.growl(false);

    }
}