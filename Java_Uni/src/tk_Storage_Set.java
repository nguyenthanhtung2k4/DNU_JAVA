
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class tk_Storage_Set {
    public static void main(String[] args) {
        // Tạo một HashSet
        Set<String> fruits = new HashSet<>();

        // Thêm các phần tử vào Set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple"); // Phần tử trùng lặp, sẽ không được thêm

        // In ra số lượng phần tử
        System.out.println("Size of set: " + fruits.size());

        // Kiểm tra xem Set có chứa một phần tử hay không
        if (fruits.contains("Banana")) {
            System.out.println("Set contains Banana.");
        }

        // Xóa một phần tử
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Kiểm tra xem Set có rỗng hay không
        System.out.println("Is the set empty? " + fruits.isEmpty());

        // Duyệt qua các phần tử trong Set bằng Iterator
        System.out.println("Fruits in the set using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Chuyển đổi Set thành mảng
        String[] fruitsArray = fruits.toArray(new String[0]);
        System.out.println("Fruits in the set as an array:");
        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }

        // Xóa tất cả các phần tử
        fruits.clear();
        System.out.println("Set after clearing: " + fruits);
    }
}
