import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Tuan9_io {

     public static void main(String[] args) throws FileNotFoundException {
          int tong=0;
          File file = new File("text_io.txt");
          try {
               @SuppressWarnings("resource")
               Scanner render = new Scanner(file);
               while (render.hasNextLine()) {
                    if(render!= null){
                         tong+=Integer.parseInt(render.nextLine()); 
                    }
               }
               System.out.println("Tong cac so trong file la: " + tong);
               
          } catch (FileNotFoundException e) {
               System.out.println("File not found.");
          }
     }
}