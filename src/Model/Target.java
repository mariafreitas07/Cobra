  
package Model;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Target extends Node {

    private ImageIcon apple;

    public Target(int x, int y) {
        super(x, y);
        this.apple = new ImageIcon("src/Assets/bolinha.png");
    }

    @Override
    public void desenhar(Graphics g) {
        g.drawImage(apple.getImage(), getX(), getY(), TAMANHO, TAMANHO, null);
        g.setColor(Color.BLACK);
    }
}

