package DATA;

public class User {
      private String username;
      private double total;
      private long stk;

      // Constructor
      public User(String username, double total, long stk) {
         this.username = username;
         this.total = total;
         this.stk = stk;
      }

      // Getter và Setter cho các thuộc tính
      public String getUsername() {
         return username;
      }

      public void setUsername(String username) {
         this.username = username;
      }

      public double getTotal() {
         return total;
      }

      public void setTotal(double total) {
         this.total = total;
      }

      public long getStk() {
         return stk;
      }

      public void setStk(long stk) {
         this.stk = stk;
      }

      // Hàm cộng thêm tiền vào tài khoản
      public void addMoney(double amount) {
         this.total += amount;
      }
      public  void moveMoney(double amount) {
            this.total -= amount;
      }
      public boolean  checkMoney() {
         if (this.total>0) {
            return  true;
         } else {
            return false;
         }
      }
}
