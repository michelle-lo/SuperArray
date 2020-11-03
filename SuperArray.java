/*
Create a Repo SuperArray
Create a class SuperArray which will contain:

a)Instance Variables:
private String [] data;
private int size; //The current size

b)Constructor:
-public SuperArray()
  Creates an empty superArray.
  Empty does NOT mean an empty capacity,
  it means no elements are stored in it (the size is 0).
  \A good starting capacity is 10.

  Methods:
  c)
  public int size()
  -Returns the number of elements in this list.

  d)
  public boolean add(String element)
  -Appends the specified element to the end of this list.

  e)
  public String get(int index)
  -Returns the element at the specified position in this list.
  [For Now Assume the index is 0 to size-1]

  f)
  public String set(int index, String element)
  -Replaces the element at the specified position in this list w
  ith the specified element. Return the value you replaced.
  [Assume the index is 0 to size-1] note: This is not to add new values,
  it is only to replace old ones.
  */

public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  //Returns the number of elements in this list.
  public int size() {
    return size;

  }
}
