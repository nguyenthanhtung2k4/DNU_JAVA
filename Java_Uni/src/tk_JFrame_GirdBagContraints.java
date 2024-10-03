import java.awt.*;
import javax.swing.*;

public class tk_JFrame_GirdBagContraints{
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("GridBagConstraints Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridBagLayout());

        // Tạo GridBagConstraints để cấu hình bố cục
        GridBagConstraints gbc = new GridBagConstraints();

        // Tạo các thành phần
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        // Cấu hình cho Button 1
        gbc.gridx = 0; // Cột 0
        gbc.gridy = 0; // Hàng 0
        gbc.gridwidth = 1; // Chiếm 1 ô ngang
        gbc.gridheight = 1; // Chiếm 1 ô dọc
        gbc.weightx = 1.0; // Giãn theo chiều ngang khi cửa sổ mở rộng
        gbc.weighty = 1.0; // Giãn theo chiều dọc khi cửa sổ mở rộng
        gbc.fill = GridBagConstraints.BOTH; // Giãn đều theo cả chiều ngang và dọc
        frame.add(button1, gbc); // Thêm Button 1 vào JFrame

        // Cấu hình cho Button 2
        gbc.gridx = 1; // Cột 1
        gbc.gridy = 0; // Hàng 0
        gbc.gridwidth = 2; // Chiếm 2 ô ngang
        gbc.gridheight = 1; // Chiếm 1 ô dọc
        frame.add(button2, gbc); // Thêm Button 2

        // Cấu hình cho Button 3
        gbc.gridx = 0; // Cột 0
        gbc.gridy = 1; // Hàng 1
        gbc.gridwidth = 3; // Chiếm 3 ô ngang
        gbc.gridheight = 1; // Chiếm 1 ô dọc
        gbc.fill = GridBagConstraints.HORIZONTAL; // Chỉ giãn theo chiều ngang
        frame.add(button3, gbc); // Thêm Button 3

        // Cấu hình cho Button 4
        gbc.gridx = 0; // Cột 0
        gbc.gridy = 2; // Hàng 2
        gbc.gridwidth = 1; // Chiếm 1 ô ngang
        gbc.gridheight = 1; // Chiếm 1 ô dọc
        gbc.weightx = 0.5; // Giãn ít hơn Button 1
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(button4, gbc); // Thêm Button 4

        // Cấu hình cho Button 5
        gbc.gridx = 1; // Cột 1
        gbc.gridy = 2; // Hàng 2
        gbc.gridwidth = 2; // Chiếm 2 ô ngang
        frame.add(button5, gbc); // Thêm Button 5

        // Hiển thị JFrame
        frame.setVisible(true);
    }
}
