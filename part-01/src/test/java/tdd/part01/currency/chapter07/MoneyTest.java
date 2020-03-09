package tdd.part01.currency.chapter07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
  
  @Test
  void testEquality() {
    assertTrue(new Dollar(5).equals(new Dollar(5)));
    assertFalse(new Dollar(5).equals(new Dollar(6)));
    assertTrue(new KRWon(5).equals(new KRWon(5)));
    assertFalse(new KRWon(5).equals(new KRWon(6)));
    assertFalse(new KRWon(5).equals(new Dollar(5)));
  }
  
}
