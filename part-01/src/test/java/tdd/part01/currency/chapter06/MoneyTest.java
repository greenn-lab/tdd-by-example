package tdd.part01.currency.chapter06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
  
  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
  }
  
  @Test
  public void testMultiplication2() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    
    assertEquals(new Dollar(10), product);
    
    product = five.times(3);
    
    assertEquals(new Dollar(15), product);
  }
  
  @Test
  public void testMultiplication3() {
    Dollar five = new Dollar(5);
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(15), five.times(3));
  }

  @Test
  public void testMultiplication4() {
    assertTrue(new Dollar(5).equals(new Dollar(5)));
    assertFalse(new Dollar(5).equals(new Dollar(6)));
    assertTrue(new KRWon(5).equals(new KRWon(5)));
    assertFalse(new KRWon(5).equals(new KRWon(6)));
  }
}
