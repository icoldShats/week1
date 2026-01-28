//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//
//        List<Event> events = List.of(
//                new Event(1L, MyEventType.LOGIN, LocalDateTime.of(2026, 1, 27, 9, 0)),
//                new Event(2L, MyEventType.PURCHASE, LocalDateTime.of(2026, 1, 27, 10, 0)),
//                new Event(1L, MyEventType.LOGOUT, LocalDateTime.of(2026, 1, 27, 11, 0)),
//                new Event(1L, MyEventType.LOGIN, LocalDateTime.of(2026, 1, 27, 8, 30)),
//                new Event(2L, MyEventType.LOGIN, LocalDateTime.of(2026, 1, 27, 9, 30))
//        );
//
//        Map<Long, Map<MyEventType, List<Event>>> grouped = EventAggregator.aggregate(events);
//
//        // Выводим результат
//        grouped.forEach((userId, map) -> {
//            System.out.println("User: " + userId);
//            map.forEach((type, list) -> {
//                System.out.println("  Type: " + type);
//                list.forEach(e -> System.out.println("    " + e));
//            });
//        });
//    }
//
//}
