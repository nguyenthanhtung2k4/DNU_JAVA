package Menu;
// import java.util.List;
import java.util.Scanner;

public class CreditCard extends AccountMoney {
        private double creditLimit;
        private double debt;
       
       
        public CreditCard(String name, double initialMoney,int id) {
            super( name,initialMoney,id);
                this.debt = 0;
                this.creditLimit = 0;
                // this.time = time;
                addHistory("The Tin Dung: " + creditLimit+" |Now: " );
            }
        public CreditCard(String name, double initialMoney, double creditLimit, double debt, int id) {
        super( name,initialMoney,id);
        this.creditLimit = creditLimit;
            this.debt = debt;
            // this.time = time;
            addHistory("The Tin Dung: " + creditLimit+" |Now: " );
        }
        public CreditCard(String name, double initialMoney, double creditLimit, int id) {
        super( name,initialMoney,id);
        this.creditLimit = creditLimit;
            this.debt = 0;
            // this.time = time;
            addHistory("The Tin Dung: " + creditLimit+" |Now: " );
        }
    
        public void payDebt(double amount) {
            if (amount > 0 && amount <= debt) {
                debt -= amount;
              
            } else {
                System.out.println("Invalid payment amount.");
            }
        }
        public double getCard(){
            return creditLimit;
        }
        public void setCard(double limit){
            this.creditLimit = limit;
        }
        public double getDebt(){
            return debt;
        }
        public void getDebt(double debt){
            this.debt = debt;
        }
        
      

        public void useCard(double amount) {
            if (amount > 0 && amount <= creditLimit) {
                debt += amount;
            } else {
                System.out.println("Insufficient credit limit.");
            }
        }
        public void checkCreditLimit() {
            System.out.println("\n\n\tLimit: " + creditLimit + ", Debt: " + debt+"\n");
        }
        Scanner   scanner = new Scanner(System.in);
/////////////////////////////////////////////////////////////////////////////////////////////

        public void menuCard(AccountMoney moneyAcc, String file){
        int choice;

        do{
            System.out.println("[0] Thoat che do the tin dung");
            System.out.println("[1] Dung the tin dung");
            System.out.println("[2] Thanh Toan tien the tin dung");
            System.out.println("[3] Kiem tra thong tin the");
                System.out.print("Nhap lua chon (0-3): ");
            choice = scanner.nextInt();
            switch(choice){
                case 0:
                    String fomat="id,name,limit,debt";
                    String plance=(getId()+","+getName()+","+getCard()+","+getDebt());
                    ModifyCSV.displayCSV(moneyAcc.getId(), file, fomat, plance);

               
                    System.out.println("Thoat");
                    break;
                case 1:
                    System.out.println("\n\tNhap so tien dung: ");
                    double amount = scanner.nextDouble();
                    useCard(amount);
                    moneyAcc.addHistory("Dung Card| Tien: "+amount+"Total Debt: "+debt);
                    System.out.println("Tong so tien no: "+debt);
                    break;
                    case 2:
                    System.out.println("\n\tNhap so tien thanh toan: ");
                    amount = scanner.nextDouble();
                    double tien=moneyAcc.getMoney();
                    moneyAcc.setMoney(tien-amount);
                    
                    payDebt(amount);
                    moneyAcc.addHistory("Thanh toan Card| Tien: "+amount+"Total Debt: "+debt);
                    System.out.println("Tong so tien du: "+moneyAcc.getMoney()+" Total Debt: "+debt);
                    break;
                case 3:
                    checkCreditLimit();
                    break;
                default:
                    System.out.println("\n\tLua chon khong hop le");
            }
        }while(choice!=0);
    }
    
}
