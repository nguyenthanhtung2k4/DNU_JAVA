import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Menu.AccountBank;
import Menu.AllMenu;



public class BankAccount {
     public static final String FileAcc = "Acc_Bank.csv";
     public static List<AccountBank> accounts = new ArrayList<>();
     public static AccountBank AccBank; 
     public static void Clear(){
          System.out.print("\033[H\033[2J");
          System.out.flush();
     }
     public static void login() {
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
               System.out.println("Login Success");
               AllMenu.displayMenu(AccBank);
          } else {
               System.out.println("Login Fail");
          }
     }
     public static void CreateAccount() {
          String name, email, sex, address, pass1, pass2;
          double money;
          int phone, year;
          Scanner scanner = new Scanner(System.in);

          System.out.println("Your username: ");
          name = scanner.nextLine();
          System.out.println("Your Year: ");
          year = scanner.nextInt();
          scanner.nextLine();
          scanner.nextLine(); 
          System.out.println("Email: ");
          email = scanner.nextLine();
          System.out.println("Sex : \n\tBoy\n\tGirl");
          sex = scanner.nextLine();
          System.out.println("Your Address: ");
          address = scanner.nextLine();
          System.out.println("Your Phone: ");
          phone = scanner.nextInt();
          scanner.nextLine();

          do {
               System.out.println("Password: ");
               pass1 = scanner.nextLine();
               System.out.println("Confirm password: ");
               pass2 = scanner.nextLine();
               if (pass1.equals(pass2)) {
                    break;
               } else {
                    System.out.println("Password fail");
               }
          } while (!pass1.equals(pass2));

          System.out.println("Money");
          money = scanner.nextDouble();
          WriteAccountBank(name,year,email,sex,address,phone,pass2,money);

          // accounts.add(new AccountBank(name, email, sex, address, phone, pass2, money));
     }
     public static void WriteAccountBank(String name,int year,String email,String sex,String address,int phone, String pass2,double money){
          try {
               FileWriter myWriter = new FileWriter(FileAcc, true);
               myWriter.write(name + "," + year + "," + email + "," + sex + "," + address + "," + phone + ","+pass2+"," + money+"\n");
               myWriter.close();
          } catch (IOException e) {
               System.out.println("Error writing to file!");
               e.printStackTrace();
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

                         AccountBank acc = new AccountBank(name,year, email, sex, address, phone, password, money);
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
