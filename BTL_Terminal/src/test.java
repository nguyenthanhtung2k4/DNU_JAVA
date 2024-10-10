import java.util.ArrayList;
import java.util.Scanner;

public class test {

    public static Scanner scanner = new Scanner(System.in);
    // Danh sách các tài khoản ngân hàng
    public static ArrayList<AccountBank> accounts = new ArrayList<>();

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("[1] Create Account Bank");
            System.out.println("[2] Login Bank");
            System.out.println("[3] Exit Bank");
            System.out.println(" menu: ");
            chon = scanner.nextInt();
            scanner.nextLine(); 

            switch (chon) {
                case 1:
                    creatAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("nhap lia !");
                    break;
            }
        } while (chon != 3);
    }


    public static void creatAccount() {
        String name, email, sex, adrees, pass1, pass2;
        double money;
        int phone;

        System.out.println("Your username: ");
        name = scanner.nextLine();
        System.out.println("Email: ");
        email = scanner.nextLine();
        System.out.println("Sex: \n\tBoy\n\tGirl");
        sex = scanner.nextLine();
        System.out.println("Your Address: ");
        adrees = scanner.nextLine();
        System.out.println("Your Phone: ");
        phone = scanner.nextInt();
        scanner.nextLine(); 


        do {
            System.out.println("Password 1: ");
            pass1 = scanner.nextLine();
            System.out.println("Password 2: ");
            pass2 = scanner.nextLine();
            if (!pass1.equals(pass2)) {
                System.out.println("Passwords No");
            }
        } while (!pass1.equals(pass2));

        System.out.println("Money: ");
        money = scanner.nextDouble();
        scanner.nextLine(); 


        AccountBank newAccount = new AccountBank(name, email, sex, adrees, phone, pass2, money);
        accounts.add(newAccount);
        System.out.println("Sussec");
        System.out.println(newAccount.toString());
    }


    public static void login() {
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String pass = scanner.nextLine();


        AccountBank foundAccount = null;
        for (AccountBank account : accounts) {
            if (account.getEmai().equals(email) && account.getPassword().equals(pass)) {
                foundAccount = account;
                break;
            }
        }


        if (foundAccount != null) {
            System.out.println("Susuccs");
            System.out.println("Name: " + foundAccount.getName());
            System.out.println("Adrees: " + foundAccount.getAdrees());
            System.out.println("Money : " + foundAccount.getMoney());
        } else {
            System.out.println("Fail");
        }
    }
}
