import java.util.ArrayList;

public class tung { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int  i=0;i<cars.size();i++){
          if (cars.get(i).equals("Tung")) {
               cars.set(0, "Opel");
               System.out.println(cars);
          }
    }
  } 
}
