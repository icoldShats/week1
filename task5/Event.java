import java.time.LocalDateTime;
import jdk.jfr.EventType;
import java.util.*;

// Тип события
enum MyEventType {
    LOGIN,
    LOGOUT,
    PURCHASE,
    VIEW
}

// Класс события
class Event {
    private final Long userId;
    private final MyEventType type;
    private final LocalDateTime timestamp;

    public Event(Long userId, MyEventType type, LocalDateTime timestamp) {
        this.userId = userId;
        this.type = type;
        this.timestamp = timestamp;
    }

    public Long getUserId() {
        return userId;
    }

    public MyEventType getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Event{" +
                "userId=" + userId +
                ", type=" + type +
                ", timestamp=" + timestamp +
                '}';
    }



}
