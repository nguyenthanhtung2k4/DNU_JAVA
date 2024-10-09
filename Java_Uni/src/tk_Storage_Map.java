import java.util.HashMap;
import java.util.Map;

public class tk_Storage_Map {
    public static void main(String[] args) {
////////////////////////// Map of
            Map<String, Integer> map1 = Map.of(
                "age", 20,
                "height", 180,
                "weight", 70,
                "salary", 50000
            );

            // In ra các giá trị trong Map
            for (Map.Entry<String, Integer> entry : map1.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

////////////////////////// HashMap
            Map<String, Integer> map = new HashMap<>();

            // Thêm các phần tử vào Map
            map.put("Apple", 10);
            map.put("Banana", 20);
            map.put("Orange", 30);
            map.put("Mango", 40);
            // In ra kích thước của Map
            System.out.println("Size of map: " + map.size());

            // Lấy giá trị theo key
            Integer appleCount = map.get("Apple");
            System.out.println("Count of Apples: " + appleCount);

            // Kiểm tra xem Map có chứa key không
            if (map.containsKey("Banana")) {
                System.out.println("Map contains Banana.");
            }

            // Kiểm tra xem Map có chứa value không
            if (map.containsValue(30)) {
                System.out.println("Map contains value 30.");
            }

            // Xóa một phần tử
            map.remove("Orange");
            System.out.println("After removing Orange: " + map);

            // Duyệt qua các phần tử trong Map
            System.out.println("Entries in the map:");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Làm rỗng Map
            map.clear();
            System.out.println("Map after clearing: " + map);
    }
}
