# Các Nút BẤM LIÊN QUAN ĐẾN JFrame
## 1. `button`
- **Mô tả**: Sử dụng nút bấm
- **Cách dùng**: 
```java
        JButton button = new JButton("Nhấn vào đây");
        button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                // Xử lý khi nút được nhấn
                System.out.println("Nút đã được nhấn");
        }
        });
```

## 2. `JToggleButton`
- **Mô tả**: Nút bấm có thể ở hai trạng thái: bật hoặc tắt.
- **Cách dùng**: 
```java
        JToggleButton toggleButton = new JToggleButton("Bật/Tắt");
        toggleButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) {
                System.out.println("Nút đã được bật");
                } else {
                System.out.println("Nút đã được tắt");
                }
        }
        });
```
## 3. `JMenuItem`
- **Mô tả**: Nút bấm trong menu.
- **Cách dùng**: 
```java
        JMenuItem menuItem = new JMenuItem("Mở");
        menuItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                // Xử lý khi menu item được chọn
                System.out.println("Mở file");
        }
        });
        JMenu menu = new JMenu("File");
        menu.add(menuItem);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
```
## 4. `JCheckBox | JRadioCheck`
- **Mô tả**: Check box
- **Cách dùng**: 
```java
        // box
        JCheckBox checkBox = new JCheckBox("Đồng ý với điều khoản");
        // radio
        JRadioButton radioButton = new JRadioButton("Nam");
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton);
```
## 5. `JComboBox`
- **Mô tả**:  Hộp chọn, cung cấp một danh sách các tùy chọn để người dùng lựa chọn.
- **Cách dùng**: 
```java
        String[] items = {"Java", "C++", "Python"};
        JComboBox comboBox = new JComboBox(items);
```
## 6. `JPasswordField`
- **Mô tả**:  input passwword  khong cho  nhin thay  mat  khau
- **Cách dùng**: 
```java
        JPasswordField passwordField = new JPasswordField(20);
       
```
## 4. `JOptionFrame`
- **Mô tả**:
- **Cách dùng**: 
```java
       
```




////////////////////////////////////////////////////////////////////////////////////////



# Các phương thức và cách SỬ DỤNG JFrame

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
  - Bố cục thường dùng:
                `FlowLayout`: Mặc định của JPanel, tự động xếp các thành phần theo hàng ngang. Khi hết chỗ, nó sẽ tự động xuống dòng.
                `GridLayout`: Sắp xếp các thành phần thành lưới các hàng và cột.
                `BoxLayout`: Cho phép bạn sắp xếp các thành phần theo hướng ngang hoặc dọc.
                `GridBagLayout`: Cung cấp khả năng kiểm soát bố cục chi tiết hơn.
- **Cách dùng**: 
```java
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());  // Đặt bố cục FlowLayout để sắp xếp các thành phần
```
## 6.1 `GirdBagContraints()`
- **Mô tả**: Nó là một hàm riêng không nằm trong SetLayout Chính vì vậy khi dùng phải khởi tạo nó.
  - Các thuộc tính thường dùng:
                `gridx` và `gridy`: Xác định vị trí cột và hàng của thành phần.
                `gridwidth` và `gridheight`:Xác định số cột và số hàng mà thành phần sẽ chiếm.`weightx` và `weighty`:Xác định trọng số của thành phần khi thay đổi kích thước
                `anchor`:Định nghĩa vị trí của thành phần bên trong một ô lưới khi kích thước của ô lớn hơn kích thước của thành phần.
                        *Các giá trị thường* dùng: 
                        `GridBagConstraints.CENTER`: CAN CHINH GIUA
                        `GridBagConstraints.WEST`  : cAN SANG TRAI
                        `GridBagConstraints.EAST`  : cAN SANG PHAI
                `fill`:Quy định cách thành phần lấp đầy không gian trong ô lưới. 
                        *Các giá trị*:
                                `NONE`: Thành     phần giữ nguyên kích thước.
                                `HORIZONTAL`: Giãn theo chiều ngang.
                                `VERTICAL`: Giãn theo chiều dọc.
                                `BOTH`: Giãn theo cả hai chiều.
                `insets`:Xác định khoảng cách giữa thành phần và các thành phần khác (khoảng đệm).
                `ipadx` và `ipady`:Xác định kích thước nội bộ thêm vào cho thành phần theo chiều ngang (ipadx) và chiều dọc (ipady).

```java
        // Cấu hình cho Button 1
        gbc.gridx = 0; // Cột 0
        gbc.gridy = 0; // Hàng 0
        gbc.gridwidth = 1; // Chiếm 1 ô ngang
        gbc.gridheight = 1; // Chiếm 1 ô dọc
        gbc.weightx = 1.0; // Giãn theo chiều ngang khi cửa sổ mở rộng
        gbc.weighty = 1.0; // Giãn theo chiều dọc khi cửa sổ mở rộng
        gbc.fill = GridBagConstraints.BOTH; // Giãn đều theo cả chiều ngang và dọc
```
![Vd:  Sử dụng GirdBagContraints](./tk_JFrame_GirdBagContraints.java)

## 6.1 `JOptionPane`
- **Mô tả**: Hiên thi ra thanh thông báo cho  người dùng (information - pane)
- **Các hàm liên quan**: 
                        showConfirmDialog() :
                        showInputDialog()   :

- **Cách dùng**: 
```java
                        // Tạo một hộp thoại xác nhận
                        int option = JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
```

![Vd suu dung Information](./tk_Class_OPP_Message.java)

## 7. `getJPane()`
- **Mô tả**: Trả về nội dung của cửa sổ, là nơi chứa tất cả các thành phần. JFanel panel
- **Cách dùng**: 
```java
        JFrame frame = new JFrame();
        JPanel pane = new JPanel;  // Tạo Jpanel để chứa các phần tử
        pane.setLayout(new BorderLayout());  // Đặt bố cục BorderLayout cho nội dung
```
## 7.1 `getContentPane()`
- **Mô tả**: Trả về nội dung của cửa sổ, là nơi chứa tất cả các thành phần. container
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

![Cách dùng Panel](./tk_JFrame_JPanel.java)
![Cách dùng Container](./tk_JFrame_Container.java)


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
