import java.util.Arrays;

public class Tester {
  public static void main (String[] args) {
    SuperArray words = new SuperArray();
    System.out.println("----size----");
    print(words.size(), 0);
    System.out.println("----add----");
    print(words.add("hewwo"), true);

  }

  public static void print (Object actual, Object expected) {
    String str = "";
    str += "Actual: " + actual + "\n";
    str += "Expected: " + expected + "\n";
    if (actual.equals(expected)) {
      str += "Success! :)\n";
    } else {
      str += "Fail! :(\n";
    }
    System.out.println(str);
  }


}
