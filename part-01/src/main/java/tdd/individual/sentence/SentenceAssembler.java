package tdd.individual.sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceAssembler {
  
  private final String message;
  private List<String> parameters = new ArrayList<>();
  
  public SentenceAssembler(String message) {
    this.message = message;
  }
  
  public void addParameter(String parameter) {
    parameters.add(parameter);
  }
  
  public List<String> getParameters() {
    return parameters;
  }
  
  public void validateStartsOne() {
    final Matcher matcher = Pattern.compile("!(\\d+)").matcher(message);
    
    boolean hasOne = false;
    int caret = 0;
    while (matcher.find(caret)) {
      final String digit = matcher.group(1);
      if ("1".equals(digit)) {
        hasOne = true;
        break;
      }
      
      caret = matcher.start() + 1;
    }
    
    if (!hasOne) {
      throw new IllegalArgumentException();
    }
  }
  
  public void validateSameParameterLengthAndArgumentMax() {
    final Matcher matcher = Pattern.compile("!(\\d+)").matcher(message);
    
    int caret = 0;
    String max = "";
    
    while (matcher.find(caret)) {
      final String digit = matcher.group(1);
      
      if (max.compareTo(digit) < 0) {
        max = digit;
      }
      
      caret = matcher.start() + 1;
    }
    
    if (parameters.size() != Integer.parseInt(max)) {
      throw new IllegalArgumentException();
    }
    
  }
}
