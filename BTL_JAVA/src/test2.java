import java.awt.*;
import javax.swing.*;

public class test2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Đăng nhập");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// //// bang lay out + container
        GridBagLayout layout = new GridBagLayout();
        frame.setLayout(layout);

        GridBagConstraints constraints = new GridBagConstraints();

        // Tạo nhãn "Tên đăng nhập"
        JLabel label = new JLabel("Tên đăng nhập:");
        constraints.gridx = 0; // Ô hàng 0, cột 0
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.EAST; // Căn nhãn bên phải
        frame.add(label, constraints);

        // Tạo trường văn bản
        JTextField textField = new JTextField(20);
        constraints.gridx = 1; // Ô hàng 0, cột 1
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL; // Cho phép trường văn bản kéo dài
        constraints.weightx = 1.0; // Cho phép trường văn bản chiếm hết không gian thừa theo chiều ngang
        frame.add(textField, constraints);

        // Tạo nút bấm
        JButton button = new JButton("Đăng nhập");
        constraints.gridx = 1; // Ô hàng 1, cột 1
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.CENTER; // Căn nút bấm ở giữa
        frame.add(button, constraints);

        frame.pack();
        frame.setVisible(true);
    }
}

// import java.awt.*;
// import javax.swing.*;

// public class test2 {
//     public static void main(String[] args) {
//         // Tạo JFrame
//         JFrame frame = new JFrame("GridBagLayout Example");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(400, 300);
        
//         // Sử dụng GridBagLayout
//         frame.setLayout(new GridBagLayout());
//         GridBagConstraints gbc = new GridBagConstraints();
        
//         // Tạo các thành phần
//         JButton button1 = new JButton("Button 1");
//         JButton button2 = new JButton("Button 2");
//         JButton button3 = new JButton("Button 3");
        
//         // Cấu hình vị trí và các ràng buộc cho Button 1
//         gbc.gridx = 0; // Vị trí cột 0
//         gbc.gridy = 0; // Vị trí hàng 0
//         gbc.gridwidth = 1; // Chiếm 1 ô chiều rộng
//         gbc.gridheight = 1; // Chiếm 1 ô chiều cao
//         gbc.fill = GridBagConstraints.BOTH; // Giãn đều cả theo chiều ngang và dọc
//         gbc.weightx = 1.0; // Độ ưu tiên giãn theo chiều ngang
//         gbc.weighty = 1.0; // Độ ưu tiên giãn theo chiều dọc
//         frame.add(button1, gbc); // Thêm Button 1 vào vị trí được xác định

//         // Cấu hình cho Button 2
//         gbc.gridx = 1; // Cột 1
//         gbc.gridy = 0; // Hàng 0
//         gbc.gridwidth = 2; // Chiếm 2 ô chiều rộng
//         frame.add(button2, gbc); // Thêm Button 2

//         // Cấu hình cho Button 3
//         gbc.gridx = 0; // Cột 0
//         gbc.gridy = 1; // Hàng 1
//         gbc.gridwidth = 3; // Chiếm 3 ô chiều rộng
//         frame.add(button3, gbc); // Thêm Button 3

//         // Hiển thị JFrame
//         frame.setVisible(true);
//     }
// }
