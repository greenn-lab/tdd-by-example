package tdd.part01.currency.chapter15;

public class Sum implements Expression {
  Expression augend;
  Expression addend;
  
  public Sum(final Expression augend, final Expression addend) {
    this.augend = augend;
    this.addend = addend;
  }
  
  @Override
  public Money reduce(Bank bank, String to) {
    final int amount = augend.reduce(bank, to).amount
        + addend.reduce(bank, to).amount;
    return new Money(amount, to);
  }
  
  @Override
  public Expression plus(Expression addend) {
    return null;
  }
}
