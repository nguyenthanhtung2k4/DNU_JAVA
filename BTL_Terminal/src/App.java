import OPP.Login_Sigup;

public class App {
    public static void main(String[] args) {
        // Tạo đối tượng Login_Sigup
        Login_Sigup tung = new Login_Sigup();

        // // Đăng ký một tài khoản mới bằng phương thức signup
        // Login_Sigup.Sigup sigup = tung.signup("tung", "2004", "ha noi", 123456789);

        // // Kiểm tra đăng nhập
        // boolean isLoggedIn = tung.login(sigup, "tung", "2004");

        // if (isLoggedIn) {
        //     System.out.println("Success");
        // } else {
        //     System.out.println("Fall Success");
        // }

        Login_Sigup.Sigup tung2=  new Login_Sigup.Login("thanhtung","2004");
        tung2.checkLogin("thanhtung","2004");
    }
}
