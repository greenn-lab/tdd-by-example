package tdd.part01.currency.chapter15;

public interface Expression {
  Money reduce(Bank bank, String to);
  Expression plus(Expression addend);
}
