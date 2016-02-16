package unity0;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayerlin_Yandar
 */
public class List {
    private int[] data;
    private int top;
    
    public void add(int d, int n){
        top++;
        if(n<top){
            for(int i=top-1;i>=n;i--){
            data[i+1]=data[i];
            }
            data[n]=d;
        }
    }
    public int Remove(int num){
       int d2;
       d2=data[num];
        System.out.println(d2);
       for(int i=num;i<top;i++){
           data[i]=data[i+1];
       }
       top--;
        return d2;
    }
    public void print(){
        for(int i=0;i<top;i++){
            System.out.print("  "+data[i]);
        }
        System.out.println();
    }
    public List(){
        data= new int[100];
        top=0;
        
    } 
}
    
