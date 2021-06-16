package Model;

import java.awt.Color;
import java.awt.Graphics;

public class Corpocobra extends Node {

    public Corpocobra(int x, int y) {
        super(x, y);
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(this.getX(), this.getY(), Node.TAMANHO, Node.TAMANHO);
    }

}