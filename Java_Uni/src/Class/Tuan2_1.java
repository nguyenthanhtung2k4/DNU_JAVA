
import java.util.Scanner;

public class Tuan2_1 {
     public static void main(String[] args) {
     //      String str1,str2,str3;
     //      str1="dai hoc ";str2="dai nam";
     //      str3=str1+str2;
     //      System.out.println(str3.toUpperCase());
     //      System.out.println("Length : "+str3.length());
     // //  nhap  bat ki :
     //      Scanner scanner= new Scanner(System.in);
     //      System.out.println("Nhap bat ki  chuoi: ");
     //      String chuoi=scanner.nextLine();
     //      System.out.println("Chuoi  bat ki la: "+chuoi.toUpperCase());
     //      System.out.print("Length: "+chuoi.length());
          int sum=0;
          Scanner scanner=new Scanner(System.in);
          
          int n=scanner.nextInt();
          while (n>0){
               sum+=n%10;
               n/=10;
          }
          System.out.println(sum);
     }

}
