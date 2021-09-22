/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4_YOHANES_ALBERT_172392;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author RENDER12
 */
public class YOHANES_ALBERT_172392_Nomor1 extends Applet {
    public void paint (Graphics g){
    
        // kepala
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(200, 50, 100, 115);
        // mata kiri
        g.setColor(Color.white);
        g.fillOval(220, 90, 17, 10);
        g.setColor(Color.black);
        g.fillOval(225, 93, 8, 5);
        // mata kanan
        g.setColor(Color.white);
        g.fillOval(265, 90, 17, 10);
        g.setColor(Color.black);
        g.fillOval(270, 93, 8, 5);
        // alis
        g.drawArc(214, 80, 30, 40, 40, 100);
        g.drawArc(214, 81, 30, 40, 40, 100);
        g.drawArc(214, 82, 30, 40, 40, 100);
        g.drawArc(258, 80, 30, 40, 40, 100);
        g.drawArc(258, 81, 30, 40, 40, 100);
        g.drawArc(258, 82, 30, 40, 40, 100);
        // mulut
        g.drawArc(230, 90, 40, 50, 200, 140 );
        g.drawArc(230, 91, 40, 50, 200, 140 );
        g.drawArc(230, 92, 40, 50, 200, 140 );
        g.drawArc(230, 93, 40, 50, 200, 140 );
        // leher
        g.drawLine(230, 160, 230, 185);
        g.drawLine(270, 160, 270, 185);
        // bahu
        g.drawLine(170, 185, 330, 185);
        
        //lengan luar
        g.drawLine(170, 185, 100, 330);
        g.drawLine(330, 185, 400, 330);
        
        //lengan dalam
        g.drawLine(190, 240, 140, 340);
        g.drawLine(310, 240, 360, 340);
        
        //badan
        g.drawLine(190, 240, 190, 400);
        g.drawLine(310, 240, 310, 400);
        //ikat pinggang
        g.drawLine(190, 400, 310, 400);
        g.drawLine(191, 405, 309, 405);
        
        //celana
        g.drawLine(190, 400, 170, 600);
        g.drawLine(310, 400, 330, 600);
        //celana dalam
        g.drawLine(250, 460, 220, 600);
        g.drawLine(250, 460, 280, 600);
        
        
        
        
        
    }
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
