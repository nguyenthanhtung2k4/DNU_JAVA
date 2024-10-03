// import java.awt.*;
// import javax.swing.*;

// public class test {
//     public static void main(String[] args) {
//         // Tạo JFrame
//         JFrame frame = new JFrame("Login Bank");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(400, 300);
        
//         // Tạo Container
//         Container container = frame.getContentPane();
//         container.setLayout(new BorderLayout());
        
//         // Tạo JPanel để chứa các thành phần
//         JPanel panel = new JPanel();
//         panel.setLayout(new GridLayout(3, 2)); // Bố trí theo lưới 3 hàng, 2 cột

//         // Tạo các thành phần
//         JLabel usernameLabel = new JLabel("UserName:");
//         JTextField usernameField = new JTextField(20);
//         JLabel passwordLabel = new JLabel("Password:");
//         JPasswordField passwordField = new JPasswordField(20);
//         JButton loginButton = new JButton("Login");

//         // Thêm các thành phần vào JPanel
//         panel.add(usernameLabel);
//         panel.add(usernameField);
//         panel.add(passwordLabel);
//         panel.add(passwordField);
//         panel.add(new JLabel("")); // Thêm một nhãn trống để giữ vị trí cho GridLayout
//         panel.add(loginButton);

//         // Thêm JPanel vào Container
//         container.add(panel, BorderLayout.CENTER);

//         // Hiển thị JFrame
//         frame.setVisible(true);

//         // Xử lý sự kiện cho nút Login
//         loginButton.addActionListener(e -> {
//             String username = usernameField.getText();
//             String password = new String(passwordField.getPassword()); // Lấy mật khẩu từ JPasswordField
//             // Thực hiện kiểm tra thông tin đăng nhập (chưa được thực hiện trong ví dụ này)
//             System.out.println("Username: " + username);
//             System.out.println("Password: " + password);
//             // Ở đây bạn có thể thêm logic để kiểm tra thông tin đăng nhập
//         });
//     }
// }
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class test {
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null); // Đặt vị trí giữa màn hình
        
        // Tạo JPanel để chứa các thành phần
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout()); // Bố trí lưới
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Tạo các thành phần
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel(""); // Để hiển thị thông báo

        // Thiết lập GridBagConstraints
        gbc.insets = new Insets(20, 10, 10, 10); // Khoảng cách giữa các thành phần
        gbc.gridx = 0; // Cột 0
        gbc.gridy = 0; // Hàng 0
        panel.add(usernameLabel, gbc); // Thêm nhãn username
        
        gbc.gridx = 1; // Cột 1
        panel.add(usernameField, gbc); // Thêm trường nhập username
        
        gbc.gridx = 0; // Cột 0
        gbc.gridy = 1; // Hàng 1
        panel.add(passwordLabel, gbc); // Thêm nhãn password
        
        gbc.gridx = 1; // Cột 1
        panel.add(passwordField, gbc); // Thêm trường nhập password
        
        gbc.gridx = 1; // Cột 1
        gbc.gridy = 2; // Hàng 2
        panel.add(loginButton, gbc); // Thêm nút đăng nhập
        
        gbc.gridx = 0; // Cột 0
        gbc.gridy = 3; // Hàng 3
        gbc.gridwidth = 2; // Chiếm toàn bộ chiều rộng
        panel.add(messageLabel, gbc); // Thêm nhãn thông báo

        // Thêm ActionListener cho nút đăng nhập
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                
                // Kiểm tra thông tin đăng nhập
                if (username.equals("admin") && password.equals("admin")) {
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Đăng nhập thành công!");
                } else {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Tên đăng nhập hoặc mật khẩu không đúng.");
                }
            }
        });

        // Thêm JPanel vào JFrame
        frame.add(panel);
        frame.setVisible(true);
    }
}
