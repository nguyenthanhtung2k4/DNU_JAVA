import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Data.srcData;
import Menu.AccountBank;
import Menu.AccountMoney;
import Menu.Admin;
import Menu.Input;
import Menu.Login;
import Menu.Sigup;
import Menu.Support;
public class Main {
    public static AccountMoney moneyAcc;
    public static List<AccountBank> accounts = new ArrayList<>();
    private static final String FileAcc = new srcData().getAccounts() ;
    private static final String FileCard= new srcData().getCard() ;
    private static final String FileVayVon = new srcData().getVayvon() ;
    private static final String FileMoney = new srcData().getSavemoney() ;
    public static Scanner scanner;
    public static void main(String[] args) throws Exception {
        scanner= new Scanner(System.in);
        CheckFile(FileAcc,"name,year,email,sex,adrees,phone,cccd,pass,money,id");
        CheckFile(FileCard,"id,name,limit,debt");
        CheckFile(FileVayVon,"id,name,vay,lai,han,tong");
        CheckFile(FileMoney,"id,name,saveMoney,lai,han,tongtien");
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        while (true) {
            FileAccounts();
            System.out.println("Welcome to Banking");
            System.out.println("[0] Exit Bank");
            System.out.println("[1] Create Account Bank");
            System.out.println("[2] Login Bank");
            System.out.println("[3] Support");
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
                    accounts.clear();
                    System.out.println("Exit Bank");
                    return;
                case 1:
                    moneyAcc.Clear();
                    new Sigup(FileAcc, accounts);
                    break;
                case 2:
                    moneyAcc.Clear();
                    new Login(accounts);
                    break;
                case 3:
                    moneyAcc.Clear();
                    System.out.println("\n\t Support");
                    Support.displaySupport(accounts, FileAcc);
                    String admin=Input.nhap("Y/N Login Admin: ",String.class);
                    if (admin.equalsIgnoreCase(admin)){
                        System.out.println("Quan tri vien: ");
                        Admin.displayAdmin(admin, accounts);
                    }
                    break;
                default:
                    System.out.println("Sai nhap. Vui long nhap lai");
            }
        }
    }
    //////////////////////////////////////////////
    public static void CheckFile(String fileData, String format) throws IOException{
        File file = new File(fileData);
        try {
            if (!file.exists()) { 
                file.createNewFile();
                try (FileWriter fileWriter = new FileWriter(file)) {
                    fileWriter.write(format+"\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void FileAccounts() {
        try(Scanner myReader = new Scanner(new File(FileAcc))){
            try {
                myReader.nextLine();
            } catch (Exception e) {
                System.out.println("Khong co tai khoan nao duoc dang ky");
            }
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
            System.out.println("File not found: " + e.getMessage());
        }
    }
}