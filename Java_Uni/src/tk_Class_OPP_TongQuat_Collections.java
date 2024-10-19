import java.util.ArrayList;
import java.util.Collection;

public class tk_Class_OPP_TongQuat_Collections {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        // Thêm phần tử vào collection
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Orange");

        // Kiểm tra kích thước của collection
        System.out.println("Kích thước của collection: " + collection.size());

        // Kiểm tra xem collection có rỗng không
        System.out.println("Collection có rỗng không: " + collection.isEmpty());

        // Kiểm tra xem collection có chứa phần tử cụ thể không
        System.out.println("Collection có chứa 'Apple' không: " + collection.contains("Apple"));

        // Xóa phần tử từ collection
        collection.remove("Banana");
        System.out.println("Kích thước của collection sau khi xóa: " + collection.size());

        // Chuyển đổi collection thành mảng
        Object[] array = collection.toArray();
        System.out.println("Các phần tử trong mảng:");
        for (Object element : array) {
            System.out.println(element);
        }

        // Xóa tất cả các phần tử trong collection
        collection.clear();
        System.out.println("Collection có rỗng không sau khi xóa tất cả: " + collection.isEmpty());
    }
}
