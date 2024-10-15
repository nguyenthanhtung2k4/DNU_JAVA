import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static AccountBank AccBank;
    public static List<AccountBank> accounts = new ArrayList<>();
    public static final String FileAcc = "accounts.csv";
    public static Scanner scanner;

    public static void main(String[] args) throws Exception {
        int nhap;
        scanner= new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        do{

            ReadAccountBank();
            System.out.println("Welcome to  Banking");
            System.out.println("[1] Creat Acount Bank");
            System.out.println("[2] Login Bank");
            System.out.println("[3] Exit Bank");
            System.out.print("Chon menu: ");
            nhap= scanner.nextInt();
            switch (nhap){
                case 1:
                    new Sigup(FileAcc);
                    break;
                case 2:
                    new Login(accounts);
                    break;
                    
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    accounts.clear();
                    System.out.println("Exit Bank");
                    break;

                default:
                    System.out.println("Sai nhap. Vui long nhap lai");
            }
        }while(nhap!=3);
    }
    ///////////////////////////////////
    public static void ReadAccountBank() {
          try {
               Scanner myReader = new Scanner(new File(FileAcc));
               while (myReader.hasNextLine()) {
                    String line = myReader.nextLine();
                    String[] data = line.split(",");
                    if (data.length == 8) {
                        String name = data[0];
                        int year = Integer.parseInt(data[1]);
                        String email = data[2];
                        String sex = data[3];
                        String address = data[4];
                        int phone = Integer.parseInt(data[5]);
                        String password = data[6];
                        double money = Double.parseDouble(data[7]);

                        AccountBank acc = new AccountBank(name, year, email, sex, address, phone, password, money);
                        accounts.add(acc);
                    }
               }
               myReader.close();
          } catch (IOException e) {
               System.out.println("An error occurred while reading the file.");
               e.printStackTrace();
          }
     }
}
