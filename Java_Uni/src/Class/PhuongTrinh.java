import java.util.Scanner;
public class PhuongTrinh {
     public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
          System.out.print("Nhap a: ");
          float a=scanner.nextFloat();
          System.out.print("Nhap b:");
          float b=scanner.nextFloat();
          System.out.print("Nhap c: ");
          float c=scanner.nextFloat();
          if(a!=0){
               float benta=(b*b)-4*a*c;
               if(benta> 0){
                    double root1 = (-b + Math.sqrt(benta)) / (2 * a);
                    double root2 = (-b - Math.sqrt(benta)) / (2 * a);
                    System.out.println("X1: "+root1);
                    System.out.println("X2: "+root2);
               }
               else if(benta == 0){
                    double root0 = - b / (2*a);
                    System.out.println("No  kep: "+root0);
               }else{
                    System.out.println("Vo nghiem: ");
               }
          }else{
               System.out.println("pt khong phai la bac 2");
          };
     }
};
