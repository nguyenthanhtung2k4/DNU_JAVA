import java.util.Scanner;

class HCN{
     double dai;
     double rong;
     public void ThietLapCanh(double  dai,double  rong){
          this.dai=dai;this.rong=rong;
     }
     public double  DienTich(){
          return (dai*rong);
     }
     public double  chuvi(){
          return (dai+rong)*2;
     }
}



public class Tuan3_1 {
     public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);

          System.out.println("Dai: ");
          double dai=scanner.nextDouble();
          System.out.println("Rong: ");
          double rong=scanner.nextDouble();
          HCN hinh=new HCN();
          hinh.ThietLapCanh(dai,rong);
          System.out.println("DienTich "+hinh.DienTich());
          System.out.println("chuvi "+hinh.chuvi());
     }
}
