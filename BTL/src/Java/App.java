package Java;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int chon;
          do {
               System.out.print("\033[H\033[2J");
               System.out.flush();

               Login.ReadAccountBank();
               System.out.println("Welcome to  Banking");
               System.out.println("[1] Creat Acount Bank");
               System.out.println("[2] Login Bank");
               System.out.println("[3] Exit Bank");
               System.out.println("Chon menu: ");
               chon = scanner.nextInt();
               
               System.out.print("\033[H\033[2J");
               System.out.flush();
               
               switch (chon) {
                    case 1:
                         checkFile();
                         CreateAccount create = new CreateAccount();
                         create.Sigup();
                         break;
                    case 2:
                         // new Login();
                         break;
                    case 3:
                         System.out.println("Good bye !");
                         break;
                    default:
                         System.out.println("Vui long chon lai !");
                         break;
               }
          } while (chon!=3);
    
     }
     public static void checkFile(){
          try {
               File myObj = new File("Acc_Bank.csv");
               if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
               } else {
                    System.out.println("File already exists.");
               }
          } catch (IOException e) {
               System.out.println("An error occurred.");
               e.printStackTrace();
          }
     }
}
