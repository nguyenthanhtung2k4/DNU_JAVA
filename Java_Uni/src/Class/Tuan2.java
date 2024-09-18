
import java.util.Scanner;

public class Tuan2 {
     public static void main(String[] args) {
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
