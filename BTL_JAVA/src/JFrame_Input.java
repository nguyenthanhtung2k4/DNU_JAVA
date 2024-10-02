import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame_Input {
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("Stylish JFrame with Input Example");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo một JPanel với BorderLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.LIGHT_GRAY); // Đặt màu nền cho JPanel

        // Tạo một JLabel để hiển thị thông báo
        JLabel label = new JLabel("Enter your name:", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24)); // Đặt font chữ
        label.setForeground(Color.BLUE); // Đặt màu chữ

        // Tạo JTextField để nhập dữ liệu từ người dùng
        JTextField textField = new JTextField(20);
        textField.setFont(new Font("Arial", Font.PLAIN, 18)); // Đặt font chữ

        // Tạo JButton để thực hiện hành động khi nhấn
        JButton button = new JButton("Submit");
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        button.setBackground(Color.GREEN); // Đặt màu nền cho nút
        button.setForeground(Color.WHITE); // Đặt màu chữ cho nút

        // Tạo JLabel để hiển thị kết quả sau khi nhấn nút
        JLabel resultLabel = new JLabel("", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        resultLabel.setForeground(Color.RED);

        // Thêm ActionListener vào nút để lấy thông tin từ textField khi nhấn nút
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy thông tin từ textField và cập nhật vào resultLabel
                String name = textField.getText(); // Lấy nội dung nhập vào
                resultLabel.setText("Hello, " + name + "!"); // Hiển thị kết quả
            }
        });

        // Tạo một hộp chứa cho textField và button
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(textField);
        inputPanel.add(button);

        // Thêm các thành phần vào panel
        panel.add(label, BorderLayout.NORTH); // Thêm label lên trên cùng
        panel.add(inputPanel, BorderLayout.CENTER); // Thêm inputPanel vào giữa
        panel.add(resultLabel, BorderLayout.SOUTH); // Thêm resultLabel ở dưới

        // Thêm panel vào JFrame
        frame.add(panel);

        // Hiển thị JFrame
        frame.setVisible(true);
    }
}
