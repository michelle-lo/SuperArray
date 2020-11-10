import java.util.Arrays;

public class Tester {
  public static void main (String[] args) {
    SuperArray a = new SuperArray();
    SuperArray empty = new SuperArray();
    System.out.println("----size----");
    print(a.size(), 0);
    System.out.println("----add----");
    print(a.add("hewwo"), true);
    SuperArray nothing = new SuperArray();
    nothing.add("haha");
    print(nothing.toString(), "[haha]");
    System.out.println(nothing.turnToString());
    System.out.println("----get----");
    print(a.get(0), "hewwo");
    a.add("goodbwye");
    print(a.get(1), "goodbwye");
    System.out.println("----set----");
    a.add("yes");
    print(a.set(2, "no"), "yes");
    print(a.get(2), "no");
    System.out.println("----clear----");
    a.clear();
    print(a.toString(), "[]");
    print(a.size(), 0);
    System.out.println("----isEmpty----");
    SuperArray notEmpty = new SuperArray(2);
    notEmpty.add("lol");
    print(a.isEmpty(), true);
    print(notEmpty.isEmpty(), false);
    System.out.println("----add(index, element)----");
    SuperArray b = new SuperArray(4);
    b.add("yes");
    b.add("no");
    b.add("maybe");
    System.out.println(b.toString());
    b.add(2, "hello");
    print(b.toString(), "[yes, no, hello, maybe]");
    System.out.println(b.turnToString());
    b.add(2, "what's up");
    print(b.toString(), "[yes, no, what's up, hello, maybe]");
    System.out.println("----remove----");
    System.out.println("size: " + b.size());
    b.remove(2);
    print(b.toString(), "[yes, no, hello, maybe]");
    print(b.size(), 4);

    a.remove(2);
    print(a.toString(), "[]");
    print(a.size(), 0);
    System.out.println("----indexOf----");
    print(b.indexOf("yes"), 0);
    print(b.indexOf("hewwo"), -1);
    print(a.indexOf("okay"), -1);
    System.out.println("----toArray----");
    String[] arrA = a.toArray();
    print(Arrays.toString(arrA), "[]");
    String[] arrB = b.toArray();
    print(Arrays.toString(arrB), "[yes, no, hello, maybe]");
    System.out.println("----lastIndexOf----");
    SuperArray c = new SuperArray();
    c.add("heyo"); c.add("heyo"); c.add("heyo"); c.add("heyo"); c.add("heyo");
    c.add("nah"); c.add("nah"); c.add("heyo"); c.add("nah");
    print(c.lastIndexOf("heyo"), 7);
    print(c.lastIndexOf("nah"), 8);
    print(empty.lastIndexOf("nah"), -1);
    print(empty.lastIndexOf("bruh"), -1);

    /*
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
    */

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
