import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class tk_Class_OPP_TongQuat_Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Pineapple");

        // Sử dụng Iterator
        Iterator<String> iterator = list.iterator();
        System.out.println("Duyệt qua các phần tử và xóa các phần tử bắt đầu bằng 'A':");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.startsWith("A")) {
                iterator.remove();
            }
        }

        // Sau khi xóa các phần tử, hiển thị lại danh sách
        System.out.println("Các phần tử trong list sau khi xóa:");
        for (String element : list) {
            System.out.println(element);
        }

        // Sử dụng ListIterator
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("Duyệt qua các phần tử và thêm 'Kiwi' sau 'Banana':");
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
            if (element.equals("Banana")) {
                listIterator.add("Kiwi");
            }
        }

        // Duyệt ngược qua các phần tử và thay thế 'Orange' bằng 'Mango'
        System.out.println("Duyệt ngược và thay thế 'Orange' bằng 'Mango':");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
            if (element.equals("Orange")) {
                listIterator.set("Mango");
            }
        }

        // Hiển thị lại danh sách sau khi thao tác
        System.out.println("Các phần tử trong list sau khi thao tác:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
