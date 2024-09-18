
import java.util.Scanner;

public class tk_VòngLap {
     public static void main(String[] args) {
     //  Dung for 
          for (int i=0;i<10;i++){
               System.out.println("Thanhtung"+i);
          }    
     // Dung for each
          String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
          for (String i : cars) {
          System.out.println(i);
          }
     
     // Dung while
          int i=0;
          while(i<=10){
               System.out.println("Tung"+i);
               i++;
          }
          // Dung wich case
          System.out.println("Nhap so ra ngay: ");
          Scanner scanner=new  Scanner(System.in);
          int a=scanner.nextInt();
          switch (a){
               case 1:
                    System.out.println("Monday");
                    break;
               case 2:
                    System.out.println("Tuesday");
                    break;
               case 3:
                    System.out.println("Wednesday");
                    break;
               case 4:
                    System.out.println("Thursday");
                    break;
               case 5:
                    System.out.println("Friday");
                    break;
               case 6:
                    System.out.println("Saturday");
                    break;
               case 7:
                    System.out.println("Sunday");
                    break;
               default:
                    System.out.println("Invalid day number");
               }
     }
}
