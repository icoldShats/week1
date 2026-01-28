package nasl;

public abstract class Device {
    String brand;
    double price;

    public Device(String brand,double price){
        this.brand=brand;
        this.price=price;
    }
    public void turnOn(){
        System.out.println("Устроиство "+ brand+ " вкл");
    }

    public void displayInfo(){
        System.out.println("Бренд: "+brand+ "Цена: "+price);
    }

}
