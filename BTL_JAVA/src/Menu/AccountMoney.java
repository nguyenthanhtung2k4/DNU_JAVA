package Menu;
import java.util.ArrayList;
import java.util.List;

public class AccountMoney {
     private double money;
     private String name;
     private String time;
    

     private List<String> history; //  lu tru  lich su  giao dich
     public AccountMoney(){};
     public AccountMoney( double money,String name, String time) {
          this.name = name;
          this.money = money;
          this.time=time;
          this.history = new ArrayList<>();
          this.history.add("Account created with balance: " + money+" |Time: "+time);
     }
     public AccountMoney(double money, String name){
          this.name=name;
          this.money = money;
     }
     public AccountMoney(String name, double initialMoney) {
          this.name = name;
          this.money = initialMoney;
          this.history = new ArrayList<>();
          addHistory("Account created with initial balance: " + initialMoney);
      }
  
      public double getMoney() {
          return money;
      }
  
      public String getName() {
          return name;
      }
  
      public void setMoney(double money) {
          this.money = money;
      }
     public String getTime() {
          return time;
     }
     public void setTime(String time) {
          this.time = time;
     }
      public void addHistory(String action) {
          this.history.add(action);
      }
  
      public void showHistory() {
          System.out.println("Transaction History for " + name + ":");
          for (String h : history) {
              System.out.println(h);
          }
      }
}
