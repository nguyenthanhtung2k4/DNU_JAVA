class  Diem{
     private int x,y;
     public Diem(int x ,int y){
          this.x=x;this.y=y;

     }
     // public void setX(int x){this.x=x;}\
     // public int getX(){ return x;}
     public void printDiem(){
          System.out.print("<"+x+","+y+">");
     }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}


class TuGiac{
     private Diem d1,d2;
     private Diem d3,d4;
     public TuGiac(Diem x1,Diem x2,Diem x3,Diem x4){
         d1=x1;d2=x2;d3=x3;d4=x4;
     }
     public void  printTuGiac(){
          d1.printDiem();
          d2.printDiem();
          d3.printDiem();
          d4.printDiem();
          System.out.println();
     }
}
public class Tuan4_Ket_Tap {
    public static void main(String[] args) {
         Diem d1= new Diem(1,2);
         Diem d2= new Diem(3,4);
         Diem d3= new Diem(5,6);
         Diem d4= new Diem(7,8);
         TuGiac t1= new  TuGiac(d1,d2,d3,d4);
         t1.printTuGiac();
    }
}