public class Demo {

    public static void main(String[]args){
      System.out.println("---removeDuplicates---");
      SuperArray words = new SuperArray();
      //grouped to save vertical space
      words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
      words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
      words.add("una");    words.add("ebi");     words.add("toro");

      System.out.println(words);
      removeDuplicates(words);
      System.out.println(words);

      System.out.println("---findOverlap---");
      SuperArray a = new SuperArray();
      a.add("9"); a.add("1"); a.add("2"); a.add("2"); a.add("3"); a.add("4");
      SuperArray b = new SuperArray();
      b.add("0"); b.add("4"); b.add("2"); b.add("2"); b.add("9");
      System.out.println(findOverlap(a, b).toString());
      //expected: [9,2,4]

      SuperArray noCommon = new SuperArray();
      noCommon.add("9"); noCommon.add("9"); noCommon.add("4");
      SuperArray noCommon2 = new SuperArray();
      noCommon.add("3"); noCommon.add("3"); noCommon.add("2"); noCommon.add("1");
      System.out.println(findOverlap(noCommon, noCommon2).toString());
      //expected: []

      SuperArray c = new SuperArray();
      c.add("4"); c.add("4"); c.add("5"); c.add("4"); c.add("2"); c.add("1");
      SuperArray d = new SuperArray();
      d.add("7"); d.add("8"); d.add("9"); d.add("4"); d.add("7"); d.add("4");
      d.add("2"); d.add("1"); d.add("8");
      System.out.println(findOverlap(c, d).toString());
      //expected: [4. 2, 1]
      SuperArray e = new SuperArray();
      e.add("a"); e.add("b"); e.add("c"); e.add("d"); e.add("e"); e.add("f");
      SuperArray f = new SuperArray();
      f.add("0"); f.add("1"); f.add("2"); f.add("3");
      System.out.println(zip(e, f).toString());
      //Expected: ["a","0","b","1","c","2", "d","3","e","f"]

      SuperArray g = new SuperArray();
      g.add("a"); g.add("b"); g.add("c");
      SuperArray h = new SuperArray();
      h.add("0"); h.add("1"); h.add("2"); h.add("3"); h.add("4");
      System.out.println(zip(g, h).toString());
      //expected:["a","0","b","1","c","2","3","4"]
      //[a, 0, b, 1, c, 2, 2, 3, 4]




    }

  /*
  You will be writing a method public static void removeDuplicates(SuperArray s){}
  When there are duplicates: all elements with the same value but higher index
  will be removed [you keep the first occurrence of each value].
  */
  public static void removeDuplicates(SuperArray s) {
    for (int i = 0; i < s.size(); i++) {
      if (i != s.indexOf(s.get(i))) { //gets rid of elements that are not first occurences of element.
        s.remove(i);
        i--; //placed so it doesn't skip elements.
      }
    }
  }

  //This will return a new SuperArray that is the intersection of
  //elements of a and b. The order should be the same as the
  //order of the elements of a. There should be no duplicates in the result.

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    removeDuplicates(a);
    SuperArray c = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.contains(a.get(i))) { //if (b.indexOf(a.get(i)) != -1) {
        c.add(a.get(i));
      }
    }
    return c;
  }


  //takes two SuperArrays and merge them together.
  //Return a new SuperArray that contains all elements of a,
  //and all elements of b in the following sequence:
  //[a0, b0, a1, b1, a2, b2 ... ]
  //When either SuperArray is longer and you run out of strings in one,
  //just fill the remaining elements with the rest of the longer SuperArray.
  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray zipped = new SuperArray();
    int last = 0;
    for (int i = 0; i < a.size() && i < b.size(); i++) {
      zipped.add(a.get(i));
      zipped.add(b.get(i));
      last = i;
    }

    if (a.size() == b.size()) {
      return zipped;
    } else if (a.size() > b.size()) {
      for (int i = last + 1; i < a.size(); i++) {
        zipped.add(a.get(i));
      }
    } else {
      for (int i = last + 1; i < b.size(); i++) {
        zipped.add(b.get(i));
      }
    }

    return zipped;
  }
}
