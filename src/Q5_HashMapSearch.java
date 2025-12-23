import java.util.*;

public class Q5_HashMapSearch {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ram", 36);
        map.put("Shyam", 60);

        String key = "Ram";
        if (map.containsKey(key)) {
            System.out.println(map.get(key));
        } else {
            System.out.println("Not Found");
        }
    }
}
