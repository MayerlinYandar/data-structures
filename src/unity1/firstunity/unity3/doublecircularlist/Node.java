/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.firstunity.unity3.doublecircularlist;
public class Node {
    
    protected int data;
    protected Node Next;
    protected Node Back;
    
    public Node(int d){
        
        data = d;
        Next = this;
        Back= this;
        
    }
    
}