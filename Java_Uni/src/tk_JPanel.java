import javax.swing.*;

public class tk_JPanel {
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("Ví dụ về JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Tạo JPanel với FlowLayout (mặc định)
        JPanel panel = new JPanel();
        
        // Thêm các thành phần vào JPanel
        JButton button1 = new JButton("Nút 1");
        JButton button2 = new JButton("Nút 2");
        JLabel label = new JLabel("Đây là một nhãn");

        panel.add(button1);  // Thêm nút 1
        panel.add(button2);  // Thêm nút 2
        panel.add(label);    // Thêm nhãn

        // Thêm JPanel vào JFrame
        frame.add(panel);  // Thêm JPanel vào JFrame
        
        // Hiển thị JFrame
        frame.setVisible(true);
    }
}