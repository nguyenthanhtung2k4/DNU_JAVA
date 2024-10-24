import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import Menu.Input;


public class Sigup {
     Scanner scanner = new Scanner(System.in);
     public Sigup(){};
     @SuppressWarnings("static-access")
     public Sigup(String FileACC){

          String file, name, email, sex, address, pass1, pass2;
               double money;
               int phone, year,id,cccd;
               file=FileACC;
               Random ran = new Random();
               System.out.println("Your username: ");
               name = scanner.nextLine();
               year = new Input().nhap("Nhap year:", Integer.class);
               System.out.println("Email: ");
               email = scanner.nextLine();
               System.out.println("Sex : \n\tBoy\n\tGirl");
               sex = scanner.nextLine();
               System.out.println("Your Address: ");
               address = scanner.nextLine();
               phone = new Input().nhap("Nhap Phone: ", Integer.class);
               cccd = new Input().nhap("Nhap cccd: ", Integer.class);
               id=ran.nextInt(1000)+100;
               do {
                    System.out.println("Password: ");
                    pass1 = scanner.nextLine();
                    System.out.println("Confirm password: ");
                    pass2 = scanner.nextLine();
                    if (pass1.equals(pass2)) {
                         break;
                    } else {
                         System.out.println("Password fail");
                    }
               } while (!pass1.equals(pass2));
               money = new Input().nhap("Money ", Double.class);
               WriteAccountBank(file, name, year, email, sex, address, phone,cccd, pass2, money,id);
     }
     //////////////////////////////
     public static void WriteAccountBank(String file,String name, int year, String email, String sex, String address, int phone,
               int cccd, String pass2, double money, int id) {
          try {
               FileWriter myWriter = new FileWriter(file, true);
               myWriter.write(name + "," + year + "," + email + "," + sex + "," + address + "," 
                         + phone + ","+cccd+"," + pass2
                         + "," + money +","+id+ "\n");
               myWriter.close();
          } catch (IOException e) {
               System.out.println("Error writing to file!");
               e.printStackTrace();
          }
     }
}