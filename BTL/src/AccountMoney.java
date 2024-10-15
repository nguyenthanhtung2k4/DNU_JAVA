import java.util.ArrayList;
import java.util.List;

public class AccountMoney {
     private double money;
     private String name;
     private String time;
     private List<String> history; // Lưu trữ lịch sử giao dịch trong chương trình
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
     // Thêm giao dịch vào lịch sử
     public void addHistory(String action) {
          this.history.add(action);
     }
     public void setHistory(String action) {
          this.history.add(action);
     }

     public void showHistory() {
          System.out.println("\nTransaction History for " + name + ":");
          for (String record : history) {
               System.out.println("\t - "+record);
          }
     }
}
