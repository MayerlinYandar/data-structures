/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.simplestructures;

/**
 *
 * @author Mayerlin Yandar
 */
public class Test {

    public static void main(String[] args) {

        List l = new List();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);
        l.add(30);

        System.out.print("initial values:");
        l.print();
        int c = l.count();
        System.out.println("Total Nodes:" + c);
//        l.printFirstElement();
//        l.printLastElement();
//        System.out.println("Remove First element");
//        l.removefirstelement();
//        l.print();
//        System.out.println("Remove last element");        
//        l.removelastelement();
//        l.print();
//        System.out.println("Duplicating...");
//        l.duplicate();
//        System.out.println("Vaulues after duplication:");
//        l.print();
//        System.out.println("Mirroring Duplicate...");
//        l.duplicateMirror();
//        l.print();
//        System.out.println("Removing Intercalated...");
//        l.removeIntercaled();
//        l.print();
//        System.out.println("Duplicating intercalated...");
//        l.DuplicateIntercaled();
//        l.print();
//        System.out.println("Inverting...");
//        l.Invert();
//        l.print();
//        System.out.println("Removing Recurrents...");
//        l.RemoveRecurrents();
//        l.print();
//        System.out.println("Insert Zeros");
//        l.insertZeros();
//        l.print();
//        System.out.println("Remove Middle");
//        l.RemoveMiddle();
//        l.print();
        System.out.println("Count Odds");
        l.countOdds();
        l.print();
    }

}
