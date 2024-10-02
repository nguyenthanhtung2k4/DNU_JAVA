class Counter {
     private static int count = 0; // Biến đếm static
 
     public Counter() {
         count++;
     }
 
     public static int getCount() {
         return count;
     }
}
public class tk_Static_Class_OPP{
     public static void main(String[] args) {
         Counter c1 = new Counter();
         Counter c2 = new Counter();
         Counter c3 = new Counter();
 
         System.out.println("Số lượng đối tượng Counter: " + Counter.getCount());
     }
}