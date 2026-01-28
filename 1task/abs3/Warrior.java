package abs3;

public class Warrior extends Hero{


    public Warrior(String enemy, int health) {
        super(enemy, health);
    }

    @Override
    public void attack(Hero enemy) {
        enemy.health=enemy.health-20;
        System.out.println(this.name + " атакует " + enemy.name);

    }

}
