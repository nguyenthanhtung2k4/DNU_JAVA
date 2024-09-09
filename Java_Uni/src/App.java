
import java.util.Scanner;

public  class App{
    public static void main(String[] args) {
        System.out.println("Nhap so bat ki: \n");
        try (//  Dat ten bien trong java 
                // <Kieu>  <ten_bien> = gan_gia_tri
        Scanner number = new Scanner(System.in)) {
            System.out.println("Kq: "+(number.nextFloat()+5));
        }
     }
}