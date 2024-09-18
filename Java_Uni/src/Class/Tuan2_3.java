import java.util.Scanner;

public class Tuan2_3 {
     public static void main(String[] args) {
          bai2();
     }
     public static void bai1() {
         Scanner scanner=  new Scanner(System.in);
         System.out.println("Nhap int: ");
         int so=scanner.nextInt();
         int  j=0;
         for(int i= 1;i<=so;i++){
               if(so%i==0){
                    System.out.println("Uoc la: "+i);
                    j++;
               }
         }
         System.out.print("Tong so uoc la: "+j);
     }
     public static void bai2() {
          Scanner scanner=new Scanner(System.in);
          System.out.print("Nhap n: ");
          int n=scanner.nextInt();
          if(n<=1){
              System.out.println(n+" Khong Nguyen to");
          }
          if( n==2||n==3){
               System.err.println(n+" Nguyen to");
          }
  
          for(int i=2;i<=Math.sqrt(n);i++){
              if(n%i==0){
                  System.out.println(n+" Khong nguyen to");
                  break;
               }else{
                  System.out.println(n+" Nguyen to");
                  break;
  
              }
          }
      }   
     public static void  bai3(){
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
