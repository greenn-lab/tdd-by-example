package tdd.part01.currency.chapter09;

public class KRWon extends Money {
  
  public KRWon(int amount, String currency) {
    super(amount, currency);
  }
  
  public Money times(int multiplier) {
    return Money.won(amount * multiplier);
  }

}
