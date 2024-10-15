import java.util.Scanner;

public class Menu {
     public Menu(){}
     public void displayMenu() {
          System.out.println("Welcome to our restaurant!");
          System.out.println("Our menu:");
          System.out.println("1. Pasta Carbonara - $12.99");
          System.out.println("2. Pizza Margherita - $14.99");
          System.out.println("3. Salad - $9.99");
          System.out.println("4. Pasta Bolognese - $13.99");
          System.out.println("5. Pizza Capricciosa - $15.99");
          System.out.println("6. Exit");
          System.out.print("Please choose an option (1-6): ");
          Scanner   scanner = new Scanner(System.in);
          int choice = scanner.nextInt();
          switch (choice) {
                case 1:
                AccountMoney account = new AccountMoney("tung", 23.99);
                CreditCard card = new CreditCard("tung", 1000, 200);
                card.showHistory();
                account.getMoney();
                     System.out.println("Pasta Carbonara added to your order.");
                     break;
                case 2:
                     System.out.println("Pizza Margherita added to your order.");
                     break;
                case 3:
                     System.out.println("Salad added to your order.");
                     break;
                case 4:
                     System.out.println("Pasta Bolognese added to your order.");
                     break;
                case 5:
                     System.out.println("Pizza Capricciosa added to your order.");
                     break;
                case 6:
                     System.out.println("Thank you for your order!");
                     System.exit(0);
                default:
                     System.out.println("Invalid option. Please try again.");
          }
     }
}
