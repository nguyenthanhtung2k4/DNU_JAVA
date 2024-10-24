import Menu.Input;

public class tung {
     public static void main(String[] args) {
         
         int so =new Input().nhap("Thanhtung la tao: ", Integer.class);
         System.out.println("So nguyen: " + so);
         double d =new Input().nhap("Thanhtung la tao2: ", Double.class);
         System.out.println("So nguyen: " + d);
     }
 }
