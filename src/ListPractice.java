import java.util.ArrayList;
import java.util.Collections;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> stringList = new ArrayList<String>();

    // Add 3 elements to the list (OK to do one-by-one)
    stringList.add("Hello");
    stringList.add("Hi");
    stringList.add("Greetings");
    System.out.println(stringList + "\n");

    // Print the element at index 1
    System.out.println(stringList.get(1) + "\n");

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    stringList.set(1, "Salutations");
    System.out.println(stringList + "\n");

    // Insert a new element at index 0 (the length of the list will change)
    stringList.add(0, "Blessings");
    System.out.println(stringList + "\n");

    // Check whether the list contains a certain string
    if (stringList.contains("Greetings")) {
      System.out.println("I greet thee as well." + "\n");
    }

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for(int i = 0; i < stringList.size(); i++) {
      System.out.println(stringList.get(i) + "\n");
    }

    // Sort the list using the Collections library
    Collections.sort(stringList);
    System.out.println("List is sorted." + "\n");

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for(String word : stringList) {
      System.out.println(word + "\n");
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}