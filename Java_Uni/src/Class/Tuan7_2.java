import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Sv{
     private String name;private int Diem;
     public String getName() {
          return name;
     }
     public void setName(String name) {
          this.name = name;
     }
     
     public void setDiem(int Diem) {
          this.Diem = Diem;
     }
     public int getDiem() {
          return Diem;
     }
     
}
class DiemComparator implements Comparator<Sv> { 
     public int compare(Sv ob1, Sv ob2) {  
          int ob1Diem = ((Sv)ob1).getDiem(); 
          int ob2Diem = ((Sv)ob2).getDiem(); 
          
          if(ob1Diem > ob2Diem)  return 1; 
          else if(ob1Diem < ob2Diem)  return -1; 
          else return 0; 
     } 
}
class NameComparator implements Comparator<Sv> {
     private Collator collator = Collator.getInstance();
 
     public int compare(Sv ob1, Sv ob2) {
     //     return collator.compare(ob1.getName(), ob2.getName());
         return collator.compare(ob1.getName(), ob2.getName());
     }
 }
 
//  sap xep theo then Sinh vien 
public class Tuan7_2 {

     // @SuppressWarnings("unchecked")
     public static void main(String[] args) {
          List<Sv> list = new ArrayList<Sv>();
          Sv p;
          p=new Sv();
          p.setName("John");p.setDiem(20);
          list.add(p);
          p= new Sv();
          p.setName("Lisa");p.setDiem(22);
          list.add(p);
          p= new Sv();
          p.setName("Better");p.setDiem(21);
          list.add(p);
          p= new Sv();
          p.setName("Licol");p.setDiem(30);
          list.add(p);

          Collections.sort(list, new DiemComparator());
          System.out.println("Sap xep theo Diem:");
          for(Sv sv:list){
              System.out.println("\t"+sv.getName() +" : "+sv.getDiem());
          }
          Collections.sort(list, new NameComparator());
          System.out.println("Sap xep theo tuoi:");
          for(Sv sv:list){
              System.out.println("\t"+sv.getName() +" : "+sv.getDiem());
          }
     }
}
