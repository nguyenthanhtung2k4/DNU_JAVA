import javax.swing.*;
public class tk_Class_OPP_Message {
    public static void main(String[] args) {
        // Tạo một hộp thoại thông báo đơn giản
        JOptionPane.showMessageDialog(null, "Đây là một thông báo đơn giản!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        // Tạo một hộp thoại xác nhận
        int option = JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.out.println("Bạn đã chọn Có");
        } else {
            System.out.println("Bạn đã chọn Không");
        }

        // Tạo một hộp thoại nhập liệu
        String name = JOptionPane.showInputDialog(null, "Nhập tên của bạn:");
        System.out.println("Tên của bạn là: " + name);
    }
}
