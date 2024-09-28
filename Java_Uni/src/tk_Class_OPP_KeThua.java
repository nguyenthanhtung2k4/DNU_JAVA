class Person{
     String name;int age;double luong;
     public Person(String name,int age,double luong){
          this.name=name; this.age=age; this.luong=luong;
     }
     public  void  printPerson(){
          System.out.print("Name: "+name+"\tAge: "+age+"\tLuong: "+luong);
     }
}
class  Employee extends Person{
     String sex;
     public  Employee(String name,int age,double  luong,String sex){
          super(name,age,luong);
          this.sex=sex;
          // System.out.println("Sex: "+sex);
     }
     public  void Sex(){
          printPerson();
          System.out.print(" Sex: "+sex);
     }
}



public class tk_Class_OPP_KeThua {
     public static void main(String[] args) {
          Person  p= new Person("thanhtung",20, 1000);
          Employee e =new Employee("Thanhtung20",21,2000,"Boy");
          
          // p.printPerson();
          // e.printPerson();
          e.Sex();

     }
}
