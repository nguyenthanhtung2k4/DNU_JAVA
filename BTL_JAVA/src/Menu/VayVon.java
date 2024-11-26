package Menu;
import java.util.Scanner;
public class VayVon extends AccountMoney {
     private double vay, lai, tong;
     private boolean status = false; 
     private int han;
     String name;
     public VayVon(String name, double money, int id) {
          super(name, money, id);
          this.name = name;
     }
     public VayVon(String name, double money, Double vay, double lai, int han) {
          super(name, money);
          this.vay = vay;
          this.han = han;
          this.lai = lai / 100;
          this.name = name;
          this.status = true; 
     }
     public VayVon(int id, String name, double money, Double vay, double lai, int han, double tong) {
          super(name, money, id);
          this.vay = vay;
          this.han = han;
          this.lai = lai / 100;
          this.name = name;
          this.tong = tong;
          this.status = tong > 0; 
     }
     public double getLai() {
          return lai;
     }
     public void setLai(double lai) {
          this.lai = lai;
     }
     public double getVay() {
          return vay;
     }
     public void setVay(double vay) {
          this.vay = vay;
     }
     public int getHan() {
          return han;
     }
     public void setHan(int han) {
          this.han = han;
     }
     public double getTong() {
          return tong;
     }
     public void setTong(double tong) {
          this.tong = tong;
     }
     public void payVayVon(double money) {
          if (money <= tong && money >= 0) {
               tong -= money;
               
               System.out.println("Da thanh toan: " + money);
               System.out.println("So tien con lai can tra: " + tong);
               if (tong == 0) {
                    status = false;
                    System.out.println("Thanh toan thanh cong");
               }
          } else {
               System.out.println("Thanh toan khong hop  le.");
          }
     }
     public boolean isStatus() {
          return status;
     }
     public void setStatus(boolean status) {
          this.status = status;
     }
     public void setTong(double vay, double lai, double han) {
          this.tong = vay + ((vay * lai));
          this.status = true; 
     }
     public void TongVayVon() {
          System.out.println("Name: " + name);
          System.out.println("Tong so tien can tra: " + tong);
          System.out.println("\tSo tien vay: " + vay + "\n\tLai suat: " + (lai * 100) + "%\n\tKy han: " + han + " thang");
     }
     public void printVayVon() {
          System.out.println("Ton tien can tra: " + tong + "\nTien tra hang thang" + tong / han);
     }
     Scanner scanner = new Scanner(System.in);

     public void displayVayVon(AccountMoney moneyAcc, String time, String file) {
          int choice;
          do {
               System.out.println("[0] Thoat");
               System.out.println("[1] Vay von");
               System.out.println("[2] Thanh toan khoan vay");
               System.out.println("[3] Quan ly vay");
               System.out.print("Chuc nang (0-3): ");
               choice = scanner.nextInt();

               switch (choice) {
                    case 0:
                         String format = "id,name,vay,lai,han,tong";
                         String data = (getId() + "," + getName() + "," + getVay() + "," + getLai() + "," + getHan() + "," + getTong());
                         ModifyCSV.displayCSV(moneyAcc.getId(), file, format, data);
                         if(getTong()==0){
                            status=false;  
                         }
                         System.out.println("thoat");
                         break;
                    case 1:
                         case1(moneyAcc, file);
                         break;
                    case 2:
                         System.out.println("Thanh toan Vay\n");
                         System.out.println("Nhap so tien thanh toan: ");
                         double pay = scanner.nextDouble();
                         if (pay > 0 && pay <= moneyAcc.getMoney()) {
                              payVayVon(pay);
                              moneyAcc.setMoney(moneyAcc.getMoney()-pay);
                         } else {
                              System.out.println("So tien khong hop le");
                         }
                         break;
                    case 3:
                         System.out.println("Quan ly vay");
                         if (isStatus()) {
                              TongVayVon();
                         } else {
                              System.out.println("Hien khong co Khoan Vay nao");
                              System.out.println("Bat dau khoan vay NHAN -->  'Ok' ");
                              String ok = scanner.next();
                         if (ok.equalsIgnoreCase("OK")) {
                              case1(moneyAcc, file);
                         }
                         }
                         break;
                    default:
                         System.out.println("Vui long chon lai  chuc nang");
                         break;
               }
          } while (choice != 0);
     }


     public void case1(AccountMoney moneyAcc, String path) {
          System.out.println("Vay Von\n");
          if (!isStatus()) { 
               System.out.println("Nhap tien: ");
               vay = scanner.nextDouble();
               System.out.println("Nhap lai (vd: 10 ~ 10%): ");
               lai = scanner.nextDouble() / 100;
               System.out.println("Nhap ki han (Thang): ");
               han = scanner.nextInt();
               setTong(vay, lai, han);
               moneyAcc.setMoney(moneyAcc.getMoney() + vay);
               printVayVon();
               // String write = (getId() + "," + getName() + "," + getVay() + "," + getLai() + "," + getHan() + "," + getTong() + "\n");
               // AccountMoney.writeFile(path, write);
               setStatus(true); 
               
          } else {
               System.out.println("Ban da co  khoan vay! ");
          }
     }
}
