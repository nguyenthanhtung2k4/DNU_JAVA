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

          %s: Đại diện cho một chuỗi (String). 
          %d: Đại diện cho một số nguyên (integer). Tương tự như %s, %d sẽ được thay thế bằng giá trị số nguyên tương ứng.
          %a: Đây không phải là một định dạng chuẩn trong Java.%f (số thực)
          %x (số nguyên thập lục phân)
               ==> dung prinrf ()
```java
          String name = "John Doe",a="tung";
          int age = 30,b=2004;
          double salary = 5000.5;
          System.out.printf("Tên: %s, Tuổi: %d, Lương: %.2f", name, age, salary);

          System.out.printf("name%10sage%12d%n", a, b);
          System.out.printf("name%-10sage %-12d", a, b);
          System.out.printf("%-10s%-10s%-10s\n", "Loai", "Gia", "BoiThuong");

``
               System.out.print("\033[H\033[2J");
               System.out.flush();
          ==>  Clear terminal( Sử dụng ký tự ANSI)
////////////////////////////////////// Gợi ý //////////////////
          - Mỗi lần viết code xong xuống dòng phải có ;
          - Khái báo thư viẹn : import java.{tên_thư_viện}
          - + (Dấu cộng sẽ cho phép bạn liên kết với a với b thành c)
```java
                         a=10;
                         System.out.print("tung"+a)
```

////////////////////////////////////// Các hàm trong Java inport  //////////////////////////////////////////
     - length :  Kiểm tra độ dài của mảng , object ....
     - toUppercase() : in hoa
     - toLowerCase() : in thuong
     - toArray() : Chuyển đổi từ kiểu dữ liệu khác sang mảng.
     - isEmpty() : Kiểm tra chúng có tồn tại hay không.
     - strim() : Loại bỏ khoảng trắng
     - container(<phanntu>) : Kiểm tra chúng có trong mảng, set , map  hay  không .
     - concat () or jonin() : Thêm chuỗi
     - indeOf() : tìm vị trí trong chuỗi
     - super  : truy xuất thằng cha trong class ( OPP: Lập trình hướng đôí tượng)
     - equals() : so  sánh hai  chuỗi có bằng không (True :  có | False : không)
     - equalsIgnoreCase() : không phân biệt chữ hoa chứ thường.
     instanceof  - kiểm tra kiểu dữ  liệu

////////////////////////////////////// Quan trong import //////////////////
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

                         hasNext() :  true | false (Hiểu đơn giản là trả về lần lượt)
                              -> next()
                         hasprevious() : (đơn  giản là trả ngược lại  lần lượt)
                              -> previous()
                         -> LinkThamKhao : https://www.codecademy.com/resources/docs/java/iterator/previous
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
///////////////////////////////////////// Các kiểu lưu  trữ khác  ////////////////////////////////
ArrayList: ( Hoạt động bằng  giống  mảng )
          Là lớp triển khai List được sử dụng phổ biến nhất.
          `Dựa trên mảng động`, cho phép truy cập nhanh các phần tử bằng chỉ số.
          Thích hợp cho việc truy xuất ngẫu nhiên các phần tử.
LinkedList: ( Hoạt động như danh sách liết kết kép )
          Mỗi phần tử trong `LinkedList` chứa một tham chiếu đến phần tử trước và phần tử sau.
          Thích hợp cho việc chèn và xóa các phần tử ở đầu hoặc cuối danh sách.
          Ít hiệu quả hơn ArrayList khi truy xuất ngẫu nhiên.
Vector: ( )
          Là một phiên bản `đồng bộ` của ArrayList.
          Nên tránh sử dụng Vector trừ khi bạn thực sự cần đồng bộ hóa.

Set: (hoạt  động  giống Set python)
     Đặc điểm:
          Không cho phép phần tử trùng lặp.
          Không có thứ tự xác định cho các phần tử.
     Sử dụng:
          Khi bạn cần một tập hợp các phần tử duy nhất.
          Ví dụ: Lưu trữ các số nguyên tố, các từ khóa trong một từ điển.

Stack:
          Là một lớp đặc biệt của Vector, thực hiện theo nguyên tắc LIFO (Last In First Out).
          Thường được sử dụng để thực hiện các thao tác như push, pop.
          
Queue:
     Đặc điểm:
          Tuân theo nguyên tắc FIFO (First In First Out).
          Phần tử được thêm vào cuối danh sách và lấy ra ở đầu.
     Sử dụng:
          Mô phỏng các hàng đợi, xử lý các tác vụ theo thứ tự.
          Lớp triển khai: Queue, PriorityQueue
-----------------------------------------------------------
Map:  giống  dictionary ( json ) trong python
     Đặc điểm:
          Lưu trữ các cặp khóa-giá trị.
          Mỗi khóa phải là duy nhất.
     Sử dụng:
          Khi bạn cần ánh xạ giữa các khóa và giá trị.
          Ví dụ: Lưu trữ thông tin sinh viên (key là mã sinh viên, value là đối tượng sinh viên).
**Cách dùng**:
     `Map.of()` : Khai báo cùng lúc nhiều giá trị luôn
     `HashMap()`: Khai báo thêm  1 giá trị một
     ===> Ví dụ bên dưới. ![Vd:Sử dụng Map](./tk_Storage_Map.java)
-----------------------------------------------------------




## ==> Cấu trúc khai báo và dùng  chúng như nhau
### Cách dùng:
Các phương thức bên dưới:
               <KiểuLuu_trữ><type> new  :  khai báo  khởi tạo  cho  chúng
               add(<phanTu>) : thêm phần tử 
               put(<phanTu>) : thêm phần tử trong( `Map` )
               set(<vitri> , <phantuUpdate>) : cập nhập update vao kieu  lu tru
               get(<index>)  : Truy vấn
               contains(<phanTu>): Kiểm tra xem phần tử có tồn tại trong danh sách hay không.
               remove(<index>) : Xóa phần tử vị trí chỉ định
               remove(<giá_trị>) : Xóa phần tại giá trị
               clear() : Xóa tất cả các phần tử
               for-each()     : duyệt tất cả các phần  tử
               size()         : Kiểm tra kích thước của kiểu lưu trữ
               isEmpty() : Kiểu tra có giỗng hay không
               toArray() : Chuyển về mảng ( `trong_Set`)

==> ArrayList + LinkList + Vectoer  :  Chúng dùng giống  nhau


**Chú ý: Khi khai báo trong lưu trữ ta cũng có thể dùng list<type> = new <Cấu trú_DanhSach>**

*vd: List<int> tung= new ArrayList();*
*vd: List<int> tung= new Vector();*

**List hiểu đơn giản là một kiểu danh sách trong đó nó có thể tham chiếu đến bất kì danh sách nào chứa phần tử**


![Vd: sử dụng ArrayList](./tk_Storage_ArrayList.java)
![Vd: sử dụng Set ](./tk_Storage_Set.java)
![Vd: sử dụng Map ](./tk_Storage_Map.java)

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
##             Cac kieu  trong quat:
                    -  E : Các phần trong một collection
                    -  K : KIểu khóa trong Map
                    -  V : Kiểu giá trị trong Map
                    -  T : Các kiể thông thường
                    -  S, U: Các kiểu thông thường khác.
                    -  Object : 

##          - Collections Framework:
                    - Set :  không cho  lập lại các kiểu dữ liệu giống nhau
                    - List : Tập các đối tuognjw tuần tự kế tiếp nhau, có thể lặp.
                    - Map: Tập các giá trị (key - value) và không cho phép khóa lặp lại
               -  Cây cấu trúc giao diện Collection:
                         |_Collection : Giao diện gốc cho tất cả các tập hợp
                              |_Set : Tập hợp không trùng lặp
                                   |__HashSet : Lưu trữ phần tử không trùng lặp, không duy trì thứ tự
                                   |__SortedSet : Lưu trữ phần tử không trùng lặp, tự động sắp xếp
                                        |___TreeSet : Sắp xếp phần tử theo thứ tự tự nhiên hoặc Comparator

                              |_List : Tập hợp có thể trùng lặp, duy trì thứ tự chèn
                                   |__ArrayList : Truy cập phần tử nhanh, duy trì thứ tự chèn
                                   |__Vector : Tương tự ArrayList nhưng thread-safe
                                   |__LinkedList : Chèn/xóa nhanh, duy trì thứ tự chèn

                              |_Map : Tập hợp các cặp khóa-giá trị
                                   |__HashMap : Lưu trữ cặp khóa-giá trị, không duy trì thứ tự
                                   |__Hashtable : Tương tự HashMap nhưng thread-safe
                                   |__SortedMap : Lưu trữ cặp khóa-giá trị, tự động sắp xếp
                                        |___TreeMap : Sắp xếp cặp khóa-giá trị theo thứ tự tự nhiên hoặc Comparator





##          - Collections Thuộc tính (interface) :
               |_ Collection
                    |__ size() : Trả về số phần tử trong collection (int)
                    |__ isEmpty() : Kiểm tra xem collection có rỗng không (boolean)
                    |__ contains(Object o) : Kiểm tra xem collection có chứa phần tử cụ thể không (boolean)
                    |__ iterator() : Trả về một iterator để lặp qua các phần tử trong collection
                    |__ toArray() : Chuyển đổi collection thành một mảng
                    |__ add(E e) : Thêm phần tử vào collection (boolean)
                    |__ remove(Object o) : Xóa phần tử ra khỏi collection (boolean)
                    |__ containsAll(Collection<?> c) : Kiểm tra xem collection có chứa tất cả các phần tử của collection khác không (boolean)
                    |__ addAll(Collection<? extends E> c) : Thêm tất cả các phần tử từ collection khác vào collection hiện tại (boolean)
                    |__ removeAll(Collection<?> c) : Xóa tất cả các phần tử của collection khác ra khỏi collection hiện tại (boolean)
                    |__ retainAll(Collection<?> c) : Giữ lại các phần tử trong collection hiện tại mà cũng nằm trong collection khác (boolean)
                    |__ clear() : Xóa tất cả các phần tử trong collection
                    |__ equals(Object o) : So sánh collection với một đối tượng khác (boolean)
                    |__ hashCode() : Trả về hash code của collection (int)

                    |_ Set (Kế thừa từ Collection)
                         |__ first() : Trả về phần tử đầu tiên trong tập hợp (E)
                         |__ last() : Trả về phần tử cuối cùng trong tập hợp (E)
                         |__ comparator() : Trả về comparator được sử dụng để sắp xếp, nếu có (Comparator<? super E>)
                         |__ subSet(E fromElement, E toElement) : Trả về một tập hợp con từ fromElement đến toElement (SortedSet<E>)
                         |__ headSet(E toElement) : Trả về một tập hợp con từ đầu đến toElement (SortedSet<E>)
                         |__ tailSet(E fromElement) : Trả về một tập hợp con từ fromElement đến cuối (SortedSet<E>)

                    |_ List (Kế thừa từ Collection)
                         |__ get(int index) : Trả về phần tử tại vị trí chỉ định (E)
                         |__ set(int index, E element) : Thay đổi phần tử tại vị trí chỉ định (E)
                         |__ add(int index, E element) : Chèn phần tử vào vị trí chỉ định (void)
                         |__ remove(int index) : Xóa phần tử tại vị trí chỉ định (E)
                         |__ indexOf(Object o) : Trả về vị trí của phần tử đầu tiên xuất hiện trong list (int)
                         |__ lastIndexOf(Object o) : Trả về vị trí của phần tử cuối cùng xuất hiện trong list (int)
                         |__ listIterator() : Trả về một list iterator để lặp qua các phần tử trong list
                         |__ listIterator(int index) : Trả về một list iterator bắt đầu từ vị trí chỉ định
                         |__ subList(int fromIndex, int toIndex) : Trả về một phần của list từ vị trí fromIndex đến toIndex

                    |_ Map (Không kế thừa từ Collection)
                         |__ put(K key, V value) : Thêm hoặc thay thế một cặp khóa-giá trị trong map (V)
                         |__ get(Object key) : Trả về giá trị tương ứng với khóa chỉ định (V)
                         |__ remove(Object key) : Xóa cặp khóa-giá trị tương ứng với khóa chỉ định (V)
                         |__ containsKey(Object key) : Kiểm tra xem map có chứa khóa chỉ định không (boolean)
                         |__ containsValue(Object value) : Kiểm tra xem map có chứa giá trị chỉ định không (boolean)
                         |__ keySet() : Trả về một tập hợp các khóa trong map (Set<K>)
                         |__ values() : Trả về một collection các giá trị trong map (Collection<V>)
                         |__ entrySet() : Trả về một tập hợp các entry (khóa-giá trị) trong map (Set<Map.Entry<K, V>>)

[Vd:Sử dụng Set](./tk_Class_OPP_TongQuat_Set.java)
[Vd:Sử dụng List](./tk_Class_OPP_TongQuat_List.java)
[Vd:Sử dụng Map](./tk_Class_OPP_Tongquat_Map.java)
[Vd:Sử dụng List](./tk_Class_OPP_TongQuat_Collections.java)

##          - Giao diện iterator và Comparator :
###               - Interator :(Lặp) Duyệt toàn bộ nội dung của toàn bộ nội dung. Sắp xếp theo thứ tự.
               - Các thuộc tính Iterator:
                    |_ Iterator
                         |__ hasNext() : Kiểm tra xem còn phần tử để duyệt tiếp không (boolean)
                         |__ next() : Trả về phần tử tiếp theo (E)
                         |__ remove() : Xóa phần tử cuối cùng được trả về (void)

                         |_ ListIterator (con của Iterator)
                              |__ hasNext() : Kiểm tra xem còn phần tử để duyệt tiếp không (boolean)
                              |__ next() : Trả về phần tử tiếp theo (E)
                              |__ hasPrevious() : Kiểm tra xem còn phần tử phía trước không (boolean)
                              |__ previous() : Trả về phần tử trước đó (E)
                              |__ nextIndex() : Chỉ số của phần tử tiếp theo (int)
                              |__ previousIndex() : Chỉ số của phần tử trước đó (int)
                              |__ set(E e) : Thay thế phần tử cuối cùng bằng phần tử chỉ định (void)
                              |__ add(E e) : Chèn phần tử chỉ định vào list (void)

[Vd:Sử dụng Iterator](./tk_Class_OPP_TongQuat_Iterator.java)

###               - Comparator:(So sánh) CHO PHÉP bạn so sánh hai đối tượng trong tập hợp. PHẢI ĐỊNH NGHĨA PHƯƠNG THỨC 
                    - Một Comparatoe  phải định nghiawx một phương thức compare() Lấy tham số Ọect  và trả về -1, 0  hoặc 1
                    - KHÔNG CẦN THIẾT LẬP TẬP HỢP ĐÃ CÓ KHẢ NĂNG SO SÁNH TỰ NHIÊN(string ,  integer...)

[Vd:Sử dụng Comparator](./tk_Class_OPP_TongQuat_Comparator.java)

##          - Kí tự đại diện:
               <?>: Đại diện cho bất kỳ kiểu dữ liệu nào.
               <? extends T>: Đại diện cho bất kỳ kiểu dữ liệu nào là lớp con của T hoặc chính T.
               <? super T>: Đại diện cho bất kỳ kiểu dữ liệu nào là lớp cha của T hoặc chính T.
               T : thường là khi muốn xuất hiện ở một ví trí nào đó.

[Vd:Sử lý ngoại lệ <?>](./tk_Class_OPP_KiTuDaiDien_1.java)
[Vd:Sử lý ngoại lệ <? extends T>](./tk_Class_OPP_KiTuDaiDien_2.java)
[Vd:Sử lý ngoại lệ <? supper T>](./tk_Class_OPP_KiTuDaiDien_3.java)
z


# Xử lý ngoại lệ:
-    `try` :  Trường hợp ngoại lệ có thể xảy ra.
-    `catch`: Sử lý ngoại lệ
-    `finally`: Luôn thực hiện ngoại lệ dù có lỗi hay không.
-    `thorow`:  Dùng để ném ra một ngoại lệ.
-    `thorows`: Được khai báo trong chữ ký của phương thức để biểu thị rằng phương thức này có thể ném ra một ngoại lệ.
- `Lấy thông tin ngoại lệ`:
          + getMessage() : Lấy thông tin ngoại lệ.
          + getString() : Mô tả ngắn gọn về ngoại lệ
          + printStacjTrace() : In ra tất cả các thông tin liên quan đến ngoại lệ (tên ,  loại, vị trí )

--> Try lồng try cũng có thể cho phép bạn lồng nhau.
## Các trường hợp ngoại lệ hay gặp:
-    **InputMismatchException**: Bắt lỗi khi người dùng nhập vào không phải là số nguyên.
-    **FileNotFoundException** : (IOException)Xảy ra khi có lỗi liên quan đến nhập xuất (ví dụ: file không tồn tại).
-    **NullPointerException**: Xảy ra khi bạn cố gắng truy cập một đối tượng null.
-    **ArrayIndexOutOfBoundsException**: Xảy ra khi bạn truy cập một phần tử không tồn tại trong mảng.
-    **ArithmeticException**: Xảy ra khi có một phép toán số học không hợp lệ (ví dụ: chia cho 0).
-    **SQLException**: Xảy ra khi có lỗi liên quan đến cơ sở dữ liệu.
-    **NumberFormatException**: Xảy ra khi cố gắng chuyển đổi một chuỗi thành số nhưng không thành công.
-    **IllegalArgumentException**: Xảy ra khi một phương thức nhận được một đối số không hợp lệ.
-    **ClassNotFoundException**: Xảy ra khi bạn cố gắng load một class mà không tồn tại.


``` java
          try {
               // Code trường hợp ngoại lệ
          } catch (Exception e) {
               // Xử lý lỗi chia cho 0
          }
```
![Vd:Xử_lý_ngoại_lệ](./tk_try_catch_XuLyNgoaiLe.java)

# input  or output: (luư file i/o)
-    **File()**:
     -    **FileWrite()**: Dùng để ghi các kí tự
          -    **read()**: Dùng để đọc với char
          -    **write()**: Làm việc với char
-    **PrintWrite()**: In trực tiếp ra màn hình +  ghi file.
     -    **read()**: Dùng để đọc với char
     -    **write()**: Làm việc với char
-    **buferedReader**: 
     -    **buferedReader.close()**: 
     -    **buferedReader.close()**: 
     -    **write()**: Làm việc với char
     -    **read()**: Dùng để đọc với char
-    **FileReader**: Dùng để đọc
     -    **write()**: Làm việc với char
     -    **read()**: Dùng để đọc với char
-    **FileOutputStream()**: 
-    **FileInputStream()**: 
     -    **DataInputStream()**: 
     -    **DataOutpurStream()**: 
     -    **ObjectInputStream()**: 
     -    **ObjectOutputStream()**:
          -    **writeObject()**:  
     -    *Ưu nhược điểm của Object  và data*

# Luồng trong java: 
-    **Scanner()**: 
---> Bên trên đã có rồi, tìm kiếm bên trên để có thể hiểu hơn về Scanner(nextLine(), hasNextLine() .....)


## Các lớp xử lý io  trong java:
               -java.lang.Object
                         |_InputStream
                                   |_
                                   |_
                                   |_
## Lớp File:


# UML (unified  Moedeing language):  Mô hình hóa.


///////////////////////////////////////// JFame (Giao diện destop java) //////////////////////
# JFrame là gì?
     - Hiểu đơn giản nó là một trong những thư viên cho phép bạn tạo ra phần mềm chạy trên pc ( viết bằng Java)
-    **Lưu ý**: Container và JPanel ==> Liên quan đến phân bố cục giao diện nhưng chúng khác nhau 1 chút.
![Sự khác nhau của Container và JPanel](./tk_Container_VS_JPanel.txt)

# Các hàm liên quan JFrame tham khảo bên dưới:
![Tham khảo JFrame cơ bản](./tk_JFrame_Java(Giaodien_Destop).csv)
![Tham khảo JFrame nâng cao đầy đủ hơn](./tk_JFrame_Java.md)