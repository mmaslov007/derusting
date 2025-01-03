import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String string = "Monolith";
    System.out.println(string + "\n");

    // Find the length of the string
    System.out.println(string.length() + "\n");

    // Concatenate (add) two strings together and reassign the result
    String add = " Emissary";
    string = string + add;
    System.out.println(string + "\n");

    // Find the value of the character at index 3
    System.out.println(string.charAt(3) + "\n");

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(string.contains("Mon") + "\n");

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < string.length(); i++) {
      System.out.println(string.charAt(i));
    }
    System.out.println("\n");

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> stringList = new ArrayList<String>();

    // Add multiple strings to the List (OK to do one-by-one)
    stringList.add("Monolith");
    stringList.add("Freedom");
    stringList.add("Fighter");
    System.out.println(stringList + "\n");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    System.out.println(String.join(", ", stringList) + "\n");

    // Check whether two strings are equal
    if (string.equals(add)) {
      System.out.println("The strings are equal.");
    } else {
      System.out.println("The strings are not equal.");
    }

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
