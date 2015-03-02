/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import com.sun.java.swing.plaf.gtk.GTKLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


/**
 *
 * @author null
 */
public class Editor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
           MainFrame frame = new MainFrame();
           frame.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
