
import java.util.Map;
import java.util.HashMap;

public class AccountBank {
    private  String name, emai, sex,password , adrees; private  double money; int phone;
     

    public AccountBank(){};

    public AccountBank(String name, String email, String sex , String adrees, int phone , String password , double money) {
          this.name = name;
          this.emai = email;
          this.password = password;
          this.money = money;
          this.adrees= adrees;
          this.phone=phone;
     }

    public double getMoney() {
          return money;
     }

    public  void setMoney(double money) {
          if (money>=0){
               this.money = money;
          }else{
               System.out.println("Vui long nhap money >=0");
          }
     }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdrees() {
        return adrees;
    }

    public void setAdrees(String adrees) {
        this.adrees = adrees;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
         return "AccountBank \n\tname: " + name + "\n\temai: " + emai + "\n\tpassword: " + password + "\n\tmoney: " + money + "\n\n";
    }

//  arr  mang   java
    public void ArrayBank(){
        // Map<String , Object> map = new HashMap<>();
        // map.add("name", AcgetName()

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

     
}
