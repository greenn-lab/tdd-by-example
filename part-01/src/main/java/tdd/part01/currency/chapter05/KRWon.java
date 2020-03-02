package tdd.part01.currency.chapter05;

public class KRWon {
  
  private int amount;
  
  public KRWon(int amount) {
    this.amount = amount;
  }
  
  public KRWon times(int multiplier) {
    return new KRWon(amount * multiplier);
  }

  public boolean equals(Object object) {
    KRWon target = (KRWon) object;
    return amount == target.amount; // 이거 이대로 둬도 될까요? ... 눈에 밟히는데...
  }
}
