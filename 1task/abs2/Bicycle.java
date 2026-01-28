package abs2;

public class Bicycle extends Transport{

    public Bicycle(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println(model + " едет по дороге...");

    }
}
