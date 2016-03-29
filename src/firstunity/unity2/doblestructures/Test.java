package firstunity.unity2.doblestructures;

/**
 *
 * @author Mayerlin_Yandar
 */
public class Test {
    public static void main(String[] args){
        
        List l = new List();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);
        l.add(30);
        
        System.out.print("initial values:");
        l.print();  
        l.removelastelement();
        l.print();
        l.removefirstelement();
        l.print();
        l.Invert();
        l.print();
    }    
}
    
