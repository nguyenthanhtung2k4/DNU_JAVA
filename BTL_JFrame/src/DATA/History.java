
import java.time.LocalDateTime;


public class History {
     String name;
     double money;
     LocalDateTime date;
     public History(String name,double  money,LocalDateTime date){
          this.name=name;
          this.money=money;
          this.date=date;
     }


     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public double getMoney() {
          return money;
     }

     public void setMoney(double money) {
          this.money = money;
     }

          public LocalDateTime getDate() {
          return date;
     }

     public void setDate(LocalDateTime Date) {
          this.date = Date;
     }

}
