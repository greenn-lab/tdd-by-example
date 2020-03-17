package tdd.part01.currency.chapter14;

public class Sum implements Expression {
  Money augend;
  Money addend;
  
  public Sum(final Money augend, final Money addend) {
    this.augend = augend;
    this.addend = addend;
  }
  
  @Override
  public Money reduce(Bank bank, String to) {
    final int amount = augend.amount + addend.amount;
    return new Money(amount, to);
  }
}
