package tdd.part01.currency.chapter10;

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
    assertTrue(Money.won(5).equals(Money.won(5)));
    assertFalse(Money.won(5).equals(Money.won(6)));
    assertFalse(Money.won(5).equals(Money.dollar(5)));
  }
  
  @Test
  void testKRWonMultiplication() {
    Money five = Money.won(5);
    
    assertEquals(Money.won(10), five.times(2));
    assertEquals(Money.won(15), five.times(3));
  }
  
  @Test
  void testCurrency() {
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("KRW", Money.won(1).currency());
  }

  @Test
  void testDifferentClassEquality() {
    assertTrue(
        new Money(10, "KRW")
            .equals(new KRWon(10, "KRW"))
      );
  }
}
