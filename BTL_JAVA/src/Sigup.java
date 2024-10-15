import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sigup {
     Scanner scanner = new Scanner(System.in);
     public Sigup(String FileACC){

          String file, name, email, sex, address, pass1, pass2;
               double money;
               int phone, year;
               file=FileACC;

               System.out.println("Your username: ");
               name = scanner.nextLine();
               System.out.println("Your Year: ");
               year = scanner.nextInt();
               scanner.nextLine();
               scanner.nextLine();
               System.out.println("Email: ");
               email = scanner.nextLine();
               System.out.println("Sex : \n\tBoy\n\tGirl");
               sex = scanner.nextLine();
               System.out.println("Your Address: ");
               address = scanner.nextLine();
               System.out.println("Your Phone: ");
               phone = scanner.nextInt();
               scanner.nextLine();

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

               System.out.println("Money");
               money = scanner.nextDouble();
               WriteAccountBank(file, name, year, email, sex, address, phone, pass2, money);
     }
     //////////////////////////////
     public static void WriteAccountBank(String file,String name, int year, String email, String sex, String address, int phone,
               String pass2, double money) {
          try {
               FileWriter myWriter = new FileWriter(file, true);
               myWriter.write(name + "," + year + "," + email + "," + sex + "," + address + "," + phone + "," + pass2
                         + "," + money + "\n");
               myWriter.close();
          } catch (IOException e) {
               System.out.println("Error writing to file!");
               e.printStackTrace();
          }
     }
}
