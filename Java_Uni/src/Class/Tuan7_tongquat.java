public class Tuan7_tongquat {
     public static void print(String[] arr) {
         for (String element : arr) {
             System.out.print(element+" ");
         }
     }
 
     public static <E> void printGeneric(E[] arr) {
         for (E element : arr) {
             System.out.print(element+" ");
         }
     }
 
     public static void main(String[] args) {
         String[] names = {"John", "David", "Michael", "Sarah", "Emily"};
         Integer[] scores = {90, 85, 95, 80, 92};
 
         System.out.print("Names: ");
         print(names);
         System.out.print("\nID: ");
         printGeneric(scores);
     //     printGeneric();
     //     System.out.println();
     }
 }