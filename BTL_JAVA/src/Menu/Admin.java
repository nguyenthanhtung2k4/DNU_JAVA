package Menu;
import java.util.List;
public class Admin {
     public Admin() {};
    public static Input input = new Input();

    @SuppressWarnings("static-access")
    public static void displayAdmin(String fileAcc, List<AccountBank> accounts) {
          int NhapADMIN;
          do {
               System.out.println("\n\t Quan Tri Vien");
               System.out.println("0 Thoat");
               System.out.println("1 Them tai khoan");
               System.out.println("2 Sua thong tin tai khoan");
               System.out.println("3 Xoa tai khoan");
               System.out.println("4 Danh sach tai khoan");
               NhapADMIN = input.nhap("Lua chon: ", Integer.class);

               switch (NhapADMIN) {
                    case 1:new AccountBank().Clear();
                         System.out.println("Them tai khoan");
                         new Sigup(fileAcc, accounts);
                         break;
                         
                    case 2:new AccountBank().Clear();
                         System.out.println("Sua thong tin tai khoan");
                         int idEdit = input.nhap("ID: ", Integer.class);
                         String format = "name,year,email,sex,adrees,phone,cccd,pass,money,id";
                         boolean isFound = false;

                         for (AccountBank acc : accounts) {
                              if (acc.getId() == idEdit) {
                                   String file = "./Data/accounts.csv";
                                   String name = input.nhap("Nhap name", String.class);
                                   int year = input.nhap("Nhap year", Integer.class);
                                   String email = input.nhap("Nhap email", String.class);
                                   String sex = input.nhap("Nhap sex ", String.class);
                                   String address = input.nhap("Nhap ads ", String.class);
                                   int phone = input.nhap("Nhap phone ", Integer.class);
                                   int cccd = input.nhap("Nhapcccd ", Integer.class);
                                   String password = input.nhap("Nhap pas ", String.class);
                                   int money = input.nhap("Nhap money ", Integer.class);

                                   String data = name + "," + year + "," + email + "," + sex + "," + address + "," +
                                                  phone + "," + cccd + "," + password + "," + money + "," + idEdit;
                                   ModifyCSV.displayCSV(idEdit, file, format, data);
                                   isFound = true;
                                   break;
                              }
                         }
                         if (!isFound) {
                              System.out.println("Khong tim thay Id User ");
                         }
                         break;    
                    case 3:new AccountBank().Clear();
                         System.out.println("Xoa tai khoan");
                         format = "name,year,email,sex,adrees,phone,cccd,pass,money,id";
                         idEdit = input.nhap("ID: ", Integer.class);
                         isFound = false;
                         for (AccountBank tk : accounts) {
                         if (tk.getId() == idEdit) {
                              ModifyCSV.displayCSVDelete(idEdit,fileAcc,format);
                              isFound = true;
                              break;
                         }
                         }

                         if (!isFound) {
                         System.out.println("Khong tim thay Id User ");
                         }
                         break;

                    case 4:new AccountBank().Clear();
                         System.out.println("Danh sach tai khoan");
                         int dem=0;
                         for (AccountBank acc : accounts) {
                              dem++;
                              System.out.println("Id: "+acc.getId());
                              System.out.println(acc);
                         }System.out.println("\n\t ==> Tong so  Acccount "+dem);
                         break;

                    case 0:new AccountBank().Clear();
                         System.out.println("Thoat khoi Quan Tri Vien");
                         break;

                    default:
                         System.out.println("Lua chon khong hop le!");
                         break;
               }
          } while (NhapADMIN != 0);
    }
}