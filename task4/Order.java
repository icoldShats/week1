import java.util.List;
import java.util.Objects;

// Order — заказ, immutable
final class Order {
    private final String orderId;       // уникальный идентификатор заказа
    private final List<OrderItem> items; // список товаров, immutable

    public Order(String orderId, List<OrderItem> items) {
        // Валидация
        if (orderId == null || orderId.isEmpty())
            throw new IllegalArgumentException("OrderId must not be empty");
        if (items == null || items.isEmpty())
            throw new IllegalArgumentException("Items must not be empty");

        this.orderId = orderId;
        this.items = List.copyOf(items); // immutable копия списка
    }

    // Возвращает общую стоимость заказа
    public Money total() {
        // Берём валюту первого товара
        Money sum = new Money(
                items.get(0).getPrice().getAmount(),
                items.get(0).getPrice().getCurrency()
        );

        // Суммируем стоимость каждого OrderItem
        for (OrderItem item : items) {
            sum = sum.add(item.totalPrice());
        }
        return sum;
    }

    // Создаёт новый Order с добавленным элементом
    public Order withAddedItem(OrderItem item) {
        List<OrderItem> newItems = new java.util.ArrayList<>(items);
        newItems.add(item);
        return new Order(orderId, newItems); // возвращает новый объект
    }

    public String getOrderId() {
        return orderId;
    }

    public List<OrderItem> getItems() {
        return items; // immutable
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderId.equals(order.orderId) &&
                items.equals(order.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, items);
    }

    @Override
    public String toString() {
        return "Order{" + orderId + ", items=" + items + "}";
    }
}
