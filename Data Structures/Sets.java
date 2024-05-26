import java.util.Set;
import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println(set);

        set.remove("Banana");
        System.out.println("After removing Banana: "+ set);
        System.out.println("Contains Orange: "+set.contains("Orange"));
        System.out.println("Size of Set " +set.size());
        set.clear();
        System.out.println("After Clearing: "+ set);
    }
}
