import java.util.ArrayList;
import java.util.Scanner;

import Menu.AccountBank;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chon;
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            BankAccount.ReadAccountBank();
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
                    BankAccount.CreateAccount();
                    break;
                case 2:
                    BankAccount.login();
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
    
}
