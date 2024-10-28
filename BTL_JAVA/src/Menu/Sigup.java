package Menu;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
public class Sigup {
     Scanner scanner = new Scanner(System.in);
     public Sigup(){};
     
     @SuppressWarnings("static-access")
     public Sigup(String FileACC, List<AccountBank>  accounts){
          String file, name, email, sex, address, pass1, pass2;
          double money;
          int phone, year,id,cccd;
          // Random ran = new Random();
          // id=ran.nextInt(1000)+100;
          file=FileACC;
          name = new Input().nhap("Your username: ",String.class);
          year = new Input().nhap("Nhap year:", Integer.class);
          boolean s_email;int dem=1;
          do{
               s_email=false;
               email = new Input().nhap("Email your: ",String.class);
               for (AccountBank acc : accounts) {
                    dem+=1;
                    if(acc.getEmai().equals(email)){
                         System.out.println("Email da ton tai\nVui long nhap lai!");
                         s_email=true;
                         break;
                    }
               }
          }while(s_email);
          id=dem+1000; //  user thu  (id=so  user)
          sex = new Input().nhap("Sex : (Boy/Girl):\n\t",String.class);
          address = new Input().nhap("Your Address:",String.class);
          phone = new Input().nhap("Nhap Phone: ", Integer.class);
          cccd = new Input().nhap("Nhap cccd: ", Integer.class);
          do { 
               pass1 = new Input().nhap("Password: ",String.class);
               pass2 = new Input().nhap("Confirm password: ",String.class);
               if (pass1.equals(pass2)) {
                    break;
               } else {
                    System.out.println("Password fail");
               }
          } while (!pass1.equals(pass2));
          money = new Input().nhap("Money ", Double.class);
          WriteAccountBank(file, name, year, email, sex, address, phone,cccd, pass2, money,id);
          AccountBank bank = new AccountBank();
          bank.Clear();
          System.out.println("Dang ky thanh cong!");
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