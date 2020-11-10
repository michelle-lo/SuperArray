//Hw14
//November 3rd, 2020javac
public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  //Create the SuperArray with the provided starting capacity.
  public SuperArray(int initialCapacity) {
      data = new String[initialCapacity];
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

  //Inserts the specified element at the specified position in this list.
  //Shifts the element currently at that position (if any)
  //and any subsequent elements to the right.
  public void add(int index, String element) {
    if (size == data.length) {
      resize();
    }
    size++;
    String[] newData = new String[data.length];

    for (int i = 0; i < size; i++) {
      if (i < index) {
        newData[i] = data[i];
      } else if (i == index) {
        newData[i] = element;
      } else {
        newData[i] = data[i - 1];
      }
    }
    data = newData;
  }

  //Removes the element at the specified position in this list.
  //Shifts any subsequent elements to the left.
  //The returned value is the element you remove.
  public String remove(int index) {
    String orig = data[index];
    for (int i = index; i < size - 1; i++) {
        data[i] = data[i + 1];
    }
    if (size > 0) {
      size--;
    }
    return orig;
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
    String[] newData = new String[data.length * 2 + 1];
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
    String[] newData = new String[data.length];
    data = newData;
    size = 0;
  }

  //This is the most important method to get right before proceeding!
  //Format "[e0, e1, e2,..., eN]" where the size is N+1
  //This only displays the elements that were added, not the empty spots
  public String toString() {
    String str = "[";
    for (int i = 0; i < size(); i++) {
      str += data[i];
      if (i != size - 1) {
        str += ", ";
      }
    }
    return str += "]";
  }

  //Returns true if this list contains the specified element.
  public boolean contains(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return true;
      }
    }
    return false;
  }
  //Returns the index of the first occurrence of the specified element
  //in this list, or -1 if this list does not contain the element.
  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }
  //Returns an array containing all of the elements in this list
  //in proper sequence (from first to last element).
  //The returned array will be "safe" in that no references to it
  //are maintained by this list. (In other words, this method must allocate a new array).
  public String[] toArray() {
    String[] arr = new String[size];
    for (int i = 0; i < size; i++) {
      arr[i] = data[i];
    }
    return arr;
  }
/*
  Add these methods to your SuperArray:
c) public int lastIndexOf(String value){ }
d) public boolean equals(SuperArray other){ }
SuperArrays are equal when all corresponding elements are equal. The capacity is NOT important.
*/

  public int lastIndexOf(String value){
    int last = -1;
    for (int i = 0; i < size; i++) {
      if (data[i].equals(value)) {
        last = i;
      }
    }
    return last;
  }

//SuperArrays are equal when all corresponding elements are equal. The capacity is NOT important.
  public boolean equals(SuperArray other){
    if (size != other.size()) {
      return false;
    }
    for (int i = 0; i < size; i++) {
      if (data[i].equals(other.get(i)) == false) {
        return false;
      }
    }
    return true;
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
