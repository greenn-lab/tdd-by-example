package tdd.part01.currency.chapter05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KRWonTest {

  @Test
  void testKRWonMultiplication() {
    KRWon five = new KRWon(5);
    assertEquals(new KRWon(10), five.times(2));
    assertEquals(new KRWon(15), five.times(3));
  }
  
}
