package abs3;

public class Paladin extends Hero implements Healer{
    public Paladin(String enemy, int health) {
        super(enemy,health);
    }

    @Override
    public void attack(Hero enemy) {
        enemy.health = enemy.health - 20;
        System.out.println(this.name + " атакует " + enemy.name);
    }



    @Override
    public void heal(Hero hero) {
        hero.health=hero.health+10;

    }
}
