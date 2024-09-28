class Bank{
     private  String name;private double Money;
     public Bank(double Money,String Name){
          this.name=Name;this.Money=Money;
     }
     public Bank(String name){
          this.name="nam";this.Money=0;
     }
     public Bank(){
     }
     public void display(){
          System.out.println("Account: "+Money+"\nName: "+name);
     }
}


public class Tuan3_2 {
     public static void main(String[] args) {
          
          // co  tham so
          Bank bank= new Bank(2000,"Tung");
          bank.display();
          Bank bank2= new Bank("abc");
          bank2.display();
          Bank bank3= new Bank();
          bank3.display();
     }
}
