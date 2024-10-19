import java.util.ArrayList;
import java.util.List;

public class tk_Class_OPP_TongQuat_List {
     public static void main(String[] args) {
          List<String> list = new ArrayList<>();
          list.add("John");
          list.add("Lisa");
          list.add("Tom");

          System.out.println("List elements:");
          for (String element : list) {
               System.out.println(element);
          }

          String name = list.get(1); // Trả về phần tử tại vị trí chỉ định
          System.out.println("Element at index 1: " + name);

          list.remove(0); // Xóa phần tử tại vị trí chỉ định
          System.out.println("List elements after removal:");
          for (String element : list) {
               System.out.println(element);
          }
     }
}
