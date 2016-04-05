package minedzone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;


public class Mine {
    protected int x ,y;
    protected boolean state;
    protected Mine next , back;
    protected Zone z;
    
    
    public Mine(int posx,int posy,Zone zone){
        x       =posx;
        y       =posy;
        state   =false;
        next    =null;
        back    =null;
        z       =zone;     
    }
    public void paint(Graphics g,boolean current){
        Image image;
        if(state == false){
            image = Toolkit.getDefaultToolkit().getImage("C:/Users/MiPc/Documents/NetBeansProjects/CUARTO SEMESTRE/data-structures/mine.png");    
        }else{
            image = Toolkit.getDefaultToolkit().getImage("C:/Users/MiPc/Documents/NetBeansProjects/CUARTO SEMESTRE/data-structures/boom.png");    
        }
        
        g.drawImage(image, x-24, y-24, z);
        
        if(current == true){
            g.setColor(Color.pink);
            
        }else{
            g.setColor(Color.WHITE);
        }
        
        g.drawRect(x-25, y-25, 50, 50);
    }
    
    
}
