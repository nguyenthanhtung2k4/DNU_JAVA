import DATA.User;
import OPP.Account;
import OPP.Login;

public class Bank {
   public static void main(String[] args) {
      //  Tham so  can  chieu  
      User user = new User("account THanh Tung", 0, 24366004L);
      
      ////  Main
      Login login = new Login();
      Account account = new Account(user);
      login.setVisible(true); // Hiển thị JFrame
   }
}
