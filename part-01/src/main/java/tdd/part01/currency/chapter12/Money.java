package tdd.part01.currency.chapter12;

public class Money implements Expression {
  
  protected int amount;
  protected String currency;
  
  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }
  
  public static Money dollar(int amount) {
    return new Money/*Dollar*/(amount, "USD");
  }
  
  public static Money won(int amount) {
    return new Money/*KRWon*/(amount, "KRW");
  }
  
  public Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }
  
  public String currency() {
    return currency;
  }
  
  @Override
  public String toString() {
    return "Money{" +
        "amount=" + amount +
        ", currency='" + currency + '\'' +
        '}';
  }
  
  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount
        && currency().equals(money.currency());
  }
  
  public Expression plus(Money addend) {
    return new Money(amount + addend.amount, addend.currency());
  }
}
