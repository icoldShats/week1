package abs2;

public class Main {
    public static void main(String[] args){
        Bicycle bicycle=new Bicycle("Stels Navigator");
        Car bwm = new Car("BMW X5");

        bwm.move();
        bicycle.move();

        bwm.refuel();
    }
}
