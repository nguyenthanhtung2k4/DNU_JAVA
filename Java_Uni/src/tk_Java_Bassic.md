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



////////////////////////////////////// Quan trong //////////////////
          - Khai báo thư viện  Scanner : 

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


///////////////////////////////////////// Vòng lặp ////////////////////////////////
          if else
          while
          swich case
///////////////////////////////////////// Array ////////////////////////////////
          - Khai báo mảng : <Kiểu> <Đặt_tên> = {<dữ_liệu_chuyền_vào>} ;
          -  Khai báo mảng cũng có thể dùng  với thư viện bên ngoài .

![Vd: Sử dụng Arr](./tk_Array.java)

///////////////////////////////////////// Objects ////////////////////////////////