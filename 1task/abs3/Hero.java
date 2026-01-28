package abs3;

public abstract class Hero {
    String name;
    int health;

    public Hero(String enemy,int health){
        this.name=enemy;
        this.health=health;
    }
    public void printInfo(){
        System.out.println("hero :"+name+" , health: "+health);
    }
    public abstract void attack(Hero enemy);

}
