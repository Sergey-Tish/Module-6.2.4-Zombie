public class Zombie extends Monster {
    public Zombie (String name) {
        super(name + "The Zombie", 5);
    }

    @Override
    public void growl() {
        System.out.print("Raaaauuughhhh");
        super.growl();
    }
    public void attack() {
        super.attack();
    }

    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("Alice");
        zombie1.attack();
        zombie1.growl();
        Zombie zombie2 = new Zombie("Bob");
        zombie2.attack();
        zombie2.growl();
    }
}