package OPP;

import java.awt.Color;
import javax.swing.*;

public abstract class BaseFrame extends JFrame {
   public BaseFrame(String title) { 
         super(title); 
         setBackground(Color.CYAN);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(700, 500);
         addJrame();
   }
   protected abstract void addJrame();
}
