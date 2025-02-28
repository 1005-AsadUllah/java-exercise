
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Collection<String> strings = List.of("one", "two", "three", "four");

        for (String element : strings) {
            System.out.println(element.length());
            if (element.length() == 3) {
                System.out.println(element);
            }   
        }
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate, won't be added
        System.out.println(set);

    }
}
