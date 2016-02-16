/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.simplestructures;

/**
 *
 * @author AULA1
 */
public class List {
    private Node header;
    public List(){
    header = null;    
    }
     public void add(int d){        
        Node n = new Node (d);
        if(header == null){
           header = n;            
        }else{            
            Node aux = header;
            while (aux.Next!= null){                
                aux = aux.Next;                
            }         
            aux.Next = n;            
        }        
    }
    
    public void print(){
        Node aux=header;
        while(aux != null){
            System.out.print(" "+aux.data);
            aux=aux.Next;
        }
        System.out.println();
        
    }
    
    public int remove(int p){
        
        return 0;
        
    }
    
    public int count(){
        Node aux=header;
        int counter=0;
        while(aux!= null){
            counter++;
            aux=aux.Next;
        }return counter;
        
    }
    public void printFirstElement(){
        if(header != null){
            System.out.println(header);
        }else{
            System.out.println("-1");
        }
        
    }
    public void printLastElement(){
        
    }
}
