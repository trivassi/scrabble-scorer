public class ScrabbleScorer {
  public int calcScore(String word) {
    int score = 0;
    // Score Arrays
    String letters = "aeioulnrstdgbcmpfhvwykjxqz";
    int[] pointArray = {1,1,1,1,1,1,1,1,1,1,2,2,3,3,3,3,4,4,4,4,4,5,8,8,10,10};
    for (int i = 0; i < word.length(); i++ ) {
      for (int j = 0; i < letters.length(); j++ ) {
          if (word.charAt(i) == letters.charAt(j)) {
            score += pointArray[j];
          }
      }
    }
    return score;
  }
}
