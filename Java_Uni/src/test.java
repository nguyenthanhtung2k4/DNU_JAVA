
public class test {
     @SuppressWarnings("resource")
     public static void main(String[] args) {
     //     int[] arr = {1, 2, 4, 5, 6};
     // //     Print the array elements in a readable format
     //     System.out.print("[");
     //      System.out.println(arr[0]);
     //     for (int i = 0; i < arr.length; i++) {
     //         System.out.print(arr[i]);
     //         if (i < arr.length - 1) {
     //             System.out.print(", ");
     //         }
     //     }
     //     System.out.println("]");

          // Scanner scanner = new Scanner(System.in);

          // System.out.println("Nhập các số nguyên (nhập 'quit' để kết thúc):");
          // int sum = 0;
          // while (scanner.hasNextInt()) {
          //      int number = scanner.nextInt();
          //      sum += number;
          // }

          // System.out.println("Tổng các số nguyên bạn đã nhập là: " + sum);
          


          int a=100;

          for (int i = 2; i <= a; i++) {
               System.out.println(i+  "i la tao");
               boolean isPrime = true;

               for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                         isPrime = false;
                         break;
                    }
               }

               if (isPrime) {
                    System.out.println(i + " nguyen");
               } else {
                    System.out.println(i + " Khong nguyen");
               }
          }
     }
 }