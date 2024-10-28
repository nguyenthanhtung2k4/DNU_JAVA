package Menu;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in); 
    public static <T> T nhap(String text, Class<T> type) {
        Object nhap = null;
        while (true) {
            try {
                System.out.print(text); 
                if (type == Integer.class) {
                    nhap = scanner.nextInt();
                    scanner.nextLine();
                } else if (type == Double.class) {
                    nhap = scanner.nextDouble();
                    scanner.nextLine();
                } else if (type == String.class) {
                    nhap = scanner.nextLine(); 
                } else if (type == Long.class) {
                    nhap = scanner.nextLine(); 
                }
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Vui long nhap dung du lieu ! ");
                scanner.nextLine(); 
            }
        }
        return type.cast(nhap);
    }
}