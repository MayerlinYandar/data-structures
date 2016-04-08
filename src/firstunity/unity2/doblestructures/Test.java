package firstunity.unity2.doblestructures;

/**
 *
 * @author Mayerlin_Yandar
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

        System.out.println("Remove First");
        System.out.println("List Initial");
        l.print();
        System.out.println("After remove first");
        l.removefirstelement();
        l.print();
        System.out.println("Remove last");
        System.out.println("List initial");
        l.print();
        System.out.println("Last remove last");
        l.removelastelement();
        l.print();

        System.out.println("Reverse print");
        System.out.println("List Normal");
        l.print();
        System.out.println("List Reverse");
        l.Reverse();

        System.out.println("List Initial");
        l.print();

        System.out.println("Duplicate Mirror");
        l.DuplicateMirror();
        l.print();

        System.out.println("Push");

        l.Push(2);
        System.out.println("List Modificate");
        l.print();
        System.out.print("");

        System.out.println("Count nodes");
        int r = l.count();
        System.out.println("" + r);

        System.out.print("");
        System.out.println("List Initial");
        l.print();

        System.out.println("Duplicate Nodes");
        l.Duplicate();
        l.print();
        System.out.println("Remove");
        System.out.println("List Initial");
        l.print();

    }
}
