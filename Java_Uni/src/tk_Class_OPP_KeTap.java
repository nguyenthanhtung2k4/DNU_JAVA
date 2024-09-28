class banh{
    int banh;
    public banh(int banh){
         this.banh=banh;
    }
}
class  dongco{
    String nguyenlieu;
    public dongco(String n){
        this.nguyenlieu=n;
    }

}
class  oto{
    banh banh;
    dongco dongco;
    public oto(banh banh, dongco dongco){
          this.banh = banh;
          this.dongco = dongco;
    }
    public void getOto(){
        System.out.println("Banh" + banh.banh + "nguyenlieu " + dongco.nguyenlieu);
    }
}


public class tk_Class_OPP_KeTap {
     public static void main(String[] args) {
          banh  b=new banh(4);
          dongco d=new dongco("banh pho");
          oto o=new oto(b,d);
          o.getOto(); //in ra ket qua
     }
}