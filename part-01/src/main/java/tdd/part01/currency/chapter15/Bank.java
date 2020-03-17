package tdd.part01.currency.chapter15;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Bank {
  
  private Map<Pair, Integer> rates = new HashMap<>();
  
  public Money reduce(Expression source, String to) {
    return source.reduce(this, to);
  }
  
  int rate(String from, String to) {
    if (Objects.equals(from, to)) {
      return 1;
    }
    
    return rates.get(new Pair(from, to));
  }
  
  void addRate(String from, String to, int rate) {
    rates.put(new Pair(from, to), rate);
  }
}
