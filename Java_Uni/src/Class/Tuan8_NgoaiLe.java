import java.util.InputMismatchException;
import java.util.Scanner;

public class Tuan8_NgoaiLe {
     public static Scanner scanner= new Scanner(System.in);
     public static void main(String[] args) {
          int [] mamng= new int[2];int i=0;int n;
          try{
               System.out.println("0  ket  thuc");
               while (true) {
                    System.out.println("Nhap so nguyen");
                    n = scanner.nextInt();
                    if(n == 0){
                         System.out.println("Mang cac so nguyen la:");
                         for (int j : mamng) {
                              System.out.print(j + " ");
                         }
                         break;
                    }
                    mamng[i]=n;i++;
               }
          }catch(ArrayIndexOutOfBoundsException e){
               System.out.println("Ban da nhap qua so phan tu");
          }catch(InputMismatchException e){
               System.out.println("Vui long nhap so nguyen");
               scanner.next();
          
          }
     }


          
     public static void bai3(){
          
     }
     public static void bai2(){
          while (true) {
               try {
                   System.out.print("a: ");
                   int a = scanner.nextInt();
                   System.out.print("b: ");
                   int b = scanner.nextInt();
                   System.out.println("KQ: " + a / b);
                   break;
               } catch (InputMismatchException e) {
                   System.out.println("Vui long nhap so nguyen");
                   scanner.next();
               } catch (ArithmeticException e) {
                   System.out.println("Loi  khong chia het cho  0");
               }
           }
     }
}
