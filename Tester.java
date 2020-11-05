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
    System.out.println("----...----");

    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println(words.get(i) );
    }

    System.out.println(words.turnToString());
    for (int i = 0; i < 20; i++) {
      words.add("yo");
    }

    System.out.println(words.turnToString());
    System.out.println(words.size());

    System.out.println(words.toString());

    System.out.println(words.contains("yo"));
    words.clear();
    System.out.println(words.toString());
    System.out.println(words.turnToString());
    System.out.println(words.size());

    SuperArray b = new SuperArray(4);
    b.add("yes");
    b.add("no");
    b.add("maybe");
    System.out.println(b.toString());
    b.add(2, "hello");
    print(b.toString(), "[yes, no, hello, maybe]");
    System.out.println(b.turnToString());
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
