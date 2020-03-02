package tdd.part01.currency.chapter04;

public class Dollar {
  
  private int amount;
  
  public Dollar(int amount) {
    this.amount = amount;
  }
  
  public Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }

  public boolean equals(Object object) {
    Dollar target = (Dollar) object;
    return amount == target.amount;
  }
}
