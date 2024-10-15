package Java.opp.menu;

public class AllMenu {
     public AllMenu(){}
     public void displayMenu(){
          System.out.println("All Menu:");
          System.out.println("1. Thêm tài khoản ngân hàng");
          System.out.println("2. Thêm tài khoản tiền mặt");
          System.out.println("3. Thêm th�� tín dụng");
          System.out.println("4. Rút tiền");
          System.out.println("5. Xem lịch sử giao dịch");
          System.out.println("6. Thoát");
          System.out.println("Chọn chức năng:");
          int choice = new java.util.Scanner(System.in).nextInt();
          switch(choice){
               case 1:
                    // Thêm tài khoản ngân hàng
                    break;
               case 2:
                    // Thêm tài khoản tiền mặt
                    break;
               case 3:
                    // Thêm th�� tín dụng
                    break;
               case 4:
                    // Rút tiền
                    break;
               case 5:
                    // Xem lịch sử giao dịch
                    break;
               case 6:
                    // Thoát
                    System.exit(0);
                    break;
     
                    default:
                         System.out.println("Vui lòng chọn lại chức năng.");
                         break;
          
          }
     }
}
