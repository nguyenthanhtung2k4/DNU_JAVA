package Menu;
import java.awt.Desktop;
import java.io.File;
import java.net.URI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import Data.srcData;
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
     public static List<String>  lines= new ArrayList<>();  // luu  mang  file vao trong nay 
     public static CreditCard card = null; //  Case 5;
     public static VayVon VayVon= null; // Case7
     public static SaveMoney SaveMoney= null; // Case8
     public static Input input= new Input();
     @SuppressWarnings("static-access")
     public DisplayMenu(AccountBank Acc , List<AccountBank> arrSig){
          String fileAcc=new srcData().getAccounts();
          String fileCredit=new srcData().getCard() ;
          String fileVayVon=new srcData().getVayvon() ;
          String fileMoney=new srcData().getSavemoney() ;
          moneyAcc = new AccountMoney(Acc.getName(),Acc.getMoney() ,Date.getDate(), Acc.getId());
          moneyAcc.Clear();
          System.out.println("\n\tWelcome " + Acc.getName() + " to Banking");
          int choice;
          do {
               card=class_ReadFile(fileCredit,moneyAcc.getId(), CreditCard.class);
               VayVon=class_ReadFile(fileVayVon,moneyAcc.getId(), VayVon.class);
               SaveMoney=class_ReadFile(fileMoney, moneyAcc.getId(),SaveMoney.class);

               System.out.println("\n---------- Option Menu ----------\n");
               AllMenu();
               // int choice=Menu.getInt();
               // Scanner scanner= new Scanner(System.in);
               choice = input.nhap("Lua chon Menu: ", Integer.class);

               switch (choice) {
                    case 0:
                         moneyAcc.Clear();
                         String fomat1="name,year,email,sex,adrees,phone,cccd,pass,money,id" ;
                         String Data=(Acc.getName()+","+Acc.getYear()+","+Acc.getEmai()+","+Acc.getSex()
                         +","+Acc.getAdrees()+","+Acc.getPhone()+","+Acc.getCccd()+","+Acc.getPassword()
                         +","+moneyAcc.getMoney()+","+Acc.getId());
                         ModifyCSV.displayCSV(Acc.getId(),fileAcc,fomat1, Data);
                         arrSig.clear();//  xoa  data
                         System.out.println("\n\n\tOut Bank\n");
                         break;
                    case 1:
                         Acc.Clear();
                         Thongtin(Acc);
                         break;
                    case 2:
                         Acc.Clear();
                         System.out.println("\n\tChuyen tien");
                         ChuyenTien();
                         break;
                    case 3:
                         Acc.Clear();
                         System.out.println("\n\t Nap Tien");
                         NapRut nap = new NapRut();
                         double tinNap =input.nhap("So tien Nap: ",Double.class);
                         // nap.NapTien(200);
                         System.out.println(
                                   "\n Now " + Date.getDate() + "\nSo du stk: " 
                                   + nap.NapTien(moneyAcc, tinNap));
                                   moneyAcc.addHistory("NapTien |So tien nap: "+tinNap+"$ | Now "+Date.getDate());
                         break;
                    case 4:
                         Acc.Clear();
                         System.out.println("\n\t Rut Tien\n");
                         NapRut rut = new NapRut();
                         double rutTien = input.nhap("So tien Rut: ",Double.class);
                         // nap.NapTien(200);
                         System.out.println(
                                   "\n Now " + Date.getDate() + "\nSo du stk: " + rut.RutTien(moneyAcc, rutTien));
                         break;
                    case 5:
                         Acc.Clear();
                         System.out.println("\n\t The tin dung\n");
                         if (card == null) {
                              System.out.println("Nhap credit limit cho the: ");
                              double limit = input.nhap("Gioi han the tin dung: ",Double.class);
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
                         Acc.Clear();
                         System.out.println("\n\tXem lai lich su giao dich");
                         moneyAcc.showHistory();
                         break;
                    case 7:
                         Acc.Clear();
                         System.out.println("\n\t Vay von");
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
                    case 8: 
                         Acc.Clear();
                         System.out.println("\n\t Tiet kiem tien");
                         if(SaveMoney==null){
                              String fomat=(moneyAcc.getId()+","+moneyAcc.getName()+","+0.0+0+0+0);
                              moneyAcc.writeFile(fileMoney, fomat);
                              SaveMoney= new SaveMoney(moneyAcc.getName(),moneyAcc.getMoney(),moneyAcc.getId());
                              SaveMoney.displaySaveMoney(moneyAcc,fileMoney);
                         }else{SaveMoney.displaySaveMoney(moneyAcc, fileMoney);}
                         break;
                    case 9: 
                         Acc.Clear();
                         System.out.println("\n\t Quan ly bao hiem");
                         new BaoHiem().displayBaohiem(Acc, moneyAcc);
                         break;
                    case 10: 
                         Acc.Clear();
                         System.out.println("\n\t Chuyen doi ngoai le");
                         NgoaiTe.displayNgoaiTe(moneyAcc);
                         break;
                    case 11: 
                         Acc.Clear();
                         System.out.println("\n\t Bao cao tai chinh");
                         moneyAcc.showHistory2();
                         break;
                    case 12: 
                         Acc.Clear();
                         System.out.println("\n\t Bao mat tai khoan");
                         System.out.println("Thong tin ca nhan");
                         Thongtin(Acc);
                         System.out.println("[Y/n] Chon Y doi mat khau");
                         String mk=input.nhap("==> ",String.class);
                         if(mk.equalsIgnoreCase("Y")){
                              while (true) {
                                        String newmk=input.nhap("Nhap mat khau moi: ",String.class);
                                        String newmk2=input.nhap("Xac nhan mat khau: ",String.class);
                                        if(newmk.equals(newmk2)){Acc.setPassword(newmk);break;}
                                        else{ System.out.println("Mat khau khong khop\nVui long nhap lai!");}
                              }
                         }
                         System.out.println("[Y/n] Chon Y doi email ");
                         String email=input.nhap("==> ",String.class);
                         if(email.equalsIgnoreCase("Y")){
                              while (true) {
                                        String emailNew=input.nhap("Nhap emai moi: ",String.class);
                                        String emailNew2=input.nhap("Xac nhan emai: ",String.class);
                                        if(emailNew.equals(emailNew2)){Acc.setEmai(emailNew);break;}
                                        else{ System.out.println("emai khong khop\nVui long nhap lai!");}
                              }
                         }
                         break;
                    case 13: 
                         Acc.Clear();
                         System.out.println("\n\t Mua Sam");
                         int nhap;
                         System.out.printf("%5s%10s%n","Chon","SanPham");
                         System.out.printf("%5s%10s%n","1","DoAn");
                         System.out.printf("%5s%10s%n","2","QuanAo");
                         System.out.printf("%5s%10s%n","3","DienTu");
                         nhap= input.nhap("Lua chon MuaSam: ",Integer.class);
                         try {
                              MuaSam(nhap);
                         } catch (Exception e) {
                              System.out.println("Lua chon khong hop le! ");
                         }
                         break;
                    case 14: 
                         Acc.Clear();
                         String TK=input.nhap("Nhap TK ADMIN:  ", String.class);
                         String MK=input.nhap("Nhap MK  ADMIN:  ", String.class);
                         if(TK.equals("admin") && MK.equals("admin")){
                              System.out.println("\n \tWelcome ADMIN Bank \n");
                              Admin.displayAdmin(fileAcc, arrSig);
                              System.out.println("\n\t Quan tri vien");
                         }else{System.out.println("TK or MK khong dung :((");}
                         break;
                    case 15: 
                         Acc.Clear();
                         System.out.println("\n\t Support");
                         Support.displaySupport(arrSig, fileAcc);
                         break;
                    default:
                         System.out.println("Vui long chon lai chuc nang.");
                         break;
               }
          } while (choice != 0);

     }
     //////////////////////////////////
     public static void AllMenu() {
          System.out.println("0. Dang xuat");
          System.out.println("1. Thong tin");
          System.out.println("2. Chuyen tien");
          System.out.println("3. Nap tien");
          System.out.println("4. Rut Tien");
          System.out.println("5. The tin dung");
          System.out.println("6. Lich su Giao Dich");
          System.out.println("7. Vay von va tra no");
          System.out.println("8. Tiet kiem tien");
          System.out.println("9. Quan ly bao hiem xe");
          System.out.println("10.Chuyen doi ngoai te");
          System.out.println("11.Bao cao tai chinh");
          System.out.println("12.Bao mat tai khoan");
          System.out.println("13.Mua sam");
          System.out.println("14.Quan tri vien"); // neu con thoi gian
          System.out.println("15.Support ");
          
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
     @SuppressWarnings("static-access")
     public static void ChuyenTien() {
          int stk =input.nhap("Stk: ",Integer.class);
          double money =input.nhap("Nhap so tien chuyen: ",Double.class);
          if (money > moneyAcc.getMoney() && money < 0) {
               System.out.println("So tien khong  hop le !");
          } else {
               moneyAcc.setMoney(moneyAcc.getMoney() - money);
               System.out.println("Chuyen tien thanh cong.");
               System.err.println("So du con lai: "+moneyAcc.getMoney());
               moneyAcc.addHistory("GiaoDich |Chuyen tien "+money+"$ --> "+stk+"| Now "+Date.getDate());
          }
     }
     @SuppressWarnings("static-access")
     public static void menu13(){
               int nhap;

               System.out.println("\n\t Mua sam");
               System.out.printf("%5s%10s%n","Chon","SanPham");
               System.out.printf("%5s%10s%n","1","DoAn");
               System.out.printf("%5s%10s%n","2","QuanAo");
               System.out.printf("%5s%10s%n","3","DienTu");
               nhap= input.nhap("Lua chon MuaSam: ",Integer.class);
               MuaSam(nhap);
         

     }
     /// oder
     public static Map<Integer,String> oder=Map.of(
          1,"https://shopeefood.vn/ha-noi/food",
          2,"https://shopee.vn/search?keyword=quanao",
          3,"https://www.thegioididong.com/"
     );
     public static void MuaSam(int nhap){
          try {
               // Kiem tra xem he  thong ton tai khong
               if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    // Kiểm tra xem Desktop có hỗ trợ duyệt web không
                    if (desktop.isSupported(Desktop.Action.BROWSE)) {
                              String url=oder.get(nhap);
                              URI uri = new URI(url); 
                              desktop.browse(uri); // Mở trang web
                    }
               } else {
                    System.out.println("Desktop  khong ho tro");
               }
          } catch (Exception e) {
               System.out.println("Error " + e.getMessage());
        }
     }
     //  tai su dung lai  code bang ki tu dai dien 
     // Tai su dung code voi  class  ke thua lai  nhau
     public static Scanner myReader;
     public static <T extends AccountMoney> T class_ReadFile(String path, int accountId, Class<T> clazz) {
          try {
               myReader = new Scanner(new File(path));
               myReader.nextLine();
               while (myReader.hasNextLine()) {
                    String line = myReader.nextLine();
                    String[] data = line.split(",");
                    if (data.length == 6 ||  data.length==4 ) {
                         int id = Integer.parseInt(data[0]);
                         String name = data[1];
                         
                         if (id == accountId) {
                              if (clazz == VayVon.class) {
                                   double vay = Double.parseDouble(data[2]);
                                   double lai = Double.parseDouble(data[3]);
                                   int han = Integer.parseInt(data[4]);
                                   double tong = Double.parseDouble(data[5]);
                                   return clazz.cast(new VayVon(id,name,moneyAcc.getMoney(), vay,lai,han,tong));
                              } else if (clazz == SaveMoney.class) {
                                   double savemoney = Double.parseDouble(data[2]);
                                   double lai = Double.parseDouble(data[3]);
                                   int han = Integer.parseInt(data[4]);
                                   double tong = Double.parseDouble(data[5]);
                                   return clazz.cast(new SaveMoney(name,moneyAcc.getMoney(),id,savemoney,lai,han,tong));
                              }else if (clazz== CreditCard.class){
                                   double limit = Double.parseDouble(data[2]);
                                   double debt = Double.parseDouble(data[3]);
                                   return clazz.cast(new CreditCard(name, moneyAcc.getMoney(), limit, debt, id));
                              }
                         }
                    }
               }
          } catch (Exception e) {
              e.printStackTrace();
          }
          return null;
     }
}