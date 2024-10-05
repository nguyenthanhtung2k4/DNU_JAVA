import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class  time{
     String time_Str;

     public time(String time) {
          this.time_Str=time;
     }

     public String getTime_Str() {
          LocalDateTime edit;
          try{
               edit= LocalDateTime.parse(this.time_Str);
          }catch(Exception e){
               System.out.println("Invalid date format. Please use dd/MM/yyyy.");
               return null;
          }
          DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
          this.time_Str=format.format(edit);
          return time_Str;
     
     }

     public void setTime_Str(String time_Str) {
          this.time_Str = time_Str;
     }
}


public class DateTime {
     public static void main(String[] args) {
          LocalDateTime time= LocalDateTime.now();
          System.out.println("time : "+time);
          time t= new time("2024-10-05");



          System.out.println("time:"+t.getTime_Str());
     }
}
