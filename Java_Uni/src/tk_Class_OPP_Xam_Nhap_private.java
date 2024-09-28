
import java.lang.reflect.Field;

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Gửi tiền thành công!");
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rút tiền thành công!");
        } else {
            System.out.println("Số tiền rút không hợp lệ.");
        }
    }
}

public class tk_Class_OPP_Xam_Nhap_private{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Account account = new Account(1000);

        // Sử dụng Reflection để truy cập và thay đổi thuộc tính private
        Field balanceField = Account.class.getDeclaredField("balance");
        balanceField.setAccessible(true);
        balanceField.set(account, 2000);

        System.out.println(account.getBalance()); // Sẽ in ra 2000
    }
}