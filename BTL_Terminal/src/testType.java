import java.util.ArrayList;
import java.util.List;

public class testType {
     public static void main(String[] args) {
          List<Object> list = new ArrayList<>();
          list.add("Hello");
          list.add(123);
          for (Object obj : list) {
               if (obj instanceof String) {
                    System.out.println("Chuỗi: " + obj);
               } else if (obj instanceof Integer) {
                    System.out.println("Số nguyên: " + obj);
               } else {
                    System.out.println("Kiểu khác: " + obj);
               }
     }
}
