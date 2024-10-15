import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.Line;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//------------------------  Class -------------------------------
//// Nap  rut tien
abstract class Nap {
     public abstract double NapTien(AccountMoney acc, double tien);

     public abstract double RutTien(AccountMoney acc, double tien);
}

class NapRut extends Nap {
     double tien;
     AccountMoney AccBank;

     public NapRut() {
     };

     public NapRut(double tien) {
          this.tien = tien;
     }

     public NapRut(AccountMoney AccBank, double tien) {
          this.tien = tien;
          this.AccBank = AccBank;
     }

     @Override
     public double NapTien(AccountMoney AccBank, double tien) {
          AccBank.setMoney(AccBank.getMoney() + tien);
          return AccBank.getMoney();
     }

     @Override
     public double RutTien(AccountMoney AccBank, double tien) {
          if (AccBank.getMoney() >= tien) {
               AccBank.setMoney(AccBank.getMoney() - tien);
               return AccBank.getMoney();
          } else {
               System.out.println("So tien rut khong du.");
               return AccBank.getMoney();
          }
     }

}

//// Time
class Time {
     String date;

     public Time() {
          LocalDateTime myDateObj = LocalDateTime.now();
          DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
          String formattedDate = myDateObj.format(myFormatObj);
          date = formattedDate;
     }

     public Time(String myDate) {
          LocalDateTime myDateObj = LocalDateTime.parse(myDate, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
          DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
          String formattedDate = myDateObj.format(myFormatObj);
          date = formattedDate;
     }

     public String getDate() {
          return date;
     }
}

// --------------------------------------------------------------
public class Bank {
     public static final String FileAcc = "Acc_Bank.csv";
     public static List<AccountBank> accounts = new ArrayList<>();
     public static AccountBank AccBank;
     public static Scanner scanner = new Scanner(System.in);

     public static void Clear() {
          System.out.print("\033[H\033[2J");
          System.out.flush();
     }

     public static void AllMenu() {
          System.out.println("1. Thong tin");
          System.out.println("2. Chuyen tien");
          System.out.println("3. Nap tien");
          System.out.println("4. Rut Tien");
          System.out.println("5. The tin dung");
          System.out.println("6. Lich su Giao Dich");
          System.out.println("7.Vay von va tra no");


     }

     public static void login() {
          // Scanner scanner = new Scanner(System.in);
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
               displayMenu(AccBank);
          } else {
               AccBank.Clear();
               System.out.println("Login Fail");
          }
     }

     public static void CreateAccount() {
          String name, email, sex, address, pass1, pass2;
          double money;
          int phone, year;
          // Scanner scanner = new Scanner(System.in);

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
          WriteAccountBank(name, year, email, sex, address, phone, pass2, money);

          // accounts.add(new AccountBank(name, email, sex, address, phone, pass2,
          // money));
     }

     public static void WriteAccountBank(String name, int year, String email, String sex, String address, int phone,
               String pass2, double money) {
          try {
               FileWriter myWriter = new FileWriter(FileAcc, true);
               myWriter.write(name + "," + year + "," + email + "," + sex + "," + address + "," + phone + "," + pass2
                         + "," + money + "\n");
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

     //////// ALL MENU /////////////////////////////////////

     public static AccountBank Acc;
     public static Time date = new Time();
     public static AccountMoney moneyAcc;

     public static void displayMenu(AccountBank AccBank) {
          Acc = AccBank;
          moneyAcc = new AccountMoney(Acc.getMoney(), Acc.getName(), date.getDate());
          AccBank.Clear();
          System.out.println("\tWelcome to " + AccBank.getName() + " Banking");
          int choice;
          do {

               System.out.println("\n---------- Optin Menu ----------\n");
               AllMenu();
               System.out.print("Chon chuc nang (1-6): ");
               // int choice=Menu.getInt();
               // Scanner scanner= new Scanner(System.in);
               choice = scanner.nextInt();

               switch (choice) {
                    case 0:
                         System.out.println("Out Bank");
                         break;
                    case 1:
                         Acc.Clear();
                         Thongtin();
                         break;
                    case 2:
                         ChuyenTien();
                         break;
                    case 3:
                         NapRut nap = new NapRut();
                         System.out.println("Nap tien:");
                         double tinNap = scanner.nextDouble();
                         // nap.NapTien(200);
                         System.out.println(
                                   "\n Now " + date.getDate() + "\nSo du stk: " + nap.NapTien(moneyAcc, tinNap));
                         break;
                    case 4:
                         NapRut rut = new NapRut();
                         System.out.println("Rut tien:");
                         double rutTien = scanner.nextDouble();
                         // nap.NapTien(200);
                         System.out.println(
                                   "\n Now " + date.getDate() + "\nSo du stk: " + rut.RutTien(moneyAcc, rutTien));
                         break;
                    case 5:
                         // System.out.println("\n\tTao the tin dung\n");
                         // System.out.println("Gioi han muc the: ");
                         // double limit = scanner.nextDouble();
                         CreditCard card = new CreditCard(Acc.getName(), Acc.getMoney(), date.getDate(), 100);
                         card.checkCreditLimit();
                    
                         break;
                    case 6:
                         System.out.println("\n\tXem lai lich su giao dich");
                         moneyAcc.showHistory();
                         break;

                    default:
                         System.out.println("Vui long chon lai chuc nang.");
                         break;
               }
          } while (choice != 0);

     }
     //////////////////////////////////////////////////////// MENU
     //////////////////////////////////////////////////////// OPTION?????????????????????????

     public static void Thongtin() {
          System.out.println("\tNgay dang nhap: " + date.getDate());
          System.out.println("\nTen: " + Acc.getName());
          System.out.println("So tien Hien Co: " + moneyAcc.getMoney());
          System.out.println("Ngay sinh: " + Acc.getYear());
          System.out.println("Email: " + Acc.getEmai());
          System.out.println("Gioi tinh: " + Acc.getSex());
          System.out.println("Dia chi: " + Acc.getAdrees());
          System.out.println("So dien thoai: " + Acc.getPhone());
     }

     public static void ChuyenTien() {
          System.out.println("Stk: ");
          int stk = scanner.nextInt();

          System.out.println("So tien chuyen: ");
          double money = scanner.nextDouble();

          if (money > moneyAcc.getMoney() && money < 0) {
               System.out.println("So tien khong  hop le !");
          } else {
               moneyAcc.setMoney(moneyAcc.getMoney() - money);

               System.out.println("Chuyen tien thanh cong.");
               System.err.println("So du con lai: "+moneyAcc.getMoney());
          }
     }

}
