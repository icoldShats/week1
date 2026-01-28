package abs1;

public abstract class Animal {
    //все наши животные могут есть
    public void eat (){
        System.out.println("I am eating...");
    }
    //но все они издают разные звуки
    public abstract void makesound ();
}
