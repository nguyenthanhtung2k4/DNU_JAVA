package OPP;
import DATA.User;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame{
	
    public Login() {
    // Thiet lap Jframe
        super("Login Bank");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
    // khoi  tao  Jpanel
        JPanel panel = new JPanel();
    // Can chinh kich thuoc  gird
        panel.setLayout(new GridBagLayout());
        GridBagConstraints luoi_Gird = new GridBagConstraints();

    // tao  Jlabel trong JFrame
        //  welcome bank
        JLabel Bank_text= new JLabel("Welcome to Bank ");
        Bank_text.setForeground(Color.BLUE);
        Bank_text.setFont( new Font("Arial", Font.BOLD, 25));
        JLabel userName = new JLabel("Username:");
        userName.setForeground(Color.BLACK);
        JTextField textUser = new JTextField(20);
        textUser.setFont(new Font("Arial", Font.PLAIN, 18));
        JLabel password = new JLabel("Password:");
        //  input pass
        password.setForeground(Color.BLACK);
        JPasswordField textPass = new JPasswordField(20);
        textPass.setFont(new Font("Arial", Font.PLAIN, 18));
        //  input button
        JButton button= new JButton("Login");
        // button.setBackground(Color.BLUE);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        // massage
        JLabel message= new  JLabel();
       
    // Thiết lập  lưới +   thêm nút +  label  vào Jframe
        /// thiet lap  luoi gird 
        luoi_Gird.gridx = 0;  
        luoi_Gird.gridy = -1;
        luoi_Gird.anchor=GridBagConstraints.CENTER;//  chinh giua
        // luoi_Gird.gridheight=2;
        luoi_Gird.insets= new  Insets(-10,0,50,0);
        panel.add(Bank_text, luoi_Gird);
        luoi_Gird.anchor = GridBagConstraints.WEST;// can sang ben  trai
        luoi_Gird.insets= new  Insets(0,0,0,0);
        luoi_Gird.gridy = 1; 
        panel.add(userName, luoi_Gird);

        luoi_Gird.gridy = 2;  
        panel.add(textUser, luoi_Gird);

        luoi_Gird.gridy = 3;  
        panel.add(password, luoi_Gird);

        luoi_Gird.gridy = 4;  
        panel.add(textPass, luoi_Gird);

        luoi_Gird.gridy=6;
        luoi_Gird.insets= new Insets(20, 0, 0, 0);
        luoi_Gird.anchor=GridBagConstraints.CENTER;
        panel.add(button,luoi_Gird);

        luoi_Gird.gridy=7;
        panel.add(message,luoi_Gird);
    //  Su ly du lieu  button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Name = textUser.getText();
                String Pass = new String(textPass.getPassword());
                
                // Kiểm tra thông tin đăng nhập
                if (Name.equals("admin") && Pass.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Susses", "Message", JOptionPane.INFORMATION_MESSAGE);
                    User user = new User("ThanhTung", 0.0, 7982292004L);
                    Account account = new Account(user);
                    setVisible(false);
                    account.setVisible(true);
                    // message.setForeground(Color.GREEN);
                    // message.setText("Đăng nhập thành công!");
                } else {
                    JOptionPane.showMessageDialog(null, "Fall login !", "Message", JOptionPane.INFORMATION_MESSAGE);
    
                    // message.setForeground(Color.RED);
                    // message.setText("Tên đăng nhập hoặc mật khẩu không đúng.");
                }
            }
        });
        // check
        // private  boolean  check(boolean  check){
        //     if(check){
        //         return true;
        //     }else{
        //         JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đ�� thông tin", "Message", JOptionPane.INFORMATION_MESSAGE);
        //         return false;
        //     }
        // }
        //  add them  
        add(panel);
    }
}
