package Pintar_Automatas;

import javax.swing.JFrame;

/**
 *
 * @author walter
 */
public class Ventana1 extends JFrame {

    public Ventana1() {
        this.setTitle("Pintar Automatas Walter Garcia");
        this.setSize(900, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lienzo1 w = new Lienzo1();
        this.add(w);
      
    }
}
