/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstunity.unity3.doublecircularlist;

/**
 *
 * @author AULA1
 */
public class Test {
    public static void main(String[] args){
        
        List c = new List();
        for(int i=2; i<=12; i++){
            c.add(i);
        }
        c.print();
        System.out.println("moving");
        c.moveFirstToEnd();
        c.print();
        System.out.println("moving");
        c.moveLastToBegining();
        c.print();
        
            
        
    }    
}
