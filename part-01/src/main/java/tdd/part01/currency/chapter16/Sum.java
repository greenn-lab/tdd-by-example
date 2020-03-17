package tdd.part01.currency.chapter16;

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
    return new Sum(this, addend);
  }
  
  public Expression times(int multiplier) {
    return new Sum(
        augend.times(multiplier),
        addend.times(multiplier)
    );
  }
}
