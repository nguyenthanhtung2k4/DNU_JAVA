import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class time{
     public static void main(String[] args) {
          LocalDateTime chxSua = LocalDateTime.parse("2024-10-05T06:23:08.927335"); // Use parse for pre-defined time
          LocalDateTime now = LocalDateTime.now();
          DateTimeFormatter fromat = DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss"); // Consistent variable name

          String time_sua = chxSua.format(fromat);
          String tgian_Thuc = now.format(fromat);

          System.out.println("da sua date: " + time_sua);
          System.out.println("date thuc: " + tgian_Thuc);
     }
}

