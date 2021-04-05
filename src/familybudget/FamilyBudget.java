/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package familybudget;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Confidence pc
 */
public class FamilyBudget {

   static Timer timer;
    static SplashPage1 sp;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        timer = new Timer(5000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               timer.stop();
               sp.dispose();
               new Login().setVisible(true);
               
                
            }
        });
        sp = new SplashPage1();
        sp.setVisible(true);
        timer.start();
    }
}
