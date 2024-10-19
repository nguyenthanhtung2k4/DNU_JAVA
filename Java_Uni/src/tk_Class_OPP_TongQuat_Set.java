import java.util.HashSet;
import java.util.Set;

public class tk_Class_OPP_TongQuat_Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Trùng lặp sẽ không được thêm vào

        System.out.println("Set elements:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
