
package View;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public abstract class Telabase extends JFrame{
    
    public Telabase(String title){
        setTitle(title);
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon("src/Assets/icon.png").getImage());
        setVisible(true) ;
    }
    
}

