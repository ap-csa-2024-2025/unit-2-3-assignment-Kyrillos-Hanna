public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary", 1));
    System.out.println(firstLastN("apple", 2));

    System.out.println(delEnd("library", 5));

    System.out.println(compareLower("Sterling", "material"));
    System.out.println(compareLower("framing", "framiNG"));
    System.out.println(compareLower("BAgels", "candLes"));

    System.out.println(lengthFirst("Everything in its right place"));
    System.out.println(lengthFirst("Down is the new up"));
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
    return word = word.substring(0, word.length() - n);
  }

  public static int compareLower(String word1, String word2) {
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();

    return word1.compareTo(word2);
  }

  public static int lengthFirst(String sentence) {
    int n = sentence.indexOf(" ");
    String firstWord = sentence.substring(0, n);
    return firstWord.length();
  }



}
