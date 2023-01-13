public class Monster {
        String name;
        int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println();
    }
    public Monster(String name) {
        this(name, 5);
        System.out.println();
    }

    public void growl() {
        System.out.println(name + " the " + getClass() + " growled");
    }

    public void attack() {

    }
}
