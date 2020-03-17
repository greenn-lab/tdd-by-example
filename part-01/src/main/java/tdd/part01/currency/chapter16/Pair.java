package tdd.part01.currency.chapter16;

import java.util.Objects;

public class Pair {
  private final String form;
  private final String to;
  
  public Pair(String form, String to) {
    this.form = form;
    this.to = to;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pair pair = (Pair) o;
    return Objects.equals(form, pair.form) &&
        Objects.equals(to, pair.to);
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(form, to);
  }
}
