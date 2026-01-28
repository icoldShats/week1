import jdk.jfr.EventType;

import java.util.*;

public class EventAggregator {
    public static Map<Long, Map<MyEventType, List<Event>>> aggregate(List<Event> events) {
        Map<Long, Map<MyEventType,List<Event>>> result = new HashMap<>();

        events.stream()
                .sorted(Comparator.comparing(Event::getTimestamp))
                .forEach(event -> {
                    result
                            .computeIfAbsent(event.getUserId(),k -> new HashMap<>())
                            .computeIfAbsent(event.getType(),k->new ArrayList<>())
                            .add(event);

                });
        return result;


    }
}
