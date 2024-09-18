import java.util.Scanner;
public class Chuong1 {
    public static void main(String[] args) {
        // bai1();
        // bai3();
        // bai3();
        // bai4();
        bai5();
          
     }
     public static void bai1(){
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.println("Nhập n: ");
             int a = scanner.nextInt();
             for(int i=0;i<a;i++){
                 if(i%5==0){
                     System.out.println(i+"Chia het cho 5");
                     
                 }
             }
         }
     }    
    public static void bai2(){
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.println("Nhập n: ");
             int a = scanner.nextInt();
             for(int i=0;i<a;i++){
                 if(i%3==0){
                     System.out.println(i+"Chia het cho 3");
                     
                 }
             }
         }
     }    
 
    public static void bai3(){
         try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhập n: ");
            int n = scanner.nextInt();
            int dem=0;
             for(int i=1;i<=n;i++){
                if(n%i==0){
                    System.out.println("boi la: "+i);
                    dem+=1;
                }
            }
            System.out.print("Tong boi la: "+dem);
         }
     }
    public static void bai4() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=scanner.nextInt();
        if(n<=1){
            System.out.println(n+"Nguyen to");
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0 ||n==2||n==3){
                System.out.println(n+"Khong nguyen to");
                break;
            }else{
                System.out.println(n+"Nguyen to");
                break;

            }
        }
    }   
    public static void  bai5(){
        @SuppressWarnings("resource")
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for(int i=2;i<=a;i++){
            boolean kq=true;
            for(int j=2; j*j<=i;j++){
                if(i%j==0){
                    kq=false;
                    break;
                }
            }
            if(kq){
                System.out.println(i+"Nguyen");
            }else{
                System.out.println(i+"Khong nguyen");
            }
        }
    }
}