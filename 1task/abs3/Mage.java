package abs3;

public class Mage extends Hero{
    public Mage(String enemy, int health) {
        super(enemy, health);
    }

    @Override
    public void attack(Hero enemy) {
        enemy.health=enemy.health-20;
        System.out.println(this.name + " атакует " + enemy.name);
    }
}

