package tdd.part01.currency.chapter02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DollarTest {
  
  @DisplayName("이걸 꼭 이렇게 해야했었냐?")
  @Test
  void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    
    assertEquals(10, product.amount);
    
    product = five.times(3);

    assertEquals(15, product.amount);
  }

}
