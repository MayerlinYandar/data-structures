/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.firstunity.unity0;

/**
 *
 * @author Mayerlin_Yandar
 */
public class Test {
    public static void main(String [] args){
        TestingStacks();
        TestingQueues();
        TestingList();
    }
    
    public static void TestingStacks(){
        System.out.println("------Stack Testing------");
        Stack s = new Stack();
        s.add(10);
        s.add(20);
        s.add(30);
        s.print();
        s.remove();
        s.print();
        for(int i=2; i<20; i+=2){
            s.add(i);
        }
        s.print();
    }
    
    public static void TestingQueues(){
        System.out.println("------Queue Testing------");
        Queue q = new Queue();
        for(int i=1; i<=20; i++){
            q.add(i);
        }
        System.out.print("Initial Values:");
        q.print();
        int d=q.remove();
        System.out.println("the element removed was;"+d);
        System.out.print("Current values:");
        q.print();
    }
    
     public static void TestingList(){
             List li=new List();
      
       for(int i=0;i<5;i++){
           li.add(i+2, i);
       }
        System.out.println("---------list---------");
       System.out.println("---------Initial Values---------");
       li.print();
       li.add(10, 1);
       
        System.out.println("---------The element removed was:---------");
       li.print();
       li.Remove(2);
        System.out.println("---------Current values---------");
       li.print();
    }
}
