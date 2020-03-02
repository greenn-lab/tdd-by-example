package tdd.part01.currency.chapter06;

public class KRWon extends Money {
  
  public KRWon(int amount) {
    this.amount = amount;
  }
  
  public KRWon times(int multiplier) {
    return new KRWon(amount * multiplier);
  }

}
