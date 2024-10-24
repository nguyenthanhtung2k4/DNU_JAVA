import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Menu.AccountBank;
import Menu.AccountMoney;
public class Main {
    public static AccountMoney moneyAcc;
    public static List<AccountBank> accounts = new ArrayList<>();
    private static final String FileAcc = "./Data/accounts.csv";
    private static final String FileCard= "./Data/card.csv";
    private static final String FileVayVon = "./Data/vayvon.csv";
    private static final String FileMoney = "./Data/savemoney.csv";
    public static Scanner scanner;
    public static void main(String[] args) throws Exception {
        scanner= new Scanner(System.in);
        CheckFile(FileAcc);
        CheckFile(FileCard);
        CheckFile(FileVayVon);
        CheckFile(FileMoney);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        while (true) {
            FileAccounts();
            System.out.println("Welcome to Banking");
            System.out.println("[1] Create Account Bank");
            System.out.println("[2] Login Bank");
            System.out.println("[0] Exit Bank");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Vui Long nhap so !");
                scanner.nextLine(); // Clear invalid input from buffer
                continue;
            }
            moneyAcc= new AccountMoney();
            switch (choice) {
                case 0:
                    moneyAcc.Clear();
                    System.out.println("Exit Bank");
                    return;
                case 1:
                    moneyAcc.Clear();
                    new Sigup(FileAcc);
                    break;
                case 2:
                    moneyAcc.Clear();
                    new Login(accounts);
                    break;
                default:
                    System.out.println("Sai nhap. Vui long nhap lai");
            }
        }
    }
    ///////////////////////////////////
    public static void CheckFile(String fileData){
        File file = new File(fileData);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
            }
        }
    }
    ///////////////////////////////////
    public static void FileAccounts() {
        try {
            File myObj = new File("./Data/accounts.csv");
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] data = line.split(",");
                String name = data[0];
                int year = Integer.parseInt(data[1]);
                String email = data[2];
                String sex = data[3];
                String address = data[4];
                int cccd = Integer.parseInt(data[5]);
                int phone = Integer.parseInt(data[6]);
                String password = data[7];
                double money = Double.parseDouble(data[8]);
                int id = Integer.parseInt(data[9]);
                // System.out.println("name : " + name + " id: " + id);
                AccountBank acc = new AccountBank(name, year, email, sex, address, phone, cccd, password, money, id);
                accounts.add(acc);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}