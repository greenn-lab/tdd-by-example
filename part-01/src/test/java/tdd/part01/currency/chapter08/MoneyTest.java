package tdd.part01.currency.chapter08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
  
  @Test
  void testMultiplication() {
    Dollar five = Money.dollar(5);
    
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(15), five.times(3));
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
  
    assertEquals(new KRWon(10), five.times(2));
    assertEquals(new KRWon(15), five.times(3));
  }
  
}
