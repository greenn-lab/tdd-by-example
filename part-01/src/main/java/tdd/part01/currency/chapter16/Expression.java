package tdd.part01.currency.chapter16;

public interface Expression {
  Money reduce(Bank bank, String to);
  Expression plus(Expression addend);
  Expression times(int multiplier);
}
