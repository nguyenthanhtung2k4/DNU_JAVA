import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        String name = "thanhtung";
        int age = 20;
        int year = 2004;

        // Create a Map using HashMap (compatible with older Java versions)
        Map<String, Object> map = new HashMap<>();
        map.put("Name", name);
        map.put("Age", age);  // Optionally, use Integer.valueOf(age) for boxing

        // Create a List using ArrayList
        List<Object> result = new ArrayList<>();
        result.add(map);

        System.out.println("Map: " + map);
        System.out.println("Name: " + map.get("Name"));
        System.out.println("Age: " + map.get("Age"));  // May need casting if not boxed
        System.out.println("Year: " + map.get("Year")); // Year key is not present
          System.out.println("Namr type "+ age  instanceof String); //);
          // Access specific values (assuming safe casting)
          String retrievedName = (String) map.get("Name");
          int retrievedAge = (int) map.get("Age");
          System.out.println("Namr type "+ retrievedAge  instanceof String); //);
    }
}