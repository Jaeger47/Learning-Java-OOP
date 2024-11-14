import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("List: " + list);

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        System.out.println("Set: " + set);

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        System.out.println("Map: " + map);

        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        System.out.println("Queue: " + queue);
    }
}
