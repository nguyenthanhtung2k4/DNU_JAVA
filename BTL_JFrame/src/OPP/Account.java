package OPP;

import DATA.User;
import java.awt.*;
import javax.swing.*;

public class Account extends JFrame { 

    private User user;
    private JLabel moneyLabel; 

    //  opp doi tuong 
    public Account(User user) {
        super("Account Bank");
        this.user = user;
        setSize(700, 500); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addFrame(); 
}


     public   void addFrame() {
          JPanel panel = new JPanel(new GridBagLayout()); // Use GridBagLayout
          panel.setBackground(new Color(35,45,48));

          GridBagConstraints gbc = new GridBagConstraints();

          panel.setLayout(new GridLayout(3, 2));
//////////////////////////////////////////////////////
          // // Account Bank
          gbc.gridx = 0;
          gbc.gridy = 0;
          gbc.gridwidth = 2; 
          gbc.anchor = GridBagConstraints.CENTER;
          gbc.insets = new Insets(-30, 0, 70, 0); 

          JLabel UserName = new JLabel("UserName: "+ user.getUsername());
          UserName.setForeground(Color.GREEN);
          UserName.setFont(new Font("Arial", Font.BOLD, 18));
        
          // // Total
          gbc.gridx = 1; 
          gbc.anchor = GridBagConstraints.EAST; 
          // JTextField  Money = new JTextField(Text_HTML);
          // Money.setEditable(false);
          moneyLabel = new JLabel(getMoneyText());
          moneyLabel.setFont(new Font("Arial", Font.BOLD,20));
          moneyLabel.setForeground(Color.YELLOW);
          moneyLabel.setBackground(new Color(35,45,48));


          // ///
          gbc.gridx = 0; 
          gbc.anchor = GridBagConstraints.CENTER; 
          JButton btn_NapTien = new JButton("Gui Tien");
          btn_NapTien.addActionListener(e-> guiTien());
          JButton btn_RutTien = new JButton("Rut Tien");
          btn_RutTien.addActionListener(e-> rutTien());
          JButton btn_Lishsu = new JButton("Lich Su");
          JButton btn_NangCao = new JButton("Nang Cao");
     /////////////////Panel  Add 
          panel.add(UserName, gbc);
          panel.add(moneyLabel, gbc);
        
          panel.add(btn_NapTien, gbc);
          panel.add(btn_RutTien, gbc);
          panel.add(btn_Lishsu, gbc);
          panel.add(btn_NangCao, gbc);
          

          // Thêm panel vào JFrame
          add(panel);
    }

    //  string html -->> getmoney
     private String getMoneyText() {
          return "<html><body><b>Money: " 
          + user.getTotal() 
          + " $</b><br><b>STK: " 
          + user.getStk() + "</b></body></html>";
     }

     // Phương thức nạp tiền
     private void guiTien() {
          String input = JOptionPane.showInputDialog(null, "Nhập số tiền muốn nạp:");
          if (input != null && !input.isEmpty()) {
               try {
                    double amount = Double.parseDouble(input); //  gan double
                    user.addMoney(amount); // Cong tien
                    moneyLabel.setText(getMoneyText()); // update tien 
               } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Số tiền không hợp lệ!");
               }
          }
     }
     private  void  rutTien(){
          String input = JOptionPane.showInputDialog(null, "Nhập số tiền muốn nạp:");
          if (input != null && !input.isEmpty()) {
               try {
                    if(user.checkMoney()) {
                         double amount = Double.parseDouble(input); //  gan gia tri 
                         user.moveMoney(amount); //tru tien
                         moneyLabel.setText(getMoneyText()); // update tien 
                    }else{
                         System.out.println(" no  check  money chx du tien");
                         JOptionPane.showMessageDialog(null, "Số dư không dung :((");                     
                    }
               } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Số tiền không hợp lệ!");
               }
          }

     }
}
/// lam chuc nang tru tien +  lich  su  + nang cao  + sql
///   ket hop  login vao  1  