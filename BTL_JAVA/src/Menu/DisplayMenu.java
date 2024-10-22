package Menu;

import java.io.File;
import java.io.IOException;
// import Menu.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
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

public class DisplayMenu{
     public static AccountMoney moneyAcc;
     public static Scanner scanner = new Scanner(System.in);
     public static Time Date = new Time();
     // public static List<CreditCard> dataCard= new ArrayList<>(); //  case5;
     public static List<String>  lines= new ArrayList<>();  // luu  mang  file vao trong nay 
     public static CreditCard card = null; //  Case 5;
     public static VayVon VayVon= null; // Case7
     // @SuppressWarnings("unused")
     @SuppressWarnings("static-access")
     public DisplayMenu(AccountBank Acc) {
          String fileCredit="./data/card.csv";
          String fileVayVon="./data/vayvon.csv";
          moneyAcc = new AccountMoney(Acc.getName(),Acc.getMoney() ,Date.getDate(), Acc.getId());
          Acc.Clear();
          System.out.println("\tWelcome " + Acc.getName() + " to Banking");
          int choice;
          do {
               readFileCard(fileCredit); // doc file  trong Case5
               readFileVayVon(fileVayVon); // doc file  trong Case7

               System.out.println("\n---------- Option Menu ----------\n");
               AllMenu();
               System.out.print("Chon chuc nang (1-6): ");
               // int choice=Menu.getInt();
               // Scanner scanner= new Scanner(System.in);
               choice = scanner.nextInt();

               switch (choice) {
                    case 0:
                         // if(card != null || VayVon != null){
                         //      ModifyCSV CSV= new ModifyCSV();
                         //      String fomat="id,name,limit,debt";
                         //      String plance=(card.getId()+","+card.getName()+","+card.getCard()+","+card.getDebt());
                         //      System.out.println(plance);
                         //      CSV.displayCSV(moneyAcc.getId(), fileCredit, fomat, plance);
                         // }
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
                                   "\n Now " + Date.getDate() + "\nSo du stk: " 
                                   + nap.NapTien(moneyAcc, tinNap));
                                   moneyAcc.addHistory("NapTien |So tien nap: "+tinNap+"$ | Now "+Date.getDate());
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
                         if (card == null) {
                              System.out.println("Nhap credit limit cho the: ");
                              double limit = scanner.nextDouble();
                              card = new CreditCard(moneyAcc.getName(), moneyAcc.getMoney(), limit,moneyAcc.getId());
                              System.out.println("The da duoc tao voi limit: " + limit);
                              card.addHistory("Create Card | Now: "+Date.getDate());
                              card.menuCard(moneyAcc,fileCredit);
                              String write=(moneyAcc.getId()+","+moneyAcc.getName()+","+limit+0);
                              moneyAcc.writeFile(fileCredit, write);

                         } else {
                              System.out.println("Su dung the da ton tai");
                              card.menuCard(moneyAcc,fileCredit);
                         }
                         break;
                    case 6:
                         System.out.println("\n\tXem lai lich su giao dich");
                         moneyAcc.showHistory();
                         break;
                    case 7:
                         if(VayVon==null){
                              VayVon= new VayVon(moneyAcc.getName(), moneyAcc.getMoney(),moneyAcc.getId());
                              VayVon.displayVayVon(moneyAcc, Date.getDate(),fileVayVon);
                              VayVon.setStatus(false);
                         }else{
                              System.out.println("Ban da duoc tao vay roi");
                              VayVon.displayVayVon(moneyAcc, Date.getDate(),fileVayVon);
                              VayVon.setStatus(true);
                         }
                         break;
                    
                    case 9: 
                         // tiet kiem tien 
                         
                         break;
                    case 10: 
                         break;
                    case 11: 
                         break;
                    case 12: 
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
          System.out.println("7. Vay von va tra no");
          System.out.println("8. Tiet kiem tien");

     }

     public static void Thongtin(AccountBank Acc) {
          System.out.println("\tToday: " + Date.getDate());
          System.out.println("\nID: " + Acc.getId());
          System.out.println("Ten: " + Acc.getName());
          System.out.println("CCCD: "+Acc.getCccd());
          System.out.println("So tien: " + moneyAcc.getMoney()+" $");
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
               moneyAcc.addHistory("GiaoDich |Chuyen tien "+money+"$ --> "+stk+"| Now "+Date.getDate());
          }
     }

     public static void readFileCard(String path){
         try {
               Scanner myReader = new Scanner(new File(path));
               myReader.nextLine();
               while (myReader.hasNextLine()) {
                    String line = myReader.nextLine();
                    String[] data = line.split(",");
                    if (data.length == 4){
                         // String id, name,limit, debt;
                         int id =Integer.parseInt(data[0]);
                         String name =data[1];
                         double limit =Double.parseDouble(data[2]);
                         double debt = Double.parseDouble(data[3]);
                         if(id== moneyAcc.getId()){
                              card = new CreditCard(name,moneyAcc.getMoney(),limit,debt,id);
                              // dataCard.add(card);    
                         }
                    }
               }
               myReader.close();
          } catch (IOException e) {
               System.out.println("An error occurred while reading the file.");
               e.printStackTrace();
          }
     // return path;
     }
     public static void readFileVayVon(String path){
         try {
               Scanner myReader = new Scanner(new File(path));
               myReader.nextLine();
               while (myReader.hasNextLine()) {
                    String line = myReader.nextLine();
                    String[] data = line.split(",");
                    if (data.length == 6){
                         // String id, name,limit, debt;
                         int id =Integer.parseInt(data[0]);
                         String name =data[1];
                         double vay =Double.parseDouble(data[2]);
                         double lai = Double.parseDouble(data[3]);
                         int han = Integer.parseInt(data[4]);
                         double tong = Double.parseDouble(data[5]);
                         if(id== moneyAcc.getId()){
                              VayVon = new VayVon(id,name,moneyAcc.getMoney(),
                                                  vay,lai,han,tong);
                         }

                    }
               }
               myReader.close();
          } catch (IOException e) {
               System.out.println("An error occurred while reading the file.");
               e.printStackTrace();
          }
     // return path;
     }

     
}
