package Panels;

import Main.Scherm;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle;

/**
 *
 * @author Oliver
 */
public class CollectiepuntPanel extends JPanel{
    private JLabel titel, test, test1, test2, test3, test4, test5, test6;
    private JSeparator line;
    private GroupLayout gl;
    
    public CollectiepuntPanel(){
        this.gl = new GroupLayout(this);
        gl.setAutoCreateGaps(true);
        gl.setAutoCreateContainerGaps(true);
        this.setLayout(gl);
        
        this.titel = new JLabel("Collectiepunten");
        this.titel.setFont(Scherm.defTitel);
        this.test = new JLabel("testje0");
        this.test1 = new JLabel("testje1");
        this.test2 = new JLabel("testje2");
        this.test3 = new JLabel("testje3");
        this.test4 = new JLabel("testje4");
        this.test5 = new JLabel("testje5");
        this.test6 = new JLabel("testje6");
        this.line = new JSeparator();
        
        gl.setHorizontalGroup(gl.createParallelGroup()
            .addComponent(titel)
            .addComponent(line)
            .addGroup(gl.createSequentialGroup()
                .addComponent(test1)
                .addComponent(test2)
                .addComponent(test3)
                .addComponent(test4)
                .addComponent(test5)
            )
        );
        
        gl.setVerticalGroup(gl.createSequentialGroup()
            .addComponent(titel)
            .addComponent(line)
            .addGroup(gl.createParallelGroup()
                .addComponent(test2)
                .addComponent(test1)
                .addComponent(test3)
                .addComponent(test4)
                .addComponent(test5)
            )
        );

    }
}
