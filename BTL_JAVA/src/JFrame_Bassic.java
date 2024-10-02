import javax.swing.*;
import java.awt.*;

public class JFrame_Bassic {
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("Stylish JFrame Example");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo một JPanel với layout là BorderLayout để quản lý các thành phần
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.LIGHT_GRAY); // Đặt màu nền cho JPanel

        // Tạo một JLabel với font chữ và căn giữa
        JLabel label = new JLabel("Welcome to Stylish JFrame", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24)); // Đặt font chữ
        label.setForeground(Color.BLUE); // Đặt màu chữ

        // Tạo một nút bấm với màu nền và màu chữ
        JButton button = new JButton("Click Me!");
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        button.setBackground(Color.GREEN); // Đặt màu nền cho nút
        button.setForeground(Color.WHITE); // Đặt màu chữ cho nút

        // Thêm các thành phần vào JPanel
        panel.add(label, BorderLayout.NORTH); // Thêm JLabel lên đầu
        panel.add(button, BorderLayout.SOUTH); // Thêm JButton ở dưới

        // Thêm JPanel vào JFrame
        frame.add(panel);

        // Hiển thị JFrame
        frame.setVisible(true);
    }
}
