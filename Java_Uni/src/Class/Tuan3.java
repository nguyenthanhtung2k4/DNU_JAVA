
class  Bank{
     private double Money;
     private String Name;
     public Bank(String Name){
          this.Name=Name;
          this.Money=0.0;
     }
     public void  GetBank(double balance){
          if (Money>=0 ){
               Money-=balance;
               // System.out.println("Tien hien tai : "+Money);
          }
     }
     public void  Add(double add){
          if( add>=0){
               Money+=add;
               // System.out.println("So tien hien tai la: "+Money);
          }else{
               System.out.println("So tien k hop le!");
          }
     }
     public void  display(){
          System.out.println("Ten "+Name+"\nTien: "+Money);
     }

}


public class Tuan3{
     public static void main(String[] args) {
          Bank account=new Bank("Thanhtung");
          // account.Bank("TUNG");
          account.Add(2000);
          account.GetBank(20);
          account.display();
     }
}