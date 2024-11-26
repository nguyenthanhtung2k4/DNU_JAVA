package Menu;

abstract class Nap extends AccountMoney {
     public abstract double NapTien(AccountMoney acc, double tien);

     public abstract double RutTien(AccountMoney acc, double tien);
}

     
public class NapRut extends Nap{
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