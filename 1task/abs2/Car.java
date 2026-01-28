package abs2;

public class Car extends Transport implements Refuelable{

    public Car(String model){
        super(model);
    }
    @Override
    public void refuel() {
        System.out.println(model+": Заливаем бензин...");

    }

    @Override
    public void move() {
        System.out.println(model + " едет по дороге...");

    }
}
