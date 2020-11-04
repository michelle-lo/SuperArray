//Hw14
//November 3rd, 2020javac
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
    String[] newData = new String[data.length * 2]; //+ 1? to acc for 0 capacity
    for (int i = 0; i < data.length; i++) {
      newData[i] = data[i];
    }
    data = newData;

  }

  //Returns true if this list contains no elements.
  public boolean isEmpty() {
    return (size == 0);
  }

  //Reset the SuperArray to be size 0 again.
  //There should be no references to any old values in the array.
  public void clear() {
    for (int i = 0; i < data.length; i++) {
      data[i] = null;
    }
    size = 0;
  }

  //This is the most important method to get right before proceeding!
  //Format "[e0, e1, e2,..., eN]" where the size is N+1
  //This only displays the elements that were added, not the empty spots
  public String toString() {
    String str = "[";
    for (int i = 0; i < data.length; i++) {
      if (data[i] != null) {
        str += data[i];
        if (data[i + 1] != null && i != data.length - 1) {
          str += ", ";
        }
      } else {
        i = data.length;
      }
    }
    return str += "]";
  }

  //Returns true if this list contains the specified element.
  public boolean contains(String s) {
    for (int i = 0; i < data.length; i++) {
      if (data[i].equals(s)) {
        return true;
      }
    }
    return false;
  }

//for testing purposes
  public String turnToString() {
    String str = "";
    for (int i = 0; i < data.length; i++) {
      str += data[i];
      str += ", ";
    }
    return str;
  }
}
