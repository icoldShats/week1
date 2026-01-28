package nasl;

public class Laptop extends Device{
    int ram;
    public Laptop(String brand, double price,int ram) {
        super(brand, price);
        this.ram=ram;
    }
    @Override
    public void turnOn(){
        System.out.println("Устроиство "+ brand+ " загружает заставку Windows.");
    }

    public void displayInfo(){
        System.out.println(", RAM: " + ram + " ГБ");
    }
}
