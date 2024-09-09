import java.util.Scanner;

public class ExampleNext {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner("Hello, world! This is a sample string.");
        Scanner scanner = new Scanner("thanh tung This is a sample string.");

        String firstWord = scanner.next();
        System.out.println("Từ đầu tiên: " + firstWord); // In ra: Hello

        String secondWord = scanner.next();
        System.out.println("Từ thứ hai: " + secondWord); // In ra: world!
        
        
        String tung = scanner.next();
        System.out.println("Từ thứ ba: " + tung); // In ra: world!

        scanner.close();
    }
}