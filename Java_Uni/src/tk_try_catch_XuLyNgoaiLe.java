import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

public class tk_try_catch_XuLyNgoaiLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // InputMismatchException
        try {
            System.out.print("Nhập vào một số nguyên: ");
            int number = scanner.nextInt();
            System.out.println("Bạn đã nhập: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Bạn phải nhập một số nguyên.");
        }

        // ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho 0.");
        }

        // NullPointerException
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Lỗi: Chuỗi không được phép null.");
        }

        // ArrayIndexOutOfBoundsException
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi: Index vượt quá giới hạn của mảng.");
        }

        // IOException
        try {
            File file = new File("data.txt");
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi: File không tồn tại.");
        }

        // SQLException
        try {
            // Giả sử bạn đã có một kết nối đến cơ sở dữ liệu
            Connection connection = null; // Thay thế bằng code kết nối thực tế
            // Thực hiện một truy vấn SQL
            // ...
        } catch (SQLException e) {
            System.out.println("Lỗi truy vấn cơ sở dữ liệu: " + e.getMessage());
        }

        // NumberFormatException
        try {
            String strNumber = "abc";
            int number = Integer.parseInt(strNumber);
            System.out.println("Số nguyên: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Không thể chuyển đổi chuỗi thành số nguyên.");
        }

        // IllegalArgumentException
        try {
            // Ví dụ: Một phương thức yêu cầu đối số phải lớn hơn 0
            int age = -5;
            if (age <= 0) {
                throw new IllegalArgumentException("Tuổi phải lớn hơn 0");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}