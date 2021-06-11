
package View;

  
   public class Telajogo extends Telabase {
    
      public Gamepanel gamePanel ;
       
       
    public Telajogo() {
        super("Tela jogo");
        gamePanel = new Gamepanel();
        gamePanel.setBounds(0,0,640,480);
        add(gamePanel);
    }
   }