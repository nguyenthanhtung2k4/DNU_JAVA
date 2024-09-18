          Conmet code: //
          "" : hằng chuỗi
          \b : xóa lùi
          \t : tab
          \n : xuống dòng
          \" : nháp kép
          \' : nháy đơn
          \\ :  \
          \f : đầy trang
          \uxxxx : ký tự  unicode
////////////////////////////////////// Gợi ý //////////////////
          - Mỗi lần viết code xong xuống dòng phải có ;
          - Khái báo thư viẹn : import java.{tên_thư_viện}
          - + (Dấu cộng sẽ cho phép bạn liên kết với a với b thành c)
```java
                         a=10;
                         System.out.print("tung"+a)
```



////////////////////////////////////// Quan trong //////////////////
          -  Trong java không cho phép sử dụng chỉ số âm
          - Khai báo thư viện  Scanner : Cho phép bạn nhập vào để lấy các giá trị khi nhập vào.
          - continue :  Cho phép bạn nhảy bước hay nói cách khác cho phép bạn bỏ qua bước đó
          - break : Cho phép bạn bỏ quả hẳn bước đó (nếu dùng for nó sẽ bỏ qua vòng for luôn)

////////////////////////////////////// Biến  //////////////////
          - Khai báo biến : <Kiểu> <tên_biến> = <Gán_giá_trị>
                    * Các kiểu :
                              <int> 32
                              <float>32
                              <char>16
                              <string>
                              <long>64
                              <double>64
                              <boolean>
                              <byte>8
                              <short>16
          - final :  Biến này không cho phép bạn thay đổi giá trị
               <!-- Vd: Biến final
                         final int x=5;
                         //  bây giờ ta đặt biến x=6 nó sẽ lỗi
                    
               -->
          
////////////////////////////////////// Toán tử  //////////////////
     - Toán tử 
               + Cộng Cộng 2 giá trị x+y 
               - Trừ Trừ một giá trị cho giá trị khác x-y 
               * Nhân Nhân 2 giá trị x*y 
               / Chia Chia một giá trị cho giá trị khác x/y 
               % Chia lấy dư Chia và trả về phần dư x%y 
               ++ Tăng giá trị Tăng giá trị lên 1 ++x 
               -- Giảm giá trị Giảm giá trị đi 1 --x 
     - Toán tử gán:
               = 
               += 
               -= 
               *=
               /=
               %=
               &=
               |=
               ^=
               >>=
               <<=
     - Toán tử so sánh:
               == 
               !=
               >
               <
               >=
               <=
     - Toán tử logic:
               &&
               ||
               !


////////////////////////////////////// Các hàm trong Java  //////////////////////////////////////////
     - length :  Kiểm tra độ dài của mảng , object ....
     - toUppercase() : in hoa
     - toLowerCase() : in thuong
     - indeOf() : tìm vị trí trong chuỗi
     - supper  : truy xuất thằng cha trong class ( OPP: Lập trình hướng đôí tượng)

////////////////////////////////////// Hiện dữ liệu & Nhập dữ liệu (print input)  //////////////////

------------------------------------- Hiện dữ liệu (print)---- -----------------------------
          - System.out.print('<text_Hiệm_ra>') : Với lệnh này nó cho phép bạn hiện màn hình
          - System.out.println('<text_Hiệm_ra>') : Với lệnh này nó cho phép bạn hiện màn hình và cho  phép nhẩy xuống dòng
          - System.out.printf('<text_Hiệm_ra %.2f%>',Math.PI) : Với lệnh này nó cho phép bạn hiện màn hình và Lấy được số thập phân sau dấu phẩy

```java
               System.out.print("My name is ");
               System.out.print("John Doe");
               System.out.println("Hello, world!"); // In ra màn hình: Hello, world!
               System.out.printf("Pi is approximately %.2f%n", Math.PI); // In ra: Pi is approximately 3.14
```

------------------------------------- Nhập  dữ liệu vào (input) ----------------------------
          - System.out.println("<Text>") : Hiện thị ra màn hình
          - Scanner : nhập dữ liệu <Cần khai báo thư viện>
                    *Hàm đọc được dữ liệu Scanner:
                         next()         ---> 
                         nextline()     ---> Đọc văn bản
                         nextInt()      ---> Đọc số nguyên
                         nextFloat()    --> Đọckiểu float
                         nextDouble()   --> Đọc kiệu số thực
                         nextbolean()   --> Đọc giá trị boolean
                         hasNextInt()   --> Kiểm tra số nguyên có hay  không
                         hasNextDouble()--> Kiểm tra có só nào số thực hay  không nếu có thì trả về
                         hasNextLine()  ---> Kiểm tra có dòng văn bản
                         useDelimiter() ---> Thiết lập dấu phẩy tùy chỉnh
                         close()        ---> Đóngđối tượng Scanner

```java
          // VD1
               Scanner scanner=new Scanner(System.in);
               System.out.print("Nhap a: ");
               float a=scanner.nextFloat(); // nextFloat
               System.out.print("Nhap b:");
               float b=scanner.nextInt(); /// nextInt 
               //  các  nextline() ; nextDouble()  ... Cungx làm như vậy 
               
               int num=0;
               while(scanner.hasNextInt){ // hasNextInt
                    int number=scanner.nextInt();
                    num+=number;
               }
               System.out.printf("Tổng la:"+num);
               //  các  hasNextFloat() ; hasNextLine()  ... Cungx làm như vậy 

               scanner.close();/// close()

          // VD2:
               Scanner scanner= new Scanner("tung Thanh");
               String tung=scanner.next();
               System.out.print(tung);
               String thanh=scanner.next();
               System.out.print(thanh);
                    // ==> Kết quả : tung thanh

```


///////////////////////////////////////// Điều kiện ////////////////////////////////
          if else
///////////////////////////////////////// Vòng lặp ////////////////////////////////
          for : vòng lặp được xác định trước (dùng giống C++)
          for each : Cho phép bạn lặp lại mà k xác định trước ( giống php)
          while : Vòng lặp cho đến khi thoản mãn điều kiện
          swich case : Dùng trong các trường hợp( dùng giống C++)
                    ==> Trong các vòng lăp cho  phép bạn  sử dụng các hàm như: continue, break
                    ---> Từ hàm này cho phép bạn  sử dụng và vận  dùng vào mỗi công dụng cụ thể
![Vd: Sử dụng các vòng lặp](./tk_VòngLap.java)
///////////////////////////////////////// Array ////////////////////////////////
          - Khai báo mảng : <Kiểu> [] <Đặt_tên>= {<dữ_liệu_chuyền_vào>} ;
          - Khai báo mảng 2 chiều: <kiểu> [][] <đặt_tên> = {<dữ_Liêu_chuyen_vao>}

          - Khai báo mảng cũng có thể dùng  với thư viện bên ngoài .
          
![Vd: Sử dụng Arr](./tk_Array.java)

///////////////////////////////////////// Objects ////////////////////////////////