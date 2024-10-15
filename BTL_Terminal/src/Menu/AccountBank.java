package Menu;
import java.util.Map;
import java.util.HashMap;

public class AccountBank {
    private  String name, emai, sex,password , adrees; 
    private  double money; 
    private int phone, year ;
     

   
    public AccountBank(){};

    public AccountBank(String name,int year, String email, String sex , String adrees, int phone , String password , double money) {
          this.name = name;
          this.year = year;
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
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public void Clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    @Override
    public String toString() {
         return "AccountBank \n\tname: " + name + "\n\temai: " + emai + "\n\tpassword: " + password + "\n\tmoney: " + money + "\n\n";
    }
}
