//import java.util.*;
//
//public class MapExample {
//    public static void main(String[] args) {
//        EventAggregator<String, Integer> ageMap = new TreeMap<>();
//
//        ageMap.put("Charlie", 20);
//        ageMap.put("Alice", 30);
//        ageMap.put("Bob", 30);
//        System.out.println(ageMap.get("Alice"));
//
//        for (EventAggregator.Entry<String, Integer> entry : ageMap.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println(key + " = " + value);
//        }
//
//
//
//
//
//        System.out.println("Age Map: " + ageMap);
//
//        // Доступ по ключу
//        System.out.println("Alice's age: " + ageMap.get("Alice"));
//
//        // Удаление элемента
//        ageMap.remove("Bob");
//        System.out.println("After removing Bob: " + ageMap);
//    }
//}
