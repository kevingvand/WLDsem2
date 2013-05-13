package Panels;

import Main.Scherm;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

/**
 *
 * @author Oliver
 */
public class KoerierPanel extends JPanel {
        private JLabel titel;
        private JSeparator line;
        private GroupLayout gl;
        
    
    public KoerierPanel(){
        super();
        this.gl = new GroupLayout(this);
        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);
        this.setLayout(gl);
        this.titel = new JLabel("Koeriers");
        this.titel.setFont(Scherm.defTitel);
        this.line = new JSeparator();
        
        gl.setHorizontalGroup(gl.createParallelGroup()
                .addComponent(titel)
                .addComponent(line)
        );
        
        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(titel)
                .addComponent(line)
        );
    }   
}