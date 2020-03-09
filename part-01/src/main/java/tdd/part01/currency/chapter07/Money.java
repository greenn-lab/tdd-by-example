package tdd.part01.currency.chapter07;

public class Money {
  
  protected int amount;
  
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount
        && getClass() == money.getClass();
  }
  
}
