package Main;


import javax.swing.UIManager;


/**
 *
 * @author Oliver
 */
public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
            //"javax.swing.plaf.metal.MetalLookAndFeel");
            //  "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            UIManager.getCrossPlatformLookAndFeelClassName());
            //"com.apple.laf.AquaLookAndFeel");
            //System.out.println(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Scherm scherm = new Scherm();
    }
}
