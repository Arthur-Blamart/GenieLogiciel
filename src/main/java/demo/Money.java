package demo;

public class Money {
    private String currency;
    private float amount;
    public Money(String currency, float amount) {
        this.currency = currency;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
