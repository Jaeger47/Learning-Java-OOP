import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator: " + iterator.next());
        }

        for (String item : list) {
            System.out.println("Enhanced For Loop: " + item);
        }
    }
}
