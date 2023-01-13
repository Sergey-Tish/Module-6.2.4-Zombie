public class Zombie extends Monster {
    String growl = "Raaaauuughhhh";

    public Zombie (String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void growl() {
        System.out.print(growl);
        super.growl();
    }
    public void attack() {
        super.attack();
        growl();
    }

    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("Alice");
        zombie1.attack();
        zombie1.growl();
        Zombie zombie2 = new Zombie("Bob");
        zombie2.attack();
        zombie2.growl();
        Monster monster = new Monster("Bobiken", 10);
        monster.attack();
        monster.growl();
    }
}