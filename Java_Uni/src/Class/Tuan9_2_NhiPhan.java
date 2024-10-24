import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Tuan9_2_NhiPhan {
     public static void main(String[] args) throws IOException, ClassNotFoundException {
          int[] num={1,2,3,4,5};
          int[] arr; int dem=0,  tong=0;     
          try(FileOutputStream fis = new FileOutputStream("nhiphan.dat")){
               ObjectOutputStream oos = new ObjectOutputStream(fis);
               oos.writeObject(num);
          } catch (FileNotFoundException e) {
               System.out.println("Error: "+e.getMessage());
          }
          //  read file dat
          try (FileInputStream fis= new FileInputStream("nhiphan.dat")){
               ObjectInputStream ois = new ObjectInputStream(fis);
               arr = (int[])ois.readObject();
               

               //  tong
               for (int i : arr) {
                    tong+=i;
                    dem++;
                    
               }
          
               
          } catch (FileNotFoundException e) {
               System.out.println("Error: "+e.getMessage());
          }
          
          // ///////  tong  dem trung binh  dan sach mang
          System.out.println("Tong: "+tong);
          System.out.println("Tb: "+tong/dem);
          System.out.println("dem: "+dem);
     }
}
