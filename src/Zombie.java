public class Zombie extends Monster {
    public static String scream = "Raaaauuughhhh";

    public Zombie (String name) {
        super(name + " the Zombie", 5);
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
    }
}