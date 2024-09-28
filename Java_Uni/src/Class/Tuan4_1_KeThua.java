
import java.util.InputMismatchException;
import java.util.Scanner;

class HCN {
    double dai, rong;
 
    public HCN(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
 
    public void inThongTin() {
        System.out.println("Chieu  Dai: " + dai);
        System.out.println("Chieu  Rong: " + rong);
    }
    public double dienTich() {
        return dai * rong;
    }
    public double  chuvi(){
        return 2*(dai+rong);
    }
}
 
class HinhVuong extends HCN {
    public HinhVuong(double canh) {
        super(canh, canh); 
    }
     
}

public class Tuan4_1_KeThua {
    public static double INPUT(){
        Scanner scanne = new Scanner(System.in);
        double nhap;
        while (true) { 
            try {
                nhap=scanne.nextDouble();
                break;
            }catch(InputMismatchException e){
                System.out.println("Vui long nhap so!");
                scanne.nextLine();
            }
        }
        return nhap;
    }
     public static void main(String[] args) {
        // System.out.println(INPUT());
        
        // Scanner scanne = new Scanner(System.in);
        System.out.print("HCN \nRong: ");
        double rong =INPUT();
        System.out.print("Dai: ");
        double dai =INPUT();
        System.out.print("Hinh Vuong \nDai: ");
        double Dai =INPUT();

        HCN hcn = new HCN(dai,rong);
        HinhVuong hv = new HinhVuong(Dai);

        System.out.println("HCN");
        // hcn.inThongTin();
        System.out.println("S --> HCN: " + hcn.dienTich());
        System.out.println("C --> HCN: " + hcn.chuvi());
        System.out.println("HV");
        // hv.inThongTin();
        System.out.println("S--> HV: " + hv.dienTich()); 
        System.out.println("C --> HV: " + hcn.chuvi());
    }
}