public class Tester {
  public static void main (String[] args) {
    SuperArray a = new SuperArray();
    System.out.println("----size----");
    print(a.size(), 0);
    System.out.println("----add----");
    print(a.add("hewwo"), true);
    System.out.println("----get----");
    print(a.get(0), "hewwo");
    a.add("goodbwye");
    print(a.get(1), "goodbwye");
    System.out.println("----set----");
    a.add("yes");
    print(a.set(2, "no"), "yes");
    print(a.get(2), "no");

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
