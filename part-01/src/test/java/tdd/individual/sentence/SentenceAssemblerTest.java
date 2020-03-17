package tdd.individual.sentence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SentenceAssemblerTest {
  
  /*
   * [X] "..!1..!3..!2.." 형식의 메세지를 받음
   * [X] "A", "B", "C" 파라미터를 순차적으로 받음
   * [-] 메세지와 파라미터를 조합 ("느낌표+숫자" 의 숫자가 파라미터의 순서와 같아야 한다.)
   *     [X] 파라미터는 1부터 시작하지 않으면 IllegalArgumentException
   *     [-] 파라미터 갯수와 "느낌표" 뒤의 숫자 중 가장 큰 수치가 맞지 않으면 IllegalArgumentException
   *         (파라미터는 3개 받았는데, !4 이런거 있음 에러)
   */
  
  @Test
  void shouldAcceptMessage() {
    final String message = "..!1..!3..!2..";
    final SentenceAssembler assembler = new SentenceAssembler(message);
  
    assertNotNull(assembler);

    assembler.addParameter("A");
    assembler.addParameter("B");
    assembler.addParameter("C");
  
    assertEquals(3, assembler.getParameters().size());
    
    assertDoesNotThrow(assembler::validateStartsOne);
  
    final SentenceAssembler assembler1 = new SentenceAssembler("....!3..!2..");
    assertThrows(IllegalArgumentException.class,
        assembler1::validateStartsOne);
  
    assembler1.addParameter("A");
    assembler1.addParameter("B");
    
    assembler1.validateSameParameterLengthAndArgumentMax();
  }

}
