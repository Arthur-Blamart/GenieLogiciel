package demo;

import java.util.Objects;

public class Money {
    private String currency;
    private float amount;
    public Money(String currency, float amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Money add(Money that){
        return new Money(this.currency, this.amount + that.amount);
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Float.compare(amount, money.amount) == 0 && Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, amount);
    }
}
