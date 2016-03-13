/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2;

/**
 *
 * @author Mayerlin_Yandar
 */
public class List {
    private Node header;

    public List() {
        header = null;
    }

    public void add(int d) {
        Node n = new Node(d);
        if (header == null) {
            header = n;
        } else {
            Node aux = header;
            while (aux.Next != null) {
                aux = aux.Next;
            }
            aux.Next = n;
            n.Back=aux;
        }
    }

    public void print() {
        Node aux = header;
        while (aux != null) {
            System.out.print(" " + aux.data);
            aux = aux.Next;
        }
        System.out.println();

    }
    public void Reverse(){
        if (header==null)return;
        Node aux = header;
        while(aux.Next != null){
            aux = aux.Next;
        }
        while ( aux.Next!= null){
            System.out.println(" "+aux.data);
            aux=aux.Back;
        }
    }
    public void Push(int d){
        Node n = new Node(d);
        if(header==null){
            header=n;
        }else{
            n.Next=header;
            header.Back=n;
            header=n;
        }
    
}
    
}
