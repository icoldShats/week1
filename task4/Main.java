import java.math.BigDecimal;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Money price1 = new Money(new BigDecimal("10.50"), "USD");
        Money price2 = new Money(new BigDecimal("5.25"), "USD");

        OrderItem item1 = new OrderItem("apple", price1, 2);
        OrderItem item2 = new OrderItem("banana", price2, 3);

        Order order = new Order("123", List.of(item1, item2));

        System.out.println(order);
        System.out.println("Total: " + order.total());

        // создаём новый заказ с добавленным элементом
        OrderItem item3 = new OrderItem("orange", new Money(new BigDecimal("3.00"), "USD"), 5);
        Order newOrder = order.withAddedItem(item3);

        System.out.println(newOrder);
        System.out.println("New total: " + newOrder.total());
    }
}