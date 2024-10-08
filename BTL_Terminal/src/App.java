
import java.util.Scanner;


public class App {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // creatAccount();
        // login();
        int chon;
        do {
            System.out.println("[1] Creat Acount Bank");
            System.out.println("[2] Login Bank");
            System.out.println("[3] Exit Bank");
            System.out.println("Chon menu: ");
            chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    creatAccount();

                    break;
                case 2:
                    login();
                    break;
                default:
                    System.out.println("Vui long chon lai !");
                    break;
            }
        } while (chon!=3);
    }
//  Create  account  bank
    public static  void creatAccount(){
        String  name, email, adrees , pass1, pass2; double money; int phone;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Your  username: ");
        name = scanner.nextLine();
        System.out.println("Email: ");
        email = scanner.nextLine();
        System.out.println("Your  Adrees: ");
        adrees = scanner.nextLine();
        System.out.println("Your  Phone: ");
        phone = scanner.nextInt();
        scanner.nextLine();
        do{
            System.out.println("password 1: ");
            pass1 = scanner.nextLine();
            System.out.println("password 2 ");
            pass2 = scanner.nextLine();
            if(pass1.equals(pass2)){
                break;
            }else{
                System.out.println("Password khong khop"); 
            }

        }while(pass1 != pass2);
        System.out.println("Money");
        money = scanner.nextDouble();
        AccountBank login= new  AccountBank(name, email , adrees, phone, pass2, money);
        System.out.println(login.toString());
        login.setMoney(3000 );
        System.out.println(login.toString());

    }

//  Login 
    public static void login(){
        @SuppressWarnings("unused")
        String email,pass;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Email: ");
        email = scanner.nextLine();
        System.out.println("Your Password: ");
        pass = scanner.nextLine();

        AccountBank bank =  new AccountBank(email, pass); 
        double tien=bank.getMoney();
        System.out.println("Tien:"+ tien);
    }

}
