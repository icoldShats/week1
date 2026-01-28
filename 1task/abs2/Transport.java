package abs2;

public abstract class Transport {
        String model;

    public Transport(String model) {
        this.model = model;
    }

    public abstract void move();
}
