abstract class luong {
     public abstract double tinhluong(double hso);
     public double NhanVien(){
          return tinhluong(1.0);
     }
     public double phong(){
          return tinhluong(1.2);
     }
     public double diamdoc(){
          return tinhluong(1.5);
     }
}
class NhanVien extends luong {
     private double luong;
     public NhanVien(double luong){
          this.luong=luong;
     }
     @Override
     public double tinhluong(double hso){
          return luong * hso;
     }
}
public class dahinh {
     public static void main(String[] args) {
          luong nv = new NhanVien(5000000);
          System.out.println("NhanVien: " + nv.NhanVien());
          System.out.println("Truong phong: " + nv.phong());
          System.out.println("Giam doc: " + nv.diamdoc());
     }
}
