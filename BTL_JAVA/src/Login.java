
import java.util.List;
import java.util.Scanner;
import Menu.AccountBank;
import Menu.DisplayMenu;

public class Login {
     public static AccountBank AccBank;
     Scanner scanner = new Scanner(System.in);
     public Login(List<AccountBank> accounts){
          System.out.println("\n\tLogin\n");
          System.out.println("Email: ");
          String email = scanner.nextLine();
          System.out.println("Password: ");
          String pass = scanner.nextLine();
          boolean isSet = false;
          for (AccountBank acc : accounts) {
               if (acc.getEmai().equals(email) && acc.getPassword().equals(pass)) {
                    isSet = true;
                    AccBank = acc;
                    break;
               }
          }

          if (isSet) {
               AccBank.Clear();
               System.out.println("Login Success");
               new DisplayMenu(AccBank);
          } else {
               AccBank= new AccountBank();
               AccBank.Clear();
               System.out.println("Login Fail");
          }
     }
}
