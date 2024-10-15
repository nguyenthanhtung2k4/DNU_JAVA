import java.util.Scanner;

public class CreditCard extends AccountMoney {
    private double creditLimit; // gioi han the tin dung
    private double debt; // so tien no

    // tao the tin dung + gioi han the  + name nguoi dung
    public CreditCard(String name, double money,String time, double creditLimit) {
        
        super(money, name);
        this.creditLimit = creditLimit;
        this.debt = 0;
        addHistory("TheTinDung| Da duoc tao" + creditLimit+"Time: "+time);
    }
    public void useCard(double amount) { // dung the tin dung thanh toan ca nhan
        if (creditLimit >= amount) {
            debt += amount;
            System.out.print("Thanh toan xog| Tong So No"+debt);
            addHistory("TheTinDung| So tien: " + amount + ", Total debt: " + debt);
        } else {
            System.out.println("Han muc tin dung khong du :((\nVui long them han muc");
        }
    }
    public void payDebt(double amount) { // thanh toan so no
        if (debt >= amount) {
            debt -= amount;
            addHistory("TheTinDung| Thanh toan no: "+amount+"So no con lai: "+debt);
            System.out.println("Da tra no: " + amount + "\n=> No Con lai: " + debt);
        } else {
            System.out.println("Thanh toan vuot qua so no ");
        }
    }
   
    public void checkCreditLimit() { // kiem tra giơi han the + so no da dung
        System.out.println("Gioi han the tin dung: " + creditLimit);
        System.out.println("So no the tin dung: " + debt);
    }
    // public void displayCard(){
    //     Scanner scanner = new Scanner(System.in);
    //     int choice;
    //     do{
    //         System.out.println("[0] Thoat che do the tin dung");
    //         System.out.println("[1] Dung the tin dung");
    //         System.out.println("[2] Thanh Toan tien the tin dung");
    //         System.out.println("[3] Kiem tra thong tin the");
    //             System.out.print("Nhap lua chon (0-3): ");
    //         choice = scanner.nextInt();
    //         switch(choice){
    //             case 0:
    //                 System.out.println("Thoat");
    //                 break;
    //             case 1:
    //                 System.out.println("Nhap so tien dung: ");
    //                 double amount = scanner.nextDouble();
    //                 useCard(amount);
    //                 break;
    //             case 2:
    //                 System.out.println("Nhap so tien thanh toan: ");
    //                 amount = scanner.nextDouble();
    //                 payDebt(amount);
    //                 break;
    //             case 3:
    //                 checkCreditLimit();
    //                 break;
    //             default:
    //                 System.out.println("Lua chon khong hop le");
    //         }
    //     }while(choice!=0);
    // }
}