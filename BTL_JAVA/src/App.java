
import OPP.L

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class App{
    public static void main(String[] args) throws Exception {
        Login login = new Login();
        login.setVisible(true);
        System.out.println("Status "+login.Status());
    }
}

//  lamf viec voi   my sql  cho  toi
//  tao void NewAcc (  dang ky tk)