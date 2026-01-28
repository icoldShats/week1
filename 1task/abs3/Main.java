package abs3;

public class Main {
    public static void main(String []args){
        Mage mage = new Mage("Qazaq",100);
        Warrior warrior=new Warrior("Tatar",100);
        Paladin paladin=new Paladin("Russia",100);

        // Проверим начальное состояние
        mage.printInfo();
        warrior.printInfo();
        System.out.println("--- НАЧАЛО БОЯ ---");

        mage.attack(warrior);
        warrior.printInfo();


        warrior.attack(mage);
        mage.printInfo();

        System.out.println("--- ПРИШЕЛ ХИЛЕР ---");

        paladin.heal(warrior);
        warrior.printInfo();

        paladin.attack(mage);
        mage.printInfo();
    }
}
