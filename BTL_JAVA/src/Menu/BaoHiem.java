package Menu;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BaoHiem extends AccountBank {
     public static Boolean statusBH=false;
     private String xe;
     private String bien;
     private int sobaohiemxe;
     private double phibaohiem,tienboithuong;
     public BaoHiem(){}
     public BaoHiem(int id, String name, double money,int chon,String bien){
          super(id, name, money);
          setXe(chon, bien);
     }
     public BaoHiem(int id,String name,double money,String xe,
     String bien,double phi,double tienboithuong,int sobaohiemxe){
          super(id,name,money);
          this.xe = xe;
          this.bien = bien;
          this.phibaohiem = phi;
          this.tienboithuong = tienboithuong;
          this.sobaohiemxe = sobaohiemxe;
     }
     public void setXe(int  choice ,String bien){
          if(choice==1){
               this.xe="Xemay";
               this.bien = bien;
               this.phibaohiem = 2.0;
               this.tienboithuong = 200.0;
               setSobaohiem();
          }else if(choice==2){
               this.xe="Moto";
               this.bien = bien;
               this.phibaohiem = 5.0;
               this.tienboithuong = 500.0;
               setSobaohiem();
          }else if(choice==3){
               this.xe="Oto";
               this.bien = bien;
               this.phibaohiem = 100.0;
               this.tienboithuong = 1000.0;
               setSobaohiem();
          } else if(choice==4){
               this.xe="XeKhach";
               this.bien = bien;
               this.phibaohiem = 300.0;
               this.tienboithuong = 3600.0;
               setSobaohiem();
          }
     }
     public void setPhi(double phi){
          this.phibaohiem = phi;
     }
     public void setTienboithuong(double tienboithuong){
          this.tienboithuong = tienboithuong;
     }
     public String getXe() { return xe; }
     public String getBien() { return bien; }
     public  void  setSobaohiem(){
          Random  ran=new  Random();
          this.sobaohiemxe = ran.nextInt(100000)+100000;
     }
     public int getSobaohiem() { return sobaohiemxe; }
     public double getPhi() { return phibaohiem; }
     public double getTienboithuong() { return tienboithuong;}
     public static Input input = new Input();

     public  static BaoHiem  BH;
     public static Map<String, Double>  map= new HashMap<>();
     public static Map<Integer, Double>  map2= new HashMap<>();
     @SuppressWarnings("static-access")
     public static void displayBaohiem(AccountBank Acc,AccountMoney moneyAcc){
          int choice;
          map.put("Xemay", 2.0);
          map.put("Moto", 5.0);
          map.put("Oto", 100.0);
          map.put("XeKhach", 300.0);
          do{
               System.out.println("[0]Thoat");
               System.out.println("[1]Mua bao hiem");
               System.out.println("[2]QuanLy bao hiem");
               System.out.println("[3]Boi thuong bao hiem");
               System.out.println("[4]Nang cap bao hiem");

               choice=input.nhap("Lua chon menu: ",Integer.class);
               switch (choice) {
                    case 1:   moneyAcc.Clear();
                         int luachon;
                         while (true) {
                              map2.put(1,2.0);map2.put(2,5.0);map2.put(3,100.0);map2.put(4,300.0);
                              
                              System.out.printf("%-10s%-10s%-10s%-10s\n", "Chon","Loai", "Gia", "BoiThuong");
                              System.out.printf("%-10s%-10s%-10s%-10s\n", "[1]","Xe may", "2.0$", "200.0$");
                              System.out.printf("%-10s%-10s%-10s%-10s\n", "[2]","Motto", "5.0$", "550.0$");
                              System.out.printf("%-10s%-10s%-10s%-10s\n", "[3]","Oto", "100.0$", "1000.0$");
                              System.out.printf("%-10s%-10s%-10s%-10s\n", "[4]","XeKhach", "300.0$", "3600.0$");
                              System.out.printf("%-10s=>%-10s\n", "[0]","Thoat");
                              luachon=Input.nhap("Lua chon loai xe", Integer.class);
                              if(luachon==0){break;}// thoat khong chon bao hiem nao  ca
                              String bien=input.nhap("Nhap bien so xe: ",String.class);
                              BH= new BaoHiem(Acc.getId(), Acc.getName(), Acc.getMoney(),luachon, bien);
                              statusBH=true;
                              // tru tien trong moneyAcc
                              try {
                                   moneyAcc.setMoney(moneyAcc.getMoney()-map2.get(choice));
                              } catch (Exception e) {
                                   System.out.println("So tien khong du !");
                                   break;
                              }
                              break;
                         }
                         if(statusBH){
                              moneyAcc.addHistory("BaoHiem | Mua Bao hiem phi: "+BH.getPhi()+" Bien so: "+BH.getBien());
                              System.out.println("Ban da mua thanh cong! ");
                              System.out.printf("%10s%15s%10s%n","Loai Xe","So bao hiem","BienSo");            
                              System.out.printf("%10s%10d%10s%n",BH.getXe(),BH.getSobaohiem(),BH.getBien());            
                         }else{System.out.println("Ban da khong mua bao hiem nao !");}
                         break;
                    case 2:moneyAcc.Clear();
                         System.out.println("\n\tQuan Ly bao hiem");
                         try{
                              System.out.print("\nLoai xe: "+BH.getXe()+"\nPhi bao hiem: "+BH.getPhi()+"\nBoiThuong: "+BH.getTienboithuong()+"\n");
                         }catch(Exception e){System.out.println("Chua co bao hiem xe");}
                         break;
                    case 3:moneyAcc.Clear();
                         System.out.println("\nBoi thuong");
                         if(statusBH){
                              String lydo = Input.nhap("Lydo  boi thuong: ",String.class);
                              while (true) {
                                   String bienso=Input.nhap("Nhap bien xe: ",String.class);
                                   if(bienso.equals(BH.getBien())){
                                        moneyAcc.setMoney(moneyAcc.getMoney()+BH.getTienboithuong());
                                        moneyAcc.addHistory("Boithuong | Ly do: "+lydo+" So tien BoiThuong: "+BH.getTienboithuong());
                                        statusBH=false;//   xoa bao hiem di. 
                                        System.out.printf("%10s%15s%25s%25s%n","Loai Xe","So bao hiem","Lydo","Boithuong");            
                                        System.out.printf("%10s%10d%25s%25f%n",BH.getXe(),BH.getSobaohiem(),lydo,BH.getTienboithuong());  
                                        System.out.println("Da boi thuong thanh cong");
                                        break;
                                   }else{
                                        System.out.println("Khong tim thay bien so xe!");
                              }
                         }}else{System.out.println("Chx co bao hiem nao!");}
                         break;
                    case 4:moneyAcc.Clear();
                         System.out.println("\nNang cap bao hiem\n");
                         if(statusBH){
                              while(true){
                                   double tien = Input.nhap("Nhap tien can nang cap: ",Double.class);
                                   String xe= BH.getXe();
                                   Double check = map.get(xe);
                                   if(check!=null && tien>=check){
                                        BH.setPhi(tien);
                                        BH.setTienboithuong(tien*100);
                                        moneyAcc.addHistory("Nangcap | So tien nang cap: "+tien);
                                        System.out.println("Da nang cap phi bao hiem thanh cong");
                                        try {
                                             moneyAcc.setMoney(moneyAcc.getMoney()-tien);
                                        } catch (Exception e) {
                                             System.out.println("Khong du tien trong tai khoan");
                                             break;
                                        }
                                        break;
                                   }else{
                                        System.out.printf("Tien phai lon hon %f va no hon $f ",check,BH.getTienboithuong());
                                   }
                              }
                         }else{System.out.println("Khong co bao hiem nao!");}
                         break;
                    case 0:moneyAcc.Clear();
                         
                         System.out.println("Good bye !");
                         break;
                    default:
                         break;
               }
          }while(choice!=0);
     }
     public class displayBaohiem {}
}