package Pintar_Automatas;

import javax.swing.JFrame;

/**
 *
 * @author walter
 */
public class Ventana extends JFrame {

    public Ventana() {
        this.setTitle("Pintar Automatas Walter Garcia");
        this.setSize(900, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lienzo w = new Lienzo();
        this.add(w);
      
    }
}
