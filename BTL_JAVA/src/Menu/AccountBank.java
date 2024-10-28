package Menu;

public class AccountBank {
     private String name, emai, sex, password, adrees;
     private double money;
     private int phone, year, id,cccd;
     
     public AccountBank() {
     };
     public AccountBank(int  id, String name,double money){
          this.id = id;
          this.name = name;
          this.money = money;
     }
     public AccountBank(String name, int year, String email, String sex, String adrees, 
          int phone,int cccd, String password,double money, int id) {
          this.name = name;
          this.year = year;
          this.emai = email;
          this.sex = sex;
          this.password = password;
          this.money = money;
          this.adrees = adrees;
          this.phone = phone;
          this.cccd = cccd;
          this.id = id;
     }
     public double getMoney() {
          return money;
     }
     public void setMoney(double money) {
          if (money >= 0) {
               this.money = money;
          } else {
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
     public String getSex() {
          return sex;
     }

     public void setSex(String sex) {
          this.sex = sex;
     }
     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }
     public int getCccd() {
          return cccd;
     }
     public void setCccd(int cccd) {
          this.cccd = cccd;
     }
     public void Clear() {
          System.out.print("\033[H\033[2J");
          System.out.flush();
     }
     @Override
     public String toString() {
          return "AccountBank \n\tname: " + name + "\n\temai: " + emai + "\n\tpassword: " + password + "\n\tmoney: "
                    + money + "\n\n";
     }
}