public class Battle {
    Monster[] monsters = new Monster[5];
    private int weHaveMonsters = 0;

    public void add (Monster monster) {
        if (weHaveMonsters < monsters.length) {
            monsters[weHaveMonsters] = monster;
            weHaveMonsters++;
        } else {
            System.out.println("No more monsters!");
        }
    }
    public void start () {
        run();
    }
    public void run() {
        for (int turn = 0; turn < weHaveMonsters; turn++) {
            monsters[turn].attack();
        }
    }


    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        battle.add(new Zombie("Noname"));
        battle.add(new GiantSnake("Noname"));

        battle.start();

        System.out.println();
        Battle battle2 = new Battle();
        battle2.add(new Zombie("Alice"));
        battle2.add(new Zombie("Bob"));
        battle2.start();
    }
}
