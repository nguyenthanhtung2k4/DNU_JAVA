import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student{
     private String name;
     private String lop;
     private double python,oop;

     public Student(String name, String Claas, double python, double oop){
          this.name = name;
          this.lop = Claas;
          this.python = python;
          this.oop = oop;
     }
     public double getdiemTB(){
          return (python+oop)/2;
     }
     public String getName(){ return this.name;}
     public String getLop(){ return this.lop;}
     public double getPython(){ return this.python;}
     public double getOpp(){ return this.oop;}
}
class diemtb implements Comparator<Student>{
     @Override
     public int compare(Student o1, Student o2) {
          return Double.compare(o1.getdiemTB(), o2.getdiemTB());
     }
}
public class Tuan10 {
     public static Scanner scanner, file;
     public static List<Student> students = new ArrayList<>();
     public static void main(String[] args) throws FileNotFoundException, IOException {
     ///  nhap  thong tin
          scanner = new Scanner(System.in);
          while (true) {
               System.out.print("Nhap ten: ");
               String name = scanner.nextLine();
               if(name.isEmpty())break; //  ket thuc nhap
               System.out.print("Nhap lop: ");
               String lop = scanner.nextLine();
               System.out.print("Nhap diem python: ");
               double python = scanner.nextDouble();
               scanner.nextLine();  // clear buffer
               System.out.print("Nhap diem oop: ");
               double oop = scanner.nextDouble();
               scanner.nextLine();  // clear buffer
               Student student= new Student(name, lop, python, oop);
               students.add(student);
          }
          System.out.println("tong arrr: "+students.size());
     // ghi file nhi phan
          try (FileOutputStream fos = new FileOutputStream("tung.dat")){
               ObjectOutputStream file= new ObjectOutputStream(fos);
                    for (Student student : students) {
                         file.writeObject(null);  // de phan tach cac sinh vien
                         file.writeObject(student.getName() + "," + student.getLop() + "," + student.getPython() + "," + student.getOpp());
                    }
          }
     //  doc  file nhi phan
          try (FileInputStream fis = new FileInputStream("tung.dat")){
                    ObjectInputStream file = new ObjectInputStream(fis);
                    // System.out.println("thong tin"+ file.readObject());
                    String data;
                    while ((data = (String) file.readObject())!= null) {
                         String[] parts = data.split(",");
                         Student student = new Student(parts[0], parts[1], Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));
                         students.add(student); // them vao danh sach moi
                    }
          } catch (Exception e) {
                    System.out.println("Error reading file: " + e.getMessage());
          }
          //  tong sinh vien
          System.out.println("Tong sinh vien la: "+students.size());
          System.out.println("\nDanh sach sinh vien:");
          // sap xep theo diem trung binh
          Collections.sort(students,new diemtb());
          // xuat diem trung binh theo lop
          System.out.println("\nDiem trung binh tang dan:");
          System.out.printf("%10s %10s %10s %10s %10s%n","Name","Class","Python","Oop","TB\n");
          for (Student student : students) {
                    String name= student.getName();
                    double diemTB = student.getdiemTB();
                    String lop = student.getLop();
                    double python= student.getPython();
                    double oop= student.getOpp();
                    System.out.printf("%10s %10s %10.2f %10.2f %10.2f%n",name,lop,python,oop, diemTB);
          }
     }
}