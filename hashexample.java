import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapsexample {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Key1", "Java");
        map.put("Key2", "Java");
        map.put("Key3", "Python");
        map.put("Key4", "AI");

        System.out.println("Key\tValue");

        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + "\t" + e.getValue());
        }

        Set<String> values = new HashSet<>();

        for (String value : map.values()) {
            if (!values.add(value)) {
                System.out.println("Duplicate value: " + value);
            }
        }
    }
}
