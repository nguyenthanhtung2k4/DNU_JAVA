
public class CreditCard extends AccountMoney {
     private double creditLimit;
     private double debt;
 
     public CreditCard(String name, double initialMoney, double creditLimit) {
         super(name, initialMoney);
         this.creditLimit = creditLimit;
         this.debt = 0;
         addHistory("Credit Card created with limit: " + creditLimit);
     }
 
     public void payDebt(double amount) {
         if (amount > 0 && amount <= debt) {
             debt -= amount;
             addHistory("Paid debt: " + amount + ". Remaining debt: " + debt);
         } else {
             System.out.println("Invalid payment amount.");
         }
     }
 
     public void useCard(double amount) {
         if (amount > 0 && (debt + amount) <= creditLimit) {
             debt += amount;
             addHistory("Used card for: " + amount + ". Current debt: " + debt);
         } else {
             System.out.println("Insufficient credit limit.");
         }
     }
 
     public void checkCreditLimit() {
         System.out.println("Credit Limit: " + creditLimit + ", Current Debt: " + debt);
         addHistory("Checked credit limit and debt.");
     }
 }
 