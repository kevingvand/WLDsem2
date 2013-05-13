package Dialogs;

import Main.Scherm;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author kevinvandommele
 */
public class PakketToevoegenDialog extends JDialog implements ActionListener{
    private GroupLayout gl;
    private JPanel dialogPanel;
    private JLabel ttlAfleveradres, ttlAfhaaladres, ttlOpdrachtgever, ttlPakketInfo;
    
    private JLabel lbPlaatsnaamAfl, lbStraatAfl, lbHuisnummerAfl, lbPostcodeAfl;
    private JTextField tfPlaatsnaamAfl, tfStraatAfl, tfHuisnummerAfl, tfPostcodeAfl;
    
    private JLabel lbPlaatsnaamAfh, lbStraatAfh, lbHuisnummerAfh, lbPostcodeAfh;
    private JTextField tfPlaatsnaamAfh, tfStraatAfh, tfHuisnummerAfh, tfPostcodeAfh;
    
    private JLabel lbTelefoonOg, lbEmailOg, lbPlaatsnaamOg, lbStraatOg, lbHuisnummerOg, lbPostcodeOg;
    private JTextField tfTelefoonOg, tfEmailOg, tfPlaatsnaamOg, tfStraatOg, tfHuisnummerOg, tfPostcodeOg;
    
    private JLabel lbGewicht, lbAfmeting;
    private JTextField tfGewicht, tfAfmeting;
    
    private JButton btnAnnuleren, btnOpslaan;
    
    
    
    public PakketToevoegenDialog(JFrame frame){
        super(frame,true); 
        this.setResizable(false);
        this.dialogPanel = new JPanel();
        this.add(dialogPanel);
        this.gl = new GroupLayout(dialogPanel);
        this.gl.setAutoCreateContainerGaps(true);
        this.gl.setAutoCreateGaps(true);
        this.dialogPanel.setLayout(gl);
        
        //**BEGIN AFLEVERADRES VARIABELES**//
        
        this.ttlAfleveradres = new JLabel("Afleveradres");
        this.ttlAfleveradres.setFont(Scherm.SubKop);
        
        this.lbPlaatsnaamAfl = new JLabel("Plaatsnaam: ");
        this.lbStraatAfl = new JLabel("Straat: ");
        this.lbHuisnummerAfl = new JLabel("Huisnummer: ");
        this.lbPostcodeAfl = new JLabel("Postcode: ");
        
        this.tfPlaatsnaamAfl = new JTextField();
        this.tfStraatAfl = new JTextField();
        this.tfHuisnummerAfl = new JTextField();
        this.tfPostcodeAfl = new JTextField();

        //**EIND AFLEVERADRES VARIABELES**//
        //**BEGIN AFHAALADRES VARIABELES**//
        this.ttlAfhaaladres = new JLabel("Afhaaladres");
        this.ttlAfhaaladres.setFont(Scherm.SubKop);
        
        this.lbPlaatsnaamAfh = new JLabel("Plaatsnaam: ");
        this.lbStraatAfh = new JLabel("Straat: ");
        this.lbHuisnummerAfh = new JLabel("Huisnummer: ");
        this.lbPostcodeAfh = new JLabel("Postcode: ");
        
        this.tfPlaatsnaamAfh = new JTextField(10);
        this.tfStraatAfh = new JTextField();
        this.tfHuisnummerAfh = new JTextField();
        this.tfPostcodeAfh = new JTextField();
        //**EIND AFHAALADRES VARIABELES**//
        //**BEGIN OPDRACHTGEVER VARIABELES**//
        this.ttlOpdrachtgever = new JLabel("Opdrachtgever");
        this.ttlOpdrachtgever.setFont(Scherm.SubKop);
        
        this.lbTelefoonOg = new JLabel("Telefoonnummer: ");
        this.lbEmailOg = new JLabel("Emailadres: ");
        this.lbPlaatsnaamOg = new JLabel("Plaatsnaam: ");
        this.lbStraatOg = new JLabel("Straat: ");
        this.lbHuisnummerOg = new JLabel("Huisnummer: ");
        this.lbPostcodeOg = new JLabel("Postcode: ");
        
        this.tfTelefoonOg = new JTextField();
        this.tfEmailOg = new JTextField();
        this.tfPlaatsnaamOg = new JTextField();
        this.tfStraatOg = new JTextField();
        this.tfHuisnummerOg = new JTextField();
        this.tfPostcodeOg = new JTextField();
        //**EIND OPDRACHTGEVER VARIABELES**//
        //**BEGIN PRODUCTINFO VARIABELES**//  
        this.ttlPakketInfo = new JLabel("Pakketadres");
        this.ttlPakketInfo.setFont(Scherm.SubKop);
        
        this.lbAfmeting = new JLabel("Afmeting: ");
        this.lbGewicht = new JLabel("Gewicht: ");
        
        this.tfAfmeting = new JTextField();
        this.tfGewicht = new JTextField();
        
        this.btnAnnuleren = new JButton("Annuleren");
        this.btnOpslaan = new JButton("Opslaan");
        this.btnOpslaan.setPreferredSize(new Dimension(112, 25));
        
        this.btnAnnuleren.addActionListener(this);
        this.btnOpslaan.addActionListener(this);
        
        gl.setHorizontalGroup(gl.createParallelGroup()
            .addGroup(gl.createParallelGroup()
                .addGroup(gl.createParallelGroup()
                    .addComponent(ttlAfleveradres)
                    .addGroup(gl.createSequentialGroup()
                        .addGroup(gl.createParallelGroup()
                            .addComponent(lbPlaatsnaamAfl)
                            .addComponent(lbStraatAfl)
                            .addComponent(lbHuisnummerAfl)
                            .addComponent(lbPostcodeAfl)
                        )
                        .addGap(39)
                        .addGroup(gl.createParallelGroup()
                            .addComponent(tfPlaatsnaamAfl)
                            .addComponent(tfStraatAfl)
                            .addComponent(tfHuisnummerAfl)
                            .addComponent(tfPostcodeAfl)
                        )
                    )
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(ttlAfhaaladres)
                    .addGroup(gl.createSequentialGroup()
                        .addGroup(gl.createParallelGroup()
                            .addComponent(lbPlaatsnaamAfh)
                            .addComponent(lbStraatAfh)
                            .addComponent(lbHuisnummerAfh)
                            .addComponent(lbPostcodeAfh)
                        )
                        .addGap(39)
                        .addGroup(gl.createParallelGroup()
                            .addComponent(tfPlaatsnaamAfh)
                            .addComponent(tfStraatAfh)
                            .addComponent(tfHuisnummerAfh)
                            .addComponent(tfPostcodeAfh)
                        )
                    )
                )
            )
                
            .addGroup(gl.createParallelGroup()
                .addGroup(gl.createParallelGroup()
                    .addComponent(ttlOpdrachtgever)
                    .addGroup(gl.createSequentialGroup()
                        .addGroup(gl.createParallelGroup()
                            .addComponent(lbTelefoonOg)
                            .addComponent(lbEmailOg)
                            .addComponent(lbPlaatsnaamOg)
                            .addComponent(lbStraatOg)
                            .addComponent(lbHuisnummerOg)
                            .addComponent(lbPostcodeOg)
                        )
                        .addGroup(gl.createParallelGroup()
                            .addComponent(tfTelefoonOg)
                            .addComponent(tfEmailOg)
                            .addComponent(tfPlaatsnaamOg)
                            .addComponent(tfStraatOg)
                            .addComponent(tfHuisnummerOg)
                            .addComponent(tfPostcodeOg)
                        )
                    )
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(ttlPakketInfo)
                    .addGroup(gl.createSequentialGroup()
                        .addGroup(gl.createParallelGroup()
                            .addComponent(lbAfmeting)
                            .addComponent(lbGewicht)
                            .addComponent(btnAnnuleren)
                        )
                        .addGap(29)
                        .addGroup(gl.createParallelGroup()
                            .addComponent(tfAfmeting)
                            .addComponent(tfGewicht)
                            .addComponent(btnOpslaan)
                        )
                    )
                )
            )
       );
        
       gl.linkSize(SwingConstants.HORIZONTAL, btnOpslaan);

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addGroup(gl.createSequentialGroup()
                .addComponent(ttlAfleveradres)
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbPlaatsnaamAfl)
                    .addComponent(tfPlaatsnaamAfl)
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbStraatAfl)
                    .addComponent(tfStraatAfl)
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbHuisnummerAfl)
                    .addComponent(tfHuisnummerAfl)
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbPostcodeAfl)
                    .addComponent(tfPostcodeAfl)
                )
            )
            .addGroup(gl.createSequentialGroup()
                .addComponent(ttlAfhaaladres)
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbPlaatsnaamAfh)
                    .addComponent(tfPlaatsnaamAfh)
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbStraatAfh)
                    .addComponent(tfStraatAfh)
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbHuisnummerAfh)
                    .addComponent(tfHuisnummerAfh)
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbPostcodeAfh)
                    .addComponent(tfPostcodeAfh)
                )
            ) 
                .addGroup(gl.createSequentialGroup()
                .addComponent(ttlOpdrachtgever)
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbTelefoonOg)
                    .addComponent(tfTelefoonOg)
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbEmailOg)
                    .addComponent(tfEmailOg)
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbPlaatsnaamOg)
                    .addComponent(tfPlaatsnaamOg)
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbStraatOg)
                    .addComponent(tfStraatOg)
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbHuisnummerOg)
                    .addComponent(tfHuisnummerOg)
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbPostcodeOg)
                    .addComponent(tfPostcodeOg)
                )
            )
            .addGroup(gl.createSequentialGroup()
                .addComponent(ttlPakketInfo)
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbAfmeting)
                    .addComponent(tfAfmeting)
                )
                .addGroup(gl.createParallelGroup()
                    .addComponent(lbGewicht)
                    .addComponent(tfGewicht)
                )
            )
            .addGroup(gl.createParallelGroup()
                .addComponent(btnAnnuleren)
                .addComponent(btnOpslaan)
            )
        );
        
        
        //**BEGIN AFLEVERADRES FORMULIER**//
        //**EIND AFLEVERADRES FORMULIER**//
        //**BEGIN AFHAALADRES FORMULIER**//
        //**EIND AFHAALADRES FORMULIER**//
        //**BEGIN OPDRACHTGEVER FORMULIER**//
        //**EIND OPDRACHTGEVER FORMULIER**//
        //**BEGIN PAKKETINFO FORMULIER**//
        //**EIND PAKKETINFO FORMULIER**//
        
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.btnAnnuleren){this.setVisible(false);}
    }
}
