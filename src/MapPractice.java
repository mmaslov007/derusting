import java.util.Map;
import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> hashMap = new HashMap<String, Integer>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    hashMap.put("Monolith", 1);
    hashMap.put("Freedom", 2);
    hashMap.put("Duty", 3);
    System.out.println(hashMap + "\n");
    
    // Get the value associated with a given key in the Map
    System.out.println(hashMap.get("Monolith") + "\n");

    // Find the size (number of key/value pairs) of the Map
    System.out.println(hashMap.size() + "\n");

    // Replace the value associated with a given key (the size of the Map should not change)
    hashMap.put("Monolith", 4);
    System.out.println(hashMap + "\n");

    // Check whether the Map contains a given key
    System.out.println(hashMap.containsKey("Freedom") + "\n");

    // Check whether the Map contains a given value
    System.out.println(hashMap.containsValue(4) + "\n");

    // Iterate over the keys of the Map, printing each key
    for (String key : hashMap.keySet()) {
      System.out.println(key);
    }
    System.out.println("\n");

    // Iterate over the values of the map, printing each value
    for (Integer value : hashMap.values()) {
      System.out.println(value);
    }
    System.out.println("\n");

    // Iterate over the entries in the map, printing each key and value
    for (String key : hashMap.keySet()) {
      System.out.println(key + ", " + hashMap.get(key));
    }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
