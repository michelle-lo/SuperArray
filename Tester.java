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
    System.out.println("----equals (SuperArray)----");
    SuperArray e = new SuperArray();
    e.add("si"); e.add("si"); e.add("si");
    e.add("no"); e.add("no"); e.add("no");
    SuperArray eToo = new SuperArray();
    eToo.add("si"); eToo.add("si"); eToo.add("si");
    eToo.add("no"); eToo.add("no"); eToo.add("no");
    print(e.equals(eToo), true);
    print(c.equals(e), false);
    print(e.equals(c), false);
    print(e.equals(empty), false);
    print(a.equals(empty), true);
    eToo.add("no");
    print(e.equals(eToo), false);
    System.out.println("----SuperArray(initialCapacity)----");
    try {
      SuperArray err = new SuperArray(2);
    } catch (IllegalArgumentException neg) {
      System.out.print("this shouldn't happen");
    }
    try {
      SuperArray negArray = new SuperArray(-1);
    } catch (IllegalArgumentException neg) {
      System.out.println("SuperArray: it's a negative number. nice try.");
    }
    System.out.println("----get index error----");
    try {
        e.get(-1);
    } catch (IndexOutOfBoundsException err) {
      System.out.println("get(): index out of bounds");
    }





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
