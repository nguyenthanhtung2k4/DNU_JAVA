package OPP;

public class Login_Sigup {
    // Lớp baseBank
    class baseBank {
        private String name;
        private String password;

        public baseBank(String name, String password) {
            this.name = name;
            this.password = password;
        }

        // Getters và setters
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    // Lớp Sigup
    public class Sigup extends baseBank {  // Thêm 'public' để có thể truy cập bên ngoài
        private String address;
        private int accountNumber;
        private double balance;

        public Sigup(String name, String password, String address, int accountNumber) {
            super(name, password);
            this.address = address;
            this.accountNumber = accountNumber;
            this.balance = 0;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }

    // Lớp Login
    public class Login extends baseBank {  // Thêm 'public' để có thể truy cập bên ngoài
        public Login(String name, String password) {
            super(name, password);
        }

        public boolean checkLogin(String name, String password) {
            return this.getName().equals(name) && this.getPassword().equals(password);
        }
    }

    // Phương thức signup
    public Sigup signup(String name, String password, String address, int accountNumber) {
        Sigup newUser = new Sigup(name, password, address, accountNumber);
        System.out.println(" Success account" + name);
        return newUser;
    }

    // Phương thức login
    public boolean login(Sigup user, String name, String password) {
        Login loginUser = new Login(user.getName(), user.getPassword());
        return loginUser.checkLogin(name, password);
    }
}
