
package guis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 * 
 * @author J.Fernando <josefer.hernandez@hotmail.com>
 */
public class Tablero implements  Component{
    
    Casilla casilla;
    
    public Tablero(Casilla casilla){
        this.casilla = casilla;
    }
    
    
    //Esquinas redondeadas
    //Manda a llamar el metodo dibujar que renderiza el esqueleto del tablero

    @Override
    public void dibujar(Graphics g) {
            
        
        //El metodo del padre (tablero) se encarga de llamar al metodo dibujar de las casillas
        Casilla c1 = new Casilla();
        c1.dibujar(g);
        
        

                //Cuadros Amarillos
        
//        g.setColor(Color.yellow);
//        Polygon cuadroDerB = new Polygon();
//        cuadroDerB.addPoint(300, 380);
//        cuadroDerB.addPoint(340, 340);
//        cuadroDerB.addPoint(368, 368);
//        cuadroDerB.addPoint(328, 408);
//        g.fillPolygon(cuadroDerB);
//        Polygon cuadroIzqB = new Polygon();
//        cuadroIzqB.addPoint(220, 300);
//        cuadroIzqB.addPoint(260, 340);
//        cuadroIzqB.addPoint(232, 368);
//        cuadroIzqB.addPoint(192, 328);
//        g.fillPolygon(cuadroIzqB);
//        Polygon cuadroIzqA = new Polygon();
//        cuadroIzqA.addPoint(260, 260);
//        cuadroIzqA.addPoint(300, 220);
//        cuadroIzqA.addPoint(272, 192);
//        cuadroIzqA.addPoint(232, 232);
//        g.fillPolygon(cuadroIzqA);
//        Polygon cuadroDerA = new Polygon();
//        cuadroDerA.addPoint(340, 260);
//        cuadroDerA.addPoint(380, 300);
//        cuadroDerA.addPoint(408, 272);
//        cuadroDerA.addPoint(368, 232);
//        g.fillPolygon(cuadroDerA);
//
//        //Triangulos
//        g.setColor(Color.red);
////DereB
//        Polygon a = new Polygon();
//        a.addPoint(480, 480);
//        a.addPoint(433, 513);
//        a.addPoint(447, 527);
//        g.fillPolygon(a);
//        Polygon b = new Polygon();
//        b.addPoint(480, 480);
//        b.addPoint(513, 433);
//        b.addPoint(527, 447);
//        g.fillPolygon(b);
//
//        //IzqA
//        Polygon e = new Polygon();
//        e.addPoint(120, 120);
//        e.addPoint(73, 153);
//        e.addPoint(87, 167);
//        g.fillPolygon(e);
//        Polygon f = new Polygon();
//        f.addPoint(120, 120);
//        f.addPoint(153, 73);
//        f.addPoint(167, 87);
//        g.fillPolygon(f);
////
//        //IzqB
////          
//        Polygon k = new Polygon();
//        k.addPoint(120, 480);
//        k.addPoint(87, 433);
//        k.addPoint(73, 447);
//        g.fillPolygon(k);
//        Polygon l = new Polygon();
//        l.addPoint(120, 480);
//        l.addPoint(167,513);
//        l.addPoint(153,527);
//        g.fillPolygon(l);
//
//
//        //DerA
//        Polygon n = new Polygon();
//        n.addPoint(480, 120);
//        n.addPoint(433, 87);
//        n.addPoint(447,73 );
//        g.fillPolygon(n);
//        Polygon m = new Polygon();
//        m.addPoint(480, 120);
//        m.addPoint(513, 167);
//        m.addPoint(527, 153);
//        g.fillPolygon(m);
        
//        g.setColor(Color.black);
//        int xValues[] = {50, 220, 50, 130, 300, 470, 550, 380, 550, 470, 300, 130};
//        int yValues[] = {130, 300, 470, 550, 380, 550, 470, 300, 130, 50, 220, 50};
//        Polygon polygon1 = new Polygon(xValues, yValues, xValues.length);
//        g.drawPolygon(polygon1);
        //Polygons
        g.setColor(Color.white);
        int xValues[] = {150, 320, 400, 230};
        int yValues[] = {160, 330, 250, 80};
        Polygon alaIzquierdaSup = new Polygon(xValues, yValues, xValues.length);
        g.drawPolygon(alaIzquierdaSup);
        
        g.setColor(Color.white);
        int x2Values[] = {570, 400, 480, 650};
        int y2Values[] = {80, 250, 330, 160};
        Polygon alaDerechaSup = new Polygon(x2Values, y2Values, x2Values.length);
        g.drawPolygon(alaDerechaSup);
        
        g.setColor(Color.white);
        int x3Values[] = {320, 150, 230, 400};
        int y3Values[] = {330, 500, 580, 410};
        Polygon alaIzquierdaInf = new Polygon(x3Values, y3Values, x3Values.length);
        g.drawPolygon(alaIzquierdaInf);
        
        g.setColor(Color.white);
        int x4Values[] = {400, 570, 650, 480};
        int y4Values[] = {410, 580, 500, 330};
        Polygon alaDerechaInf = new Polygon(x4Values, y4Values, x4Values.length);
        g.drawPolygon(alaDerechaInf);
        
        g.setColor(Color.white);
        int x5Values[] = {400, 320, 400, 480};
        int y5Values[] = {250, 330, 410, 330};
        Polygon centro = new Polygon(x5Values, y5Values, x5Values.length);
        g.drawPolygon(centro);
        /*
        Dibujo de casillas para tablero Grande
        */
        
        
        //Ala Derecha Superior
        g.drawLine(620, 190, 540, 110);
        g.drawLine(590, 220, 510, 140);
        g.drawLine(560, 249, 481, 170);
        g.drawLine(532, 277, 453, 198);
        g.drawLine(504, 304, 425, 225);
        
        //Ala Izquierda Inferior
        g.drawLine(180, 473, 260, 555);
        g.drawLine(210, 440, 290, 525);
        g.drawLine(239, 410, 318, 490);
        g.drawLine(268, 383, 347, 466);
        g.drawLine(293, 355, 374, 436);
        
        //Centro
        g.drawLine(190, 120, 610, 540);
        g.drawLine(610, 120, 190, 540);
        //Ala Derecha B
//        g.drawLine(340, 340, 536, 536);
//        g.drawLine(300, 380, 380, 300);
//        g.drawLine(328, 408, 408, 328);
//        g.drawLine(356, 436, 436, 356);
//        g.drawLine(384, 464, 464, 384);
//        g.drawLine(412, 492, 492, 412);
//        g.drawLine(440, 520, 520, 440);
//        g.drawLine(468, 548, 548, 468);
//
//        //Ala Izquirda B
//        g.drawLine(260, 340, 64, 536);
//        g.drawLine(220, 300, 300, 380);
//        g.drawLine(192, 328, 272, 408);
//        g.drawLine(164, 356, 244, 436);
//        g.drawLine(136, 384, 216, 464);
//        g.drawLine(108, 412, 188, 492);
//        g.drawLine(80, 440, 160, 520);
//        g.drawLine(52, 468, 132, 548);
//
//        //Ala Derecha A
//        g.drawLine(340, 260, 536, 64);
//        g.drawLine(300, 220, 380, 300);
//        g.drawLine(328, 192, 408, 272);
//        g.drawLine(356, 164, 436, 244);
//        g.drawLine(384, 136, 464, 216);
//        g.drawLine(412, 108, 492, 188);
//        g.drawLine(440, 80, 520, 160);
//        g.drawLine(468, 52, 548, 132);
//
//        //Ala Izquirda A
//        g.drawLine(260, 260, 70, 70);
//        g.drawLine(220, 300, 300, 220);
//        g.drawLine(192, 272, 272, 192);
//        g.drawLine(164, 244, 244, 164);
//        g.drawLine(136, 216, 216, 136);
//        g.drawLine(108, 188, 188, 108);
//        g.drawLine(80, 160, 160, 80);
//        g.drawLine(52, 132, 132, 52);
//
//        //Centro
//        g.drawLine(340, 340, 260, 260);
//        g.drawLine(260, 340, 340, 260);

        //Auxiliar Blanco
//        g.setColor(Color.yellow);
//        g.drawLine(500, 20, 580, 100);
//        g.drawLine(20, 100, 100, 20);
//        g.drawLine(100, 20, 0, 0);
//        g.drawLine(20, 500, 100, 580);
//        g.drawLine(500, 580, 580, 500);
//        
//
//        g.drawLine(20, 100, 52, 132);
//        
/*
Circuferencia
*/

g.setColor(Color.WHITE);
g.drawArc(147, 77, 120, 128, 60, 140);
//                //Circunferencia
//        g.setColor(Color.black);
//        //        x   y  Ancho Alto GIni G
//        g.drawArc(50, 50, 120, 128, 60, 140);
//        g.drawArc(425, 45, 130, 128, 340, 128);
//        g.drawArc(435, 430, 120, 128, 242, 140);
//        g.drawArc(45, 430, 118, 128, 158, 142);
//    
    }



 
}
