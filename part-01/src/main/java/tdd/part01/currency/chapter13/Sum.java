package tdd.part01.currency.chapter13;

public class Sum implements Expression {
  Money augend;
  Money addend;
  
  public Sum(final Money augend, final Money addend) {
    this.augend = augend;
    this.addend = addend;
  }
  
  public Money reduce(String to) {
    final int amount = augend.amount + addend.amount;
    return new Money(amount, to);
  }
}
