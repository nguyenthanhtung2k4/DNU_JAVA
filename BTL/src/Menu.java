import java.util.Scanner;

public class Menu {
     static AccountBank Acc;
     public static void AllMenu() {
          System.out.println("1. Thong tin");
          System.out.println("2. Chuyen tien");
          System.out.println("3. Nap tien");
          System.out.println("4. Rut Tien");
          System.out.println("5. The tin dung");
          System.out.println("6.Vay von va tra no");
          
     }
     public static void displayMenu(AccountBank AccBank){
          Acc = AccBank;
          System.out.println("Welcome to "+ AccBank.getName() +" Banking");
          int choice;
          do{
               AllMenu();
               System.out.print("Chon chuc nang (1-6): ");
               // int choice=Menu.getInt();
               Scanner scanner= new Scanner(System.in);
               choice=scanner.nextInt();
               
               switch(choice){
                    case 1:
                         Thongtin();
                         
                         
                         break;
                    // case 2:
                    //      new ChuyenTien().display();
                    //      break;
                    // case 3:
                    //      new NapTien().display();
                    //      break;
                    // case 4:
                    //      new RutTien().display();
                    //      break;
                    // case 5:
                    //      new TheTinDung().display();
                    //      break;
                    // case 6:
                    //      new VayVon().display();
                    //      break;
                    default:
                         System.out.println("Vui long chon lai chuc nang.");
                         break;
               }
          }while(choice!=0);
     
     }

     public static void Thongtin(){
          System.out.println("Ten: "+Acc.getName());
          System.out.println("So tien: "+Acc.getMoney());
     }

}
