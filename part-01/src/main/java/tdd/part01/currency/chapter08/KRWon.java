package tdd.part01.currency.chapter08;

public class KRWon extends Money {
  
  public KRWon(int amount) {
    this.amount = amount;
  }
  
  public Money times(int multiplier) {
    return new KRWon(amount * multiplier);
  }

}
