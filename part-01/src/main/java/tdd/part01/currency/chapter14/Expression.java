package tdd.part01.currency.chapter14;

public interface Expression {
  Money reduce(Bank bank, String to);
}
