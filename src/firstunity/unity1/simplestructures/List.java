/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstunity.unity1.simplestructures;

/**
 *
 * @author Mayerlin Yandar
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

    public int remove(int i) {
        if (header == null) {

        } else if (i == 0) {
            header = header.Next;
        }
        Node aux = header, p = null;
        int counter = 0;
        for (; counter < i && aux != null; counter++) {
            p = aux;
            aux = aux.Next;
        }
        if (aux != null) {
            p.Next = aux.Next;

        }
        return aux.data;
    }

    public void removefirstelement() {
        if (header == null) {
            return;
        } else {
            header = header.Next;
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

    public int count() {
        Node aux = header;
        int counter = 0;
        while (aux != null) {
            counter++;
            aux = aux.Next;
        }
        return counter;

    }

    public void printFirstElement() {
        if (header == null) {
            System.out.println("-1");
        } else {
            System.out.println("The first value is: " + header.data);
        }

    }

    public void printLastElement() {
        if (header == null) {
            System.out.println("-1");
        } else {
            Node aux = header;

            while (aux.Next != null) {
                aux = aux.Next;
            }
            System.out.println("The last value is:" + aux.data);
        }
    }

    public void duplicate() {
        if (header == null) {
            return;
        }
        Node last = header, aux = header;
        while (last.Next != null) {
            last = last.Next;
        }
        int c = count();
        for (int i = 0; i < c; i++) {
            last.Next = new Node(aux.data);
            aux = aux.Next;
            last = last.Next;
        }
    }

    public void duplicateMirror() {
        if (header == null) {
            return;
        }
        int cont = 0;
        Node aux = header, last = header;
        while (last.Next != null) {
            last = last.Next;
            cont++;

        }
        for (int i = 0; i < cont; i++) {
            Node n = new Node(aux.data);
            n.Next = last.Next;
            last.Next = n;
            aux = aux.Next;
        }
    }
    public void removeIntercaled(){
       Node aux= header,p=header;
        int c=count();
        for(int i=0;i<c;i++){
            if(i%2==1){
                p.Next=aux.Next;
            }
            p=aux;
            aux=aux.Next;
        }
    }
    public void DuplicateIntercaled(){
        Node aux= header,p=header;
        int c=count();
        while (aux.Next != null){
            Node n=new Node(aux.data);
            n.Next=aux.Next;
            aux.Next=n;
            aux=n.Next;
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
    public void RemoveRecurrents(){
        Node p =header, aux=header, back=header;
        while(aux.Next!=null){
            p=header;
            while(p!=aux){
                if(p.data==aux.data){
                    back.Next=aux.Next;
                    back=aux;
                }
                p=p.Next;
            }
            back=aux;
            aux=aux.Next;
        }
        }
    
    public void insertZeros() {
        Node aux = header;
        int c = count();
        while (aux.Next != null) {
            for (int i = 1; i < c; i++) {
                Node n = new Node(0);
                n.Next = aux.Next;
                aux.Next = n;
                aux = n.Next;
            }
        }
    }

    public void RemoveMiddle() {

        Node aux = header;
        Node p = header;
        int c = count();
        for (int i = 0; i < c / 2; i++) {
            p = aux;
            aux = aux.Next;
        }
        p.Next = aux.Next;

    }

    public int countOdds() {
        Node aux = header;
        int a = 0;
        while (aux.Next != null) {
            if (aux.data % 2 == 1) {
                a++;
            }
            aux = aux.Next;
        }
        return a; 
}
}
