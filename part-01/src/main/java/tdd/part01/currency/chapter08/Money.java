package tdd.part01.currency.chapter08;

public abstract class Money {
  
  protected int amount;
  
  public static Dollar dollar(int amount) {
    return new Dollar(amount);
  }
  
  public static Money won(int amount) {
    return new KRWon(amount);
  }
  
  public abstract Money times(int multiplier);
  
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount
        && getClass() == money.getClass();
  }
  
}
