
package Model;

import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
   
 private ArrayList<Node> snake;    
    
 public Snake(int x, int y, int largura, int altura) {
        this.snake = new ArrayList<>();
 
        Corpocobra cabeca = new Corpocobra(x, y);
        Corpocobra corpo = new Corpocobra (x, y);
        Corpocobra rabo = new Corpocobra(x, y);
        this.snake.add(cabeca);
        this.snake.add(corpo);
        this.snake.add(rabo);
    }

    public void crescerSnake() {
        Corpocobra body = (Corpocobra) this.snake.get(this.snake.size() - 1);
        int x = body.getX();
        int y = body.getY();
        this.snake.add(new Corpocobra(x, y));
    }

  public void desenhar(Graphics g) {
        for (Node n : snake) {
            n.desenhar(g);
        }
    }
 
  

 
 
 
}
