package Tugas4_YOHANES_ALBERT_172392;
import java.awt.*;
import java.applet.*;

public class YOHANES_ALBERT_172392_Nomor3 extends java.applet.Applet implements Runnable{

    Image laripics[] = new Image[6];
    String larisrc[] = {"1k.png","2k.png","3k.png","4k.png","5k.png","6k.png"};
    Image currentImage;
    Thread runner;
    int xpos;
    
    int ypos = 50;
    
    public void start(){
        if(runner == null){
            runner = new Thread(this);
            runner.start();
        }
    }
    
    public void stop(){
        if (runner != null){
            runner.stop();
            runner = null;
    }
    }
 
    public void run(){
        for (int i=0;i<laripics.length;i++){
            laripics[i] = getImage(getCodeBase(),"gmbr/"+larisrc[i]);
        }
        
        for (int idx=0;idx<20
                ;idx++){
            larirun(1300,10);
          
              currentImage = laripics[0];
              repaint();
        }
    }    
    public void larirun(int start,int end){
        for(int i = start;i>end;i-=15){
            this.xpos = i;
            if(currentImage == laripics[0]){
                currentImage = laripics[1];
            }else if(currentImage == laripics[1]){
                currentImage = laripics[2];
            }else if(currentImage == laripics[2]){
                currentImage = laripics[3];
            }else if(currentImage == laripics[3]){
                currentImage = laripics[4];
            }else if(currentImage == laripics[4]){
                currentImage = laripics[5];
            }else if(currentImage == laripics[5]){
                currentImage = laripics[0];
            }else{
                currentImage = laripics[0];
            }
            repaint();
            pause(60);
            
        }
    }
    public void pause(int time){
       try{ Thread.sleep(time);
    }catch (InterruptedException e){
        
    }
    }
    public void paint(Graphics g){
        g.drawImage(currentImage, xpos, ypos, this);
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
