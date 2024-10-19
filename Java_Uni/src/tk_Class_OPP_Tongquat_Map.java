import java.util.HashMap;
import java.util.Map;

public class tk_Class_OPP_TongQuat_Map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Lisa", 30);
        map.put("Tom", 22);

        System.out.println("Map elements:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        int age = map.get("John"); // Trả về giá trị tương ứng với khóa "John"
        System.out.println("John's age: " + age);
    }
}
