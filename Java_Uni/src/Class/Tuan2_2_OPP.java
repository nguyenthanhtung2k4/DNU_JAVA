
import java.util.Scanner;

public class Tuan2_2_OPP {
     public static void main(String[] args) {
     
          Scanner scanner = new Scanner(System.in);
          String cha,con ;
          int index;
          //đâu là
          System.err.println("Chuoi cha: ");
          cha= scanner.nextLine();
          System.err.println("Chuoi con: ");
          con= scanner.nextLine();
          index=cha.indexOf(con);
          if(index!=-1){
               System.out.println("Vi tri bat dau chuoi  con trongchoi cha: "+index);
          }else{
               System.out.println("khong co  chuoi con trong chuoi  cha");
          }
     }
}
