package Menu;

import java.util.Scanner;


public class VayVon extends AccountMoney {
     // @SuppressWarnings("unused")
     private double vay, lai, tong;

     // @SuppressWarnings("unused")
     private boolean status;
     private int han;
     String name;
    
     public VayVon(String name, double  money){
          super(name, money);
          this.name = name;
     }
     public VayVon(String name, double  money, Double vay,double lai, int han){
          super(name, money);
          this.vay = vay;
          this.han = han;
          this.lai = lai/100;
          this.name = name;
     }
     public void payVayVon(double money){
          if(money<= tong ||  money >=0){
               tong-= money;

          }else{System.out.println("Khong hop le");}
     }
     public void  TongVayVon(){
          System.out.println("Name: " + name);
          System.out.println("Tong so tien phai tra la: " + tong);
          System.out.println("\tSo tien Vay: " + vay+"\n\tLai: "+lai+" ki han: "+han);
     }
     public int getHan() {
          return han;
     }
     public void setHan(int han) {
          this.han = han;
     }
     public double getVay() {
          return vay;
     }
     public void setVay(double vay) {
          this.vay = vay;
     }
     public double getLai() {
          return lai;
     }
     public void setLai(double lai) {
          this.lai = lai/100;
     }
     public double getTong() {
          return tong;
     }
     public void setTong(double vay, double lai , double han) {
          this.tong =vay+ ((vay*lai));
     }

     public void printVayVon() {
          System.out.println("Tong tien tra: "+tong+"\nTien hang thang: "+tong/han);
     }


     Scanner   scanner = new Scanner(System.in);
     public void displayVayVon(AccountMoney moneyAcc ,String time){
          int choice;
          do{
               // System.out.println("Vay Von\n");
               System.out.println("[0] Thoat");
               System.out.println("[1] Vay Von");
               System.out.println("[2] ThanhToan khoan vay");
               System.out.println("[3] Quan ly Khoan vay");
               System.out.print("Chon chuc nang (0-3): ");
               choice = scanner.nextInt();
               switch (choice) {
                    case 0:
                         System.out.println("Thoat");
                         break;
                    case 1:
                         case1(moneyAcc);
                         break;
                    case 2:
                         System.out.println("Pay khoan vay\n");
                         System.out.println("Nhap so tien tra: ");
                         double pay = scanner.nextDouble();
                         if(getMoney()>=0 && getMoney()>=pay){
                              setMoney(getMoney() - pay);
                              tong-=pay;
                              System.out.println("Da thanh toan thanh cong! \n So no con lai:" + tong);
                              payVayVon(pay);
                              addHistory("Pay VayVon| Pay: "+pay+"Now: "+time);
                         }
                         break;
                    case 3:
                         System.out.println("Quan Ly VayVon");
                         if(status==true){TongVayVon();break;}
                         System.out.println("Hien ban khong co khoan vay nao");
                         System.out.println("Bat dau khoan vay ngay\n \tNhan >>'OK'<< bat dau  Vay Von");
                         String ok = scanner.next();
                         if(ok.equalsIgnoreCase("OK")){
                              case1(moneyAcc);
                         }
                         break;

                    default:
                         System.out.println("Vui long chon lai chuc nang.");
                         break;
               }
          }while(choice!=0);
     }
     ///////////////////////////////////////
     public void case1(AccountMoney moneyAcc){
          System.out.println("Welcome to  Loan\n");
          if (status==false){
               System.out.println("Nhap so tien vay: ");
               vay = scanner.nextDouble();
               System.out.println("Nhap lai suat (vd: 10 ~ 10%)");
               lai = scanner.nextDouble();lai/=100;
               System.out.println("Nhap Ki han (vd: 1 thang ): ");
               han = scanner.nextInt();
               setTong(vay, lai,han);
               printVayVon();
               status=  true;
          }else{
               System.out.println("Ban da vay roi !\n Vui Long thanh toan khoan vay de vay von tiep\n");
          }
     }
}
