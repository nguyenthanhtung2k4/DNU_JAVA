class  basebank{
     String name;
     String password;

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getPassword() {
          return password;
     }

     public void setPassword(String password) {
          this.password = password;
     }
}
class login extends basebank {
     public boolean login(String name,String password){
          if(this.getName().equals(name) && this.getPassword().equals(password)){
               return true;
          }
          return false;
     }
     

}
class sigup extends basebank{
     public void signup(String name,String password){
          this.setName(name);
          this.setPassword(password);
     }
}

public class Login_Sigup {
     public static void main(String[] args) {
         System.out.println("ThanhTung");
         sigup sigup= new sigup();
         sigup.signup("thanhg", "123456");
         System.out.println("Login : "+login("thanhg", "123456"));
     }
}
