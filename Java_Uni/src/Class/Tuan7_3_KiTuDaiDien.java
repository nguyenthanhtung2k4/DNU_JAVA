class persion{
     String name;

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }
     
}
class nhanVien extends persion {
     double luong;
     public nhanVien(double luong, String name) {
          super.setName(name);
          this.luong = luong;
     }
     public double getLuong() {
          return luong;
     }

     public void setLuong(double luong) {
          this.luong = luong;
     }
}
class sinhVien extends persion {
     double diem;
     public sinhVien(double diem, String name){
          super.setName(name);
          this.diem = diem;
     }
     public double getDiem() {
          return diem;
     }

     public void setDiem(double diem) {
          this.diem = diem;
     }
}
public class Tuan7_3_KiTuDaiDien {
     
     public static void main(String[] args) {
          sinhVien sv = new sinhVien(8.5,"Nam");
          nhanVien nv = new nhanVien(10,"Tung");
         
          
          System.out.println("Thong tin sinh vien: ");
          System.out.println("Ten: " + sv.getName());
          System.out.println("Diem: " + sv.getDiem());
          
          System.out.println("\nThong tin nhan vien: ");
          System.out.println("Ten: " + nv.getName());
          System.out.println("Luong: " + nv.getLuong());
     }

}

//  xay dung chuong trinh  su dung ki tu  dau  din  trong java hien thi thong tin sinh  vien (ten, diem) +  nhan vien(ten , luong) ke thua tu perdion
// su dung persion ( ten) 

