package Pintar_Automatas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPanel;

/**
 * @author walter
 */
public class Lienzo1 extends JPanel {

    public Lienzo1() {

    }
    String a;

    public void paintComponent(Graphics w) {
        Automata cadena = new Automata ();
        a = (cadena.Texto1);
        String paton = ("([a-zA-Z]+)|([+]+)");
        String texto = a;
        Pattern p = Pattern.compile(paton);
        Matcher matcher = p.matcher(texto);
        while (matcher.find()) {
            String tokenTipo1 = matcher.group(1);
            if (tokenTipo1 != null) {
                System.out.println("Letras:\t" + tokenTipo1);
                String[] b = a.split("");
                super.paintComponent(w);
                w.setColor(Color.red);
                //         x   y   x   y
                w.drawLine(20, 100, 20, 150);
                w.drawLine(20, 100, 72, 125);
                w.drawLine(20, 150, 72, 125);
                w.setColor(Color.black);
                w.drawOval(72, 90, 70, 70);
                w.drawString("qo", 100, 125);
                w.drawString(b[0], 200, 65);
                 w.drawLine(143, 125, 245, 50);
                   w.drawLine(143, 125, 245, 200);
              
                w.drawString(b[1], 200, 125);
                w.drawString(b[2], 200, 195);
                
                w.drawLine(245, 30, 245, 80);
                w.drawLine(245, 30, 270, 60);
                w.drawLine(245, 80, 270, 60);
                
                w.drawLine(245, 180, 245, 230);
                w.drawLine(245, 180, 270, 210);
                w.drawLine(245, 230, 270, 210);


                w.setColor(Color.blue);
                w.drawOval(272, 20, 70, 70);

                w.setColor(Color.blue);
                w.drawOval(272, 170, 70, 70);
                 w.drawString("q1", 300, 60);
                w.drawString("q1", 300, 210);


                

              
          }
        }
        
    }
}
