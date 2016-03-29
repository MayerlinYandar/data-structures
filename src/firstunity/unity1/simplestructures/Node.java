/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstunity.unity1.simplestructures;

/**
 *
 * @author Mayerlin_Yandar
 */
public class Node {
    protected int data;
    protected Node Next;
    
    public Node(int d){
        
        data = d;
        Next = null;
        
    }
}