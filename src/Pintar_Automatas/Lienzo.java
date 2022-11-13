package Pintar_Automatas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPanel;

/**
 * @author walter
 */
public class Lienzo extends JPanel {

    public Lienzo() {

    }
    String a;

    public void paintComponent(Graphics E) {
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
                String[] b = tokenTipo1.split("");
                super.paintComponent(E);
                E.setColor(Color.red);
                //         x   y   x   y
                E.drawLine(20, 100, 20, 150);
                E.drawLine(20, 100, 72, 125);
                E.drawLine(20, 150, 72, 125);
                E.setColor(Color.black);
                E.drawOval(72, 90, 70, 70);
                E.drawString("qo", 100, 125);
                E.drawString(b[0], 200, 125);
                E.drawString("_______________", 140, 130);
                E.drawLine(245, 110, 245, 150);
                E.drawLine(245, 110, 270, 130);
                E.drawLine(245, 150, 270, 130);
                
                E.setColor(Color.blue);
                E.drawOval(272, 90, 70, 70);
                E.drawString("q1", 300, 125);
                E.drawString(b[1], 400, 125);
                E.drawString("_______________", 340, 130);
                E.drawLine(445, 110, 445, 150);
                E.drawLine(445, 110, 470, 130);
                E.drawLine(445, 150, 470, 130);

                E.setColor(Color.black);
                E.drawOval(472, 90, 70, 70);
                E.drawString("q2", 500, 125);
                E.drawString(b[2], 600, 125);
                E.drawString("_______________", 540, 130);
                E.drawLine(645, 110, 645, 150);
                E.drawLine(645, 110, 670, 130);
                E.drawLine(645, 150, 670, 130);

                E.setColor(Color.blue);
                E.drawOval(672, 90, 70, 70);
                E.drawString("q3", 700, 125);


          }
        }
        
    }
}
