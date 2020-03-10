package tdd.part01.currency.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MoneyTest {
  
  @Test
  void testMultiplication() {
    Money five = Money.dollar(5);
    
    assertEquals(Money.dollar(10), five.times(2));
    assertEquals(Money.dollar(15), five.times(3));
  }
  
  @Test
  void testEquality() {
    assertTrue(Money.dollar(5).equals(Money.dollar(5)));
    assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    assertFalse(Money.won(5).equals(Money.dollar(5)));
  }
  
  @Test
  void testCurrency() {
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("KRW", Money.won(1).currency());
  }

  @Test
  void testSimpleAddition() {
    Money five = Money.dollar(5);
    Expression sum = five.plus(five);
    Bank bank = new Bank();
    Money reduced = bank.reduce(sum, "USD");
    assertEquals(Money.dollar(10), reduced);
  }
}
