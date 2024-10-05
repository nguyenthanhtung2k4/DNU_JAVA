
import DATA.User;


public class test {
     public static void main(String[] args) {
          System.out.println("thanhg");
          User namUser = new User("thanhting", 0, 234637L);
          System.out.println(namUser.checkMoney());
          if(namUser.checkMoney()){
               System.out.println("check money");
          }else{System.out.println("no check");}
     }
}
