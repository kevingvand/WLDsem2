package Panels;

import Dialogs.PakketToevoegenDialog;
import Main.Scherm;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

/**
 *
 * @author Oliver
 */
public class PakketPanel extends JPanel implements ActionListener {
        private JLabel titel;
        private GroupLayout gl;
        private JSeparator line;
        private JButton btnToevoegen;
        private PakketToevoegenDialog ptDia;
    
    public PakketPanel(JFrame frame){
        this.gl = new GroupLayout(this);
        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);
        this.setLayout(gl);
        this.titel = new JLabel("Pakketten");
        this.titel.setFont(Scherm.defTitel);
        this.line = new JSeparator();
        this.btnToevoegen = new JButton("Nieuw Pakket Toevoegen");
        this.ptDia = new PakketToevoegenDialog(frame);
        
        this.btnToevoegen.addActionListener(this);
        
        gl.setHorizontalGroup(gl.createParallelGroup()
                .addComponent(titel)
                .addComponent(line)
                .addGroup(gl.createParallelGroup()
                    .addComponent(btnToevoegen)
                )
        );
        
        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(titel)
                .addComponent(line)
                .addGroup(gl.createParallelGroup()
                    .addComponent(btnToevoegen)
                )
        );
    }   

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == btnToevoegen){
            ptDia.setVisible(true);
        }
    }
}
