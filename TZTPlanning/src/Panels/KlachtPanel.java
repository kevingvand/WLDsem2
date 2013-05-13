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
public class KlachtPanel extends JPanel {
    private JLabel titel;
    private GroupLayout gl;
    private JSeparator line;
    
    public KlachtPanel(){
        this.gl = new GroupLayout(this);
        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);
        this.setLayout(gl);
        this.titel = new JLabel("Klachten");
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
