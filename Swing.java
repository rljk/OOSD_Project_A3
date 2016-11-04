package swingdemo;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics; 
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.event.MouseMotionAdapter; 

/*
 * This solution does not use a Square class. We recommend students 
 * to think about designing an appropriate Square class for this program.
 */

public class Swing {
    
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI(); 
        }
      });
    }

    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? "+
        SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Warehouse");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.add(new MyPanel()); 
        f.pack();
        f.setVisible(true);
    } 
}

class MyPanel extends JPanel {


    public MyPanel() {

        setBorder(BorderFactory.createLineBorder(Color.black));       
        
    }
	

    public Dimension getPreferredSize() {
        return new Dimension(1000,1000);
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);       
        g.drawString("Robot",35,945);
        g.drawString("Belt",135,945);
        g.drawString("Loading Dock",215,945);
        g.drawString("Shipping Dock",310,945);
        g.drawString("Packing Area",415,945);
        g.drawString("Recharging Area",505,945);
        g.drawString("Shelf Drop-Off",610,945);
        int k =0;
        
        int numrows = 8;
        int htOfRow = 1000 / numrows;
        for ( k = 0; k < numrows; k++)
            g.drawLine(0, k * htOfRow , 1000, k * htOfRow );
        g.drawLine(0, 890 , 1000, 890 );
     
        int numcols = 10;
        int wdOfRow = 1000 / numcols;
        for (k = 0; k < numcols; k++){
          g.drawLine(k*wdOfRow , 0, k*wdOfRow , 875);
          g.drawLine(k*wdOfRow , 890, k*wdOfRow , 1000);
        }
        
    }  
}
