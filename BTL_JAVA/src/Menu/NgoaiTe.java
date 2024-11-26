package Menu;
import java.util.Map;
public class NgoaiTe extends AccountMoney{
     private double ngoaite;
     private double phi;
     // private  Map<Double,Double> map= new HashMap<Double,Double>();
     // map.get(1000,0.1)
     public NgoaiTe(){}
     public NgoaiTe(String name, double initialMoney,int id, Double ngoaite) {
          super(name, initialMoney, id);
          this.ngoaite = ngoaite;
          if(phi<=1000){this.phi =0;}
          else if(phi>=1000){this.phi =0.2;}
          else if(phi>10000){this.phi =0.5;}
     }
     public double getNgoaite() {
          return ngoaite;
     }
     public double getPhi() {
               return (phi*ngoaite)+ngoaite;
     }
     public static NgoaiTe ngoai=null;
     public static Input input= new Input();
     @SuppressWarnings("static-access")
     public static void displayNgoaiTe(AccountMoney moneyAcc){
          int choice;
          do{
               System.out.println("[0] Thoat");
               System.out.println("[1] Chuyen tien ngoai te");
               System.out.println("[2] Quy doi tien");
               choice=input.nhap("Choice: ",Integer.class);
               switch (choice) {
                    case 1:moneyAcc.Clear();
                         menu1(moneyAcc);
                         break;
                    case 2:moneyAcc.Clear();
                         menu2(moneyAcc);
                         break;
                    case 0:moneyAcc.Clear();
                         System.out.println("Thoat quy doi tien! ");
                         break;
               
                    default:
                         break;
               }
          }while(choice!=0);
     }
     // /////////////// menu ///////////////
     @SuppressWarnings("static-access")
     public static  void menu1(AccountMoney moneyAcc){
          System.out.println("Chuyen ngoai te\n");
          int  stk= input.nhap("So tai khoan: ",Integer.class);
          while (true) {
               double tien=input.nhap("Nhap so tien chuyen: ",Double.class);
               if(tien>moneyAcc.getMoney()){
                    System.out.println("So khong du !");
               }else{
                    ngoai= new NgoaiTe(moneyAcc.getName(),moneyAcc.getMoney(),moneyAcc.getId(),tien);
                    moneyAcc.setMoney(moneyAcc.getMoney()-ngoai.getPhi());
                    moneyAcc.addHistory("ChuyeTienTe | SoTien chuyen: "+tien+" STK: "+stk);
                    System.out.printf("Chuyen tien thanh cong!\nSo tien %.2f Chuyen den  stk: %d%n",tien,stk);
                    System.out.println("So du con lai: "+moneyAcc.getMoney());
                    break;
               }
          }
     }
     public static Map<Integer, Map<String, Object>> map = Map.of(
        1, Map.of("name", "Vietnamese", "rate", 24000.0,"kitu","VN"),
        2, Map.of("name", "Chinese", "rate", 3563.0,"kitu","CNY"),
        3, Map.of("name", "Korean", "rate", 18.0,"kitu","KRW"),
        4, Map.of("name", "Japanese", "rate", 167.0,"kitu","JPY"),
        5, Map.of("name", "Taiwanese", "rate", 791.0,"kitu","TWD")
     );
     @SuppressWarnings("static-access")
     public static void menu2(AccountMoney moneyAcc) {
          System.out.println("\n\tQuy doi tien te");
          System.out.println("[1] Sang Vietnamese");
          System.out.println("[2] Sang Chinese");
          System.out.println("[3] Sang Korean");
          System.out.println("[4] Sang Japanese");
          System.out.println("[5] Sang Taiwanese");
          int choice = input.nhap("Choice: ", Integer.class);

          while (true) {
               if (map.containsKey(choice)) {
                    double tien = input.nhap("So tien: ", Double.class);
                    Map<String, Object> data = map.get(choice);
                    double tienQuyDoi = (double)data.get("rate");
                    tienQuyDoi*=tien;
                    String country =(String) data.get("name");
                    String kitu =(String) data.get("kitu");
                    System.out.printf("So tien quy doi\nSang %s la: %.2f %s\n", country, tienQuyDoi,kitu);
                    moneyAcc.addHistory("QuyDoiTienTe | SoTien: "+tien+" Id: "+moneyAcc.getId());                    
                    break;
               } else {
                    System.out.printf("Lua chon %d hien khong co\n", choice);
                    System.out.println("Vui long 'Quy doi tien' co trong muc");
               }
          }
     }
}