

package guis;

import java.awt.Color;
import java.awt.Graphics;

public class Casilla implements Component{
    
    
    //dibuja las casillas
    @Override
    public void dibujar(Graphics g) {
    //Aqui se dibujan las casillas
    
    //Ala Izquierda Superior
        g.setColor(Color.white);
        g.drawLine(180, 190, 260, 110);
        g.drawLine(210, 220, 290, 140);
        g.drawLine(239, 249, 318, 170);
        g.drawLine(268, 277, 347, 198);
        g.drawLine(295, 304, 374, 225);
    }
        
}
