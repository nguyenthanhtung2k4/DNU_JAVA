import javax.swing.*;
import java.awt.*;

public class tk_JFrame_Container {
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("Ví dụ về Container");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        // Lấy Container của JFrame
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());  // Đặt bố cục BorderLayout
        
        // Thêm thành phần vào Container
        JButton buttonNorth = new JButton("Nút ở phía Bắc");
        JButton buttonSouth = new JButton("Nút ở phía Nam");
        JButton buttonCenter = new JButton("Nút ở Trung tâm");
        
        contentPane.add(buttonNorth, BorderLayout.NORTH);
        contentPane.add(buttonSouth, BorderLayout.SOUTH);
        contentPane.add(buttonCenter, BorderLayout.CENTER);
        
        // Hiển thị JFrame
        frame.setVisible(true);
    }
}