import java.util.Objects;

public class OrderItem {
    private final String productId;
    private final Money price;
    private final int quantity;

    public OrderItem(String productId, Money price, int quantity){
        if(productId == null || productId.isEmpty()){
            throw new IllegalArgumentException("ProductId must not be empty");
        }
        if (price == null){
            throw new IllegalArgumentException("Price must not be null");
        }
        if (quantity <=0){
            throw new IllegalArgumentException("Quantity must be positive");
        }
        this.price=price;
        this.productId=productId;
        this.quantity=quantity;
    }
    public Money totalPrice(){
        return price.multiply(quantity);
    }
    public String getProductId(){
        return productId;
    }
    public Money getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if (!(o instanceof OrderItem)) return false;
        OrderItem that =(OrderItem) o;
        return quantity == that.quantity &&
                productId.equals(that.productId) &&
                price.equals(that.price);
    }


    @Override
    public int hashCode(){
        return Objects.hash(productId,price,quantity);
    }

    @Override
    public String toString(){
        return quantity +" x "+productId+ " @ " +price;
    }


}
