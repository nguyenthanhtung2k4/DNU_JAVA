
# Các phương thức và cách sử dụng JFrame

  `JFrame` là một lớp trong Java Swing dùng để tạo cửa sổ giao diện với tiêu đề và viền. Dưới đây là danh sách các phương thức phổ biến liên quan đến `JFrame`, kèm theo giải thích và ví dụ.

## 1. `setTitle(String title)`
- **Mô tả**: Đặt tiêu đề cho cửa sổ.
- **Cách dùng**: 
```java
            JFrame frame = new JFrame();
            frame.setTitle("Ứng dụng của tôi");
```

## 2. `setSize(int width, int height)`
- **Mô tả**: Đặt kích thước cho cửa sổ (chiều rộng và chiều cao).
- **Cách dùng**: 
```java
          JFrame frame = new JFrame();
          frame.setSize(400, 300);  // Chiều rộng 400px, Chiều cao 300px
```

## 3. `setDefaultCloseOperation(int operation)`
- **Mô tả**: Xác định hành động khi người dùng đóng cửa sổ.
        - `EXIT_ON_CLOSE`: Thoát chương trình.
        - `DISPOSE_ON_CLOSE`: Đóng cửa sổ nhưng không thoát chương trình.
        - `DO_NOTHING_ON_CLOSE`: Không thực hiện hành động gì.
        - `HIDE_ON_CLOSE`: Ẩn cửa sổ.
- **Cách dùng**: 
```java
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Thoát ứng dụng khi đóng cửa sổ
```

## 4. `setVisible(boolean b)`
- **Mô tả**: Điều khiển hiển thị hay ẩn cửa sổ.
- **Cách dùng**: 
```java
        JFrame frame = new JFrame();
        frame.setVisible(true);  // Hiển thị cửa sổ
```

## 5. `add(Component comp)`
- **Mô tả**: Thêm một thành phần (ví dụ: nút bấm, nhãn) vào nội dung của cửa sổ.
- **Cách dùng**: 
```java
        JFrame frame = new JFrame();
        JButton button = new JButton("Nhấn vào đây");
        frame.add(button);  // Thêm nút vào cửa sổ
```

## 6. `setLayout(LayoutManager manager)`
- **Mô tả**: Đặt trình quản lý bố cục để sắp xếp các thành phần bên trong cửa sổ.
  - Bố cục thường dùng: `FlowLayout`, `BorderLayout`, `GridLayout`, v.v.
- **Cách dùng**: 
```java
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());  // Đặt bố cục FlowLayout để sắp xếp các thành phần
```

## 7. `getJPane()`
- **Mô tả**: Trả về nội dung của cửa sổ, là nơi chứa tất cả các thành phần.
- **Cách dùng**: 
```java
        JFrame frame = new JFrame();
        JPanel pane = new JPanel;  // Tạo Jpanel để chứa các phần tử
        pane.setLayout(new BorderLayout());  // Đặt bố cục BorderLayout cho nội dung
```
## 7.1 `getContentPane()`
- **Mô tả**: Trả về nội dung của cửa sổ, là nơi chứa tất cả các thành phần.
- **Cách dùng**: 
```java
        JFrame frame = new JFrame();
        Container pane = frame.getContentPane();  // Lấy nội dung của cửa sổ
        pane.setLayout(new BorderLayout());  // Đặt bố cục BorderLayout cho nội dung
```

##### Sử khác nhau của JPanel Và Container là: 
- **Jpanel**
        - Được sử dụng để nhóm và sắp xếp các thành phần thành các khối nhỏ hơn bên trong `JFrame`. 
        - Ví dụ về `JPanel` sử dụng `FlowLayout` mặc định để sắp xếp các thành phần theo dòng từ `trái qua phải`.
- **Container**
        -  Được sử dụng để quản lý toàn bộ bố cục của các thành phần trong `JFrame`. Ví dụ về `Container` sử dụng `BorderLayout` để `sắp xếp các thành phần`.

![Cách dùng Panel](./tk_JPanel.java)
![Cách dùng Container](./tk_Container.java)


## 8. `pack()`
- **Mô tả**: Điều chỉnh kích thước cửa sổ để phù hợp với kích thước và bố cục của các thành phần bên trong.
- **Cách dùng**: 
```java
          JFrame frame = new JFrame();
          frame.add(new JButton("Nhấn vào đây"));
          frame.pack();  // Điều chỉnh kích thước cửa sổ dựa trên nội dung
```

## 9. `setResizable(boolean resizable)`
- **Mô tả**: Kiểm soát việc người dùng có thể thay đổi kích thước cửa sổ hay không.
- **Cách dùng**: 
```java
          JFrame frame = new JFrame();
          frame.setResizable(false);  // Không cho phép thay đổi kích thước
```

## 10. `setLocation(int x, int y)`
- **Mô tả**: Đặt vị trí cửa sổ so với góc trên bên trái của màn hình.
- **Cách dùng**: 
```java
          JFrame frame = new JFrame();
          frame.setLocation(100, 100);  // Đặt vị trí cửa sổ tại tọa độ (100, 100)
```

## 11. `setIconImage(Image image)`
- **Mô tả**: Đặt biểu tượng của cửa sổ xuất hiện trên thanh tiêu đề.
- **Cách dùng**: 
```java
          JFrame frame = new JFrame();
          ImageIcon icon = new ImageIcon("path/to/icon.png");
          frame.setIconImage(icon.getImage());  // Đặt biểu tượng cho cửa sổ
```

## 12. `setExtendedState(int state)`
- **Mô tả**: Đặt trạng thái mở rộng của cửa sổ (ví dụ: phóng to, thu nhỏ).
          - `JFrame.MAXIMIZED_BOTH`: Phóng to cửa sổ theo cả hai chiều.
          - `JFrame.NORMAL`: Khôi phục kích thước bình thường.
          - `JFrame.ICONIFIED`: Thu nhỏ cửa sổ.
- **Cách dùng**: 
```java
          JFrame frame = new JFrame();
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);  // Phóng to cửa sổ
```

## 13. `dispose()`
- **Mô tả**: Giải phóng tất cả các tài nguyên màn hình được sử dụng bởi cửa sổ và các thành phần của nó.
- **Cách dùng**: 
```java
            JFrame frame = new JFrame();
            frame.dispose();  // Đóng và giải phóng cửa sổ
```

## 14. `repaint()`
- **Mô tả**: Yêu cầu vẽ lại cửa sổ, làm mới giao diện của nó.
- **Cách dùng**: 
```java
              JFrame frame = new JFrame();
              frame.repaint();  // Vẽ lại cửa sổ
```

## 15. `toFront()`
- **Mô tả**: Đưa cửa sổ lên phía trước của các cửa sổ khác.
- **Cách dùng**: 
```java
                JFrame frame = new JFrame();
                frame.toFront();  // Đưa cửa sổ lên phía trước
```

## 16. `setBackground(Color color)`
- **Mô tả**: Đặt màu nền cho cửa sổ.
- **Cách dùng**: 
```java
            JFrame frame = new JFrame();
            frame.setBackground(Color.BLUE);  // Đặt màu nền thành màu xanh dương
```
## 16.1 `setForeground(Color color)`
- **Mô tả**: Đặt màu nền cho cửa sổ.
- **Cách dùng**: 
```java
                
                // Tạo một label với màu chữ đỏ
                JLabel label = new JLabel("Đây là một label có màu đỏ");
                label.setForeground(Color.RED);
```

## 17. `getTitle()`
- **Mô tả**: Trả về tiêu đề của cửa sổ.
- **Cách dùng**: 
```java
            JFrame frame = new JFrame("Cửa sổ của tôi");
            System.out.println(frame.getTitle());  // In ra tiêu đề của cửa sổ
```

## 18. `setUndecorated(boolean undecorated)`
- **Mô tả**: Loại bỏ hoặc thêm các trang trí của cửa sổ (tiêu đề, viền).
- **Cách dùng**: 
```java
            JFrame frame = new JFrame();
            frame.setUndecorated(true);  // Loại bỏ các trang trí của cửa sổ
```

## 19. `setOpacity(float opacity)`
- **Mô tả**: Đặt mức độ trong suốt cho cửa sổ (từ 0.0 đến 1.0).
- **Cách dùng**: 
```java
                      JFrame frame = new JFrame();
                      frame.setOpacity(0.8f);  // Đặt độ trong suốt 80%
```

## 20. `setAlwaysOnTop(boolean alwaysOnTop)`
- **Mô tả**: Kiểm soát việc cửa sổ luôn ở trên cùng của các cửa sổ khác.
- **Cách dùng**: 
```java
                    JFrame frame = new JFrame();
                    frame.setAlwaysOnTop(true);  // Luôn đặt cửa sổ ở trên cùng
```

---
Mỗi phương thức này cung cấp các tính năng quan trọng để xây dựng ứng dụng giao diện người dùng với `JFrame` trong Java Swing. Bằng cách sử dụng những phương thức này, bạn có thể điều khiển kích thước, vị trí, khả năng hiển thị và nhiều thuộc tính khác của `JFrame` để tạo giao diện tương tác và động.
