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

////////////////////////////////////// Các hàm trong Java  //////////////////////////////////////////
     - length :  Kiểm tra độ dài của mảng , object ....
     - toUppercase() : in hoa
     - toLowerCase() : in thuong
     - strim() : Loại bỏ khoảng trắng
     - concat () or jonin() : Thêm chuỗi
     - indeOf() : tìm vị trí trong chuỗi
     - supper  : truy xuất thằng cha trong class ( OPP: Lập trình hướng đôí tượng)
     - equals() : so  sánh hai  chuỗi có bằng không (True :  có | False : không)


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
          - final :  Biến này không cho phép bạn thay đổi giá trị ( cố  định)
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
          if else :  Cách sử dụng giống c++
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

///////////////////////////////////////// Sử lý ngoại lệ  (try -  catch )//////////////////////
          try :  Nhập trường hợp ngoại lệ
          catch: Trường hợp sử lý ngoại lệ
#               - Các trường hợp ngoại lệ hay gặp:
                         InputMismatchException: Bắt lỗi khi người dùng nhập vào không phải là số nguyên.
                         FileNotFoundException : (IOException)Xảy ra khi có lỗi liên quan đến nhập xuất (ví dụ: file không tồn tại).
                         NullPointerException: Xảy ra khi bạn cố gắng truy cập một đối tượng null.
                         ArrayIndexOutOfBoundsException: Xảy ra khi bạn truy cập một phần tử không tồn tại trong mảng.
                         ArithmeticException: Xảy ra khi có một phép toán số học không hợp lệ (ví dụ: chia cho 0).
                         SQLException: Xảy ra khi có lỗi liên quan đến cơ sở dữ liệu.
                         NumberFormatException: Xảy ra khi cố gắng chuyển đổi một chuỗi thành số nhưng không thành công.
                         IllegalArgumentException: Xảy ra khi một phương thức nhận được một đối số không hợp lệ.

``` java
          try {
               // Code trường hợp ngoại lệ
          } catch (Exception e) {
               // Xử lý lỗi chia cho 0
          }
```
![Vd:Xử_lý_ngoại_lệ](./tk_try_catch_XuLyNgoaiLe.class)



///////////////////////////////////////// Claass (OPP OOP: Hướng đối tượng) //////////////////////

          - class <TênClass> {} : Để khai báo cho hướng đối tượng:
          - class <TênClass> extends <ClassCon> {} :  Cho phép bạn gọi lại class con trong cha
          - New :  Cho  phép bạn Khởi tạo  Class
          - Các phương thức khởi tạo:   không có giá trị trả về.
                              + Có tham số
                              +  Không tham số (Mặc định)

#          - Các phuong thức Class:
                              class:
                              void : Là chỉ in ra không có kiểu trả về ( giống c++)
                              static :Nó giống như biến toàn cục trọng (python , php) biến được lưu trữ trong chương trình.Và có thể gọi lại trong bất kì lúc nào.
                              int,  string.... trả về dữ liệu (  giống c++ )
![VD:Biến_Static](./tk_Class_OPP_Xam_Nhap_private.java)

                              final :  Không cho phép thay đổi giá trị.


#          - Tính kết tập OPP: 
                    --> Cho phép bạn  tái sử dụng  code ngoài ra
![Vd1:Sử dụng Kết tập](./tk_Class_OPP_KeTap.java)
![Vd2:Sử dụng Kết tập](./tk_Class_OPP_KeTap2.java)

#          - Tính Kế thừa OPP: Cho phép bạn kế thừa  code cha vào code con
               <ClassCon> extends  <ClassCha>
               supper : cho  phép bạn  kết thừa class lớp cha sàn thằngcon

               - Ngoài ra chúng còn kế thừa đa cấp ( hiểu đơn giản là cháu -> kế thừa -> Cha  --> Kế thừa --> Ông )
![VD: Cách sử dụng Kế thừa](./tk_Class_OPP_KeThua.java)
![VD: Nguyên lý kế thừa](./tk_4Nguyên%20Lý%20Kế%20Thừa%20(%20private,%20protected,public).png)

**==>  Sử khác nhau  của Kết tập và Kế thừa là:**
                    + Kế tập : Là các đối tượng độc lập ( Lớp này là đối tượng của lớp kia)
                    + Kế thừa: Là cho phép bạn tái sử dụng code cha trong thằng con

![So Sanh Kế Tập và Kế Thừa](./tk_4%20Sử%20khác%20nhau%20của%20Kết%20Tập%20và%20%20Kế%20Thừa.png)


#          -  Tính đóng gói:
                              public	: Bất kỳ đâu trong chương trình
                              protected	: Trong lớp, các lớp con và các lớp trong cùng gói
                              private	: Chỉ trong lớp cha 
#          - Tính đa hình : Cho phép bạn sử dụng lại hàm của thằng cha
                         @Override
                    -->  

![VD: Cách sử dụng đa hình](./tk_Class_OPP_DaHinh.java)
          
#          - Tính trừ tượng :  Cho  phép bạn khai báo trước rồi dùng đa hình để gọi lại (Xem ví dụ để hiểu dõ hơn.)
                         abstract class <Tên_Class>
![Vd: Cách sử dụng tính năng trừu tượng](./tk_Class_OPP_TruuTuong.java)

#          - package 
          
#          - Tổng quát: 

///////////////////////////////////////// JFame (Giao diện destop java) //////////////////////
# JFrame là gì?
     - Hiểu đơn giản nó là một trong những thư viên cho phép bạn tạo ra phần mềm chạy trên pc ( viết bằng Java)
-    **Lưu ý**: Container và JPanel ==> Liên quan đến phân bố cục giao diện nhưng chúng khác nhau 1 chút.
![Sự khác nhau của Container và JPanel](./tk_Container_VS_JPanel.txt)

# Các hàm liên quan JFrame tham khảo bên dưới:
![Tham khảo JFrame cơ bản](./tk_JFrame_Java(Giaodien_Destop).csv)
![Tham khảo JFrame nâng cao đầy đủ hơn](./tk_JFrame_Java.md)