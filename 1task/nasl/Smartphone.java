package nasl;

public class Smartphone extends Device {
    int cameraResolution;

    public Smartphone(String brand, double price,int cameraResolution) {
        super(brand, price);
        this.cameraResolution=cameraResolution;
    }
    @Override
    public void turnOn(){
        System.out.println("Устроиство "+ brand+ " загружает заставку Android...");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println(", Камера: " + cameraResolution + " Мп");
    }
}
