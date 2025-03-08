
// public class practice {
//     public static void main(String[] args) {
//         // Creating an IdentityHashMap
//         // IdentityHashMap<String, String> identityMap = new IdentityHashMap<>();

//         // // Creating two String objects with the same value
//         // String key1 = new String("hello");
//         // String key2 = new String("hello");

//         // // Adding the key-value pairs to the map
//         // identityMap.put(key1, "Value for key1");
//         // identityMap.put(key2, "Value for key2");

//         // // Printing out the map content
//         // System.out.println("IdentityHashMap content: " + identityMap);

//         // // Checking if both keys are considered equal
//         // System.out.println("Are key1 and key2 equal using equals()? " + key1.equals(key2));
//         // System.out.println("Are key1 and key2 the same object using ==? " + (key1 == key2));

//         // Map<Integer, String> map = ofEntries(Map.entry(1, "one"), Map.entry(2, "two"), Map.entry(3, "three"), Map.entry(4,"four"));
//         // System.out.println(map);
//         // List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
//         // entries.sort(Map.Entry.comparingByKey());
//         // System.out.println(entries);

 
//     }
// }

    

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practice  {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // // Creating a map to store the key-value pairs
        // Map<String, String> map = new java.util.HashMap<>();

        // // User input for keys and values
        // System.out.print("Enter the number of entries: ");
        // int numEntries = scanner.nextInt();
        // scanner.nextLine();  // Consume the newline character

        // for (int i = 0; i < numEntries; i++) {
        //     System.out.print("Enter key " + (i + 1) + ": ");
        //     String key = scanner.nextLine();
            
        //     System.out.print("Enter value for key '" + key + "': ");
        //     String value = scanner.nextLine();
            
        //     map.put(key, value);
        // }

        // Printing the map
        // System.out.println("Map Created: " + map);

        Map<Integer, String> map = new HashMap<>();

map.put(1, "one");
map.put(2, "two");
map.put(3, "three");
map.put(4, "four");
map.put(5, "five");
map.put(6, "six");

Set<Integer> keys = map.keySet();
System.out.println("keys = " + keys);

Collection<String> values = map.values();
System.out.println("values = " + values);

Set<Map.Entry<Integer, String>> entries = map.entrySet();
System.out.println("entries = " + entries);
    }
}
