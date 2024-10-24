import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Tuan9_3_Scanner {
     public static Scanner scanner, render;
     public static void main(String[] args) throws IOException {
          scanner = new Scanner(System.in);
          try(FileWriter file = new FileWriter("text_io.txt",  true)) {
               while (true) {
                         System.out.println("Nhap Sv: ");
                         String writer= scanner.nextLine();
                         file.write(writer+"\n");
                         if(writer.isEmpty()) break;
                    }
               
          } catch (FileNotFoundException e) {
               System.err.println("File not found: " + e.getMessage());
          }finally{
               scanner.close();
               System.err.println("Dong file");
          } 
     } 
}