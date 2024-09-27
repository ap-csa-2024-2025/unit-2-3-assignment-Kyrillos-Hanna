public class Classwork
{
  public static void main(String[] args)
  {
    // test your code here
  }

  public static String firstLastN(String word, int n) {
    String output = new String();

    String firstN = word.substring(0, n);

    int indexOfNToLast = word.length() - n;
    String lastN = word.substring(indexOfNToLast);

    output = firstN + lastN;
    return output;
  }

  public static String delEnd(String word, int n) {
    return word = word.substring(0, n-1);
  }

  public static int compareLower(String word1, String word2) {
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();
  }



}
