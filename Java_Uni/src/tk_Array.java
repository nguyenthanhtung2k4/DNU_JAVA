import java.lang.*;
import java.util.Arrays;
import java.util.Scanner; 

public class tk_Array {
     public static void main(String[] args) {
          // Mảng các số nguyên
               int[] numbers = new int[5];
               numbers[0] = 10;
               numbers[1] = 20;
               numbers[2] = 30;
               numbers[3] = 40;
               numbers[4] = 50;

          // Mảng các ký tự
               char[] characters = {'a', 'b', 'c', 'd', 'e'};

          // Mảng các chuỗi
               String[] fruits = {"apple", "banana", "orange"};

          // Truy xuất giá trị của một phần tử
               System.out.println("Phần tử thứ 2 của mảng characters là: " + characters[1]);
               System.out.println("Phần tử thứ 2 của mảng numbers là: " + numbers[1]);

         // Duyệt qua tất cả các phần tử của mảng fruits
               for (String fruit : fruits) {
                    System.out.println(fruits);
               }

          // print the updated array ( phai su dung thu vien)
               int[] arr={1,2,3,4,5};
               System.out.println("arr--> String"+Arrays.toString(arr)); 

          // mang 2 chieu 
               Scanner scanner= new Scanner(System.in);
               System.out.println("Nhap NxN : ");
               int a=scanner.nextInt();
               int[][] arr= new int[a][a];
               for(int i=0;i<a;i++){
                    for(int j=0;j<a;j++){
                         System.out.printf("Nhap dong");
                         arr[i][j]=scanner.nextInt();
                    }
               }
               int tong=0;
               for(int i=0;i<a;i++){
                    tong+=arr[i][i];
               }
               System.out.println("Tong la duong cheo: "+tong);
     }
}
