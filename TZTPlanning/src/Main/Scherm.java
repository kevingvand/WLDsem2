package Main;


import Panels.CollectiepuntPanel;
import Panels.PakketPanel;
import Panels.RoutePanel;
import Panels.KoerierPanel;
import Panels.KlachtPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import Panels.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Oliver
 */
public class Scherm extends JFrame implements MenuListener{
    private JMenuBar menu;
    private JMenu mnuCollectiepunt, mnuKoeriers, mnuKlachten, mnuPakketten, mnuRoute;
    private CollectiepuntPanel pnlCol;
    private KlachtPanel pnlKla;
    private KoerierPanel pnlKoe;
    private PakketPanel pnlPak;
    private RoutePanel pnlRou;
    private CardLayout cl;
    private JPanel scherm;
    
    final static String COLLECTIE = "Collectie";
    final static String KLACHTEN = "Klachten";
    final static String PAKKETTEN = "Pakketten";
    final static String KOERIERS = "Koeriers";
    final static String ROUTE= "Route";
    
    public static Font defTitel = new Font("Verdana", Font.PLAIN, 24);
    public static Font SubKop = new Font("Verdana", Font.PLAIN, 16);
    
    
    public Scherm(){
        this.setTitle("TZT planning's applicatie");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.cl = new CardLayout(0,5);
        
        this.menu = new JMenuBar();
        this.mnuCollectiepunt = new JMenu("Collectiepunten");
        this.mnuKoeriers = new JMenu("Koeriers");
        this.mnuKlachten = new JMenu("Klachten");
        this.mnuPakketten = new JMenu("Pakketten");
        this.mnuRoute = new JMenu("Route");
        
        this.setJMenuBar(menu);
        menu.add(mnuCollectiepunt);
        menu.add(mnuKoeriers);
        menu.add(mnuKlachten);
        menu.add(mnuPakketten);
        menu.add(mnuRoute);
        
        mnuCollectiepunt.addMenuListener(this);
        mnuKoeriers.addMenuListener(this);
        mnuKlachten.addMenuListener(this);
        mnuPakketten.addMenuListener(this);
        mnuRoute.addMenuListener(this);
        
        this.scherm = new JPanel(cl);
        
        this.pnlCol = new CollectiepuntPanel();
        this.pnlKla = new KlachtPanel();
        this.pnlKoe = new KoerierPanel();
        this.pnlPak = new PakketPanel(this);
        this.pnlRou = new RoutePanel();
        
        this.add(scherm);
        
        scherm.add(pnlCol, COLLECTIE);
        scherm.add(pnlKla, KLACHTEN);
        scherm.add(pnlKoe, KOERIERS);
        scherm.add(pnlPak, PAKKETTEN);
        scherm.add(pnlRou, ROUTE);
        
        cl.show(scherm, COLLECTIE);
        
        Toolkit tk = Toolkit.getDefaultToolkit();  
        int xSize = ((int) tk.getScreenSize().getWidth());  
        int ySize = ((int) tk.getScreenSize().getHeight());  
        this.setSize(xSize,ySize);  
        this.setVisible(true);
    }

    @Override
    public void menuSelected(MenuEvent me) {
        if(me.getSource() == mnuCollectiepunt){cl.show(scherm, COLLECTIE);}
        if(me.getSource() == mnuKoeriers){cl.show(scherm, KOERIERS);}
        if(me.getSource() == mnuKlachten){cl.show(scherm, KLACHTEN);}
        if(me.getSource() == mnuPakketten){cl.show(scherm, PAKKETTEN);}
        if(me.getSource() == mnuRoute){cl.show(scherm, ROUTE);}
    }

    @Override
    public void menuDeselected(MenuEvent me) {}

    @Override
    public void menuCanceled(MenuEvent me) {}
    
}
