import java.util.ArrayList;

public class tk_Storage_ArrayList{
     public static void main(String[] args) {
          // Khởi tạo ArrayList lưu trữ các phần tử kiểu String
          ArrayList<String> list = new ArrayList<>();
          
          // Thêm phần tử vào ArrayList
          list.add("Apple");
          list.add("Banana");
          list.add("Orange");
  
          // Hiển thị ArrayList
          String fruit= list.get(1);
          System.out.println("Phần tử tại vị trí 1: " + fruit);
          // Cập nhật phần tử tại vị trí 1
          list.set(1, "Mango");
          System.out.println(list);
          
          
          // Xóa phần tử tại vị trí 2
          list.remove(2);
          System.out.println(list);

          // Xóa phần tử có giá trị là "Apple"
          list.remove("Apple");
          System.out.println(list);
     
          // Duyệt qua danh sách bằng vòng lặp for-each

          for (String tung : list) {
              System.out.println("tung "+ tung);
          }

          // Lấy kích thước của danh sách
          int size = list.size();
          System.out.println("Kích thước của ArrayList: " + size);
          
          // Kiểm tra phần tử "Apple" có tồn tại trong danh sách không
          boolean exists = list.contains("Apple");
          System.out.println("Apple có tồn tại trong danh sách không? " + exists);
     
          // Xóa tất cả phần tử
          list.clear();
          System.out.println("Danh sách sau khi xóa tất cả: " + list);
     }
}