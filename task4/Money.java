import java.math.BigDecimal;
import java.util.Objects;

public class Money {
    private final BigDecimal amount;
    private final String currency;

    public Money(BigDecimal amount, String currency){
        if (amount == null || currency ==null || currency.isEmpty()){
            throw new IllegalArgumentException("Invalid money parameters");
        }
        if(amount.signum()<0){
            throw new IllegalArgumentException("Amount must be non-negative ");
        }
        this.amount=amount;
        this.currency=currency;
    }
    public Money add(Money other){
        if (!this.currency.equals(other.currency))
            throw new IllegalArgumentException("Currencies must mutch");
        return new Money(this.amount.add(other.amount), currency);

    }
    public Money multiply(int factor){
        if(factor <0)
            throw new IllegalArgumentException("Factor must be non-negative");
        return new Money(this.amount.multiply(BigDecimal.valueOf(factor)),currency);
    }

    public String getCurrency(){
        return currency;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return amount.equals(money.amount) && currency.equals(money.currency);
    }


    public int hashCode(){
        return Objects.hash(amount,currency);
    }

    public String toString() {
        return amount + " " + currency;
    }


    public BigDecimal getAmount() {
        return amount;
    }
}
