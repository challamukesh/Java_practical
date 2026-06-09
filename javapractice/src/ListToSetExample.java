import java.util.*;

public class ListToSetExample {
    public static void transactional(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Apple", "Orange");

        Set<String> set = new HashSet<>(list);

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
    }
}