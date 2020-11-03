/*
g)
private void resize()
-Increase the capacity by :
creating a larger array
copy the values from the original array to the new one.
assign the new one to the instance variable.

Modify part d)
public boolean add(String element)
-Appends the specified element to the end of this list.
-When the capacity is full, resize before adding.
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

  //Appends the specified element to the end of this list.
  public boolean add(String element) {
    if (size == data.length) {
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }

  //Returns the element at the specified position in this list.
  //[For Now Assume the index is 0 to size-1]
  public String get(int index) {
    return data[index];
  }

  /*
  -Replaces the element at the specified position in this list with
  the specified element. Return the value you replaced.
  [Assume the index is 0 to size-1] note: This is not to add new values,
  it is only to replace old ones.
  */
  public String set(int index, String element) {
    String orig = data[index];
    data[index] = element;
    return orig;
  }
  /*
  -Increase the capacity by :
  creating a larger array
  copy the values from the original array to the new one.
  assign the new one to the instance variable.
  */
  private void resize() {
    String[] newData = new String[data.length + 5];
    for (int i = 0; i < data.length; i++) {
      add(data[i]);
    }
  }
}
