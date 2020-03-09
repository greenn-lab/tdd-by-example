package tdd.part01.currency.chapter09;

public abstract class Money {
  
  protected int amount;
  protected String currency;
  
  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }
  
  public static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }
  
  public static Money won(int amount) {
    return new KRWon(amount, "KRW");
  }

  public abstract Money times(int multiplier);
  
  public String currency() {
    return currency;
  }
  
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount
        && getClass() == money.getClass();
  }
  
}
