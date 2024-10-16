package Menu;

// import Menu.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
public class DisplayMenu {
     public static AccountMoney moneyAcc;
     public static Scanner scanner = new Scanner(System.in);
     public static Time Date = new Time();
     public DisplayMenu(AccountBank Acc) {
          moneyAcc = new AccountMoney(Acc.getName(),Acc.getMoney() ,Date.getDate());
          Acc.Clear();
          System.out.println("\tWelcome to " + Acc.getName() + " Banking");
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
                         Thongtin(Acc);
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
                                   "\n Now " + Date.getDate() + "\nSo du stk: " + nap.NapTien(moneyAcc, tinNap));
                         break;
                    case 4:
                         NapRut rut = new NapRut();
                         System.out.println("Rut tien:");
                         double rutTien = scanner.nextDouble();
                         // nap.NapTien(200);
                         System.out.println(
                                   "\n Now " + Date.getDate() + "\nSo du stk: " + rut.RutTien(moneyAcc, rutTien));
                         break;
                    case 5:
                         Acc.Clear();
                         int dem=0; 
                         double limit=0;
                       
                         if (dem ==0){
                              dem+=1;
                              System.out.println("Nhap gioi han the: ");
                              System.out.println("Create Card:") ;
                              limit = scanner.nextDouble();
                              System.out.println("===================\n");
                         }
                         System.out.println("The tin dung");
                         System.out.println("Name:"+Acc.getName());
                         System.out.println("Hien co: "+Acc.getMoney()+" $");
                         CreditCard card= new CreditCard(Acc.getName(),Acc.getMoney(), limit);
                         card.displayCard(moneyAcc);
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
     
     //////////////////////////////////
     public static void AllMenu() {
          System.out.println("1. Thong tin");
          System.out.println("2. Chuyen tien");
          System.out.println("3. Nap tien");
          System.out.println("4. Rut Tien");
          System.out.println("5. The tin dung");
          System.out.println("6. Lich su Giao Dich");
          System.out.println("7.Vay von va tra no");

     }

     public static void Thongtin(AccountBank Acc) {
          System.out.println("\tToday: " + Date.getDate());
          System.out.println("\nTen: " + Acc.getName());
          System.out.println("So tien: " + moneyAcc.getMoney());
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
               moneyAcc.addHistory("GiaoDich |\nNow "+Date.getDate()+"Chuyen tien "+money+" --> "+stk);
          }
     }
     
}
