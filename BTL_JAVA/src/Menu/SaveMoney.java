package Menu;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SaveMoney extends AccountMoney{
     private double saveMoney,lai;
    
     // @SuppressWarnings("unused")
     private int han;
     private double TongMoney=0;
     
     public SaveMoney(String name, double money, int id) {
          super(name, money, id);
          this.saveMoney = 0;
     }
     public SaveMoney(String name, double money, int id, double saveMoney, double lai , int han, double tong) {
          super(name, money, id);
          this.saveMoney = saveMoney;
          this.lai=lai;
          this.han=han;
          this.TongMoney=tong;
     }
     public int getHan() {
          return han;
     }
     public double getLai(){
          return lai;
     }
     public void setHan(int han) {
          this.han = han;
     }
      public double getSaveMoney() {
          return saveMoney;
     }
     public void setSaveMoney(double saveMoney) {
          this.saveMoney = saveMoney;
     }
     public void setTong(double money, int han, double lai){
          this.han=han;
          this.lai=lai;
          this.saveMoney=money;
          this.TongMoney+=money+(money*han*lai);
     }
     public void setTongMoney(double tongMoney) {
          TongMoney = tongMoney;
     }
     public double getTong(){
          return TongMoney;
     }
     public void StringMoney(){
          System.out.println("Tai khoan: "+getName());
          if(saveMoney>0){
               System.out.println("So tien tiet kiem: "+saveMoney);
               System.out.println("Han: "+han);
               System.out.println("Lai: "+lai);
               System.out.println("Tong so tien can tra: "+TongMoney);
          }else{
               System.out.println("Hien tai ban khong gui tien tiet kiem!");
          }
     }

     public static Scanner scanner;
     public void displaySaveMoney(AccountMoney moneyAcc,String path){
          int choice;
          scanner= new Scanner(System.in);
          do {
               System.out.println("[0] Thoat");
               System.out.println("[1] Gui tien tiet kiem");
               System.out.println("[2] Rut tien tiet kiem");
               System.out.println("[3] Quan cac tiet kiem");
               System.out.print("Chuc nang (0-3): ");
               choice = scanner.nextInt();

               switch (choice) {
                    case 0:
                         String format = "id,name,saveMoney,lai,han,tongtien";
                         String data = (getId() + "," + getName() + "," + getSaveMoney() + "," + getLai() + "," + getHan() + "," + getTong());
                         ModifyCSV.displayCSV(moneyAcc.getId(), path, format, data);
                         System.out.println("Ban da thoat khoi chuc nang quan ly tien");
                         break;
                    case 1:
                         try{
                              System.out.println("Nhap so tien gui: ");
                              double money= scanner.nextDouble();
                              System.out.println("Nhap han( ngay): ");
                              int han= scanner.nextInt();
                              System.out.println("Nhap lai: ");
                              double lai=scanner.nextDouble();
                              if(moneyAcc.getMoney()>=money && money>0){
                                   lai=lai/100;
                                   setTong(money, han, lai);
                                   setSaveMoney(money);
                                   moneyAcc.setMoney(moneyAcc.getMoney()-money);
                                   moneyAcc.addHistory("SaveMoney| Money: "+money+" han: "+han+" ");

                              }else{
                                   System.out.println("Money khong hop le or money lon hon thuc te ");
                              }
                         } catch (InputMismatchException e) {
                              System.out.println("Nhap sai du lieu. Vui long nhap lai!");
                              scanner.next();
                         }
                         break;
                    case 2:
                         try {
                              // System.out.println("Nhap so tien rut: ");
                              // double money= scanner.nextDouble();
                              if(getTong()>=0){
                                   setTong(0, 0,0);
                                   moneyAcc.setMoney(moneyAcc.getMoney()+getTong());
                                   moneyAcc.addHistory("Withdraw| Money: "+getTong()+" ");
                                   setTongMoney(0);
                                   System.out.println("Tien da duoc gui ve stk! ");
                              }else{
                                   System.out.println("Money khong hop le or money lon hon thuc te ");
                              }
                         } catch (InputMismatchException e) {
                              System.out.println("Error : "+e.getMessage());
                         }
                         break;
                    case 3:
                         StringMoney();
                         break;
                    default:
                         System.out.println("Vui long chon lai  chuc nang");
                         break;
               }
          } while (choice != 0);
     }
}
