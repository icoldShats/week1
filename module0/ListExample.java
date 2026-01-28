import java.util.*;


public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // дубликат разрешен

        System.out.println("Fruits: " + fruits);

        // Доступ по индексу
        System.out.println("First fruit: " + fruits.get(0));

        // Перебор элементов
        for (String fruit : fruits) {
            System.out.println(fruit);

        }


        // Сортировка
        Collections.sort(fruits);
        System.out.println("Sorted: " + fruits);




        // LinkedList двусвязный список
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);

        numbers.addFirst(1); // вставка в начало
        numbers.addLast(10); // вставка в конец

        System.out.println("Numbers: " + numbers);
    }
}
