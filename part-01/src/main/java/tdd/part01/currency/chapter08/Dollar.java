package tdd.part01.currency.chapter08;

public class Dollar extends Money {
  
  public Dollar(int amount) {
    this.amount = amount;
  }
  
  public Money times(int multiplier) {
    return new Dollar(amount * multiplier);
  }

}
