
package View;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Gamepanel extends JPanel {
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent (g) ;
        g.clearRect(0, 0, 640, 480);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 640, 480);
        
        
    }
    
}
