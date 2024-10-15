package Java;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Java.opp.*;
import Java.opp.menu.*;
import Java.opp.menu.AllMenu;
import opp.AccountMoney;
import opp.CreditCard;

public class Login {
     public static final String FileAcc = "Acc_Bank.csv";
     public static List<AccountBank> accounts = new ArrayList<>();
     public static AccountBank Acc;
     public static AccountMoney moneyAcc;
     public static AccountBank AccBank;
     public Login(){
          ReadAccountBank();
          Scanner scanner = new Scanner(System.in);
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
               AllMenu menu = new AllMenu();
               menu.displayMenu(AccBank);
          } else {
               AccBank.Clear();
               System.out.println("Login Fail");
          }
     }
     public static void ReadAccountBank() {
          try {
               Scanner myReader = new Scanner(new File(FileAcc));
               while (myReader.hasNextLine()) {
                    String line = myReader.nextLine();
                    String[] data = line.split(",");
                    if (data.length == 8) {
                         String name = data[0];
                         int year = Integer.parseInt(data[1]);
                         String email = data[2];
                         String sex = data[3];
                         String address = data[4];
                         int phone = Integer.parseInt(data[5]);
                         String password = data[6];
                         double money = Double.parseDouble(data[7]);

                         AccountBank acc = new AccountBank(name, year, email, sex, address, phone, password, money);
                         accounts.add(acc);
                    }
               }
               myReader.close();
          } catch (IOException e) {
               System.out.println("An error occurred while reading the file.");
               e.printStackTrace();
          }
     }

}
