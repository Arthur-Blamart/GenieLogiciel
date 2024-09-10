package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    public void testAddEuros() {
        Money m1 = new Money("Pouet",20);
        Money m2 = new Money("Pouet",0.2f);
        Money expected = new Money("Pouet",20.2f);
        assertEquals(expected,m1.add(m2));
    }
}
