package tdd.part01.currency.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {
  
  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    
    //assertEquals(10, product.amount);
    
    //product = five.times(3);
    
    //assertEquals(15, product.amount);
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
    assertEquals(new Dollar(10), five.times(3));
  }

}
