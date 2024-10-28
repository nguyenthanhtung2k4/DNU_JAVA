package Menu;
import java.util.List;

public class Support {
     public static void displaySupport(List<AccountBank> accounts,  String fileAcc) {int S;
          do{
               
               System.out.println("[1] Lay lai Mat khau");
               System.out.println("[2] Dang ky tai khoan moi  o dau?");
               System.out.println("[3] Ngan hang co cung cap bao mat khong");
               System.out.println("[4] Cac cau hoi khac!");
               System.out.println("[5] About! ");
               System.out.println("[0] Thoat chuong trinh  Support");
               S=Input.nhap("Nhap lua chon menu: ",Integer.class);
               switch(S){
                    case 1: new AccountBank().Clear();
                         System.out.println("Lay lai mat khau");
                         menu1(accounts, fileAcc);
                         break;
                    case 2 :new AccountBank().Clear();
                         System.out.println("Dang ky tai khoan");
                         System.out.println("Dang ky  nam chuc nang [1] sau khi  chay chuong trinh ");
                         System.out.println("Yeu cau: \n\tNhap ten \n\tTuoi\n\tVa gom ca thong tin khac...");
                         System.out.println("Nhan 'ok' de dang ky ngay");
                         String ok=Input.nhap("==> ", String.class);
                         if(ok.equalsIgnoreCase("ok")){
                              System.out.println("Dang ky tai khoan moi!");
                              new Sigup(fileAcc, accounts);
                              System.out.println("Dang ky tai khoan moi thanh cong!");
                              System.exit(0);
                         }
                         break;
                    case 3:new AccountBank().Clear();
                         System.out.println("Cung cap bao mat");
                         System.out.println("Ngan hang co cung cap bao mat  nam trong menu [11] Sau khi dang nhap");
                         System.out.println("Moi van de:\nVui long lien he voi ban quan tri ngan hang\n\tQua Email: tungit.2k4@gmail.com\n\t\tHotel: 0985332211");
                         break;
                    case 4:new AccountBank().Clear();
                         System.out.println("Cac cau hoi khac");
                         Input.nhap("Nhap cau hoi: ",String.class);
                         System.out.println("Cau hoi cua ban se duoc tra loi som nhat: ");
                         break;
                    case 5:new AccountBank().Clear();
                         System.out.println("\t\tAbout!");
                         System.out.println("Ngan hang: TUNG Bank");
                         System.out.println("Version: 3.0");
                         System.out.println("Author: Jusst");
                         System.out.println("Website: www.tungit.com");
                         System.out.println("Lien he: \n\tEmail: tungit.2k4@gmail.com\n\tHotel: 0985332211");
                         break;
                    case 0:new AccountBank().Clear();
                         System.out.print("Good buye !");
                         break;
                    default:
                         System.out.println("Lua chon khong hop le!");
                         break;
               }
          }while(true);
     }
     
     //  menu
     public static void menu1(List<AccountBank> accounts, String fileAcc){
          String email=Input.nhap("Xac nhan Email: ",String.class);
          String name=Input.nhap("Xac nhan Name: ", String.class );
          boolean st=true;
          for (AccountBank acc : accounts) {
               if(email.equals(acc.getEmai()) && name.equals(acc.getName())){
                    while (true) {
                         String newmk=Input.nhap("Nhap mat khau moi: ",String.class);
                         String newmk2=Input.nhap("Xac nhan mat khau: ",String.class);
                         if(newmk.equals(newmk2)){
                              String fomat="name,year,email,sex,adrees,phone,cccd,pass,money,id";
                              String Data=(acc.getName()+","+acc.getYear()+","+acc.getEmai()+","+acc.getSex()
                                             +","+acc.getAdrees()+","+acc.getPhone()+","+acc.getCccd()+","+newmk
                                             +","+acc.getMoney()+","+acc.getId());
                              ModifyCSV.displayCSV(acc.getId(),fileAcc,fomat,Data);
                              System.out.println("Success!");
                              st=false;
                              break;
                         }
                         else{ System.out.println("Mat khau khong khop\nVui long nhap lai!");}
                         
                    }
               }if(st){
                    System.out.println("Email or Name sai !");
                    break;
               }
          }
     }
}