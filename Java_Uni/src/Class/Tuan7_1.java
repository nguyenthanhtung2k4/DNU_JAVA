import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Tuan7_1 {
     public static Scanner   scanner= new Scanner(System.in);
     public static void main(String[] args) {
          List<String> list = new ArrayList<>();
          String nhap;
          int i= 1;
          System.out.println("Nhap '1' de dung");
          while (true) {
               System.out.print("Nhap  sinh vien"+i+": ");
               nhap= scanner.nextLine();
               if (nhap.isEmpty()) {
                    break;
               }
               i++;
               list.add(nhap);
               // nhap= scanner.nextLine();
          }
          Collections.sort(list);  // Sort cars
          System.out.println("Danh sach sinh vien tang dan:");
          for (String string : list) {
               System.out.println("\tSinh vien: "+string);
          }
     }
}
