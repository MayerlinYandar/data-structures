/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstunity.unity2.doblestructures;

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
    public int count (){
        
        Node aux= header;
        int counter =0;
        while(aux != null){
            counter++;
            aux = aux.Next;
        }
        return counter;
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
    public void removelastelement() {

        Node aux = header;
        Node p = null;
        while (aux.Next != null) {
            p = aux;
            aux = aux.Next;
        }
        p.Next = null;
    }
    public void removefirstelement() {
        if (header == null) {
            return;
        } else {
            header = header.Next;
        }

    }
    public void Invert(){
        Node aux= header,head2=null;
        while(header!=null){
            aux=header;
            header=header.Next;
            aux.Next=head2.Next;
            head2.Next=aux;
        }
        header=head2;
    
}
    public void Duplicate (){
    
    if (header==null) return;
    
    Node aux=header,last=header;
    int c = count();
    
    while(last.Next!=null){
        last=last.Next;
        
    }
    
    for(int i=0; i<c; i++){
        
        Node n= new Node(aux.data);
        
        n.Back=last;
        last.Next=n;
        n.Next=null;
        
        aux=aux.Next;
        last=last.Next;
        
}
        
}

public void DuplicateMirror(){
    
    if (header==null) return;
    
    Node aux=header,last=header;
   
    
    while(last.Next!=null){
        last=last.Next;
       
       
        
    }
    aux=last;
    
    
    while(aux!=null){
        
        Node n= new Node(aux.data);
        
        n.Back=last;
        last.Next=n;
        
        
        last=last.Next;
        aux= aux.Back;
        
        
    }
}
}
