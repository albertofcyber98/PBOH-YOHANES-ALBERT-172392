
package Tugas4_YOHANES_ALBERT_172392;
import java.awt.*;

public class YOHANES_ALBERT_172392_Nomor2 extends java.applet.Applet implements Runnable {

    
     Thread runner;
    int xpos,ypos;
    int ux1,ux2,uy1,uy2;
    
    public void start(){
        if (runner==null) {
            runner = new Thread(this);
            runner.start();
            
        }
    }
    
    public void stop(){
        if (runner != null) {
            runner.stop();
            runner = null;
            
            
        }
    }
    
    public void run(){
        setBackground(Color.black );
        while (true) {
            
            //bawah
              for (ypos = 5; ypos <=300; ypos+=10) {
                uy1= ypos+90;
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                if (uy2==0) {uy2=ypos;}
                
            }
            //kanan
            for (xpos = 5; xpos <= 300; xpos+=10) {
                ux2 = xpos+90;
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                if (ux1==0) {ux1=xpos;}
   
            }
            
             
           //atas
            for (ypos = 300; ypos >=5; ypos-=4) {
                uy2= ypos;
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                if (uy1==0) {uy1=ypos+90;}
                
            }
              
            //kiri
           for (xpos = 300; xpos >= 5; xpos-=4) {
                ux1 = xpos;
                repaint();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
                if (ux2==0) {ux2=xpos+90;}
           } 
   
            
        }
    }
  
     public void paint(Graphics g){
      
         g.setColor(Color.green);
         g.fillOval(xpos, ypos, 90, 90);
         
         ux1=ux2=0;
         
     } 

  

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
