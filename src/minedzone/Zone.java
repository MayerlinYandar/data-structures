/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minedzone;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


public class Zone extends JFrame{
    private Mine head,current;
    
    public Zone(){
        setTitle("Zona minada");
        setSize(500,400);
        launchEvents();
        setVisible(true);
        head = current = null;
        
    }
    public void addMine(int x,int y){
        Mine n = new Mine(x,y,this);
        if (head == null){
            head = n;
        }else{
            Mine aux = head;
            while (aux.next != null)aux = aux.next;
            aux.next = n;
            n.back = aux;
        }
        current = n;
    }
    public void goForward(){
        if(current.next != null){
            current=current.next;
        }
        
    }
    public void goBack(){
        if(current.back != null){
            current = current.back;
        }
        
    }
    public void explode(){
        if (current !=null)
            current.state = true;
        
    }
    public void resetmine(){
        Mine aux = head;
                while (aux != null) {
                    current = aux;
                    current.state = false;
                    aux = aux.next;
                    repaint();
                }
                
    }            
    
    public void exploteallmines(){
        Mine aux = head ,d=head;
            while (aux != null) {
                d = aux;
                d.state = true;
                aux = aux.next;
                repaint();
                }
                
    
    }
     private void remove() {
        Mine aux = head;
            while (aux.next != current && aux.next == head) {
                aux = aux.next;
                repaint();
            }
            aux.next = null;
            current = aux;
               

            }
    
    
    public void paint(Graphics g){
        g.clearRect(0,0, getWidth(),getHeight());
        if(head == null) return;
        Mine aux = head;
        while (aux != null){
            aux.paint(g, aux == current);
            aux = aux.next;
        }
        
    }
    public void launchEvents(){
        addWindowListener(new WindowAdapter(){
            public void windowClosting(WindowEvent e){
                System.exit(0);
            }
        });
        
        addMouseListener(new MouseListener(){

           
            public void mouseClicked(MouseEvent e) {
                addMine( e.getX() ,e.getY() );
                repaint();
                
            }

           
            public void mousePressed(MouseEvent e) {
         
            }

           
            public void mouseReleased(MouseEvent e) {
         
            }

            
            public void mouseEntered(MouseEvent e) {
                
            }

           
            public void mouseExited(MouseEvent e) {
                
            }
            
            
        });
        
        addKeyListener(new KeyListener(){

            public void keyTyped(KeyEvent e) {
            }
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()){
                    case KeyEvent.VK_RIGHT: goForward();        break;
                    case KeyEvent.VK_LEFT : goBack();           break;
                    case KeyEvent.VK_ENTER : explode();         break;
                    case KeyEvent.VK_ESCAPE: remove();          break;
                    case KeyEvent.VK_DELETE: resetmine();       break;
                    case KeyEvent.VK_SPACE: exploteallmines();  break;
                            
                       
                }
                repaint();
            }
            public void keyReleased(KeyEvent e) {
            }
            
            
        });
        
    }
    public static void main(String args[]){
        new Zone();
        
    }
}
