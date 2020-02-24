package tdd.part01.currency.chapter01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DollarTest {
  
  @DisplayName("나는 사악하다...")
  @Test
  void testMultiplication() {
    Dollar five = new Dollar(5);
    
    five.times(2);
    
    assertEquals(10, five.amount);
  }
  
}
