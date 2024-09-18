
import java.util.Scanner;

public class tk_NguyenTo {
     public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
          System.out.println("Nhap[1] KiemTraNguyen\nNhap[2]InSoNguyen");
          int nhap=scanner.nextInt();
          if (nhap==1){
               System.out.print("Run KiemTraNguyen\n");
               KiemTraNguyen();
               
          }else if (nhap==2) {
               System.out.print("Run InSoNguyen\n");
               InSoNguyen();
          } else {
               System.out.print("Error");
          }
     }
     
     public static void KiemTraNguyen() {
          Scanner scanner=new Scanner(System.in);
          System.out.print("Nhap n: ");
          int n=scanner.nextInt();
          if(n<=1){
          System.out.println(n+"Nguyen to");
          }

          for(int i=2;i<=Math.sqrt(n);i++){
               if(n%i==0 ||n==2||n==3){
                    System.out.println(n+"Khong nguyen to");
                    break;
               }else{
                    System.out.println(n+"Nguyen to");
                    break;

               }
          }
     }   
     public static void  InSoNguyen(){
          @SuppressWarnings("resource")
          Scanner scanner=new Scanner(System.in);
          int a=scanner.nextInt();
          for(int i=2;i<=a;i++){
               boolean kq=true;
               for(int j=2; j*j<=i;j++){
                    if(i%j==0){
                         kq=false;
                         break;
                    }
               }
          if(kq){
               System.out.println(i+"Nguyen");
          }else{
               System.out.println(i+"Khong nguyen");
          }
          }
     }
}