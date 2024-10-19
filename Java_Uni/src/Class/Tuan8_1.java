import java.util.Scanner;

public class Tuan8_1 {
     public static Scanner scanner= new Scanner(System.in);
     public static void main(String[] args) {
          int a=scanner.nextInt();
          try{
               if(a<5){
                    throw new Exception("Thi lai");}
                    System.out.println("Vuot qua mon");
          }catch(Exception e){
               System.out.println(e.getMessage());
          }
     }
}
