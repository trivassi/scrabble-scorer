import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScorerTest {

  @Test
  public void calcScore_returnValueForLetter_1(){
    ScrabbleScorer testScrabbleObj = new ScrabbleScorer();
    int expectedOutput = 1;
    assertEquals(expectedOutput, testScrabbleObj.calcScore("a"));
  }

  @Test
  public void calcScore_returnPointForEachLetter_3(){
    ScrabbleScorer testObj = new ScrabbleScorer();
    assertEquals(4, testObj.calcScore("aaaa"));
  }

  @Test
  public void calcScore_returnCorrectValueForLetter_int(){
    ScrabbleScorer testObj = new ScrabbleScorer();
    assertEquals(33, testObj.calcScore("adbfkjq"));
  }
}
