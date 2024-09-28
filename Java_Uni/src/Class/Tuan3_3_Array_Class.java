
import java.util.Scanner;

class  Students{
    private  int  ma;
    private int namsinh;
    private double diem;
    private String name;
    public Students(String name,int ma , int  namsinh,double diem){
        this.name=name;
        this.namsinh=namsinh;
        this.ma=ma;
        this.diem=diem;
    }
    public void  getStudent(){
        System.out.println("\tName: "+name+"GPA: "+diem);
    }



}

public class Tuan3_3_Array_Class {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Students[] students=new  Students[3];
        for(int i=0;i<3;i++){
            System.out.println("Ma Sv: ");
            int ma=scanner.nextInt();
            scanner.nextLine(); //để viết đượck text 
            System.out.println("Name: ");
            String name=scanner.nextLine();
            System.out.println("Diem : ");
            double diem=scanner.nextDouble();
            System.out.println("Year: ");
            int nam=scanner.nextInt();
            students[i]=new Students(name,ma,nam,diem);
        }
        for (int i=0;i<3;i++){
            System.out.println("Sinh vien "+i+"\n");
            students[i].getStudent();
        }
    }
}