/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.firstunity.unity3.doublecircularlist;

/**
 *
 * @author AULA1
 */
public class List {
    private Node header;

    public List() {
        header = null;
    }

    public void add(int d) {
       
    Node n = new Node(d);
    if (header==null){
        header=n;
    }else{
        n.Next=header;
        n.Back=header.Back;
        header.Back.Next=n;
        header.Back=n;
            
        }
    }
    
    public void print() {
        if(header==null)return;
        Node aux = header;
        do{
            System.out.print(" "+aux.data);
            aux=aux.Next;
        }
        while(aux!=header);
        System.out.print(" ");
    }
    public void moveFirstToEnd(){
       header=header.Next; 
    }
    public void moveLastToBegining(){
       header=header.Back.Back;
    
}
    public void remove(int p){
}
    
}
