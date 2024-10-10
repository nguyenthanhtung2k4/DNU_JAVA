import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            File file = new File("tung.txt");

            if (file.exists()) {
                System.out.println("Ton tai: " + file.getName());
            } else {
                file.createNewFile(); // Tạo tệp tin mới
                System.out.println("Thanh cong");
            }

            System.out.println("Name tep: " + file.getName());
            System.out.println("duongg dan tep: " + file.getAbsolutePath());

            if (file.delete()) {
                System.out.println("Xoa tep");
            } else {
                System.out.println("khong xoa dc.");
            }
        } catch (IOException e) {
            System.out.println("noi roi: " + e.getMessage());
        }
    }
}
