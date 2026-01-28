package nasl;

public class Main {
    public static void main(String[] args){
        // Создаем объекты
        Smartphone samsung = new Smartphone("Samsung S24", 1200, 200);
        Laptop hp = new Laptop("HP Pavillion", 800, 16);

        // Проверяем, как они включаются (Полиморфизм в действии)
        samsung.turnOn();
        hp.turnOn();

        System.out.println("-----------------");

        // Проверяем вывод информации (работа super + свой код)
        samsung.displayInfo();
        hp.displayInfo();
    }
}
