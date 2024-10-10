
import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static ArrayList<AccountBank> accounts = new ArrayList<>();   //  khoi  tao  mang luu  tru kie account bank 
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
                case 3:
                    System.out.println("Good bye !");
                    break;
                default:
                    System.out.println("Vui long chon lai !");
                    break;
            }
        } while (chon!=3);
    }
//  Create  account  bank
    public static  void creatAccount(){
        String  name, email , sex , adrees , pass1, pass2; double money; int phone;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Your  username: ");
        name = scanner.nextLine();
        System.out.println("Email: ");
        email = scanner.nextLine();
        System.out.println("Sex : \n\tBoy\n\tGirl");
        sex= scanner.nextLine();
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
        AccountBank login= new  AccountBank(name, email, sex , adrees, phone, pass2, money);
        accounts.add(login);
        System.out.println(login.toString());

    }

//  Login 
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        AccountBank login= new AccountBank();
        System.out.println("tung: "+ login.getPassword());
        System.out.println("Email: ");
        String email= scanner.nextLine();
        System.out.println("Password: ");
        String pass= scanner.nextLine();
        boolean isSet= false;
        AccountBank Acc;
        // AccountBank account;
        for(AccountBank acc : accounts){
            if(acc.getEmai().equals(email)&& acc.getPassword().equals(pass)){
                isSet= true;
                Acc=acc;
                break;
            }
        }
        if(isSet){
            System.out.println("Login  Sussec");
        }else{
            System.out.println("Login Fail");
        }
    }

}
